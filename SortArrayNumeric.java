
public class SortArrayNumeric {

	public static void main(String[] args) {
int arr[]= {20,30,80,55,22,50,40};
		
		System.out.print("Array original elements = ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+",");
		}
		
		int temp=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Array replace elements= ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+",");
		}

	}

}
