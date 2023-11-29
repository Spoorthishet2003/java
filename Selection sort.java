//SELECTION SORT

package lab;
import java.util.Scanner;
import java.util.Random;

public class mergesort {
	
	public static void sort(int[]a, int low,int high)
	{
		int N=high-low;
		if(N<=1)
			return;
		int mid=low+N/2;
		sort(a,low,mid);
		sort(a,mid,high);
		int[]temp=new int[N];
		int i=low, j=mid;
		for( int k=0;k<N;k++)
		{
			if(i==mid)
				temp[k]=a[j++];
			else if(j==high)
				temp[k]=a[i++];
			else if(a[j]<a[i])
				temp[k]=a[j++];
			else
				temp[k]=a[i++];
		}
		for( int k=0;k<N;k++)
			a[low+k]=temp[k];
					
                      
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter the size of the array");
int size = scanner.nextInt();
int[] array=new int[size];
Random random= new Random();
System.out.println("populating array with random numbers");
for(int i=0;i<size;i++)
{
	array[i]=random.nextInt();
}
System.out.println("original array");
for(int i=0;i<size;i++)
{
	System.out.println(array[i]+"");
}
long startTime=System.currentTimeMillis();
sort(array,0,size);
long  endTime =System.currentTimeMillis();
long executionTime=endTime-startTime;
System.out.println("sorted array");
for(int i=0;i<size;i++)
{
	System.out.println(array[i]+"");
}
System.out.println("total time take fot execution"+executionTime+"milliseconds");
scanner.close();
	}
}
