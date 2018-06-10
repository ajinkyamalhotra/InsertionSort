public class Insertionsort{
   public static void InsertionSort(int[] data, int size) {
   	//Write your code here
      int temp = 0;
      for(int i=1; i<size; ++i){
         temp = data[i];
         int j=0;
         for(j=i-1; j >= 0; --j){
            if(data[j] > temp) data[j+1] = data[j];
            else 
               break;
         }
         data[j+1] = temp;
      }
   	//System.out.println("InserionSort");
   	
   }
}
