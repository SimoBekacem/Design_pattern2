public class File implements  FileComponent{
    public String name;
    public String path;
    public double size;
    public String content;
   public File(String name, String path,  double size, String content ){
       this.name = name;
       this.content = content;
       this.path = path;
       this.size = size;
   }
    public double getSize(){
        return size;
    }
    public void showContent(){
        System.out.println(content);
    }
}
