// Juan Aguirre 

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;



public class BubbleSort
{
   
   public int count = 0;
   public static  int num_itimes = 0;
   public  int running_time = 0;

   public static void main(String args[])
   {
   
   
   
   
   
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the size of the array:");
      int num1 = scan.nextInt();
      System.out.println();
      System.out.println("Please enter the number of iterations:");
      int num_itimes = scan.nextInt();
      System.out.println();
   
   
   
   
    // BubbleSort(values);
      final long startTime = System.nanoTime();
     
      for(int i=0;i<num_itimes;i++)
      {
         Random generator = new Random();
          
         //int size;
         
         int size = generator.nextInt();
       
         int [] values = new int[num1]; 
         for(int n=0; n<values.length; n++)
         {
            values[n] = generator.nextInt(100) + 1;	 
         }
        
      
         
         BubbleSort(values);
         
         printArray(values);
       
         System.out.println();
      
      
      
         
      }
      final long running_time = System.nanoTime() - startTime;
      System.out.println("The running time of program 3 is:"+ running_time + "\t"+ "Seconds");
   }
   
   public static void printArray(int[] B) {
      System.out.println(Arrays.toString(B));
   }
  
       
     
    public static int BubbleSort(int [] values) {
		int temp = 0;
      int count = temp;
		
		for (int i=0;i< values.length-1; i++){
			for (int j=0;j< values.length-1; j++){
	   	if (values[j]>values[(j+1)]){
										
               return temp;
			
				 }
			}
			
		 }
		return temp;
      }
    }
