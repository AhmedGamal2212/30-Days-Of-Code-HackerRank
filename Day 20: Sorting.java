package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        List<Integer> a = new ArrayList<Integer>();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int entry = in.nextInt();
            a.add(entry);
        }
        int numberOfSwaps = 0, swapsForIteration = 0;

        for(int i = 0; i < n; i++){
            swapsForIteration = 0;
            for(int j = 0; j < n - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    swapsForIteration++;
                    a.set(j + 1, a.get(j + 1) + a.get(j));
                    a.set(j, a.get(j + 1) - a.get(j));
                }
            }
            numberOfSwaps += swapsForIteration;
            if(swapsForIteration == 0)
                break;
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }
}
