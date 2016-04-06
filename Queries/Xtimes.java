/**
 *  works!
 */
package dataProject;

/**
 * @author alexisgrebenok
 *
 *	 The purpose of this class is to determine how many 
 *	 users viewed X a certain number of times.
 *
 */
public class Xtimes {
	
	/**
	 * 
	 * The user will input a page type X as well as a number of times the
	 * page was viewed. This method will iterate through the array and 
	 * count up the number of users that viewed the page X that number 
	 * of times!
	 * 
	 * @param finalArr
	 * @param X
	 * @param numViews
	 * @return xSum
	 * 
	 */
	
	public static int query5 (int[][] finalArr, int X, int numViews){
		//int[][] finalArr,
		/**
		int[][] finalArr = new int[4][5];
		finalArr[0][0] = 2;
		finalArr[0][1] = 0;
		finalArr[0][2] = 6;
		finalArr[0][3] = 4;
		finalArr[0][4] = 3;
		finalArr[1][0] = 2;
		finalArr[1][2] = 6;
		finalArr[1][1] = 2;
		finalArr[1][3] = 4;
		finalArr[1][4] = 6;
		finalArr[2][0] = 1;
		finalArr[2][1] = 2;
		finalArr[2][2] = 1;
		finalArr[2][3] = 4;
		finalArr[2][4] = 2;
		finalArr[3][0] = 7;
		finalArr[3][1] = 2;
		finalArr[3][2] = 8;
		finalArr[3][3] = 4;
		finalArr[3][4] = 2;
		*/
		
		//Create variable xSum
		int xSum = 0;
		int xTemp = 0;
		//Iterate through the stored sums of pages for each line
		
		for (int i = 0; i<finalArr.length-1; i++){
			xTemp = finalArr[i][X];
			if(xTemp == numViews){
				xSum += 1;
			} else {
				xSum += 0;
			}
		
		}
		//Add view number for the specific line to xSum and return
		return xSum;
	}
}
