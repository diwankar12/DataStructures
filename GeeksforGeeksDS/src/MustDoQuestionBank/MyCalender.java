package MustDoQuestionBank;

import java.util.ArrayList;
import java.util.List;

class MyCalendar {

    private static List<List<Integer>> ls = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(2%2);
        System.out.println(book(10, 20));
        System.out.println(book(15,25));
    }

    //  [[],[10,20],[15,25],[20,30]]
//     [10 = currentStart] 20= currentEnd
    // 15 = start , 25 = end
    //(Math.max(b[0], start) < Math.min(b[1], end))
    // 15<20
    public static boolean book(int start, int end) {
        System.out.println(ls.toString());
        for(List<Integer> list:ls){
            int currentStart = list.get(0);
            int currentEnd = list.get(1);
            System.out.println(currentStart);
            System.out.println(currentEnd);
            if((start>currentStart) && (start<currentEnd)) return false ;

        }

        List<Integer> newList = new ArrayList<>();
        newList.add(start);
        newList.add(end);
        ls.add(newList);
        return true ;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
