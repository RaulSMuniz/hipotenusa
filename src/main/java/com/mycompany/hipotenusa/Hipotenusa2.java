package com.mycompany.hipotenusa;

public class Hipotenusa2 {
    // variáveis para a hipotenusa, catetos A e B.
    public double a, b, hip;
    // definir que cateto A e B serão elevados ao quadrado e que a hipotenusa receberá a soma dos dois.
    public double calculo(){
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        hip = a + b;
        return hip;
    }
    // tendo realizado a soma, para obter o real resultado da hipotenusa, será feita a raiz quadrada da hipotenusa.
    public void valorhip(){
        calculo();
        System.out.println("A hipotenusa é: "+ Math.sqrt(hip));
    }
}

