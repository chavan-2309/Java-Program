   //Accept a Number n from  the user and display  the sum of natural number up to n..

import java.util.Scanner;
public class demo
{
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre your Number:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<= n)
        {
        System.out.println(i);
        sum += i;
        i++;
        }
        System.out.println("sum:"+sum);
   }
}

/*
PS C:\ORG-JAVA\03 May> javac demo.java 
PS C:\ORG-JAVA\03 May> java demo       
Entre your Number:
5
1
2
3
4
5
sum:15
PS C:\ORG-JAVA\03 May>   */