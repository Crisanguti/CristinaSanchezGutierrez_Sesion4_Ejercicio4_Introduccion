package com.ej4introduccion;

public class Main {

    public static void main(String[] args) {

        //if

        int numeroIf = 0;

        if(numeroIf>0) {
            System.out.println("Es positivo");
        } else if (numeroIf<0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es cero");
        }

        //while

        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println("Valor del bucle while: " + numeroWhile);
            numeroWhile++;
        }

        //doWhile

        int doWhile = 0;

        do {
            System.out.println("valor del bucle do while: " + doWhile);
        } while (doWhile<0);

        //for

                for (int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("Valor del bucle for: " + numeroFor);
        }

        //switch

        String estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
                default: System.out.println("Esto no es una estación");
        }

    }
}
