package es_1;

import java.util.Scanner;
import java.util.HashSet;


public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> parole = new HashSet<>();

        System.out.println("Inserisci le parole:");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                System.out.println("Parola duplicata: " + parola);
            }
        }

        System.out.println("Numero di parole distinte: " + parole.size());

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }
    }
}
