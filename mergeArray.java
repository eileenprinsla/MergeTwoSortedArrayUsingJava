import java.util.*;
public class mergeArray
{
	public static void main(String[] args)
	{
		System.out.println("Merge Two Sorted List ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array: ");
		int n=sc.nextInt();
		int[] arr1= new int[n];
		System.out.println("Enter the sorted elements of the first array: ");
		for(int k=0;k<n;k++)
		{
			arr1[k]=sc.nextInt();
		}
		System.out.println("Enter the length of second array: ");
		int m=sc.nextInt();
		int[] arr2= new int[m];
		System.out.println("Enter the sorted elements of the second array: ");
		for(int k=0;k<m;k++)
		{
			arr2[k]=sc.nextInt();
		}
		List<Integer> l=new ArrayList<Integer>();
		int i=0,j=0;
		while ( i<(arr1.length) && j<(arr2.length) ){
			if(arr1[i] > arr2[j]){
				l.add(arr2[j]);
				j++;
			}
			else if(arr1[i] < arr2[j]){
				l.add(arr1[i]);
				i++;
			}
			else{
				l.add(arr1[i]);
				i++;
				j++;
			}
		}
		while(i<=(arr1.length-1)){
			l.add(arr1[i]);
			i++;
		}
		while(j<=(arr2.length-1)){
			l.add(arr2[j]);
			j++;
		}
		System.out.println("The Merged Sorted List: "+ l);
	}
}