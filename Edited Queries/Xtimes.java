package dataProject;

/**
 * @author alexisgrebenok, Destiney Plaza
 *
 *	 The purpose of this class is to determine how many 
 *	 users viewed X a certain number of times.
 *
 */
public class Xtimes extends Thread{
	
	
	/**
	 * The user will input a page type X as well as a number of times the
	 * page was viewed. This method will iterate through the array and 
	 * count up the number of users that viewed the page X that number 
	 * of times!
	 * 
	 * @param finalArr
	 * @param X
	 * @param numViews
	 * @return xSum 
	 */
	
	private static int xSum = 0;
	private int[][] finalArr;
	private int x;
	private int numViews;
	private int start;
	private int end;
	
	public Xtimes (int[][] finalArr, int x, int numViews, int start, int end){
		
		this.finalArr = finalArr;
		this.x = x;
		this.numViews = numViews;
		this.start = start;
		this.end = end;
		
	}//END of Constructor
	
	
	public static synchronized void xSUM(){ //Allows for multiple threads to continue to add to 'xSum' 

		xSum++;
		//Test print: System.out.println("xSum: " + xSum);
	}
	
	public void run(){
		
		int xTemp = 0;
			
		for (int i = start; i<end; i++){ //Iterate through the stored sums of pages for each line
			
			xTemp = finalArr[i][x];
			//Test print: System.out.println("xTemp: " + xTemp);
			
			if(xTemp == numViews){
				xSUM(); //calls synchronized method
			} else {
				xSum += 0;
			}//end of if-else
		
		}//end of loop
		
	}//END of run ()
	
	public int getXtimes(){
		
		return xSum;
		
	}//END of getXtimes()
	
}//END of Xtimes class
