public class Directory extends File{
    private int  nbFiles ;
    public Directory(String name, String path, double size, String content,int nbFiles) {
        super(name, path, size, content);
        this.nbFiles = nbFiles;
    }
    public double getSize(){
      return 1000;
    }

}
