package com.mycompany.hipotenusa;
import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args) {
        Hipotenusa2 res = new Hipotenusa2();
        
        Scanner cateto01 = new Scanner(System.in);
        System.out.println("Qual o valor do primeiro cateto?");
        res.a = (cateto01.nextInt());
        
        Scanner cateto02 = new Scanner(System.in);
        System.out.println("Qual o valor do segundo cateto?");
        res.b = (cateto02.nextInt());
        res.valorhip();
        cateto01.close();
        cateto02.close();
         
    }
}
