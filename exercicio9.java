import java.util.Scanner;
import javax.swing.*;
public class exercicio9{

     public static void main(String[] args) {

        float n1, n2,media;
        Scanner var = new Scanner(System.in);
        System.out.println("Digite nota1:");
        n1 = var.nextFloat();
        System.out.println("Digite nota2:");
        n2 = var.nextFloat();
        media = (n1 + n2) /2 ;
        JOptionPane.showMessageDialog(null,"A media é: " +media);

    }







}