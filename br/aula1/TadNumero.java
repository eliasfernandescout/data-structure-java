package br.aula1;

import java.util.Scanner;

public class TadNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numero numero = new Numero();

        while (true){
            System.out.println("=========================================================");
            System.out.println("                  ESTUDO DO TAD NUMERO                   ");
            System.out.println("=========================================================");
            System.out.println("0 - encerrar");
            System.out.println("1 - ler valor");
            System.out.println("2 - atribuir valor");

            System.out.println("Qual sua opcao? ");

            int opc = input.nextInt();

            if(opc == 0){
                break;
            } else if (opc == 1) {
                System.out.println("\n\n" + numero.getValor() + "\n\n");
            } else if (opc == 2) {
                System.out.println("Forneca um novo valor: ");
                float v = input.nextFloat();
                numero.setValor(v);
            }
        }

        System.out.println("--- FIM  ---");
        System.out.println("Ate a proxima!");

    }
}
