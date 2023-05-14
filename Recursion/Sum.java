import java.util.*;
public class Sum{
    public static int findSum(int num){
        int result=0;
        if(num==0)
        {
            return 0;
        }
        else
        {
          result=(num%10)+findSum(num/10);;
          
        }
        return result;
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