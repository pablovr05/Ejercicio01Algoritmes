package com.project;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Electrodomestic> llistaElectrodomestics = new ArrayList<>();

        llistaElectrodomestics.add(createForn("Forn1", "Blanc", 100, "Lenovo", 10, false, 100));
        llistaElectrodomestics.add(createForn("Forn2", "Negre", 150, "Samsung", 8, true, 180));
        llistaElectrodomestics.add(createForn("Forn3", "Gris", 200, "Bosch", 9, true, 220));
        llistaElectrodomestics.add(createForn("Forn4", "Vermell", 250, "LG", 7, true, 250));
        llistaElectrodomestics.add(createForn("Forn5", "Blau", 120, "Philips", 6, false, 130));
        llistaElectrodomestics.add(createForn("Forn6", "Blanc", 170, "Electrolux", 8, true, 180));
        llistaElectrodomestics.add(createForn("Forn7", "Negre", 300, "Balay", 9, true, 280));
        llistaElectrodomestics.add(createForn("Forn8", "Gris", 190, "Miele", 10, false, 200));
        llistaElectrodomestics.add(createForn("Forn9", "Verd", 210, "Whirlpool", 7, false, 220));
        llistaElectrodomestics.add(createForn("Forn10", "Taronja", 160, "Bosch", 8, true, 170));

        llistaElectrodomestics.add(createNevera("Nevera1", "Blanc", 100, "Lenovo", 10, 100, true));
        llistaElectrodomestics.add(createNevera("Nevera2", "Negre", 200, "Samsung", 9, 150, true));
        llistaElectrodomestics.add(createNevera("Nevera3", "Gris", 300, "Bosch", 8, 200, false));
        llistaElectrodomestics.add(createNevera("Nevera4", "Vermell", 400, "LG", 7, 250, true));
        llistaElectrodomestics.add(createNevera("Nevera5", "Blau", 500, "Electrolux", 6, 300, false));
        llistaElectrodomestics.add(createNevera("Nevera6", "Verd", 350, "Balay", 9, 220, true));
        llistaElectrodomestics.add(createNevera("Nevera7", "Negre", 450, "Whirlpool", 8, 280, false));
        llistaElectrodomestics.add(createNevera("Nevera8", "Gris", 600, "Miele", 10, 320, true));
        llistaElectrodomestics.add(createNevera("Nevera9", "Blanc", 700, "Siemens", 7, 400, false));
        llistaElectrodomestics.add(createNevera("Nevera10", "Taronja", 550, "Bosch", 8, 350, true));

        llistaElectrodomestics.add(createRentadora("Rentadora1", "Blanc", 400, "LG", 8, 1200, true));
        llistaElectrodomestics.add(createRentadora("Rentadora2", "Vermell", 550, "Samsung", 9, 1600, false));
        llistaElectrodomestics.add(createRentadora("Rentadora3", "Negre", 450, "Bosch", 9, 1500, true));
        llistaElectrodomestics.add(createRentadora("Rentadora4", "Blau", 500, "Whirlpool", 10, 1800, false));
        llistaElectrodomestics.add(createRentadora("Rentadora5", "Gris", 350, "Balay", 7, 1400, true));
        llistaElectrodomestics.add(createRentadora("Rentadora6", "Verd", 600, "Electrolux", 8, 1700, false));
        llistaElectrodomestics.add(createRentadora("Rentadora7", "Taronja", 650, "Miele", 10, 1900, true));
        llistaElectrodomestics.add(createRentadora("Rentadora8", "Blanc", 320, "Philips", 6, 1300, false));
        llistaElectrodomestics.add(createRentadora("Rentadora9", "Negre", 480, "Siemens", 8, 1600, true));
        llistaElectrodomestics.add(createRentadora("Rentadora10", "Gris", 370, "Bosch", 7, 1400, true));

        List<Electrodomestic> copiaLlistaeElectrodomestics = copiaLlista(llistaElectrodomestics);

        System.out.println("COMPARACIÓ AMB LA MATEIXA LLISTA");
        System.out.println("--------------------------------");
        comparaListas(llistaElectrodomestics, llistaElectrodomestics);
        System.out.println("COMPARACIÓ AMB LA COPIA DE LA LLISTA");
        System.out.println("--------------------------------");
        comparaListas(llistaElectrodomestics, copiaLlistaeElectrodomestics);

    }

    public static Forn createForn(String nom, String color, int preu, String marca, int eficiència, boolean autoneteja, int temperatura) {
        Forn forn = new Forn();
        forn.nom = nom;
        forn.color = color;
        forn.preu = preu;
        forn.marca = marca;
        forn.eficiència = eficiència;
        forn.autoneteja = autoneteja;
        forn.temperatura = temperatura;
        return forn;
    }

    public static Nevera createNevera(String nom, String color, int preu, String marca, int eficiència, int frigories, boolean soroll) {
        Nevera nevera = new Nevera();
        nevera.nom = nom;
        nevera.color = color;
        nevera.preu = preu;
        nevera.marca = marca;
        nevera.eficiència = eficiència;
        nevera.frigories = frigories;
        nevera.soroll = soroll;
        return nevera;
    }

    public static Rentadora createRentadora(String nom, String color, int preu, String marca, int eficiència, int revolucions, boolean soroll) {
        Rentadora rentadora = new Rentadora();
        rentadora.nom = nom;
        rentadora.color = color;
        rentadora.preu = preu;
        rentadora.marca = marca;
        rentadora.eficiència = eficiència;
        rentadora.revolucions = revolucions;
        rentadora.soroll = soroll;
        return rentadora;
    }

    public static List<Electrodomestic> copiaLlista(List<Electrodomestic> list) {
        List<Electrodomestic> copy = new ArrayList<>();
        for (Electrodomestic i: list) {
            copy.add(i.clone());
        }
        return copy;
    }

    public static void comparaListas(List<Electrodomestic> list1, List<Electrodomestic> list2) {
        String isTheSame = "Les llistes són iguals";
        for (int i = 0; i < list1.size(); i++) {
            Electrodomestic electrodomestic1 = list1.get(i);
            Electrodomestic electrodomestic2 = list2.get(i);
            if (electrodomestic1.equals(electrodomestic2)) {
                System.out.println(electrodomestic1 + " és igual a " + electrodomestic2);
            } else {
                System.out.println(electrodomestic1 + " no és igual a " + electrodomestic2);
                isTheSame = "Les llistes no són iguals";
            }
        }
        System.out.println("");
        System.out.println(isTheSame);
    }
}
