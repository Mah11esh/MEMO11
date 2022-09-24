package Day4;
/*
 *     *****
 *     ****
 *     ***
 *     **
 *     *
 */
public class pattern2 {

	public static void main(String[] args) {


		for(int row=1;row<=5;row++) // row =1  2 3   5
		{                       
			//for(int col=5;col>=row;col--)//  5 times 4  3  2  1
			for(int col=1 ;col<=6-row;col++)	
			{           
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
