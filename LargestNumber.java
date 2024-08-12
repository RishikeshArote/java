import java.util.*;
class LargestNumber
{
 public static void main(String args[])
  {
     int a,b,c;
     System.out.println("Enter three numbers ");
   Scanner sc =new Scanner (System.in);
 a= sc.nextInt();
 b= sc.nextInt();
 c= sc.nextInt();

if(a>b &&a>c)
    System.out.println("1st no. is largest");
else if(b>a&& b>c)
   System.out.println("2nd  no is largest");
else if(c>a&& c>b)
       System.out.println("3rd no is largest");
else
System.out.println("Number are not distict");
  }
}

    