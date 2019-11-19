package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x,y;
        System.out.println("Unesite dva broja: x i y");
        Scanner unos = new Scanner(System.in);
        x = unos.nextInt();
        y = unos.nextInt();

        com.company.Calculator kalk = new com.company.Calculator();
        System.out.println("Zbir: " +kalk.add(x,y));
        System.out.println("Razlika: " +kalk.sub(x,y));
        System.out.println("Proizvod: " +kalk.mul(x,y));
        System.out.println("Kolicnik " +kalk.div(x,y));
        System.out.println("Modul " +kalk.mod(x,y));
    }
}
