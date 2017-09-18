/*
aman kumar jha
*/
import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;
public class biginteger
{
    static BigInteger factorial(int N)
    {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
    public static void main(String args[]) throws Exception
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(factorial(n));
    }
}
