package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
