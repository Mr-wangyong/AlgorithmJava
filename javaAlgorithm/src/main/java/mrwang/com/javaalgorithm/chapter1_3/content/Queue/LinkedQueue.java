package mrwang.com.javaalgorithm.chapter1_3.content.Queue;

import java.util.Iterator;

import mrwang.com.javaalgorithm.chapter1_3.content.Stack.Node;

/**
 * @author chengwangyong
 * @date 2018/1/1
 */
public class LinkedQueue<T> implements QueueInterface<T>, Iterator<T> {
  private Node first;
  private int size;

  @Override
  public void enqueue(T item) {
    Node oldFirst = first;
    first = new Node<T>();
    first.item = item;
    first.next = oldFirst;
    size++;
  }

  @Override
  public T deQueue() {
    T item = (T) first.item;
    first =first.next;
    size--;
    return item;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<T> iterator() {
    return this;
  }

  @Override
  public boolean hasNext() {
    return size>0;
  }

  @Override
  public T next() {
    return deQueue();
  }
}
