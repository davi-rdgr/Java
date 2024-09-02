package exercicio_4_televisor;

import java.util.Scanner;

public class Exercicio_4_Televisor {

    public static class Televisor {

        byte canal;
        short volume;
        boolean ligada = false;

        public void ligar() {
            ligada = true;
            System.out.println("A TV está ligada.");
        }

        public void desligar() {
            ligada = false;
            System.out.println("A TV foi desligada.");
        }

        public void trocarCanal(byte novoCanal) {
            if (!ligada) { //! é o operador "não"
                System.out.println("A TV está desligada!");
            } else { //só realizará a operação se a TV estiver ligada
                if (novoCanal > 1 && novoCanal < 14) { //canais VHF vão de 2 a 13
                    canal = novoCanal;
                    System.out.println("Canal " + canal + " sintonizado");
                } else {
                    System.out.println("Canal inválido");
                }
            }
        }

        public void aumentarVolume() {
            if (!ligada) { //só realizará a operação se a TV estiver ligada
                System.out.println("A TV está desligada!");
            } else {
                if (volume < 100) { //volume máximo = 100
                    volume++;
                }
                System.out.println("Volume atual: " + volume);
            }
        }

        public void diminuirVolume() {
            if (!ligada) { //só realizará a operação se a TV estiver ligada
                System.out.println("A TV está desligada!");
            } else {
                if (volume > 0) { //volume mínimo = 0
                    volume--;
                }
                System.out.println("Volume atual: " + volume);
            }
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String operacao = "";
        byte canal;
        short volume;

        Televisor minhaTV = new Televisor();//instanciando o objeto Televisor
        do {
            System.out.println("Digite a operação da TV: [L]igar; [D]esligar; [T]rocar canal; [+]Aumentar volume; [-]Diminuir volume; [X]Sair");
            operacao = entrada.nextLine();

            switch (operacao) {
                case "L":
                    minhaTV.ligar();
                    break;
                case "D":
                    minhaTV.desligar();
                    break;
                case "T":
                    System.out.print("Digite o canal desejado (entre 2 e 13): ");
                    canal = entrada.nextByte();
                    entrada.nextLine(); //consumir o [enter] digitado após o número
                    minhaTV.trocarCanal(canal);
                    break;
                case "+":
                    minhaTV.aumentarVolume();
                    break;
                case "-":
                    minhaTV.diminuirVolume();
                    break;
                case "X":
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!operacao.equals("X"));
    }

}
