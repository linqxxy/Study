package TestDemo4.bit.src;

class MacFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new MacBook();
    }

    @Override
    public OpreatSystem createOpreatSystem() {
        return new MacOs();
    }
}
