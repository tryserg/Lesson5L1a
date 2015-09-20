package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Input array size:");
        n = sc.nextInt();

        int[] mass = new int[n];
        int[] b = new int[n];

        inputArrayEl(mass);
        b = max(mass);
        print(b);

        sc.close();
    }

    static void inputArrayEl(int[]a){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Input array elements:");
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("MAX of ARRAY: " + a[a.length - 1]);

    }

    static int[] max(int[] a) {
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);

        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                int temp;
                int count = 0;
                temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
                count++;
                if (count == 0) {
                    break;
                }
            }
        }
        return b;
    }

}
