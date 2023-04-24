import java.util.*;
public class BinarySearch{
    public static boolean BinarySearch(int[] arr,int n,int x){
        int low=0,high=n-1;
        while(low<high)
        {
            int mid=(low+(high-low))/2;
            if(arr[mid]<x)high=mid-1;
            else if(arr[mid]==x)return true;
            else
            low=mid+1;
        }
        return false;
        
    }
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
        if(BinarySearch(arr,n,x))
            System.out.println("Prsent in the given array");
        else
            System.out.println("Not present in the given array");
    }
}