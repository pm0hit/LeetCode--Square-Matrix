//Given an integer n, generate a square matrix filled with elements from 1 to n^2. Given n = 3, 
//You should return the following matrix:[ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ]


import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		1111
		System.out.println("Enter Matrix Dimension:");
		
		int n = scan.nextInt();
		
		scan.close();
		
		if(n<=0) {
			System.out.println("Enter Valid value of n");
		}
					
		int[][] result= new int[n][n];
		
					
    int cur=1;
        
			while(true)	{
			for(int i=0; i<=n-1; i++) {
				
				for(int j=0; j<=n-1; j++) {
			
					result[i][j] = cur++;
					System.out.printf(result[i][j]+ " ");
						
				} System.out.println();
			} 
			
			break;
			
		}	
	}
	
}
	
