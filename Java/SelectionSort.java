public class SelectionSort {

    public static void sort(int[] a) {
        // Implement me!
      int i,j,min,min_i,tmp;
      for(i=0;i<a.length-1;i++{
          min_i=i;
          min=a[i];
          for(j=i;j<length;j++){
              if(a[j]<min){
                  min=a[j];
                  min_i=j;
              }
          }
      }if(min<a[i]){
          tmp=a[i];
          a[i]=a[min_i];
          a[min_i]=a[i];
          
      }
    }

}
