package mrwang.com.javaalgorithm.chapter1_3.content.Iterable;

/**
 * https://www.cnblogs.com/keyi/p/5821285.html
 * @author chengwangyong
 * @date 2018/1/1
 */
public class IteratorImpl<T> implements Iterator<T> {
  int cursor =0;

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public T next() {
    return null;
  }

  @Override
  public void remove() {

  }
}
