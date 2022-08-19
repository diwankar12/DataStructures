package Gfg.string;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";

        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));

        // Creating two string literals
         s1 = "geeksforgeeks";
         s2 = "for";

        int res = s1.compareTo(s2);

        if(res == 0)
            System.out.println("Same");

        if(res > 0)
            System.out.println("s1 is Greater");

        if(res < 0)
            System.out.println("s1 is Smaller");


        // Creating two string literals
         s1 = "geeksforgeeks";
         s2 = "geeks";

        // Whether s2 is present in s1 or not
        // true
        System.out.println(s1.contains(s2));

    }
}
