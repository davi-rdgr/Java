package exercicio_3;

public class Exercicio_3 {

    public static class Aluno {

        String nome;
        float nota1;
        float nota2;
        float media;// Aqui, é utilizado o tipo de atributo “float” para aceitar números com casas decimais 

        public void descrever() {
            System.out.println("Nome do Aluno: " + nome);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("\n");
        }

        public float calcularMedia(float num1, float num2) {
            return (num1 + num2) / 2;
        }

        public float mostrarMaior() {
            if (nota1 >= nota2) {
                return nota1;
            } else {
                return nota2;
            }

        }

        public void mostrarResultado() {
            if (media >= 7) {
                System.out.println("O aluno foi aprovado.\n");
            } else {
                System.out.println("O aluno foi reprovado.\n");
            }
        }
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Celso Medeiros";
        aluno1.nota1 = (float) 9.7;
        aluno1.nota2 = (float) 6.5;

        aluno2.nome = "Camila Alves";
        aluno2.nota1 = (float) 4.2;
        aluno2.nota2 = (float) 6.5;

        System.out.println("Mostrar Alunos:\n");
        aluno1.descrever();
        System.out.println("A média do aluno é: " + aluno1.calcularMedia(aluno1.nota1, aluno1.nota2));
        System.out.println("A maior nota do aluno é: " + aluno1.mostrarMaior());
        aluno1.mostrarResultado();

        aluno2.descrever();
        System.out.println("A média do aluno é: " + aluno2.calcularMedia(aluno1.nota1, aluno1.nota2));

        System.out.println("A maior nota do aluno é: " + aluno2.mostrarMaior());
        aluno2.mostrarResultado();

    }

}
