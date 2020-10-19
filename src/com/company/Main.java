package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();
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
