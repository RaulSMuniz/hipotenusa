package com.mycompany.hipotenusa;

public class Hipotenusa2 {
    public double a, b, hip;
    public double calculo(){
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        hip = a + b;
        return hip;
    }
    public void valorhip(){
        calculo();
        System.out.println("A hipotenusa é: "+ Math.sqrt(hip));
    }
}

