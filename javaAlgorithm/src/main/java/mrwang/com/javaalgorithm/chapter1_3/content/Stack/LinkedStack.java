package mrwang.com.javaalgorithm.chapter1_3.content.Stack;

import java.util.Iterator;

/**
 * 用链表实现的 栈
 * 优点：不用冗余设计
 * @author chengwangyong
 * @date 2018/1/1
 */
public class LinkedStack<T> implements Stack<T> {
  private Node first;
  private int size;

  @Override
  public void push(T item) {
    Node oldFirst = first;
    first = new Node<T>();
    first.item = item;
    first.next = oldFirst;
    size++;
  }

  @Override
  public T pop() {
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
    return new QueueStackIterator();
  }



  private class QueueStackIterator implements Iterator<T> {
    @Override
    public boolean hasNext() {
      return size>0;
    }

    @Override
    public T next() {
      return pop();
    }
  }
}
