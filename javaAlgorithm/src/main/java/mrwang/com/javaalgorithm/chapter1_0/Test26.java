package mrwang.com.javaalgorithm.chapter1_0;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Test26 {
  public static void main(String[] args) {
    //test26();
    binomial(100,50,0.25);
  }

  /**
   * 将三 数字排序。 设 a、b、c 和 t 都是同一种原始数字类型的 量。证明以下代码能够将 a、 b、c 按照升序排列:
   * if (a > b) { t = a; a = b; b = t; }
   * if (a > c) { t = a; a = c; c = t; }
   * if (b > c) { t = b; b = c; c = t; }
   */
  public static void test26() {
    int a = StdIn.readInt();
    int b = StdIn.readInt();
    int c = StdIn.readInt();
    int t;
    if (a > b) {
      t = a;
      a = b;
      b = t;
    }
    if (a > c) {
      t = a;
      a = c;
      c = t;
    }
    if (b > c) {
      t = b;
      b = c;
      c = t;
    }
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
  }


  public static double binomial(int N, int k, double p) {
    if (N == 0 && k == 0) return 1.0;
    if (N < 0 || k < 0) return 0.0;
    return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1,p);
  }

}
