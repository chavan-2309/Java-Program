// Accept a character and a range n,then display the next n characters.

import java.util.Scanner;
public class demo5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character:");
        char ch= sc.next().charAt(0);

        System.out.println("Enter number:");
        int n=sc.nextInt();
        int start = (int)ch;
        int end = start + n;

        while(start < end)
        {
            System.out.println((char)start);
            start++;
        }
    }
}

/*
output
 PS C:\ORG-JAVA\03 May> javac demo5.java
PS C:\ORG-JAVA\03 May> java demo5      
Enter character:
a
Enter number:
26
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z
PS C:\ORG-JAVA\03 May> 
 */