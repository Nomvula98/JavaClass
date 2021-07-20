public class DecimalCheck {
    //get the input from user and
// print them one by one as complete number before and after
// decimal check if both part are same then print "identical"


    void checkDecimal(String inputValue){
        String val1 = "";
        String val2 ="";
        int index = inputValue.indexOf('.');
        int lastIndex = inputValue.length();

        if (inputValue.contains(".") || inputValue.contains(",") ){
            val1 = inputValue.substring(0, index);
            val2 = inputValue.substring(index+1, lastIndex);
            System.out.println(val1);
            System.out.println(val2);
        }
        else{
            val1 = inputValue;
            val2 = "0";
            System.out.println(val1);
            System.out.println(val2);
        }
        if(val1.equals(val2)){
            System.out.println("Identical");
        }
       /* else{
            System.out.println("Not Identical");
        }*/

    }
}
