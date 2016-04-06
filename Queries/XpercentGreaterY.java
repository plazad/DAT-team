/**
 * Works!
 */
package dataProject;

/**
 * @author alexisgrebenok
 *
 *	The purpose of this class is to determine the percent
 *	of users that looked at X more than Y.
 *
 */
public class XpercentGreaterY {
	
	/**
	 * The user will input X and Y which are two page types
	 * The method will determine the number of users that looked at X
	 * And then the number of users that looked at Y
	 * Then will determine if X > Y for each row.
	 * Each time X > Y, 1 will be added to the XmoreY variable. 
	 * Percentage will be calculated mathematically.
	 * 
	 * @param finalArr
	 * @param X
	 * @param Y
	 * @return percent
	 * 
	 */
	public static double query3(int[][] finalArr, int X, int Y){
		
		//int[][] finalArr,
		
		/**For testing
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
		finalArr[2][1] = 2;
		finalArr[2][2] = 1;
		finalArr[2][3] = 2;
		finalArr[2][4] = 2;
		finalArr[3][0] = 7;
		finalArr[3][1] = 5;
		finalArr[3][2] = 8;
		finalArr[3][3] = 4;
		finalArr[3][4] = 2;
		*/
		
		//Create variables
		int XmoreY = 0; // one is added each time X views > Y views in a row
		int xTemp = 0; // temp place to store the value indexed in array for X
		int yTemp = 0; // temp place to store the value indexed in array for Y
		double percent; // variable to store the calculated percentage
		//Iterate through the stored sums of pages for each line
		
		for (int i = 0; i<finalArr.length-1; i++){
			xTemp = finalArr[i][X];
			yTemp = finalArr[i][Y];
			if(xTemp > yTemp){
				XmoreY += 1;
			}
		}
		
		//XmoreY divided by total users * 100
		percent = (XmoreY*1.0)/((finalArr.length)*1.0)*100.0;
		//Return the percent to the user
		return percent;
		}
	}
