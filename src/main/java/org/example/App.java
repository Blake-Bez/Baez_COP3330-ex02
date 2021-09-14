/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("What is the input string? ");
            String name = input.next();

            System.out.println(name + " has " + name.length()+ " characters");
        }
    }
