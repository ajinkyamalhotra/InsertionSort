public class Insertionsort{
   
   //Given I pass in the parameters, array and array size to the method
   public static void InsertionSort(int[] data, int size) {
      
      int temp = 0;
     
      //from 1 to size-1
      for(int i=1; i<size; ++i){
         
         temp = data[i];
         
         int j=0;
         
         //from i-1 down to 0
         for(j=i-1; j >= 0; --j){
            
            if(data[j] > temp)
               data[j+1] = data[j];
            
            else 
               break;
         
         }
         
         data[j+1] = temp;
      }   	
   	
   }

}
/*********Running time*********
 *                            *
 * Best Case: θ(n)            *
 * Average Caser: θ(n^2)      *
 * Worst Case: θ(n^2)         *
 *                            *
 ******************************/
