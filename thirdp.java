import java.util.*;
public class thirdp {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0; i<a; i++)
    {
        for(int j=0; j<i; j++)
        {
            System.out.print(" ");
        }
        for(int j=0; j<a; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
 }   
}
