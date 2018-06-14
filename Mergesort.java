public class Mergesort{

   public static void MergeSort(int[] data, int lo, int hi) {

      if(lo==hi) 
         return;
      else{
         int mid = (lo + hi)/2;
         MergeSort(data, lo, mid);
         MergeSort(data, mid+1, hi);
         Merge(data, lo, mid, hi);
      }
   	//System.out.println("MergeSort");
   }
   public static void Merge(int[] data, int lo, int mid, int hi){
      int sizeL = mid-lo+1;
      int sizeR = hi-mid;
      
      //for approach2 added +1 on the sizes of the arrays
      int[] left = new int[sizeL+1];
      int[] right = new int[sizeR+1];
      
      int a = 0;
      for(int i=lo; i<=mid; i++){
         left[a] = data[i];
         a++;
      }
      int b =0;
      for(int j=mid+1; j<=hi; j++){
         right[b] = data[j];
         b++;
      }
      int i=0; int j=0;
     
      int large = Math.max(left[sizeL-1], right[sizeR-1])+1;
      left[sizeL] = large;
      right[sizeR] = large;
      for(int k=lo; k<=hi; k++){
         if(left[i] < right[j]){
            data[k] = left[i];
            i++;
         }
         else{
            data[k] = right[j];
            j++;
         }
      
      }

   }

}
