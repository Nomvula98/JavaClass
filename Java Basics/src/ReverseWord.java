

//3.  Pass the name and revers it without using String revers method

public class ReverseWord {
    void reverseString(String input, String tempStr, String newStr) {
        for (int i=0; i <= input.length()-1; i++ ){

            tempStr = input.substring((input.length())-(i+1),input.length()-i); //Get a letter from the last letter to the left
            newStr = newStr + tempStr;
        }
        System.out.println(newStr);

    }
}
