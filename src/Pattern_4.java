import java.util.Scanner;
public class Pattern_4 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows from user:");
        int n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
