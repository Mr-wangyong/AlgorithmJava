package mrwang.com.javaalgorithm.chapter1_0;

/**
 * @author chengwangyong
 * @date 2017/11/25
 */
public class Matrix {
  /**
   * 向量点乘 直接相乘 多个则取最后的总和
   */
  public double dot(double[] x, double[] y) {
    int min = Math.min(x.length, y.length);
    double result = 0.0;
    for (int i = 0; i < min; i++) {
      result += x[i] * y[i];
    }
    return result;
  }



  /**
   * 矩阵和矩阵之积
   */
  public double[][] mult(double[][] x, double[][] y) {

    return null;
  }

  /**
   * 转置举证
   */
  public double[][] transpose(double[][] a) {
    double[][] s = new double[a[0].length][a.length];
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < s[i].length; j++) {
        s[i][j] = a[j][i];
      }
    }
    return s;
  }

  /**
   * 矩阵和向量之积
   */
  public double[] mult(double[][] a, double[] x) {
    if (a[0].length == x.length) {
      double[] y = new double[a.length];
      for (int i = 0; i < y.length; i++) {
        for (int j = 0; j < x.length; j++) {
          y[i] += a[i][j] * x[j];
        }
      }
      return y;
    } else {
      return null;
    }
  }

  /**
   * 向量和矩阵之积
   */
  public double[] mult(double[] y, double[][] a) {
    if (y.length == a.length) {
      double[] x = new double[a[0].length];
      for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < y.length; j++) {
          x[i] += y[j] * a[j][i];
        }
      }
      return x;
    } else {
      return null;
    }
  }
}
