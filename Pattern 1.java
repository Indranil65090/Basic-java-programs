import java.util.Scanner;

public class Pattern 1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        int n1=n;
        for(int r=1;r<=n;r++)
        {
            if(r>1)
            {
                for(int space=1;space<=r-1;space++)
                {
                    System.out.print(" ");
                }
            }
            for(int i=n1;i>=1;i--)
            {
                System.out.print("*");
            }
            n1--;
            System.out.println();
        }
    }
}




