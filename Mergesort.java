public class Mergesort{

   //Given I pass in the parameters, array, start index and last index to the method
   public static void MergeSort(int[] data, int lo, int hi) {
      
      //base condition check
      if(lo==hi) 
         return;
      
      //recurrsion condition check
      else{
         
         //computing middle index value
         int mid = (lo + hi)/2;
         
         //processing left sub-array
         MergeSort(data, lo, mid);
         
         //processing right sub-array
         MergeSort(data, mid+1, hi);
         
         Merge(data, lo, mid, hi);
      
      }

   }
   
   public static void Merge(int[] data, int lo, int mid, int hi){
      
      int sizeL = mid-lo+1;
      
      int sizeR = hi-mid;
      
      //intializing arrays left and right to sizeL+1 and sizeR+1 respectively
      int[] left = new int[sizeL+1];
      int[] right = new int[sizeR+1];
      
      //loading data into left sub-array
      int a = 0;
      for(int i=lo; i<=mid; i++){
         
         left[a] = data[i];
         
         a++;
      }
      
      //loading data into right sub-array
      int b = 0;
      for(int j=mid+1; j<=hi; j++){
         
         right[b] = data[j];
         
         b++;
      }
      
      //i = left sub-array counter | j = right sub-array counter
      int i=0; int j=0;
     
      //Determining the largest value among the left and right sub-array
      int large = Math.max(left[sizeL-1], right[sizeR-1])+1;
      
      //adding the largest value as the last element to both the sub-arrays
      left[sizeL] = large;
      right[sizeR] = large;
      
      for(int k=lo; k<=hi; k++){
         
         //if left is smaller compared to right, then add left value and left counter (i) += 1
         if(left[i] < right[j]){
            
            data[k] = left[i];
            
            i++;
         }
         
         //if right is smaller than or equal to left, then add right value and right counter (j) += 1
         else{
            
            data[k] = right[j];
            
            j++;
         }
      
      }

   }

}

/*********Running time*********
 *                            *
 * Best Case: θ(nlogn)        *
 * Average Caser: θ(nlogn)    *
 * Worst Case: θ(nlogn)       *
 *                            *
 ******************************/
