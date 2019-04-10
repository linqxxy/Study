package TestDemo3.bit.src;

public class SurfaceFactory implements  ComputerFactory {
    @Override
    public Computer CreatComputer() {
        return new SurfaceBook();
    }
}
