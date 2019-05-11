package top.linqxxy.wwh;

public enum  Color {
    RED("红色"),GREEN("绿色"),BLUE("蓝色");

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    private static String message="Hello!";
    private String title;
    Color(String title){
        this.title=title;
    }
    //成员方法
    public void print(){
        System.out.println(this);
    }
}
