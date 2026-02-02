package com.andremaia.chess.engine;

public class Posicao {

    private final int linha;
    private final int coluna;

    /**
     * construtor
     * if para verificar posicao invalida no tabuleiro
     */
    public Posicao(int linha, int coluna) {

        if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
            throw new IllegalArgumentException("Posição inválida no tabuleiro");
        }
        this.linha = linha;
        this.coluna = coluna;
    }

    /**
     * getters
     */
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    /**
     * Converte as coordenadas internas da matriz (linha/coluna) para a
     * notação algébrica padrão do xadrez (ex: 'a1', 'h8').
     * * @return String representando a posição no formato letra e número.
     */
    public String paraNotacaoXadrez() {
        char colunaLetra = (char) ('a' + coluna);
        int linhaNumero = 8 - linha;
        return "" + colunaLetra + linhaNumero;
    }

    @Override
    public String toString() {
        return paraNotacaoXadrez();
    }
}
