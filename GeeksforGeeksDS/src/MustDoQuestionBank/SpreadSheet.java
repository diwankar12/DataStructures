package MustDoQuestionBank;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 senior role

 6min
 46min

sheets = Spreadsheet()
sheets.put("A1", "1")
sheets.put("A2", "2")
sheets.put("A3", "3")

sheets.get("A1") # => 1
sheets.get("A2") # => 2
sheets.get("A3") # => 3

sheets.put("B1", "=A1+A2")
sheets.put("B2", "=B1+2")
sheets.put("B3", "=B1+B2+5")

sheets.get("B1") # => 3
sheets.get("B2") # => 5
sheets.get("B3") # => 13

 */


class SpreadSheet {
    public static void main(String[] args) {

        Spreadsheets sheets = new Spreadsheets();
        sheets.put("A1", "1");
        sheets.put("A2", "2");
        sheets.put("A3", "3");

        System.out.println(sheets.get("A1"));    // # => 1
        System.out.println(sheets.get("A2"));    // # => 2
        System.out.println(sheets.get("A3"));    // # => 3

        sheets.put("B1", "=A1+A2");
        sheets.put("B2", "=B1+2");
        sheets.put("B3", "=B1+B2+5");

        System.out.println(sheets.get("B1"));// # => 3
        System.out.println(sheets.get("B2"));// # => 5
        System.out.println(sheets.get("B3")); // # => 13

    }
}


class Spreadsheets {

    public Map<String,String> mp = new HashMap<>();


    public  void put(String cellName, String expression){
        mp.put(cellName,expression);
    }

    public  int get(String cell) {
    int sum =0 ;

    if(cell.charAt(0)=='='){
        cell = cell.substring(1);
        String[] strArray = cell.split("\\+");
        for(String str : strArray){
            sum+= get(str);
          }
    } else {
       if(Character.isAlphabetic(cell.charAt(0))){
             sum+= get(mp.get(cell));
       } else {
           sum+= Integer.parseInt(cell);
       }
    }
  return sum ;
    }
}

class LetterCount implements Comparable<LetterCount>{


    public int letter ;
    public int count ;

    public LetterCount(int letter,int count){

        this.letter=letter ;
        this.count=count ;
    }


    @Override
    public int compareTo(LetterCount o) {
        return 0;
    }
}



//
//    int sum = 0 ;
//        if (cell.charAt(0) == '=') {
//        cell = cell.substring(1);
//        String[] cells = cell.split("\\+");
//        System.out.println(Arrays.toString(cells));
//        for (String c : cells) {
//            sum += get(c);
//        }
//    } else {
//        //not equation -> A1, 5
//        if (Character.isAlphabetic(cell.charAt(0))) {
//            sum += get(mp.get(cell));
//        } else {
//            sum +=  Integer.parseInt(cell);
//        }
//    }
//
//        return sum;
//}