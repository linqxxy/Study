/**
 * Created with IntelliJ IDEA.
 * Description:链式队列
 * User: GAOBO
 * Date: 2019-04-25
 * Time: 19:24
 */
public class MyQueueImpl implements IMyQueue{

    class Node {

        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }

    }

    private Node front;
    private Node rear;
    private int usedSize;
    public MyQueueImpl (){
        this.front = null;
        this.rear = null;
        this.usedSize = 0;
    }
    @Override
    public boolean empty() {
        return this.usedSize == 0;
    }

    @Override
    public int peek() {
        if(empty()){
            return -1;
        }
        return this.front.data;
    }

    @Override
    public int poll() {
        if(empty()){
            return -1;
        }
        int data =  this.front.data;
        if(this.usedSize == 1) {
            this.front = null;
            this.rear = null;
        }else {
            this.front = this.front.next;
        }
        this.usedSize--;
        return data;
    }

    @Override
    public void add(int item) {
        Node node = new Node(item);
        if(empty()) {
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
