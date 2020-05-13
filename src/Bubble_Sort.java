import java.util.Scanner;
public class Bubble_Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to sort:");
        int n=sc.nextInt();
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int a[]=new int[num];
        int m=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println("The element at "+ m +" position:");
            a[i]=sc.nextInt();
            m++;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("The sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
