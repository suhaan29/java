import java.util.*;

public class Fibonacci{
    public static void main(String args[])
    {
        int n = 5;
        int t1 = 0; int t2 = 1;
        int sum = 0;
        for(int i = 1; i <=5; i++)
        {
            System.out.println(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
