import java.util.Scanner;

public class Pattern 3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        int n1=n-1;
        int i,j,space;
        for(i=1;i<=n;i++)
        {
            for(space=n1;space>=1;space--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            n1--;
            System.out.println();
        }
    }
}
