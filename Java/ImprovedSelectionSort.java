public class ImprovedSelectionSort {

    public static void sort(int[] a) {
        // Implement me!
        int len=a.length;
        int i_min,i_max, min,max, tmp;
        for(int i=0;i<len/2;i++){
            i_min=i;
            i_max=i;
            min=a[i];
            max=a[i];
            for(int j=i+1;j<len-1;j++){
                if(a[j]<min){
                    min=a[j];
                    i_min=j;
                }
            if(a[j]>max){
                max=a[j];
                i_max=j;
            }
            }

            tmp=a[i];
            a[i]=a[i_min];
            a[i_min]=tmp;
            
            if(i==i_max){
                i_max=i_min;
            }

            tmp=a[len-1-i];
            a[len-1-i]=a[i_max];
            a[i_max]=tmp;
        }
    }

}
