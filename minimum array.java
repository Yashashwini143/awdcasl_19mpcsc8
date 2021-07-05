import java.util.Scanner;
public class minimum
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int size,i;
        System.out.print("Enter array size:");
        size=sc.nextInt();
        int ar[];
        ar=new int[size];
        System.out.print("Enter array elements:");
        for(i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
            
        }
        int min=ar[0]; //size=5
        for(i=1;i<size;i++)
        {
            if( ar[i]>min)
            min=ar[i];
            
        }
        System.out.print("Minimum element is:" +min);
        
    }
    
}
output:
Enter array size:5
Enter array elements:12
34
45
56
67
Minimum element is:67
