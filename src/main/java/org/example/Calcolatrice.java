package org.example;

public class Calcolatrice {
    public int somma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice();
        int risultato = calc.somma(5, 3);
        System.out.println("La somma di 5 e 3 è: " + risultato);
    }
}
