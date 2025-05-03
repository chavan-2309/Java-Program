  //print the multiplication table of a number without using the * oprater


import java.util.Scanner;
public class demo2
{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Number:");
         int n=sc.nextInt();
         int i=n;
         while(i <= n*10)
         {
            System.out.println(i);
            i+=n;
         }
    }
}  */
  /*
  output
  PS C:\ORG-JAVA\03 May> javac demo2.java
PS C:\ORG-JAVA\03 May> java demo2      
Enter Your Number:
4
4
8
12
16
20
24
28
32
36
40
PS C:\ORG-JAVA\03 May> 
  */

//  OR



/*
import java.util.Scanner;
public class demo2
{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your number:");
         int n=sc.nextInt();
         int i=1;
         int j=n;

         while(i <= 10)
         {
            System.out.println(j);
            j = j + n;
            i++;
         }
    }
}

    /*
    
    output
    PS C:\ORG-JAVA\03 May> javac demo2.java
PS C:\ORG-JAVA\03 May> java demo2      
Enter your number:
4
4
8
12
16
20
24
28
32
36
40
PS C:\ORG-JAVA\03 May> 
     */     
 