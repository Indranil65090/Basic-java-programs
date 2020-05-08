import java.util.Scanner;
public class Armstrongnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number from user:");
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        while(t!=0)
        {
            int c=t%10;
            sum=sum+(c*c*c);
            t/=10;
        }
        if(n==sum)
        {
            System.out.println("The number "+n+" is Armstrong number");
        }
        else
        {
            System.out.println("The number "+n+" is not Armstrong number");
        }
    }
}
