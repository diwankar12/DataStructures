package MustDoQuestionBank.MicrosoftOA;

public class LargestCharacter {

    public static String largestCharacter(String str)
    {
        // Array for keeping track of both uppercase
        // and lowercase english alphabets
        boolean[] uppercase = new boolean[26];
        boolean[] lowercase = new boolean[26];

        char[] arr = str.toCharArray();

        for (char c : arr) {

            if (Character.isLowerCase(c))
                lowercase[c] = true;

            if (Character.isUpperCase(c))
                uppercase[c] = true;
        }

        // Iterate from right side of array
        // to get the largest index character
        for (int i = 25; i >= 0; i--) {

            // Check for the character if both its
            // uppercase and lowercase exist or not
            if (uppercase[i] && lowercase[i])
                return (char)(i + 'A') + "";
        }

        // Return -1 if no such character whose
        // uppercase and lowercase present in
        // string str
        return "-1";
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "admeDCAB";

        System.out.println(largestCharacter(str));
    }

}
