package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.8.​ Realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai sunaudoja kuro 100
        // km. Programa turi paprašyti vartotojo įvesti nuvažiuotus km ir kuro sąnaudas.
        // vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo
        // 1.9.​ Papildyti 1.8​. programą, parašykite du atskirus metodus, vienas turi nuskaityti įvestus
        // vartotojo parametrus, kitas paskaičiuotų ir grąžintų vidurkį. Rezultatus spausdinti ekrane.

        parametrai();
        System.out.println("Kuro sanaudu vidurkis: " + vidurkis(km, sanaudos));
    }
    private static float km;
    private static float sanaudos;
    private static void parametrai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km: ");
        km = sc.nextFloat();
        System.out.println("Iveskite kuro sanaudas: ");
        sanaudos = sc.nextFloat();
    }
    private static float vidurkis(float a, float b) {
        return (b*100)/a;
    }
}
