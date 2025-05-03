   // Compute the power of  a number m^n

   import java.util.Scanner;
   public class demo4
   {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int m=sc.nextInt();
        System.out.println("Enter power :");
        int n=sc.nextInt();
        int i=1;
        int power=1;
        while(i<=n)
        {
         power*=m;
         i++;
        }
            System.out.println("Power: " + n + " of " + m + " is:"+ power );
        
    }
   }

   /*
   output
   PS C:\ORG-JAVA\03 May> javac demo4.java
PS C:\ORG-JAVA\03 May> java demo4      
Enter Number:
5
Enter power :
3
Power: 3 of 5 is:125
PS C:\ORG-JAVA\03 May> 
    */

   