import java.io.File;
public class Sem2Program4 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
            { System.out.println("finally"); }
    }
}