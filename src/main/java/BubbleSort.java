
public class BubbleSort {

    public static int[] bubbleSort(int[] inputArray, int lenArray) {
        int timeVar;
        boolean flagSorted = false;
        while (!flagSorted) {
            flagSorted = true;
            for (int i = 0; i < lenArray - 1; i++) {
                if (inputArray[i] > inputArray[i+1]) {
                    flagSorted = false;
                    timeVar = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = timeVar;
                }
            }
        }
        return inputArray;
    }
}
