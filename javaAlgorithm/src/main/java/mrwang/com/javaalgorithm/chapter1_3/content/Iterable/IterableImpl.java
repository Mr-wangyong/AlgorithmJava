package mrwang.com.javaalgorithm.chapter1_3.content.Iterable;

/**
 * @author chengwangyong
 * @date 2018/1/1
 */
public class IterableImpl<T> implements Iterable<T> {
  @Override
  public Iterator<T> iterator() {
    return new IteratorImpl<>();
  }

}
