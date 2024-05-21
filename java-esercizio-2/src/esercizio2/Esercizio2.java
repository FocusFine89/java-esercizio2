package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero, se è compreso tra 0 e 3 lo trasformo in stringa:");
        int numero = Integer.parseInt(sc.nextLine());
        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore " + numero + " non è compreso tra 0 e 3");

        }
    }
}
