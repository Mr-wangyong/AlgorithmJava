package mrwang.com.javaalgorithm.chapter1_0;

import java.util.Scanner;

/**
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Test01_25 {
  public static void main(String args[]) {
    //    boolean arr[][] = {{true, false}, {false, true}, {true, true}, {false, true}, {false, false}};
    //    test11(arr);
    //int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //test13(arr);
    //test14(59);
    //    int[] a = { 1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2 };
    //    int[] result = histogram(a, 8);
    //    for (int i = 0; i < result.length; i++) {
    //      System.out.printf("%3d", result[i]);
    //    }

    //System.out.println("test16(19)=" + test16(19));

    //System.out.println(mystery(2, 25));
    //System.out.println(mystery(3, 11));

    //test20(5);
    //test22();
    System.out.println(gcd(1111111, 1234567));
  }

  public static void test1() {
    System.out.println("1.1.1 a =" + ((0 + 15 / 2)));
    System.out.println("1.1.1 b =" + (2.0e-6 * 100000000.1));
    System.out.println("1.1.1 c =" + (true && false || true && true));//true 因为 &&比||优先
  }

  public static void test2() {
    System.out.println("1.1.2 a =" + (1 + 2.236) / 2);
    System.out.println("1.1.3 b =" + (1 + 2 + 3 + 4.0));
    System.out.println("1.1.3 c =" + (4.1 > 4));
    System.out.println("1.1.3 d =" + (1 + 2 + "3"));
  }

  public static void test6() {
    int f = 0;
    int g = 1;
    for (int i = 0; i < 15; i++) {
      System.out.println("f=" + f);
      f = f + g;
      g = f - g;
    }
  }

  public static void test7a() {
    double t = 9.0;
    while (Math.abs(t - 9.0 / t) > 0.001) {
      t = (9.0 / t + t) / 2.0;
    }
    System.out.printf("%.5f\n", t);
  }

  public static void test7b() {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < i; j++) {
        sum++;
      }
    }
    System.out.println("sum=" + sum);
  }

  private static void test7c() {
    int sum = 0;
    for (int i = 1; i < 1000; i *= 2) {
      for (int j = 0; j < 1000; j++) {
        sum++;
      }
    }
    System.out.println("sum=" + sum);
  }

  private static void test8() {
    System.out.println('b');
    System.out.println('b' + 1);
    System.out.println('A' + 1);
    System.out.println('a' + 1);
    System.out.println('c' + 1);
    System.out.println('b' + 'c');
    System.out.println((char) ('a' + 4));
  }

  private static void test9(int num) {
    String s = "";
    for (int n = num; n > 0; n = n / 2) {
      s = (n % 2) + s;
    }
    System.out.println("分解为二进制=" + s);
    System.out.println("分解为二进制=" + Integer.toBinaryString(num));
  }

  private static void test11(boolean[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("行号=" + i + " 列号=" + j + " 值=" + (arr[i][j] ? "*" : " "));
      }
    }
  }


  private static void test12() {
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
      a[i] = 9 - i;
    for (int i = 0; i < 10; i++)
      a[i] = a[a[i]];
    for (int i = 0; i < 10; i++)
      System.out.println("i=" + i);
  }

  /**
   * 二维数组的转序(交换行和列)
   */
  private static void test13(int[][] arr) {
    int[][] arrCopy = new int[arr[0].length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arrCopy[j][i] = arr[i][j];
      }
    }

    for (int i = 0; i < arrCopy.length; i++) {
      for (int k = 0; k < arrCopy[i].length; k++) {
        System.out.println("行号=" + i + " 列号=" + k + " 值=" + arrCopy[i][k]);
      }
    }
  }

  private static void test14(int n) {
    lg(n);
  }

  /**
   * 查找不大于 log2n 的正整数
   */
  private static void lg(int n) {
    for (int i = 1; i * i < n; i++) {
      System.out.println("i=" + i);
    }
  }

  private static void test15() {

  }

  /**
   * 编写一个 态方法 histogram()，接受一个整型数组  a[] 和一个整数 M 为参数并返回一个大小
   * 为 M 的数组，其中第 i 个元素的值为整数 i 在参数数组中出现的次数。如果 a[] 中的值均在 0 到 M-1
   * 之间，返回数组中所有元素之和应该和 a.length 相等
   */
  private static int[] histogram(int[] a, int M) {
    int[] result = new int[M];
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= 0 && a[i] < M) {
        result[a[i]]++;
      }
    }
    return result;
  }

  private static String test16(int n) {
    if (n <= 0) return "";
    return test16(n - 3) + n + test16(n - 2) + n;
  }

  private static int mystery(int a, int b) {
    if (b == 0) return 0;
    if (b % 2 == 0) return mystery(a + a, b / 2);
    return mystery(a + a, b / 2) + a;
  }


  private static void test20(int n) {
    System.out.println("fac=" + fac(n));
  }

  private static long fac(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fac(n - 1);
  }

  private static void test21() {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("请输入分数1");
    int score1 = scanner.nextInt();
    System.out.println("请输入分数2");
    int score2 = scanner.nextInt();
    System.out.println("学生1 姓名" + name + " 分数1=" + score1 + " 分数2=" + score2 + " 平均分=" + (score1 + score2) / 2f);
  }

  private static void test22() {
    int arr[] = {1, 3, 4, 5, 7, 8, 19, 30, 100, 200, 435, 654};
    int key = 654;
    int midIndex = binarySearch(key, arr, 0, arr.length - 1, 0);
    System.out.println("二分查找法为 =" + midIndex);
  }

  private static int binarySearch(int key, int arr[], int startIndex, int endIndex, int depth) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < depth; i++) {
      s.append(" ");
    }
    System.out.println(s.toString() + "binarySearch startIndex=" + startIndex + " endIndex=" + endIndex + " depth=" + depth);
    if (startIndex > endIndex) return -1;
    int mid = startIndex + (endIndex - startIndex) / 2;
    if (key > arr[mid]) return binarySearch(key, arr, mid + 1, endIndex, depth + 1);
    else if (key < arr[mid]) return binarySearch(key, arr, startIndex, mid - 1, depth + 1);
    else return mid;
  }


  private static int gcd(int p, int q){
    if (q == 0) return p;
    int r = p % q;
    System.out.println("中间值 =" + r);
    return gcd(q, r);
  }


}
