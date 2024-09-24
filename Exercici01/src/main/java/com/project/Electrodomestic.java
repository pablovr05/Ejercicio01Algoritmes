package com.project;

public abstract class Electrodomestic {
    
    public String nom;
    public String color;
    public int preu;
    public String marca;
    public int eficiència;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.preu = target.preu;
            this.marca = target.marca;
            this.eficiència = target.eficiència;
        }
    }

    public abstract Electrodomestic clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return cast2.nom.equals(nom) && cast2.color.equals(color) && cast2.preu == preu && cast2.marca.equals(marca) && cast2.eficiència == eficiència;
    }
}