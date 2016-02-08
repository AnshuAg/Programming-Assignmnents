/**
 * Created by anshuaggarwal on 2/8/16.
 */
public class FB {
    public static void main(String[] args)
    {
        FB obj= new FB();
        obj.FizzBuzz();

    }

    private void FizzBuzz()
    {
        for(int i=1; i<=100; i++)
        {
            if(i%5==0&&i%3==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
