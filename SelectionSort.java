// Juan Aguirre

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;



public class SelectionSort
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
   
   
   
   
    // SelectionSort(values);
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
        
      
         
         selectionSort(values);
         
         printArray(values);
       
         System.out.println();
      
      
      
         
      }
      final long running_time = System.nanoTime() - startTime;
      System.out.println("The running time of program 4 is:"+ running_time +"\t"+"Seconds");
   }
   
   public static void printArray(int[] B) {
      System.out.println(Arrays.toString(B));
   }

      
   public static  int[] selectionSort(int values[])
   {
     
      for(int i = values.length - 1; i >= 0; i--)	
      {
         int highestIndex = i;				
         for(int j = i; j >= 0; j--)			
         					
         {
            if(values[j] > values[highestIndex])	// compare current element to highest
               highestIndex = j;		// if it's higher, it becomes the new highest
         }
      
         int temp = values[i];
         values[i] = values[highestIndex];
         values[highestIndex] = temp;
      }
      return values;
   }
}


     
      
           
     
    

   
    //public static int BubbleSort(int [] values) {
		//int temp = 0;
      //int count = temp;
		
		//for (int i=0;i< values.length-1; i++){
			//for (int j=0;j< values.length-1; j++){
	   	//if (values[j]>values[(j+1)]){
					//temp =values[j+1];
					//values[j+1]= values[j];
					//values[j] = temp;
					
              // return temp;
			
				// }
			//}
			
		// }
		//return temp;
      //}
    // }

