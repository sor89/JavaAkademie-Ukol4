package com.company;


//ukol 4 - obvod a obsah geometrických těles
public class Main {

    enum GeoTvar {
        OBDELNIK, CTVEREC, KRUH, TROJUHELNIK
    }

    public static void main(String[] args) {

        GeoTvar tvar = GeoTvar.OBDELNIK;

        System.out.println(vypocetObvodu(tvar));
        System.out.println(vypocetObsahu(tvar));

    }

    public static String vypocetObvodu(GeoTvar tvar) {
        int a = 5;
        int b = 10;
        int c = 0;
        double pi = 3.14;
        double r = 1.4;

        return switch (tvar) {
            case OBDELNIK -> "Obvod tělesa " + tvar + " je " + (2 * (a + b)) + " cm.";
            case CTVEREC -> "Obvod tělesa " + tvar + " je " + (4 * a) + " cm.";
            case TROJUHELNIK -> "Obvod tělesa " + tvar + " je " +  (a + b + c) + " cm.";
            case KRUH -> "Obvod tělesa " + tvar + " je " + (2 * pi * r) + " cm.";
        };
    }

        public static String vypocetObsahu(GeoTvar tvar){
            int a = 5;
            int b = 10;
            int z = 1;
            int v = 2;
            double pi = 3.14;
            double r = 5.3;

            return switch (tvar) {
                case OBDELNIK -> "Obsah tělesa " + tvar + " je " + (a * b )+ " cm.";
                case CTVEREC -> "Obsah tělesa "+ tvar +" je " + (a * a )+ " cm.";
                case TROJUHELNIK -> "Obsah tělesa "+ tvar +" je " + ((v * z)/2) + " cm.";
                case KRUH -> "Obsah tělesa je "+ tvar +" je " + (pi * r * r) + " cm.";
            };
        }


}




