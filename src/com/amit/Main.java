package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        char caracter;
        int contador = 0;

        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();
        System.out.print("Dame una carácter: ");
        caracter = entrada.nextLine().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.print("Número de veces que aparece el carácter "+caracter+ ": "+contador);
        entrada.close();
    }
}
