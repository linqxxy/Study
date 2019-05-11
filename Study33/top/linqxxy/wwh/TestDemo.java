package top.linqxxy.wwh;
/*
enum 关键字定义枚举类
Enum 枚举类的父类
枚举类：枚举常量
静态方法 valueOf  values
定义结构：静态方法和属性 成员方法和属性 实现接口，覆写Enum类的方法，
应用场景：一个类的实例化对象是可数的（性别，状态，周期，颜色）
枚举支持switch分支语句。
 */
public class TestDemo {
    public static void main(String[] args) {
        Color[] colors=Color.values();
        Color color2=Color.valueOf("RED");
        for (Color color1:colors
             ) {
            System.out.println(color1.name());
        }
        System.out.println(color2.name());
        Color color1=Enum.valueOf(Color.class,"BLUE");
        System.out.println(color1.name());
    }
}
