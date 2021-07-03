class Test {
    static boolean isAutomorphic(int n)
    {
        int sq = n * n;
  
      
        while (n > 0) {
        
            if (n % 10 != sq % 10)
                return false;
  
            
            n /= 10;
            sq /= 10;
        }
  
        return true;
    }
  
   
    public static void main(String[] args)
    {
        int n = 5;
  
        System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");
    }
}
output:

Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776

Input  : N = 25
Output : Automorphic
As 25*25 = 625

Input : N = 7
Output : Not Automorphic
As 7*7 = 49