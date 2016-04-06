/**
 * 
 */
package dataProject;

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
/**
 * @author Destiney
 *
 */
public class FileReadIn {
	
private Scanner scanText;
private String[] pageHistory = new String[10];
private static int[][] sortedUserHistory = new int[10][17];
private int[] intArr; //1D array 
private int break1 = 2;
private int break2 = 6;
private static int finalIndex = 0; //should keep track of index of Final array


	public FileReadIn(String history){
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
	
	
	public String[] getPageHistory(){
		
		return pageHistory;
		
	}//END of getPageHistory
	
	public static synchronized void storeArray(int[] myArr){
		//int count = 0;
		for(int i= 0; i < myArr.length ; i++){
			System.out.println("myarr: i= " + i +" value: " + myArr[i]);
			int sum = sortedUserHistory[finalIndex][myArr[i] - 1];
			System.out.println("Sum is: " + sum);
			//sum++;
			
			sortedUserHistory[finalIndex][myArr[i] - 1] = (sum + 1); 
			System.out.println("Sum after is: " + sortedUserHistory[finalIndex][myArr[i] - 1]);
		}
		
		finalIndex ++;
		System.out.println("finalArray [0][0] " + sortedUserHistory[0][0]);
	}//END of storeArray()
	
	
	public int[][] getFinalArray(){
		
		return sortedUserHistory;
		
	}//END of getFinalArray()
	
	
	public void sortingUserHistory(){
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				// TODO Auto-generated method stub
				for(int i = 0; i < break1 ; i ++){
					
					//System.out.println("hi");
					//Want to check how many times does each number occur
					//Then will place each occurrences in designated index
					//Yet need to parse pageHistory index value and covert to ints
					
					/*
					 * Need to parse it then sort it to then count how many 
					 * times a number appears
					 */
					System.out.println("PageHistory: " + pageHistory[i]);
					String[] strArr = pageHistory[i].split(" ");
					
					intArr = new int[strArr.length];
					
					for( int j = 0 ; j< strArr.length; j++){
						
						System.out.println("String :" + strArr[j]);
						intArr[j] =  Integer.parseInt(strArr[j]);
						System.out.println(intArr[j]);
						
					}//end of 2nd for-loop
					
					//Need to sort intArr first
					//TEST System.out.println("intArr length: " + intArr.length);
					//TEST System.out.println("Index 3 before sort: " + intArr[3]);
					
					//ort(intArr);
					storeArray(intArr);
					
					//TEST System.out.println("Index 3 after sort" + intArr[3]);
					
					
					/*
					 * Should call another method 
					 * method should take in intArr and find 
					 * the occurrences of a value to then 
					 * add to final array
					 */
					
				}//end of 1st for-loop
				
			}//END of run()
			
		});//END of t1
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//END of sortingUserHistory()
	
	
}//END of FileReadIn class
