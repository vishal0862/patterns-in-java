import java.util.*;
public class fifth5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hello their:");
        int a=sc.nextInt();
        for(int i=0; i<a; i++)
        {
            for(int j=a-i; j>1; j--)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                System.out.print(" *");
            System.out.println();
        }

    }
}
