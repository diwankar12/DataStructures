package Gfg.BackTracking;

public class KSwapsAlternativeMethod {


    public static String findMaximumNum(String str, int k)
    {
        String ans = str ;
        int n = str.length();
        solve(str,n,k,0,ans) ;
        return ans ;

    }

    private static void solve(String str, int n, int k, int index,String ans) {

      if(k==0){
          return;
      }

      char maxChar = str.charAt(index);
      for(int i=index+1;i<n;i++){
          if(maxChar<str.charAt(i)){
              maxChar=str.charAt(i);
          }
      }
      if(maxChar!=str.charAt(index)){
          k--;
      }
      for(int i=n-1;i>=index;i--){

          if(str.charAt(i)==maxChar){
              swap(index,i,str);
              if(Integer.parseInt(String.valueOf(ans))<Integer.parseInt(str)){
                  ans=str;
              }
              solve(str,n,k,index+1,ans);
              swap(index,i,str);
          }

      }
    }

    private static void swap(int index,int pointer,String str){

        char ch[] = str.toCharArray();
        char temp = ch[index];
        ch[index] = ch[pointer];
        ch[pointer] = temp;
    }


}
