/**
 * Created by anshuaggarwal on 2/8/16.
 */
import java.util.Scanner;

public class Pattern
{
    public static void main (String args[])
    {
        int n;
        System.out.println("Enter Value of n");
        Scanner input = new Scanner( System.in );
        n= input.nextInt();

        System.out.println("Printing Single *");

        System.out.println("*");
        System.out.println();

        System.out.println("Printing *s horizontally");
        int num=n;
        while(n!=0)
        {
            System.out.print("*");
            n--;
        }
        System.out.println();

        System.out.println("Printing *s vertically");
        n=num;
        while(n!=0)
        {
            System.out.println("*");
            n--;
        }
        System.out.println();

        n=num;
        System.out.println("Printing Right Triangle");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        n=num;
        System.out.println("Printing Isosceles Triangle");
        for(int i=1;i<=n;i++) {
            for (int k = n - i; k > 0; k--)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        n=num;
        System.out.println("Printing Diamond");
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>0;k--)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--)
        {
            for (int k=n-i; k>0; k--)
                System.out.print(" ");

            for (int j=1; j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

        n=num;
        System.out.println("Printing Diamond with my name");
        for(int i=1;i<=n;i++)
        {
            for(int k=n-i;k>0;k--)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
            {
                if(i!=n)
                System.out.print("*");
                else
                {

                    System.out.print("Anshu");
                    break;
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--)
        {
            for (int k=n-i; k>0; k--)
                System.out.print(" ");

            for (int j=1; j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
