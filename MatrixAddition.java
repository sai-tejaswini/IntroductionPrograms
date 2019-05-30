import java.util.Scanner;

class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of matrix - ");
		System.out.println();
		int s = sc.nextInt();
		int arr1[][] = new int[s][s];
		int arr2[][] = new int[s][s];

		System.out.println("Enter elements of 1st matrix ");
		for(int k=0; k<s ; k++)
		{
			for(int l=0 ; l<s ; l++)
			{
				arr1[k][l] = sc.nextInt() ;
			}
		}

		System.out.println("Enter elements of 2nd matrix ");
		for(int k=0; k<s ; k++)
		{
			for(int l=0 ; l<s ; l++)
			{
				arr2[k][l] = sc.nextInt() ;
			}
		}

		
		for(int i=0; i<s ; i++)
		{
			for(int j=0; j<s; j++)
			{
				arr1[i][j]+=arr2[i][j];
			}
		}
		
		
		for(int k=0; k<s ; k++)
		{
			for(int l=0 ; l<s ; l++)
			{
				System.out.print(arr1[k][l] + " ");
			}
			System.out.println();
		}

	}
}