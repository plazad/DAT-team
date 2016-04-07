/**
 * Works!
 */
package dataProject;

/**
 * @author alexisgrebenok, Timothy Posenjak, Destiney Plaza 
 *
 *	The purpose of this class is to determine the percent of users 
 *	that looked at X.
 *
 */
public class PercentX extends Thread {
	
	/** User will enter a page type to consider
	 *  Number of users that looked at X will be added together
	 *  Percentage will be determined mathematically
	 * 
	 *  @param finalArr
	 *  @param X
	 *  @return percentViewed
	 * 
	 */
	
	private static double percentViewed = 0;
	private int[][] finalArr;
	private int x;
	private static int xUserSum = 0;
	private int start;
	private int end;
	
	public PercentX (int[][] finalArr, int x, int start, int end) {
		
		this.finalArr = finalArr;
		this.x = x;
		this.start = start;
		this.end = end;
		
	}//END of constructor 
	
	public static synchronized void findPercent () {
		
		xUserSum += 1;
	}
	
	public void run() {
		
		//Create variable xUserSum to represent the total users that looked at X
		//int xUserSum = 0;
		
		//Variable for the percentage calculation
		//double percentViewed = 0;
		
		//Iterate through the lines of code and add quantity of X to sum
		for (int i = start; i<end; i++){
			if (finalArr[i][x] != 0){
				//xUserSum += 1;
				findPercent();
			}
		}
		//Take xUsers and divide it by the total number of lines * 100
		percentViewed = ((xUserSum * 1.0)/(finalArr.length-1)*1.0)*100.0;
	}
	
	public double getPercentX() {
		
		//return xUserSum;
		return percentViewed;
		//Return the percent to the user in the GUI
	}
	
}
