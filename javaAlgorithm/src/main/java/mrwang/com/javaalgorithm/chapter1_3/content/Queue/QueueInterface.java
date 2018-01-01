package mrwang.com.javaalgorithm.chapter1_3.content.Queue;

/**
 * @author chengwangyong
 * @date 2018/1/1
 */
public interface QueueInterface<T> extends Iterable<T> {
  /**
   * 添加一个元素
   * @param item 添加的元素
   */
  void enqueue(T item);

  /**
   * 出栈一个元素
   * @return 被出栈的元素
   */
  T deQueue();

  boolean isEmpty();

  int size();
}
