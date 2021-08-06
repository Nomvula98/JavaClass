import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Asking user to enter a the length of list
        /*int lengthOfList;
        int countRises = 0;
        int countFalls = 0;
        try {
            System.out.println("Enter the the length of your list of :");
            Scanner scanner = new Scanner(System.in);
            lengthOfList = scanner.nextInt();
            int[] list=new int[lengthOfList];

            //Requesting users for the values and storing them
            for (int i = 0; i < list.length; i++) {
                System.out.println("Enter number "+(i+1)+": ");
                list[i]=scanner.nextInt();
            }
            System.out.println("Your Array: " + Arrays.toString(list));

            for (int j = 1; j < list.length; j++) {
                if (list[j] > list[j - 1] && list[j] > list[j + 1]) {
                    countRises++;
                    System.out.println(list[j] + " is a rise");
                }
            }
                for (int k = 1; k < list.length; k++) {
                    int lowest = list[]`
                    if (list[k] < list[k - 1] && list[k] < list[k + 1]) {
                        countFalls++;
                        System.out.println(list[k] + " is a fall");
                    }
                }
            }
        catch (InputMismatchException e){
            System.out.println("Please enter a whole number: ");

        }
        catch (NegativeArraySizeException ex){
            System.out.println("Please enter a positive number: ");
        }
*/
        //Instantiate data object
        Data data = new Data();

        //Request user for number of inputs they want to enter
        System.out.print("Enter number of inputs: ");
        Scanner scanner = new Scanner(System.in);
        int numInputs = scanner.nextInt();

        //LinkedList allows duplicates, stores/prints objects as they are entered(Not sort)
        // and is faster in manipulation of data
        //Create a linkedList
        LinkedList<Double> list = new LinkedList<>();

        //Store data from user in a linkedList
        for (int i = 0; i < numInputs; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            double inputValue = scanner.nextDouble();
            list.add(inputValue);
        }

        //Invoke Methods to print HighestPeak, LowestValley and Difference
        System.out.println("------------------------HighestPeak-----------------------");
        double highestPeak= data.findMax(list);
        System.out.println("highestPeak:" + highestPeak);

        System.out.println("------------------------LowestValley-----------------------");
        double lowestValley = data.findMin(list);
        System.out.println("Lowest Peak: " + lowestValley);

        System.out.println("--------------------Difference(Max,Min)---------------------");
        double difference = data.findDifferenceMaxMin(highestPeak, lowestValley);
        System.out.println("The difference between highestPeak and lowestValley is: "+ difference);

        data.countNumberOfRises(list);
    }
}
