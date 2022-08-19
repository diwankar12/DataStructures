package algoExpert.Array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalenderMaatching {

    public static void main(String[] args) throws ParseException {
        List<StringMeeting> calendar1 = new ArrayList<>();
        StringMeeting stringMeeting1= new StringMeeting("9:00","10:30");
        StringMeeting stringMeeting2= new StringMeeting("12:00","13:00");
        StringMeeting stringMeeting3= new StringMeeting("16:00","18:00");

        calendar1.add(stringMeeting1);
        calendar1.add(stringMeeting2);
        calendar1.add(stringMeeting3);

        List<StringMeeting> calendar2 = new ArrayList<>();
        StringMeeting stringMeeting4= new StringMeeting("10:00","11:30");
        StringMeeting stringMeeting5= new StringMeeting("12:30","14:30");
        StringMeeting stringMeeting6= new StringMeeting("14:30","15:00");
        StringMeeting stringMeeting7= new StringMeeting("16:00","17:00");
        calendar2.add(stringMeeting4);
        calendar2.add(stringMeeting5);
        calendar2.add(stringMeeting6);
        calendar2.add(stringMeeting7);

        System.out.println(calendarMatching(calendar1,calendar2));

    }

    public static List<StringMeeting> calendarMatching(List<StringMeeting> calendar1,
                                                      // StringMeeting dailyBounds1,
                                                       List<StringMeeting> calendar2
                                                      // StringMeeting dailyBounds2,
                                                      // int meetingDuration
                              ) throws ParseException {

        // Write your code here.
        int i= 0;
        int j=0 ;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        List<StringMeeting> res = new ArrayList<>() ;
        for(int k=0;k<Math.min(calendar1.size(),calendar2.size());k++){

            if((sdf.parse(calendar2.get(j).start)).compareTo(sdf.parse(calendar1.get(i).start)) > 0){
                  if((sdf.parse(calendar1.get(i).end)).compareTo(sdf.parse(calendar2.get(j).start))>0){
                     res.get(k).start = calendar1.get(i).start ;
                     res.get(k).end = sdf.parse(calendar1.get(i).end)
                             .compareTo(sdf.parse(calendar2.get(j).end)) > 0 ? calendar1.get(i).end : calendar2.get(j).end ;
                     i++;
                     j++;
                  }
            } else {

//                if(){
//
//                } else {
//
//                }
            }
        }
        return res;
    }

    static class StringMeeting {
        public String start;
        public String end;

        public StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }
}
