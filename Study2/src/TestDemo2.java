abstract class shopping{
    public final void browseGoods(){
        System.out.println("1、浏览商品");
    }
    public final void selectGoods(){

        System.out.println("2、选择商品");
    }
    public abstract void callSevvice();
    public final void computerPrice(){
        System.out.println("4、结算");
    }
    public abstract void orderpay();
    public abstract void sendService();
    public final void showOrder(){
        System.out.println("7、查看订单");
    }
    public final void shopping(){
        browseGoods();
        selectGoods();
        if(hook()) {
            callSevvice();
        }
        computerPrice();
        orderpay();
        sendService();
        showOrder();
    }
    public  boolean hook(){
        return true;
    }
}
class jingDong extends shopping{


    @Override
    public void callSevvice() {
        System.out.println("3、京东客服为您服务！");
    }

    @Override
    public void orderpay() {
        System.out.println("5、京东白条");
    }
    public boolean hook(){
        return false;
    }

    @Override
    public void sendService() {
        System.out.println("6、京东到家");
    }
}
class tianMao extends shopping{

    @Override
    public void orderpay() {
        System.out.println("5、支付宝");
    }
    @Override
    public void callSevvice() {
        System.out.println("3、天猫客服为您服务！");
    }
    @Override
    public void sendService() {
        System.out.println("6、天猫配送");
    }
}
class suNing extends shopping{

    @Override
    public void orderpay() {
        System.out.println("5、微信");
    }

    @Override
    public void callSevvice() {
        System.out.println("3、苏宁客服为您服务！");
    }
    @Override
    public void sendService() {
        System.out.println("6、顺丰");
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
    jingDong jingDong=new jingDong();
    jingDong.shopping();
    }
}
