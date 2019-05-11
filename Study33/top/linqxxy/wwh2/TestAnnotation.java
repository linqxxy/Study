package top.linqxxy.wwh2;

public class TestAnnotation {
    @SuppressWarnings(value = "used"+"rawtype")
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.toString());
    }
}
class Person{
    /*
    原因：人得有名字
    替代方法：建议使用Person(String name);
     */
    @Deprecated
    public Person(){

    }
    public Person(String name){

    }
    @Override
    public String toString() {
        return "比特人";
    }
}
