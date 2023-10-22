import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new File("fichier1","./desktop/tp",3000,"hello world");
        FileComponent file2 = new File("fichier1","./desktop/tp",9000,"hello world");
        FileComponent hardDisk1 = new HardDisk("ssd","1000Gb",2000);
        System.out.println(file1.getSize());
        System.out.println(hardDisk1.getSize());

    }
}