public class DecimalCheck {
    //1.  the input from user and
// print them one by one as complete number before and after
// decimal check if both part are same then print "identical"
    public void splitValue(double val) {
        String[] arr = String.valueOf(val).split("\\.");
        int[] intArr = new int[2];
        intArr[0] = Integer.parseInt(arr[0]); // 1
        intArr[1] = Integer.parseInt(arr[1]); // 9
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);

        if(intArr[0] == intArr[1] ) {
            System.out.println("Identical");
        }else {
            System.out.println("Not Identical");
        }
    }



    }

