/**
 * 
 */
package dataProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Destiney
 *
 */
public class FileReadIn1 {
	
	private Scanner scanText;
	private String[] pageHistory = new String[989818];
	private static int[][] sortedUserHistory = new int[989818][17];
	private int[] intArr; //1D array 
	//private int break1 = 2;
	//private int break2 = 6;
	private static int finalIndex = 0; //should keep track of index of Final array


		public FileReadIn1(String history){
			File text = new File(history);
			 try {
				scanText = new Scanner(text);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}//END of try catch
			 
			 userHistory(); //called to put data into 'pageHistory' array
			 sortingUserHistory();
			
		}//END of constructor
		
		
		private void userHistory(){
			int index = 0 ;
			while(scanText.hasNextLine()){
				
				pageHistory[index] = scanText.nextLine();
				index ++;
				
			}
			
		}//END of userHistory()
		
		/**
		 * Returns 1D String array where each index represents a line in the text file 
		 * @return pageHistory
		 */
		
		public String[] getPageHistory(){
			
			return pageHistory;
			
		}//END of getPageHistory
		
		/**
		 * Stores how many times a number appears
		 * @param myArr
		 */
		public static void storeArray(int[] myArr){
			
			for(int i= 0; i < myArr.length ; i++){
				
				int sum = sortedUserHistory[finalIndex][myArr[i] - 1];		
				sortedUserHistory[finalIndex][myArr[i] - 1] = (sum + 1); 
				
			}
			
			finalIndex ++;
			
		}//END of storeArray()
		
		/**
		 * Returns Final 2d array that is used with queries
		 * @return sortedUserHistory
		 */
		public int[][] getFinalArray(){
			
			return sortedUserHistory;
			
		}//END of getFinalArray()

		
		public void sortingUserHistory(){
			
			for(int i = 0 ; i < pageHistory.length ; i++){
					
				String[] strArr = pageHistory[i].split(" ");
				intArr = new int[strArr.length];
				
				for( int j = 0 ; j< strArr.length; j++){
					
					intArr[j] =  Integer.parseInt(strArr[j]);
						
				}//end of 2nd for-loop
				
				storeArray(intArr);
				
			}//end of 1st for-loop
			
			
		}//END of sortingUserHistory()
		

}//END of FileReadIn class
