package esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola:");
        String parola = sc.nextLine();
        System.out.println(pariDispari(parola));

        System.out.println("Inserisci un anno e ti dirò se è bisestile:");
        int anno = Integer.parseInt(sc.nextLine());
        System.out.println(annoBisestile(anno));
        

    }

    public static boolean pariDispari(String parola) {
        if (parola.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 != 1 && anno % 400 != 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}