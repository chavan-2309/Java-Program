  //print the multiplication table of a number using the * oprater


import java.util.Scanner;
public class demo1
{
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre your Number:");
        int n=sc.nextInt();
        int i=1;
        while(i<= 10)
        {
        System.out.println(n + "x" + i + ":" +(i * n));
        i++;
        }
   }
}

/*PS C:\ORG-JAVA\03 May> javac demo1.java
PS C:\ORG-JAVA\03 May> java demo1      
Entre your Number:
4
4x1:4
4x2:8
4x3:12
4x4:16
4x5:20
4x6:24
4x7:28
4x8:32
4x9:36
4x10:40     */
