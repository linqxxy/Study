package TestDemo2.bit.src;

public class IsVaild {
    private MyStackImpl stack;

    public IsVaild() {
        this.stack = new MyStackImpl();
    }

    public boolean isValid(String str) {
        int count1 = 0;
        int count2 = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                this.stack.push(arr[i]);
                count1++;
            }
            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                count2++;
            }
            if(stack.empty()){
                continue;
            }
            if((stack!=null)&&(stack.peek()=='['&&arr[i]==']'||stack.peek()=='{'&&arr[i]=='}'
            ||stack.peek()=='('&&arr[i]==')')){
                stack.pop();
            }
        }
        if (count1!= count2) {
            return false;
        }
        return stack.empty();
    }
}
