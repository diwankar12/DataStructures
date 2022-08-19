import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {

        System.out.println(minimum("XHXHXHADOBECODEBANCXHXHXHX","ABC"));


    }


    private static String minimum(String x,String y){

        String ans = "";
        if(x.length()==0) return y ;
        if(y.length()==0) return ans  ;

        int mct = y.length(); // 3
        int dmct = 0;
        int i=0;
        int j= 0 ;
        Map<Character,Integer> mapy = new HashMap<>();
        for(int k=0;k<y.length();k++){
            char ch = y.charAt(k);
            mapy.put(ch,mapy.getOrDefault(ch,0)+1); // A=1,B=1,C=1
        }
        Map<Character,Integer> mapx = new HashMap<>();

        while(true){

            boolean f1 = false ;
            boolean f2 = false ;

            // acquire
            while(i<x.length() && dmct<mct){
                char ch1 = x.charAt(i);
                mapx.put(ch1,mapx.getOrDefault(ch1,0)+1); // X =1
                if(mapy.containsKey(ch1) && mapy.getOrDefault(ch1,0)>=mapx.getOrDefault(ch1,0)){
                    dmct++;
                }
                i++;
                f1=true ;
            }

            while(j<i && dmct==mct){

                String potentialAns = x.substring(j,i);
                System.out.println("pans = "+potentialAns);
                if(ans.length()==0 || potentialAns.length()<ans.length()){
                    ans = potentialAns ;
                }

                char ch2 = x.charAt(j) ;

                if(mapx.get(ch2)==1){
                    mapx.remove(ch2);
                }else {
                    mapx.put(ch2,mapx.getOrDefault(ch2,0)-1);
                }
                //Input: x = "XHXHXHADOBECODEBANCXHXHXHX", y = "ABC"
                if(mapy.containsKey(ch2)) dmct--;
                j++;
                f2=true ;
            }

            if(!f1 && !f2) break ;
        }


        return ans ;



    }

}
