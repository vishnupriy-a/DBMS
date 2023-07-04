/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package javaapplication1;

/**
 *
 * @author exam1
 */
public class Cpu {

    float price;

    private static class Ram {

        String memory, manufacturer;

    }

    private class Processor {

        int noOfCores;
        String manufacturer;
        void display()
        {
            System.out.println("Cpu Details are");
            System.out.println("Processor ="+manufacturer);
            System.out.println("Processor Cores ="+noOfCores);
            System.out.println("Cpu Details are");
        }
    }
    
        public static void main(String[] args) {
        System.out.println("HEYYY");
        Cpu obj1=new Cpu();
    }
}
