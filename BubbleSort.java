import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // 外层循环控制排序的轮数
        for (int i = 0; i < n - 1; i++) {
            // 内层循环进行元素的比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前一个元素大于后一个元素，则交换它们
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("排序前的数组：");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));
    }
}
