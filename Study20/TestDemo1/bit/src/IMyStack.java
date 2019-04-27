package TestDemo1.bit.src;

public interface IMyStack { // 将 item 压入栈中
    void push(Object item);
    // 返回栈顶元素，并且出栈
    Object pop();
    // 返回栈顶元素，但不出栈
    Object peek();
    // 判断这个栈是否为空栈
    boolean empty();
    // 返回元素个数
    int size();
}
