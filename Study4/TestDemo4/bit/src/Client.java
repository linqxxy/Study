package TestDemo4.bit.src;

public class Client {
    public void BuyComputer(Computer computer){
        computer.print();
    }
    public void Os(OpreatSystem opreatSystem){
        opreatSystem.print();
    }

    public static void main(String[] args) {
        Client client=new Client();
        Factory factory=new MacFactory();
        client.BuyComputer(factory.createComputer());
        client.Os(factory.createOpreatSystem());
    }
}
