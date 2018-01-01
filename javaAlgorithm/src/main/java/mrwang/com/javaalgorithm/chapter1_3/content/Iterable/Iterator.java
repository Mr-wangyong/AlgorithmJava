package mrwang.com.javaalgorithm.chapter1_3.content.Iterable;

/**
 * 迭代器接口
 * @author chengwangyong
 * @date 2018/1/1
 */
public interface Iterator<E> {
  boolean hasNext();

  E next();

  void remove();
}
