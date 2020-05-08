import java.util.Scanner;
public class Pattern_3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        int n1=n;
        for(int r=0;r<n;r++)
        {
            if(n1>1)
            {
                for(int space=n1-1;space>=1;space--)
                {
                    System.out.print(" ");
                }
            }
            for(int i=1;i<=(2*r+1);i++)
            {
                System.out.print(i);
            }
            n1--;
            System.out.println();
        }
    }
}
