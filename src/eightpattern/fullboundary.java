package eightpattern;
/*print the pattern 

*****
*****
*****
*****      */


public class fullboundary {
	
	public static void main(String[] args) {
		
		ractanglehol();
		triangle();
		halfPyramid();
		numberPyramid();	
		invertedHalfNumberPyramid();
		oneZeroPatter();
		
		//noRepeatNumberPattern();
		
		startpattern();
		
		
		
//		int n = 5;
//		int m = 4;
//		
//		
//		for (int i=1;i <= m; i++) {
//			
//			for (int j=1;j <= n; j++) {
//				
//			
//			System.out.print("*");
//			
//			}
//			System.out.println();
//		}
		
		
		
	}
/* print the below pattern 
*****
*   *
*   *
*****
*/ 
	public static void ractanglehol() {
		
		int n = 5;
		int m = 4;
		
		
		for (int i=1;i <= m; i++) {
			
			for (int j=1;j <= n; j++) {
			
				if (i == 1 || j == 1 || i == m || j == n)	
			
					System.out.print("*");
				
				else 
					
					System.out.print(" ");
			
				//System.out.println();
			}
			
			
		}
		
		
	}
/* pyramid 
*
**
***
****
  */	
	
public static void triangle() {
		
	
		int m = 4;
		
		for (int i = 1; i <=m; i++) {
			
			for(int j = 1; j<=i; j++) {
			
			System.out.print("*");
			
			
			}
			System.out.println();
		} 

	}

/* half piramind rotated by 180 deg

   *
  **
 ***
****

*/
public static void halfPyramid() {
	
	int n = 8;
	
	for (int i = 1; i<=n; i++) {
		
		for(int j = 1; j<=n-i; j++) { 
		
			System.out.print(" ");
		
			
		}
		
		for (int j = 1; j <= i;j++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	
}

/*
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 
 */


	public static void numberPyramid() {
	int n = 5;
	
	
	for(int i =1; i <= n; i++ ) {
		
		for(int j =1; j<=i; j++) {
		
		System.out.print(j+" ");
		
		
	}
	System.out.println();
	}
	}
	
	
	public static void invertedHalfNumberPyramid() {
	int n = 5;
	
	
	for(int i = 1; i <= n; i++ ) {
		
		for(int j =1; j<=n-i+1; j++) {
		
		System.out.print(j+" ");
		
		
	}
	System.out.println();
	}
	}

/* print the below pattern 
1
01
101
0101
10101
010101
1010101
01010101
  */
	
	
	public static void oneZeroPatter() {
		int n = 8;
		
		
		for(int i = 1; i<= n; i++) {
			
			for(int j =1; j<=i; j++) {
			
				if((i+j) %2 == 0) {
					
					System.out.print("1");
				}
				else 
					
					System.out.print("0");
			}
			System.out.println();
		}
	}
	
	public static void noRepeatNumberPattern() {
		
		
		int n = 5; 
		int number = 1;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j<=i; j++) {
				
				
			System.out.print(number+ " ");
			
			number++;
		
				
			}
			System.out.println();
		}
		
	}
	// homework 
	
	
	public static void startpattern() {
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			for (int j =1 ;  j <=n+i ; j++) {
				
				System.out.print(" ");
				
			
			//System.out.println();
			
			}
		
		for (int k =1 ;  k <=n; k++) {
			
			System.out.print("*");
			
		
		}
		
		System.out.println();
		
		}
		
	}
	
	
}
