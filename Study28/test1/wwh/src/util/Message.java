package test1.wwh.src.util;

public class Message<T> {
    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message=" + message +
                '}';
    }

    private T message;

}
