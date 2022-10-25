
import java.util.*;
public class Abc
{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number");
      int a=sc.nextInt();
      for(int i=0; i<a; i++)
      {
         for(int j=0; j<a; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }

   }
} 
