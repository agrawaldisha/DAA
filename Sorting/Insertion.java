import java.util.*;
public class insertion{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int a=arr[i],j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>a){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=a;
        }
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}