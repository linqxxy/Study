package TestDemo2.bit.src;

class ComputeFactory {
    public static Computer getInstance(String type){
        Computer computer=null;
        switch (type){
            case "Mac":
                computer=new Macbook();break;
            case "Sur":
                computer=new SurfaceBook();break;
            default:
                System.out.println("请输入型号");break;
        }
       return computer;
    }
}
