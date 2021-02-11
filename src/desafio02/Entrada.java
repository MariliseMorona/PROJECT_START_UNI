package desafio02;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Insira o preço por tonelada de carga:");
        float valor = numero.nextFloat();
        System.out.println("Inisra o peso da carga, em toneladas:");
        float peso = numero.nextFloat();


    }
}
