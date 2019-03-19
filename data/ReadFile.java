package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    private String namaFileSrc;
    public List<String> file;

    public ReadFile(String pathSrc){
        this.namaFileSrc=pathSrc;
        file = new ArrayList<>();
        this.init();
    }

    public int init(){
        try {
            Scanner reader = new Scanner(new File(this.namaFileSrc));
            while (reader.hasNextLine()) {
                file.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found " + this.namaFileSrc + " in "+System.getProperty("user.dir"));
        } finally {
            System.out.println("error ReadFile");
        }
        return 0;
    }

    public List<String> getLine() {
        return file;
    }

}
