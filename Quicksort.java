 public class Quicksort{
   public static void QuickSort(int[] data, int lo, int hi, int depth) {
   	//Write your code here
   	//You may create other functions if needed 
      if(lo>= hi) 
         return;
      else {
         if(depth > maxDepth) maxDepth = depth;
         int q = partition(data, lo, hi);
         QuickSort(data, lo, q-1, depth++);   
         QuickSort(data, q+1, hi, depth++);
            
      }
   
   }
   public static int partition(int[] data, int lo, int hi){
      int index = -1;
      Random rand = new Random();

      index = rand.nextInt(hi+1-lo) + lo;
      
      //swaping the last element with the radomly selected pivot point
      if(index != hi)swap(data, index, hi);
      
      int pivot = data[hi];
      
      int i = lo-1;
      for(int j=lo; j<=hi-1; j++){
         //if(data[j] <= pivot && i+1 != j){
         if(data[j] <= pivot){
            swap(data, i+1, j);
            i++;
         }
         //else if(i+1 == j) i++;
      }
      swap(data, i+1, hi);
      return i+1;
   }
   public static void swap(int[] data, int index1, int index2){
      if(index1 != index2){
         int temp = data[index1];
         data[index1] = data[index2];
         data[index2] = temp;
      }
   }
}
