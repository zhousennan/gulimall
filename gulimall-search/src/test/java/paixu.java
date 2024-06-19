import java.util.Arrays;

/**
 * @Author : zhou sen nan
 * @Date : 2022/7/8  9:57
 */
public class paixu {
    public static void main(String[] args) {

        SelectSort();
        /*int[] arr = {12, 31, 2, 56, 43, 67, 43, 21};
        for (int i = 0; i < arr.length - 1; i++) {//控制趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {//控制次数
                //比较相邻元素的值
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }*/
    }


    public static void SelectSort() {
        int[] arr = new int[]{11, 34, 120, 1};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));

        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.println("第" + (i + 1) + "次排序后:");
            System.out.println(Arrays.toString(arr));
        }
    }
}
