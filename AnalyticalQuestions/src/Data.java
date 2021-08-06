import java.util.Collections;
import java.util.LinkedList;

public class Data {

    //Find the maximum value in linkedList
    public double findMax(LinkedList<Double> list) {
        double highestPeak =  Collections.max(list);
        return highestPeak;
    }

    //Find the minimum value in linkedList
    public double findMin(LinkedList<Double> list) {
        double lowestValley =  Collections.min(list);
        return lowestValley;
    }

    //Find the difference between min and max value in linkedList
    public double findDifferenceMaxMin(double highestPeak, double lowestValley) {
        double difference = highestPeak - lowestValley;
        return difference;
    }

    public void mountain(LinkedList<Double> list){
        for (Object highValue : list) {
            System.out.println(highValue);
        }

    }
    public void countNumberOfRises(LinkedList list) {

        for (Object highValue : list) {
            int count=0;

            System.out.println(highValue);
             count++;
        }

    }
}








