public class AccountingConnection implements  Connection{

    @Override
    public void open() {
        System.out.println("this is the method open in AccountingConnection class");
    }

    @Override
    public void close() {
        System.out.println("this is the method close in AccountingConnection class");
    }

    @Override
    public void log() {
        System.out.println("this is the method log in AccountingConnection class");
    }

    @Override
    public void update() {
        System.out.println("this is the method update in AccountingConnection class");
    }
}
