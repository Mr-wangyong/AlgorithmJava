package mrwang.com.javaalgorithm.chapter1_3.content.Stack;

import java.util.Iterator;

/**
 * 用 Array 实现的 Stack push和pop 的代码写的很优雅  学习 要是我自己，可能没有那么好看
 * 缺陷 经常需要 resize 栈容量越大 resize 耗时越长
 * @author chengwangyong
 * @date 2018/1/1
 */
public class ArrayStack<T> implements Stack<T>, VariableCapacity, Iterator<T> {
  private T[] items;
  private int index = 0;
  private static float DEFAULT_LOAD_FACTOR = 0.75F;
  private static final int DEFAULT_CAPACITY = 10;

  public ArrayStack(int cap, int factor) {
    //noinspection unchecked
    items = (T[]) new Object[cap];
    DEFAULT_LOAD_FACTOR = factor;
  }

  public ArrayStack() {
    //noinspection unchecked
    items = (T[]) new Object[DEFAULT_CAPACITY];
  }

  @Override
  public void push(T item) {
    if (index == items.length) {
      resize(Math.round((1 + DEFAULT_LOAD_FACTOR) * index));
    }
    items[index++] = item;
  }

  @Override
  public T pop() {
    T item = items[--index];
    items[index] = null;
    if (index > 0 && index == items.length / 4) {
      resize(items.length / 2);
    }
    return item;
  }

  @Override
  public boolean isEmpty() {
    return index == 0;
  }

  @Override
  public int size() {
    return index;
  }

  @Override
  public Iterator<T> iterator() {
    return this;
  }


  @Override
  public void resize(int max) {
    @SuppressWarnings("unchecked")
    T[] tempItems = (T[]) new Object[max];
    System.arraycopy(items, 0, tempItems, 0, items.length);
    items = tempItems;
  }


  @Override
  public boolean hasNext() {
    return index>0;
  }

  @Override
  public T next() {
    return pop();
  }
}
