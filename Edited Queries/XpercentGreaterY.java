/**
 * Works!
 */
package dataProject;

/**
 * @author alexisgrebenok, Timothy Posenjak, Destiney Plaza
 *
 *	The purpose of this class is to determine the percent
 *	of users that looked at X more than Y.
 *
 */
public class XpercentGreaterY extends Thread {
	
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
	
	private static double percent;
	private int[][] finalArr;
	private int x;
	private int y;
	private static int xmoreY;
	private int start;
	private int end;
	
	public XpercentGreaterY (int[][] finalArr, int x, int y, int start, int end){
		
		this.finalArr = finalArr;
		this.x = x;
		this.y =y;
		this.start = start;
		this.end = end;
		
	}//END of constructor 
	
	public static synchronized void addXmoreY() {
		xmoreY += 1;
	}
	
	public void run() {
		
		//Create variables
		int XmoreY = 0; // one is added each time X views > Y views in a row
		int xTemp = 0; // temp place to store the value indexed in array for X
		int yTemp = 0; // temp place to store the value indexed in array for Y
		//double percent; // variable to store the calculated percentage
		//Iterate through the stored sums of pages for each line
		
		for (int i = start; i<end; i++){
			xTemp = finalArr[i][x];
			yTemp = finalArr[i][y];
			if(xTemp > yTemp){
				//XmoreY += 1;
				addXmoreY();
			}
		}
		
		//XmoreY divided by total users * 100
		percent = (XmoreY*1.0)/((finalArr.length)*1.0)*100.0;
		}
	
	public double getXpercentGreaterY() {
		
		return percent;
	}
	}
