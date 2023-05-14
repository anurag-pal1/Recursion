import java.util.*;
public class SumofArray {
    public static int findSum(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
     return sum;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter size of array: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter array elememts: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result=findSum(arr);
            System.out.println("Maximum value is: "+result);
        }
    }
}
