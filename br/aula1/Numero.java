package br.aula1;

public class Numero {
    private float valor;

    public Numero() {
        this.valor = 0;
    }

    public void setValor(float valor) {
        if (valor < 0) {
            valor = 0;
            msg("valor menor que zero -> corrigido para zero");
        } else if (valor > 40 && valor < 60) {
            if (valor < 50) {
                valor = 40;
                msg("valor no intervalo nao suportado -> corrigido para 40");
            } else {
                valor = 60;
                msg("valor no intervalo nao suportado -> corrigido para 60");

            }

        } else if (valor > 100) {
            valor = 100;
            msg("valor mairo que 100 -> corrigido para 100");
        }

        this.valor = valor;
        System.out.println("Novo valor atribuido");
    }

    public float getValor() {
        return valor;
    }

    private void msg(String texto) {
        System.out.println("\n\n!!! ATENCAO: " + texto + "!!!\n\n");
    }
}
