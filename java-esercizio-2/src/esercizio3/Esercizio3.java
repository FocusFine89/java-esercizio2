package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una frase e la dividerò con le virgole, scrivi :q per uscire");
        String stringa = sc.nextLine();

        while (!Objects.equals(stringa, ":q")) {

            String[] arrayDiStringhe = stringa.split(" ");
            for (int i = 0; i < arrayDiStringhe.length; i++) {
                arrayDiStringhe[i] = arrayDiStringhe[i] + ",";
            }


            String stringa2 = String.join(" ", arrayDiStringhe);
            System.out.println(stringa2);
            System.out.println("Inserisci una frase e la dividerò con le virgole, scrivi :q per uscire");
            stringa = sc.nextLine();

        }
    }
}
