package gourpLibrary;

public class StringUtility {

    // find the Frequency of a  character in a String
    public static int frequency(String str, char ch){
        int count = 0;

        for(char each  : str.toCharArray() ){    //each: [a, a, a, b, c]
            if(each == ch){
                count++;
            }
        }
        return count;
    }

    // find the Unique Character in a String
    public static String unique(String str){
        String unique = ""; // "eg"
        for(int i=0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character of the string
            int count = frequency(str,  each);  // finding teh frequency of every single char from str

            if( count == 1){
                unique += each;
            }
        }
        return unique;
    }

    // Reverses a String
    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

    // removes duplicates from a String
    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        return result;
    }

    // print the frequency of each character in a String
    public static String frequencyOfCharacters(String str) {
        String result = "";
        String nonDup = StringUtility.removeDuplicates(str);

        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i);
            int count = StringUtility.frequency(str, ch);
            result += "" + ch + count;
        }
        return result;
    }
}
