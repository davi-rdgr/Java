package swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Swing {

    public static void main(String[] args) {
        
        //JFrame janela = new JFrame();
        //janela.setSize(300, 200);
        //janela.setVisible(true);
        
        
        double peso;
        double altura;
        double imc;
        String nome;
        String mensagem = "";

        JOptionPane.showMessageDialog(null, "Calculando o IMC: ");
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em Kg:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em cm:"));

        imc = peso / (altura / 100 * altura / 100);
        if (imc < 18.5) {
            mensagem = nome + " você está muito magro.\nPrecisa de uma dieta para engordar";
        } else if (imc < 24.9) {
            mensagem = nome + " você está com peso ideal.\nNão precisa de dieta";
        } else if (imc < 29.9) {
            mensagem = nome + " você está com sobrepeso.\nPrecisa de uma dieta para emagrecer";
        } else if (imc < 30) {
            mensagem = nome + " você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        } else {
            mensagem = nome + " você está com obesidade grave.\nPrecisa procurar um médico";
        }

        JOptionPane.showConfirmDialog(null, mensagem);
    }
}
