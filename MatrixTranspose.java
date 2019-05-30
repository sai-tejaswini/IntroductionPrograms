import java.util.Scanner;

class MatrixTranspose
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the row and column of matrix - ");
		System.out.println();
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		int tarr[][] = new int[c][r];

		System.out.println("Enter elements of matrix ");
		for(int k=0; k<r ; k++)
		{
			for(int l=0 ; l<c ; l++)
			{
				arr[k][l] = sc.nextInt() ;
			}
		}

		for(int i=0; i<c ; i++)
		{
			for(int j=0; j<r ; j++)
			{
				tarr[i][j] = arr[j][i];
			}
		}
		

/*		
		for(int k=0; k<r ; k++)
		{
			for(int l=0 ; l<c ; l++)
			{
				System.out.print(arr[k][l]);
			}
			System.out.println();
		}
*/
		for(int k=0; k<c ; k++)
		{
			for(int l=0 ; l<r ; l++)
			{
				System.out.print(tarr[k][l]);
			}
			System.out.println();
		}


	}
}