public class Controller {

    Connection state;

    public void Controller(Connection state){
        this.state = state;
    }
    public  void changeConnection(Connection newState){
        state = newState;
    };
    public void open() {
        state.open();
    }
    public void close() {
        state.close();
    }
    public void log() {
        state.log();
    }
    public void update() {
        state.update();
    }
}
