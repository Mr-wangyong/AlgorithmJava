package mrwang.com.javaalgorithm.chapter1_3.content.Stack;

/**
 * @author chengwangyong
 * @date 2018/1/1
 */
public interface StackInterface<T> extends Iterable<T> {
  void push(T item);

  T pop();

  public void isEmpter();

  public void size();
}
