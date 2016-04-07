package dataProject;

/**
 * @author alexisgrebenok, Destiney Plaza
 * 
 * 	The purpose of this class is to determine the number 
 * 	of users that looked at x more than y.
 *
 */

public class XthanY extends Thread{
	
	/**
	 * 
	 *  x and y are input by the user, both representing page types.
	 * This method will determine the number of users that looked at x more than y.
	 * Comparing each row's views of x and y and adding 1 to variable XmoreY each
	 * time a user viewed x page more than y page.
	 *
	 * @param finalArr
	 * @param x
	 * @param y
	 * @return XmoreY
	 * 
	 */
	
	private static int xmoreY = 0;
	private int[][] finalArr;
	private int x;
	private int y;
	
	public XthanY (int[][] finalArr, int x, int y){
		
		
		this.finalArr = finalArr;
		this.x = x;
		this.y = y;
		
		}//END of constructor
	
	public static synchronized void addXmoreY(){
		
		xmoreY += 1;
		
	}//END of addXmoreY()
	
	public void run(){

		int xTemp = 0;
		int yTemp = 0;
		
		for (int i = 0; i<finalArr.length; i++){ //Iterate through the lines and for each line with x we +1 xViews
			System.out.println("Length: " + finalArr.length);
	
			xTemp = finalArr[i][x];
			yTemp = finalArr[i][y];
				if(xTemp > yTemp){
					addXmoreY();
				}
			}
			
			
	}//END of run()
	
	
	public int getXthanY(){
		
		return xmoreY;
		
	}//END of getXmoreY()
	
	
	}//END of XthanY class