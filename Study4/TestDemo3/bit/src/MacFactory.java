package TestDemo3.bit.src;

public class MacFactory implements ComputerFactory {
    @Override
    public Computer CreatComputer() {
        return new MacBook();
    }
}
