package com.company;

import java.util.Scanner;

public class RecebeValor {

    public long get(){

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um valor: ");
    int param1 = sc.nextInt();
    return param1*1000000;
    }

}
