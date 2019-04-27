package TestDemo2.bit.src;

public class IsVaild {
    private MyStackImpl stack;

    public IsVaild() {
        this.stack = new MyStackImpl();
    }

    public boolean isValid(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                this.stack.push(arr[i]);
            }else {
                if(stack.empty()){
                    return false;
                }
            }
            if((stack.peek()=='['&&arr[i]==']'||stack.peek()=='{'&&arr[i]=='}'
            ||stack.peek()=='('&&arr[i]==')')){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();
    }
}
