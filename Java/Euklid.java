public class Euklid{
    static int euklid2(int m, int n){
        int z=1;
        while(z!=0){
            z = m % n;
            m=n;
            n=z;
            
        }
        return n;
    }
    public static void main(String[] args) {
         Sustem.out.println(euklid2(10,19));
        
    }
}