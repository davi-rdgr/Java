package javaapplication45;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
    public void init() {
        setTitle("Welcome!");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MainFrame mf = new MainFrame();

        mf.init();
    }
    
    
}
