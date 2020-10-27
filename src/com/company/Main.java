package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();
        String[] massivS = k.split(" ");
        double a = Double.valueOf(massivS[0]);
        double b = Double.valueOf(massivS[1]);
        if (a <= 0 && b <= 0)
        {
            System.out.printf("no such x");
        }
       else {
            if ((a > 0 && b >= 0) || (a == 0 && b > 0)) {
                System.out.printf("any x");
            }
            else {
                if (a > 0 && b < 0)
                {
                    double x1 = b/a;
                    double x2 = x1*(-1);
                    System.out.printf("x<%f or x>%f",x1,x2);
                }
                else
                {
                    double x1 = b/a;
                    double x2 = x1*(-1);
                    System.out.printf("%f<x<%f",x1,x2);
                }
            }
        }


        /*int s = in.nextInt();
        int p = s%10;
        if(p==1 && s != 11)
        {
            System.out.println(s + " TOPT");
        }
        else
        {
            if (p >= 2 && p <= 4 && !(s>=12 && s <=14))
            {
                System.out.println(s + " TOPTA");
            }
            else
            {
                System.out.println(s + " TOPTOB");
            }
        }
        /*String k = in.nextLine();
        String[] massivS = k.split(" ");
        int u = Integer.valueOf(massivS[0]);
        int i = Integer.valueOf(massivS[1]);
        int r = Integer.valueOf(massivS[2]);
        if (u <= i && u <= r)
        {
            System.out.print(u + " ");
            if (r <= i)
            {
                System.out.print(r + " ");
                System.out.print(i);
            }
            else {
                System.out.print(i + " ");
                System.out.print(r);
            }
        }
        else
        {
            if (i <= u && i <= r)
            {
                System.out.print(i + " ");
                if (r <= u)
                {
                    System.out.print(r +" ");
                    System.out.print(u);
                }
                else {
                    System.out.print(u + " ");
                    System.out.print(r);
                }
            }
            else
            {
                System.out.print(r + " ");
                if (i <= u)
                {
                    System.out.print(i +" ");
                    System.out.print(u);
                }
                else {
                    System.out.print(u + " ");
                    System.out.print(i);
                }
            }
        }

        /*int a = in.nextInt();
        if(a>=0 && a<=9)
        {
            System.out.println("DIGIT");
        }
        else
        {
            if(a>=10 && a<=99)
            {
                System.out.println("NUM");
            }
            else
            {
                System.out.println("OTHER");
            }
        }*/

    }
}
