package dataProject;

/**
 * @author alexisgrebenok, Timothy Posenjak, Destiney Plaza 
 *
 * This is a class to determine if the number of times a page is
 * viewed greater than or less than the number of times that the
 * page is actually looked at. True or False will be assigned to 
 * a variable which will be returned to the user in massage form.
 *  
 */


public class LookedAtX extends Thread {
	
	/** User will enter a number to be compared to x
	 *  Number entered by user will be defined to a variable - numViews;
	 *  xSum will be defined as the number of users who looked at x
	 * 
	 *  @param finalArr
	 *  @param x
	 *  @param numViews
	 *  @return truth
	 * 
	 */
	
	private static int xSum = 0;
	private int[][] finalArr;
	private int x;
	private static int numViews;
	private static boolean truth= false;
	private int start;
	private int end;
		
	public LookedAtX (int[][] finalArr, int x, int numViews, int start, int end){
		
		this.finalArr = finalArr;
		this.x = x;
		this.numViews = numViews;
		this.start = start;
		this.end = end;
		
	}//END of Constructor
	
	public static synchronized void findTruth(){
		
		if (numViews > xSum){
			truth = true;
		} else {
			//truth = false;
		}
	}
	
	public void run(){
		
		// Iterate through the array
		for (int i = start; i<end; i++){
			xSum += finalArr[i][x]; //Add the number of views from each row
		}
	}
	
	public boolean getLookedAtX() {
		
		return truth;
	}
}