   // Calculate the Factorial of a given number n

import java.util.Scanner;
public class demo3
{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Number:");
         int n=sc.nextInt();
         int i=n;
         int fact =1;
         while(i>=1)
         {
            System.out.println(i);
            fact *=i;
            i--;
         }
         System.out.println("Factorial: "+ n +"is="+fact);
    }
}    


/* 
output
PS C:\ORG-JAVA\03 May> javac demo3.java
PS C:\ORG-JAVA\03 May> java demo3
Enter Your Number:
5
5
4
3
2
1
Factorial: 5is=120
PS C:\ORG-JAVA\03 May>  */