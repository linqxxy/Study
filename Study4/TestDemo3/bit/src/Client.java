package TestDemo3.bit.src;

public class Client {
    public void BuyComputer(Computer computer){
        computer.print();
    }

    public static void main(String[] args) {
        Client client=new Client();
        ComputerFactory computerFactory=new SurfaceFactory();
        client.BuyComputer(computerFactory.CreatComputer());
    }
}
