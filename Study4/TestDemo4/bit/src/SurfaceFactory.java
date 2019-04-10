package TestDemo4.bit.src;

class SurfaceFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new SurfaceBook();
    }

    @Override
    public OpreatSystem createOpreatSystem() {
        return new Win10();
    }
}
