import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Data {

    //Find the maximum value in linkedList
    public double findMax(LinkedList list){
        double highestPeak = (double) Collections.max(list);
        return highestPeak;
    }

    //Find the minimum value in linkedList
    public double findMin(LinkedList list){
         double lowestValley = (double) Collections.min(list);
        return lowestValley;
    }
    //Find the difference between min and max value in linkedList
    public double findDifferenceMaxMin(double highestPeak, double lowestValley){
        double difference = highestPeak-lowestValley;
        return difference;
    }

    //public int countNumberOfRises(LinkedList list, int numInputs) {
    //
//
}








