package lab;

import java.util.*;
class LabOne{
public static void main(String args[])
{

System.out.println("Enter a number");
Scanner scan = new Scanner(System.in);   
 int number= scan.nextInt();
int sum=0;

while(number!=0)
{
int digit= number%10;
sum=sum+digit*digit*digit;
number=number/10;
}
System.out.println("The sum of cubes of digits of is   "  +sum);


}}
