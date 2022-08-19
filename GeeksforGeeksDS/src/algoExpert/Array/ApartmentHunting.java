package algoExpert.Array;

import java.util.*;

public class ApartmentHunting {

    public static void main(String[] args) {




        List<Map<String, Boolean>> blocks = new ArrayList<>();
        Map<String, Boolean> mp1 = new HashMap<>();
        mp1.put("gym",false);
        mp1.put("school",true);
        mp1.put("store",false);
        blocks.add(mp1);

        Map<String, Boolean> mp2 = new HashMap<>();
        mp2.put("gym",true);
        mp2.put("school",false);
        mp2.put("store",false);
        blocks.add(mp2);


        Map<String, Boolean> mp3 = new HashMap<>();
        mp3.put("gym",true);
        mp3.put("school",true);
        mp3.put("store",false);
        blocks.add(mp3);



        Map<String, Boolean> mp4 = new HashMap<>();
        mp4.put("gym",false);
        mp4.put("school",true);
        mp4.put("store",false);
        blocks.add(mp4);


        Map<String, Boolean> mp5 = new HashMap<>();
        mp5.put("gym",false);
        mp5.put("school",true);
        mp5.put("store",true);
        blocks.add(mp5);

        String[] reqs = new String[]{"gym", "school", "store"};

        System.out.println(apartmentHunting(blocks,reqs));



    }
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        // Write your code here.
        int[][] res = new int[reqs.length][blocks.size()] ;
        for(int j=0;j<reqs.length;j++){
            res[j] = getValForReq(reqs[j],blocks);
            System.out.println(Arrays.toString(res[j]));
        }
        int[] maxDistancesAtblock = findMaxForEachColumn(res,blocks);
        return getIndex(maxDistancesAtblock);
    }


    public static int getIndex(int[] maxDistanceAtBlocks){
        int idx = 0 ;
        int val = Integer.MAX_VALUE;
        for(int i=0;i<maxDistanceAtBlocks.length;i++){
            if(val>maxDistanceAtBlocks[i]){
                val = maxDistanceAtBlocks[i] ;
                idx = i ;
            }
        }


        return idx ;
    }


    public static int[] findMaxForEachColumn(int[][] res,List<Map<String, Boolean>> blocks){
        int[] newArr = new int[blocks.size()] ;
        for(int i=0;i<blocks.size();i++){
            int maxi = Integer.MIN_VALUE;
            for(int j=0;j<res.length;j++){
                maxi = Math.max(res[j][i],maxi) ;
            }
            newArr[i] = maxi;
        }

        return newArr ;

    }

    public static int[] getValForReq(String req,List<Map<String, Boolean>> blocks){
        int[] reqArr = new int[blocks.size()] ;
        for(int i=0;i<blocks.size();i++){
            if(blocks.get(i).get(req)){
                reqArr[i] = 0 ;
            } else if(i==0){
                reqArr[i] = Integer.MAX_VALUE ;
            } else {
                reqArr[i] = reqArr[i-1] + 1 ;
            }
        }
        for(int i=blocks.size()-1;i>=0;i--){
            if(i==blocks.size()-1){
                continue ;
            } else {
                if(reqArr[i]==Integer.MAX_VALUE){
                    reqArr[i] = Math.min(reqArr[i+1] ,reqArr[i]) +1 ;
                } else {
                    reqArr[i] = Math.min(reqArr[i+1] ,reqArr[i]) ;
                }
            }
        }
        return reqArr ;
    }
}
