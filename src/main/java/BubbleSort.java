public class BubbleSort {

    public static int[] bubbleSort(int[] inputArray, int lenArray) {
        int timeVar;
        if (lenArray == 1) {
            return inputArray;
        } else {
            for (int i = 0; i < lenArray-1; i+=1) {
                if (inputArray[i] > inputArray[i+1]) {
                    timeVar = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = timeVar;
                }
            }
        } return bubbleSort(inputArray, lenArray - 1);
    }


}
