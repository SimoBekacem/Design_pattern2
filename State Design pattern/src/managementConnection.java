public class managementConnection implements Connection{
        @Override
        public void open() {
            System.out.println("this is the method open in managementConnection class");
        }

        @Override
        public void close() {
            System.out.println("this is the method close in managementConnection class");
        }

        @Override
        public void log() {
            System.out.println("this is the method log in managementConnection class");
        }

        @Override
        public void update() {
            System.out.println("this is the method update in managementConnection class");
        }

}
