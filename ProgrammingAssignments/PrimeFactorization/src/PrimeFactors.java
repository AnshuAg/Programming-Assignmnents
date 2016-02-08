
/**
 * Created by anshuaggarwal on 2/8/16.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        PrimeFactors obj= new PrimeFactors();
        int num;
        Scanner in= new Scanner(System.in);

        System.out.println("Enter Number Whose Factors You Want to generate..");
        num= in.nextInt();

        ArrayList<Integer> FactorList= obj.generate(num );


        System.out.println("Factors of "+num +" is :-");
        for (int value : FactorList)
            System.out.println(value);

    }

    private ArrayList<Integer> generate(int n)
    {
        ArrayList<Integer> Factors = new ArrayList<>();
        System.out.println("in generate");

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0&&IsPrime(i))
            {
                Factors.add(i);
            }

        }

        return Factors;
    }

    private boolean IsPrime(int num)
    {
        boolean flag= true;

        if(num==2)
            return  true;
        else
        {
            for (int i = 2; i<=num/2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }

            }

            return flag;
        }
    }
}
