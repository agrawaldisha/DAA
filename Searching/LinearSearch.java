import java.util.*;
public class LinearSearch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your Array");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
         System.out.println("Key to be searched");
        int x=sc.nextInt();
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x){
                a=2;
                break;
            }
        }
        if(a==2)System.out.println("Present in the given array");
        else
            System.out.println("not present in the given array");
    }
}