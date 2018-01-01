package mrwang.com.javaalgorithm.chapter1_3.content.Stack;

/**
 * @author chengwangyong
 * @date 2018/1/1
 */
public class StackTest {

  public static void main(String[] args) {
    //arrayStackTest();
    queueStackTest();
  }

  private static void arrayStackTest(){
    ArrayStack<String> arrayStack=new ArrayStack<>();
    arrayStack.push("wang");
    arrayStack.push("yong");
    arrayStack.push("xue");
    arrayStack.push("xi");
    arrayStack.push("xi1");
    arrayStack.push("xi2");
    arrayStack.push("xi3");
    arrayStack.push("xi4");
    arrayStack.push("xi5");
    arrayStack.push("xi6");
    arrayStack.push("xi7");
    arrayStack.push("xi8");
    arrayStack.push("xi9");
    arrayStack.push("xi10");
    arrayStack.push("xi11");
    arrayStack.push("xi12");
    arrayStack.push("xi13");
    for (String s : arrayStack) {
      System.out.println("s="+s);
    }
  }

  public static void queueStackTest(){
    LinkedStack<String> queueStack= new LinkedStack<>();
    queueStack.push("wang");
    queueStack.push("yong");
    queueStack.push("xue");
    queueStack.push("xi");
    queueStack.push("xi1");
    queueStack.push("xi2");
    queueStack.push("xi3");
    queueStack.push("xi4");
    queueStack.push("xi5");
    queueStack.push("xi6");
    queueStack.push("xi7");
    queueStack.push("xi8");
    queueStack.push("xi9");
    queueStack.push("xi10");
    queueStack.push("xi11");
    queueStack.push("xi12");
    queueStack.push("xi13");
    for (String s : queueStack) {
      System.out.println("s="+s);
    }
  }
}
