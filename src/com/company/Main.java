package com.company;

import java.util.Scanner;

public class Main {
    public static int validarNumero(Scanner sc){
        int numeroValidado;
        while (!sc.hasNextInt()){
            System.out.print("¡Introduce un valor numérico! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }
    public static String comprobarNumero(int numero){
        String cadenaResultado;
        if (numero < 0){
            cadenaResultado = String.format("EL número %d es negativo", numero);
        }else{
            cadenaResultado = String.format("El número %d es positivo", numero);
        }
        return cadenaResultado;
    }
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a comprobar si un número es negativo o positivo.");
        System.out.print("Introduce un número: ");
        numero =validarNumero(sc);
        sc.close();
        System.out.println(comprobarNumero(numero));
    }
}
