package tcs_examples;
import java.util.*;

public class tcsninja9 {
   public static void main(String [] args)
{
   int count =0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the n number");
   int n=sc.nextInt();
   sc.nextLine();
    
   System.out.println("Enter the "+n+" elements now");
   String str=sc.nextLine();
    
    
   String []arrst=str.split(" ");
    if(arrst.length==n)
    {
       int [] arr=new int[n];
        for(int u=0;u<arr.length;u++)
        {
            arr[u]=Integer.parseInt( arrst[u]);
        }
        Arrays.sort(arr);
    
        for(int y=0;y<n-1;y++)
        {
            if(arr[y]==arr[y+1])
            {
               count++;
               y++;
            }
        }
        
        System.out.println(count);
    }
    else
    {
      System.out.println("Error --> Enter correct number of n elements");
    }
}
}
