import java.util.ArrayList;

public class HardDisk implements  FileComponent{
    String brand;
    String FMS;
    double size;
    public ArrayList<FileComponent> children = new ArrayList<>();

    public ArrayList<FileComponent> getChildren() {
        return children;
    }

    public  HardDisk (String brand, String FMS, double size){
        this.size = size;
        this.brand = brand;
        this.FMS = FMS;
    }

    public double getSize(){
        double totalSize = 0;
        for (FileComponent child : children) {
            totalSize += child.getSize();
        }
        return size + totalSize;
    }
}
