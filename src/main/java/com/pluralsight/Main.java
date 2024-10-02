package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CellPhone cellPhone1 = new CellPhone(
                sc.nextInt(), //serial number
                sc.nextLine(), //phone number
                sc.nextLine(), //model
                sc.nextLine(), //carrier
                sc.nextLine()); //owner

        System.out.println(cellPhone1);


        CellPhone cellPhone2 = new CellPhone();



        System.out.print("\nEnter the phone serial number: ");
        cellPhone2.setSerialNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("\nEnter the phone number: ");
        cellPhone2.setPhoneNumber(sc.nextLine());
        System.out.print("\nEnter the phone Model: ");
        cellPhone2.setModel(sc.nextLine());
        System.out.print("\nEnter the phone carrier: ");
        cellPhone2.setCarrier(sc.nextLine());


        System.out.println(cellPhone2);
    }











}