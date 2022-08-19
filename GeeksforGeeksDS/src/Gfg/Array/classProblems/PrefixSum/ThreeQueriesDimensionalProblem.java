package Gfg.Array.classProblems.PrefixSum;

public class ThreeQueriesDimensionalProblem {

    /*
      You are given an array of which all the positions are initially '0'
      You are given Q queries , each queries is a triplet[l,r,x]
      Add +x to all elements from Index 'l' to index 'r' in arr[]
      Print the final array
      Example :
      arr = [0,0,0,0,0,0,0]
      Q = [[0,1,3]
            [1,4,9]
            [2,6,2]
            [1,6,1]
            ]
    output : arr = {3,13,12,12,12,3,3}

     */
    public static void main(String[] args) {
       int[]  arr = {0,0,0,0,0,0,0};
       int[][]  q = new int[][]{{0, 1, 3} ,
               {1, 4, 9},
               {2, 6, 2},
               {1, 6, 1}
            };

        getArray(arr,q,7,q.length);
    }

    private static void getArray(int[] arr,int[][] q,int noOfElements,int noOfQ){

        for(int i=0;i<noOfQ;i++){

            int l = q[i][0];
            int r = q[i][1];
            int x = q[i][2];
            arr[l] += x ;
            if(r+1<noOfElements){
                arr[r+1] += (-x) ;
            }
        }
        int pre = 0 ;
        for(int i=0;i<noOfElements;i++){
            pre += arr[i];
            System.out.println(pre);
        }




    }





}
