package mrwang.com.javaalgorithm.chapter1_0;

/**
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Test30 {
  public static void main(String[] args) {
    test30(100);
  }

  public static void test30(int n) {
    boolean[][] arr = new boolean[n][n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (euclid(i, j) == 1);
        System.out.println("result=" + arr[i][j]);
      }
    }
  }

  private static int euclid(int i, int j) {
    if (i == 0 || j == 0) {
      return 1;
    }
    if (i % j == 0) {
      return j;
    }
    return euclid(j, i % j);
  }
}
