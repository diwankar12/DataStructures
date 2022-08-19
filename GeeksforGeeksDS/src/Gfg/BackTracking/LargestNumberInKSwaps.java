package Gfg.BackTracking;

public class LargestNumberInKSwaps {

    public static void main(String[] args) {

//        3
//        4551711527

        String str = "1234567" ;
        System.out.println(findMaximumNum(str,4));
        String str1 = "4551711527";
        System.out.println(findMaximumNum(str1,3));
    }

    public static String findMaximumNum(String str, int k)
    {



        return helper(str,k,0);
    }

    private static String helper(String str,int k,int index){
        if(k==0){
            //System.out.println("when k=0 "+str);
            return str ;
        }
        int max = Integer.MIN_VALUE ;
        int pointer = 0;
        for(int i=index;i<str.length();i++){
            int l = Integer.parseInt(String.valueOf(str.charAt(i))) ;
            if(max<=l){
                max=l ;
                pointer =i ;
            }
        }
        if(index<str.length()) {
            int indexVal = Integer.parseInt(String.valueOf(str.charAt(index)));
            int pointerVal = Integer.parseInt(String.valueOf(str.charAt(pointer)));
            if(indexVal == pointerVal && pointer != index){
                return helper(str,k,index+1);
            }
                String str1 = swap(index, pointer, str);
                return helper(str1, k - 1, index + 1);
        }

       return null ;
    }

    private static String swap(int index,int pointer,String str){

        char ch[] = str.toCharArray();
        char temp = ch[index];
        ch[index] = ch[pointer];
        ch[pointer] = temp;
        return new String(ch);
    }
}
