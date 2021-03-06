package mrwang.com.javaalgorithm.chapter1_3.content.Stack;

import java.util.Stack;

/**
 * 利用栈进行算数表达式求值
 * 输入一个 算术 字符串 求出值
 *
 * 支持多个
 *
 * @author chengwangyong
 * @date 2018/1/1
 */
public class Evaluate {

  public static void main(String[] args) {
    Double evaluate = evaluate("(2+(299999*5)+7)");
    System.out.println("evaluate =" + evaluate);
  }

  public static Double evaluate(String evaluateStr) {
    Stack<Character> ops = new Stack<>();
    Stack<Double> vals = new Stack<>();
    char[] evaChars = evaluateStr.toCharArray();
    boolean isValue = false;
    StringBuilder value = new StringBuilder();
    for (char eva : evaChars) {
      System.out.println("eva =" + eva);
      switch (eva) {
        case '(':
          break;
        case '+':
        case '-':
        case '*':
        case '/':
          ops.push(eva);
          isValue = false;
          break;
        case ')':
          Double calculate = calculate(ops, vals);
          System.out.println("calculate =" + calculate);
          break;
        default:
          if (isValue) {
            value.append(String.valueOf(eva));
          } else {
            value = new StringBuilder();
            value.append(eva);
          }
          vals.push(Double.valueOf(value.toString()));
          isValue = true;
          break;
      }
    }
    return vals.pop();
  }

  private static Double calculate(Stack<Character> ops, Stack<Double> vals) {
    Character op = ops.pop();
    Double value = vals.pop();
    switch (op) {
      case '+':
        value = vals.pop() + value;
        break;
      case '-':
        value = vals.pop() - value;
        break;
      case '*':
        value = vals.pop() * value;
        break;
      case '/':
        value = vals.pop() / value;
        break;
    }
    vals.push(value);
    return value;
  }


}
