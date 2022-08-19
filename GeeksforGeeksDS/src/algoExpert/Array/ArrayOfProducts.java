package algoExpert.Array;

public class ArrayOfProducts {


    public static void main(String[] args) {

    }

    public int[] arrayOfProducts(int[] array) {
        // Write your code here.
        // create prefix and suffix array
        int x = array.length;
        int[] res = new int[x];
        int[] prefix = new int[x];
        prefix[0] = 1;
        prefix[1] = array[0] ;
        for(int i=2;i<prefix.length;i++){
            prefix[i] = prefix[i-1] * array[i-1] ;
        }

        int[] suffix = new int[x] ;

        suffix[x-1] = 1 ;
        suffix[x-2] = array[x-1];
        for(int i = x-3;i>=0;i--){
            suffix[i] = suffix[i+1] * array[i+1] ;
        }

        for(int j=0;j<res.length;j++){
            res[j] = prefix[j] * suffix[j] ;
        }
        return res;
    }


}
