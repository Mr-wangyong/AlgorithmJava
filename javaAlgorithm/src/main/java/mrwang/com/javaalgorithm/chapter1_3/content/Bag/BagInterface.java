package mrwang.com.javaalgorithm.chapter1_3.content.Bag;

/**
 * 背包 的接口
 * @author chengwangyong
 * @date 2018/1/1
 */
public interface BagInterface<T> extends Iterable{

  public void add(T item);

  public void isEmpter();

  public void size();
}
