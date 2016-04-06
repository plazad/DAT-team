/**
 * WORKS!
 */
package dataProject;

/**
 * @author alexisgrebenok
 * 
 * 	The purpose of this class is to determine the number 
 * 	of users that looked at X more than Y.
 *
 */
public class XthanY {
	
	/**
	 * 
	 * X and Y are input by the user, both representing page types.
	 * This method will determine the number of users that looked at X more than Y.
	 * Comparing each row's views of X and Y and adding 1 to variable XmoreY each
	 * time a user viewed X page more than Y page.
	 *
	 * @param finalArr
	 * @param X
	 * @param Y
	 * @return XmoreY
	 * 
	 */
	
	public static int query4 (int[][] finalArr, int X, int Y){
		
		//int[][] finalArr, 
		/** For Testing Purposes
		int[][] finalArr = new int[4][5];
		finalArr[0][0] = 2;
		finalArr[0][1] = 0;
		finalArr[0][2] = 6;
		finalArr[0][3] = 4;
		finalArr[0][4] = 3;
		finalArr[1][0] = 2;
		finalArr[1][1] = 2;
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
		int xTemp = 0;
		int yTemp = 0;
		int XmoreY = 0;
		
		//Iterate through the lines and for each line with X we +1 xViews
		
		for (int i = 0; i<finalArr.length-1; i++){
			xTemp = finalArr[i][X];
			yTemp = finalArr[i][Y];
				if(xTemp > yTemp){
					XmoreY += 1;
				}
			}
		return XmoreY;	
		}
	
	}
