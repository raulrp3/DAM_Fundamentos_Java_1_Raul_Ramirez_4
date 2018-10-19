package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion){
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case  0:{
                while(!sc.hasNextInt()){
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1:{
                while(!sc.hasNextDouble()){
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return  validado;
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
        numero =(int)validador(0);
        sc.close();
        System.out.println(comprobarNumero(numero));
    }
}
