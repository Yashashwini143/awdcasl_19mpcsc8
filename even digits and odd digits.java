import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        int n,odd=0,even=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            if(r%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            n=n/10;
        }
        System.out.println("odd digits"+odd);
        System.out.println("even digits"+even); 
    }
    
}

output:
enter n
12345
odd digits3
even digits2
