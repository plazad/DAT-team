/**
 * Works!
 */
package dataProject;

/**
 * @author alexisgrebenok
 *
 *	The purpose of this class is to determine the percent of users 
 *	that looked at X.
 *
 */
public class PercentX {
	
	/** User will enter a page type to consider
	 *  Number of users that looked at X will be added together
	 *  Percentage will be determined mathematically
	 * 
	 *  @param finalArr
	 *  @param X
	 *  @return percentViewed
	 * 
	 */
	
	public static double query2(int[][] finalArr, int X){
		//int[][] finalArr,
	/** For Testing Purposes
		int[][] finalArr = new int[4][5];
		finalArr[0][0] = 14;
		finalArr[0][1] = 0;
		finalArr[0][2] = 13;
		finalArr[0][3] = 4;
		finalArr[0][4] = 32;
		finalArr[1][0] = 0;
		finalArr[1][1] = 22;
		finalArr[1][2] = 2;
		finalArr[1][3] = 19;
		finalArr[1][4] = 6;
		finalArr[2][0] = 11;
		finalArr[2][1] = 2;
		finalArr[2][2] = 0;
		finalArr[2][3] = 22;
		finalArr[2][4] = 2;
		finalArr[3][0] = 7;
		finalArr[3][1] = 5;
		finalArr[3][2] = 8;
		finalArr[3][3] = 0;
		finalArr[3][4] = 12;
		*/
		//Create variable xUserSum to represent the total users that looked at X
		int xUserSum = 0;
		
		//Variable for the percentage calculation
		double percentViewed = 0;
		
		//Iterate through the lines of code and add quantity of X to sum
		for (int i = 0; i<finalArr.length-1; i++){
			if (finalArr[i][X] != 0){
				xUserSum += 1;
			}
		}
		//Take xUsers and divide it by the total number of lines * 100
		
		percentViewed = ((xUserSum * 1.0)/(finalArr.length-1)*1.0)*100.0;
		//return xUserSum;
		return percentViewed;
		
		//Return the percent to the user in the GUI
	}
	
}
