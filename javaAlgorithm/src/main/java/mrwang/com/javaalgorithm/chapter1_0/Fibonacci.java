package mrwang.com.javaalgorithm.chapter1_0;

/**
 * 计算杨辉三角
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Fibonacci {
  private static long[] arr = new long[100];

  private static long F(int N) {
    if (N == 0) return 0;
    if (N == 1) {
      arr[1] = 1;
      return arr[1];
    }
    return arr[N - 2] + arr[N - 1];
  }

  private static long F2(int N) {
    if (arr[N] == 0) {
      arr[N] = F(N);
    }
    return arr[N];
  }

  public static void main(String[] args) {
    for (int N = 0; N < 100; N++)
      System.out.println(N + " " + F2(N));
  }
}
