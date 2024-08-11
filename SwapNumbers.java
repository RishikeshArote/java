import java.util.Scanner;
class SwapNumbers
  {
     public static void main(String args[])
       {
           int x,y,temp;
System.out.println("Enter two numbers");
Scanner sc= new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
System.out.println("Before swapping\n    x="+x+"   \n   y="+y );
temp=x;
x=y;
y=temp;
System.out.println("After swapping\n      x="+x+"    \n   y="+y);
}
}