package exercicio_5;

public class Exercicio_5 {

    public static class Carro {

        String modelo;
        String marca;
        int ano;
        String cor;

        public Carro() {
            /* Este é um método padrão, chamado quando um objeto é criado, sem passagem de valores de atributos */
        }

        /* Construtor com quatro parâmetros, que recebe todos os atributos sempre que instancia um novo objeto*/
        public Carro(String modelo, String marca, int ano, String cor) {
            this.modelo = modelo;
            this.marca = marca;
            this.ano = ano;
            this.cor = cor;
        }

        /* Construtor com três parâmetros, que recebe três atributos e define a cor inicial automaticamente para vermelha*/
        public Carro(String modelo, String marca, int ano) {
            this.modelo = modelo;
            this.marca = marca;
            this.ano = ano;
            this.cor = "Vermelho";
        }

        public void descrever() {
            System.out.println("Modelo do carro: " + modelo);
            System.out.println("Marca do carro: " + marca);
            System.out.println("Ano do carro: " + ano);
            System.out.println("Cor do carro: " + cor);
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {

        Carro carros[] = new Carro[4];
        carros[0] = new Carro();
        carros[1] = new Carro("Ka", "Ford", 2020, "Branco");
        carros[2] = new Carro("Gol", "Volkswagen", 2010, "Rosa");
        carros[3] = new Carro("Siena", "Fiat", 2022);

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Dados do carro " + i);
            carros[i].descrever();
        }

    }

}
