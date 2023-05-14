import java.util.*;
public class Armstrong {
    public static double findArmstrong(int num)
    {
        int temp=num;
        int digit=0;
        int rem=0;
        double sum=0;
        while(temp!=0)
        {
              temp/=10;
              digit++;
        }
        while(num!=0)
        {
            rem=num%10;
             sum=sum+Math.pow(rem,digit);
             num=num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a number: ");
            int n=sc.nextInt();
            double result=findArmstrong(n);
            if(result==n)
            {
                System.out.println("YES,it is a Armstrong Number.");
            }
            else
            {
                System.out.println("NO,it is not a Armstrong Number.");
            }
        }
    }
}
