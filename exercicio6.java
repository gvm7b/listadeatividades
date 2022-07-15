

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Float sal;
        Integer hora;

        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira as suas horas trabalhadas: ");
        hora = ler.nextInt();

        sal = 10.25f * hora;

        System.out.println("O salário a ser recebido será de: R$" + sal);

    }

}

