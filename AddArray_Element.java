package com.example.demo.Array.Exercise;

import java.util.Scanner;

public class AddArray_Element {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n;
        System.out.print("Enter Number Of Element = ");
        n = cin.nextInt();
        int a[] = new int[n];

        for(int i = 0; i< a.length; i++){
            System.out.print("Enter a[" + i + "] =");
            a[i] = cin.nextInt();
        }

        System.out.println("List all Element of Array....");

        for (int i = 0; i< a.length; i++){
            System.out.println("a [" + i + "] =" + a[i]);
        }
    }
}
