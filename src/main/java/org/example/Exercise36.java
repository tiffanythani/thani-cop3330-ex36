package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Exercise36 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a list of numbers, separated by spaces: ");
            String data = in.nextLine();


            String record[] = data.split(" ");

            // returns the int array of even #'s
            Integer listEven[] = filterEvenNumbers(record);

            System.out.print("The even numbers are ");
            for(int i=0; i<listEven.length; i++){
                if(i < listEven.length-1){
                    System.out.print(listEven[i] + " ");
                }
                else
                {
                    System.out.print(listEven[i] + ".");
                }
            }
        }
        public static Integer[] filterEvenNumbers(String record[]) {

            ArrayList<Integer> newList = new ArrayList<>();

            for(int i=0; i<record.length; i++){

                int number = Integer.parseInt(record[i]);

              //if a number is divisible by 2 it is even
                if(number % 2 == 0){

                    newList.add(number);
                }
            }

            // converting array list to integer array
            Integer[] arr = new Integer[newList.size()];
            arr = newList.toArray(arr);
            return arr;
        }
    }


