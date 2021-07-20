public class ReverseWord {
    void reverseString(String input, String tempStr, String newStr) {
        for (int i=0; i <= input.length()-1; i++ ){

            tempStr = input.substring((input.length())-(i+1),input.length()-i); //Get a letter from the last one
            newStr = newStr + tempStr;
        }
        System.out.println(newStr);

    }
}
