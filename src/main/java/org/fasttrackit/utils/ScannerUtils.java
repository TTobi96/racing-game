package org.fasttrackit.utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public String nextLine() {
        return scanner.nextLine();
    }

    public int nextSingleInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextInt();
        }
    }

    public double nextSingleDouble(){
        try{
            return scanner.nextDouble();
        }finally {
            scanner.nextLine()
        }
    }
}
