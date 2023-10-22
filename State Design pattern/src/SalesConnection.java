public class SalesConnection implements  Connection{
    @Override
    public void open() {
        System.out.println("this is the method open in SalesConnection class");
    }

    @Override
    public void close() {
        System.out.println("this is the method close in SalesConnection class");
    }

    @Override
    public void log() {
        System.out.println("this is the method log in SalesConnection class");
    }

    @Override
    public void update() {
        System.out.println("this is the method update in SalesConnection class");
    }
}
