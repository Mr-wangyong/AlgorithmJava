package mrwang.com.javaalgorithm.chapter1_0;

/**
 * 计算两个非负整数 p 和 q 的最大公约数：若 q 是 0， 则最大公约数是 p,否则，将 p 除以 q 得到
 * 余数 r, p 和 q 的最大公约数即为 q 和 r 的最大公约数
 *
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Gcd {
  public static void main(String[] args) {
    //System.out.println("最大公约数为 =" + gcd(15, 5));
    int arr[] = {1, 3, 4, 5, 7, 8, 19, 30, 100, 200, 435, 654};
    int key = 19;
    int midIndex = binarySearch(key, arr);
    //System.out.println("二分查找法为 =" + midIndex);

    int arr2[] = {654, 435, 200, 100, 98, 43, 7, 8, 19, 30, 49};
    int min = findMin(arr2);
    System.out.println("二分查找法为 min=" + min);
    System.out.println("result=" + (2/0e-6*10000000.1));
  }

  /**
   * 用递归来实现 基本原理是不断两个数求余数，最后余数为零 则当前数为最大公约数
   */
  private static int gcd(int p, int q) {
    if (q == 0) return p;
    int r = p % q;
    System.out.println("中间值 =" + r);
    return gcd(q, r);
  }

  /**
   * 判断一个数是否是素数 核心就是判断是否能被一些数整除
   */
  private static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }

  /**
   * 二分查找法 元素有序
   */
  private static int binarySearch(int key, int arr[]) {
    return rank(key, arr, 0, arr.length - 1);
  }

  private static int rank(int key, int arr[], int startIndex, int endIndex) {
    if (startIndex > endIndex) return -1;
    int middleIndex = startIndex + (endIndex - startIndex) / 2;
    if (key < arr[middleIndex]) return rank(key, arr, startIndex, endIndex - 1);
    else if (key > arr[middleIndex]) return rank(key, arr, startIndex + 1, endIndex);
    else return middleIndex;
  }


  /**
   * 给定一个数组 数组前部分递减 后部分递增，找出最小值
   * {654, 435, 200, 100, 98, 43, 7, 8, 19, 30, 49};
   */
  private static int findMin(int[] arr) {
    int mid = arr.length / 2;
    int start = mid - 1;
    int end = mid + 1;
    while (true) {
      mid = start + (end - start) / 2;
      if (arr[start] > arr[mid] && arr[end] > arr[mid]) {
        return arr[mid];
      } else if (arr[start] > arr[mid] && arr[end] < arr[mid]) {
        start++;
        end++;
      } else if (arr[start] < arr[mid] && arr[end] > arr[mid]) {
        start--;
        end--;
      }
    }
  }


}
