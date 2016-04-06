package dataProject;

/**
 * @author alexisgrebenok
 *
 * This is a class to determine if the number of times a page is
 * viewed greater than or less than the number of times that the
 * page is actually looked at. True or False will be assigned to 
 * a variable which will be returned to the user in massage form.
 *  
 */


public class LookedAtX {
	
	/** User will enter a number to be compared to X
	 *  Number entered by user will be defined to a variable - numViews;
	 *  xSum will be defined as the number of users who looked at X
	 * 
	 *  @param finalArr
	 *  @param X
	 *  @param numViews
	 *  @return truth
	 * 
	 */
		
	public static boolean query1(int[][] finalArr, int X, int numViews){
		//int[][] finalArr, 
		
		/** For Testing Purposes
		int[][] finalArr = new int[4][5];
		finalArr[0][0] = 2;
		finalArr[0][1] = 0;
		finalArr[0][2] = 6;
		finalArr[0][3] = 4;
		finalArr[0][4] = 3;
		finalArr[1][0] = 2;
		finalArr[1][2] = 2;
		finalArr[1][3] = 9;
		finalArr[1][4] = 6;
		finalArr[2][0] = 1;
		finalArr[2][1] = 1;
		finalArr[2][2] = 1;
		finalArr[2][3] = 2;
		finalArr[2][4] = 2;
		finalArr[3][0] = 7;
		finalArr[3][1] = 5;
		finalArr[3][2] = 8;
		finalArr[3][3] = 4;
		finalArr[3][4] = 2;
		*/
		
		int xSum = 0; //Variable
		
		// Iterate through the array
		for (int i = 0; i<finalArr.length-1; i++){
			xSum += finalArr[i][X]; //Add the number of views from each row
		}
		
		//xSum and numViews will be compared
		boolean truth = true;
		//numViews > xSum … return True
		
		if (numViews > xSum){
			truth = true;
		} else {
			truth = false;
		}
		return truth;
		
	}
}

