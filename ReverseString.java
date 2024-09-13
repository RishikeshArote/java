import java.util.Scanner;
public class ReverseString 
{
  public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Give a string  ");
      String str = scanner.nextLine();
      String reversed = "";
      for (int i=str.length()-1; i >= 0; i--) 
        {
          reversed += str.charAt(i);
        }
      System.out.println("reversed string " + reversed);
    }
}
----------------------------------------------------------------------------
Give a string
Rishikesh Arote
reversed string etorA hsekihsiR
=====================================================================================================================================================================
