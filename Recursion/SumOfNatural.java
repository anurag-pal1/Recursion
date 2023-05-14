import java.util.*;
public class SumOfNatural {
    public static int findSum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
            else
            {
                sum=sum-i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int n=sc.nextInt();
            int result=findSum(n);
            System.out.println("Sum of digits of given number is: "+result);
        }
    }
}
