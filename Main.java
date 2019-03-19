import data.ReadFile;

public class Main {
    public static void main(String[] args) {
        int a=0;
         ReadFile readFile = new ReadFile("data/file.txt");
         for (String line:readFile.getLine()) {
             System.out.println("line "+(a++)+" : "+line);
         }
    }
}
