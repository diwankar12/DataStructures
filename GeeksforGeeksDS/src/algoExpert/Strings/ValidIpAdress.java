package algoExpert.Strings;

import java.util.ArrayList;

public class ValidIpAdress {


    public static void main(String[] args) {

    }
    public ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        getValidAddress(new ArrayList<>(),string,ans,0);
        return ans;
    }

    public void getValidAddress(ArrayList<String> list ,String str,ArrayList<String> ans,int start){

        //base case
        if(list.size()==4){
            if(start!=str.length()) return ;
            StringBuilder sb = new StringBuilder();
            for(String ls : list){
                sb.append(ls);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString());
            return ;
        }



        for(int i=1 ; i<=3;i++){

            if(start+i>str.length()) break ;

            String sub = str.substring(start,start+i);
            if(validate(sub)){
                list.add(sub);
                getValidAddress(list ,str,ans,start+i);
                list.remove(list.size()-1);
            }

        }


    }

    public boolean validate(String str){

        if(str.isEmpty()) return false ;
        int num = Integer.parseInt(str);
        if(num>255){
            return false ;
        }

        if(str.length()>1 || str.charAt(0)=='0'){
            return false ;
        }

        return true ;
    }
}
