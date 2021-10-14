import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9,8,7,6,5,4,314,12,64};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr, arr.length)));
    }
}
