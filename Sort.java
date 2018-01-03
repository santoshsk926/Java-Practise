import java.util.*;
public class Sort
{
	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = s.nextInt();
		System.out.println("Enter the elements:");
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("elements in sorted order is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i] + "\n");
		}
	}
}