/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto140;

import java.util.*;

/**
 *
 * @author Milzork
 */
public class Reto140 
{

    /**
     * @param args the command line arguments
     */
    public static char numerico(char numero) 
    {
        char valor = 0;
        
        if (numero == '0') {
            valor = 0;
        } else if (numero == '1') {
            valor = 1;
        } else if (numero == '2') {
            valor = 2;
        } else if (numero == '3') {
            valor = 3;
        } else if (numero == '4') {
            valor = 4;
        } else if (numero == '5') {
            valor = 5;
        } else if (numero == '6') {
            valor = 6;
        } else if (numero == '7') {
            valor = 7;
        } else if (numero == '8') {
            valor = 8;
        } else if (numero == '9') {
            valor = 9;
        }
        return valor;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean fin = false;

        while (fin == false) 
        {
            String array = sc.nextLine();
            
            char aux[] = array.toCharArray();
            
            int numero[] = new int[aux.length];
            
            for (int i = 0; i < aux.length; i++) 
            {
                if (aux[i] == '-') {
                    fin = true;
                    break;
                }
            }
            
            if(fin == true)
            {
                break;
            }

            int total = 0;

            for (int i = 0; i < numero.length; i++) 
            {
                numero[i] = numerico(aux[i]);
            }

            for (int i = 0; i < numero.length; i++) 
            {
                total += numero[i];
            }

            for (int i = 0; i < numero.length - 1; i++) 
            {
                System.out.print(numero[i] + " + ");
            }
            
            System.out.print(numero[numero.length - 1] + " = " + total + "\n");

        }
    }
}
