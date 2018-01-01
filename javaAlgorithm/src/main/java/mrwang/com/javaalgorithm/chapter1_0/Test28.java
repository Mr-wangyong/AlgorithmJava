package mrwang.com.javaalgorithm.chapter1_0;

import java.util.Arrays;

/**
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Test28 {
  public static void main(String[] args) {
    int[] whiteList={19, 30, 100, 200};
    int arr[] = {1, 3, 4, 5, 7, 8, 19, 30, 100, 200, 435, 654};
    int key = 19;
    Arrays.binarySearch(arr,key);
  }

}
