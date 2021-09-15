package factorial;

import java.util.Scanner;


/*author @AlexanderRojas */
public class Factorial {

    /*En el main entra y sale el valor*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /*Trae clase Scanner a variable sc*/
        int num =sc.nextInt(); /*pide un int*/
        System.out.println(factorial(num)); /*imprime resultado*/
    }
    
    /*Declara método 'factorial' que consume un INT*/
    public static long factorial (int n){
        long aux = 1; /*Declara acumulador*/
        for(int i=2;i<=n;i++){ /*Bucle(inicio,fin,intervalo)*/
        aux *= i; /*acumulanding*/
        }
            return aux; /*¿Qué acumuló?*/                                    
    }
    
} /*end*/