

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Float sal;
        Integer hora;

        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira as suas horas trabalhadas: ");
        hora = ler.nextInt();

        sal = 10.25f * hora;

        System.out.println("O salário a ser recebido será de: R$" + sal);

        if (sal < 50) {

            System.out.println("Atenção, dirija-se à direção do Hotel!");

        }
    
    }

}
