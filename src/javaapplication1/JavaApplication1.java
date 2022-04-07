/*
 * Guillermo Avelar
 * NumberSorter
 * A program that sorts a users inputs into evens, odds and negatives
 * 1/26/2021
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Guillermo Avelar
 */
public class JavaApplication1 {
        //instance variables
	public static Scanner reader = new Scanner(System.in); 
	public static int[] array = new int[10], evenList = new int[10] , oddList = new int[10], negativeList = new int[10];
	public static int count = 0,count1=0,count2=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
			loop();
			assignNumbers();
			
		}
		
		public static void loop()
		{
			//while loop that runs until the array is full
			while (count<array.length)
			{
				System.out.println("Enter an integer:");
				System.out.println((10 - count) + " entries remaining"); //shows how many entries remain
				int number = reader.nextInt();

				
				array[count] = number;
				count++;
			}
			
		}	

		
		public static void assignNumbers()
		{
                    int n=0;
			for (int i = 0; i<array.length;i++) //for loop/if statements that increment an according variable that represents a range for each element in array
			{
				if (array[i] < 0){
					negativeList[i]=array[i];}
				
				else if (array[i] % 2 == 0){
					evenList[i]=array[i]; n++;}
					
				else if (array[i] % 2 == 1){
					oddList[i]=array[i];}
			}
                        
                    int[] nevenList= new int[n];
                        for(int i=0; i<n; i++){
                            if(evenList[i] != 0){
                                nevenList[i]=evenList[i];
                            }
                        }
                System.out.println("The even numbers entered: ");
		for(int value : nevenList)
		{
			System.out.println(value+"\n");
		}
		
		System.out.println("The odd numbers entered: ");
		for(int value : oddList)
		{
			System.out.println(value);
		}	
		System.out.println();
		
		System.out.println("The negative numbers entered: ");
		for(int value : negativeList)
		{
			System.out.println(value);
		}	
		System.out.println();
				
		}
	
	public static void printNumbers() //print the sorted numbers
	{
		
    }
    
}
