public class ExceptionHandlingExamples {
    //Unchecked exceptions - Runtime exceptions
    //1. Arithmetic 2. NullPointerException 3. NumberFormatException
    // 4. IndexOutOfBoundsException 5. Array/StringOutOfBoundsException


//Arithmetic
    public void checkDivide() {
        try{
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
    }

    //ArrayOutOfBounds
    public void testArray() {
        try {
            int a[] = new int[10];
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        }
    }
    //NumberFormatException
        public void parseValue() {
            try {
                int num = Integer.parseInt("XYZ");
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception occurred");
            }
        }
        //StringIndexOutOfBounds
    public void testString(){
        try{
            String str="beginnersbook";
            System.out.println(str.length());;
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }

    }

    //NullPointer
    public void testNull(){
        try{
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException..");
        }
    }


}




