package Day4;
/*
 *      1
 *      12
 *      123
 *      1234
 *      12345
 */
public class pattern3 {

	public static void main(String[] args) {


//		 for(int i=1;i<=5;i++)
//		 {
//			 for(int j=1;j<=i;j++)
//			 {
//				System.out.print(i); 
//			 }
//			 System.out.println();
//		 }

	/*     55555
	 *     4444
	 *     333
	 *     22
	 *     1
	 *   	 
	 */
		 for(int i=5;i>=1;i--)       //5 times 4  3 2 1
		 {
			 for(int j=1;j<=i;j++)    
			 {                            
				System.out.print(i); 
				//System.out.print(j); 
			 }
			 System.out.println();
		 }
		 
		 
		 
	}

}
