import data.Quotes;
import data.hash.HashTable;
import file_reader.ReadFile;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("/home/mza/Documents/pro/StukturDataAlgoritma/data/file.txt");
        Iterator iterator = readFile.getLine().iterator();
        System.out.println("List elements : ");
        HashTable hashTable = new HashTable(readFile.getLine().size());

        while (iterator.hasNext()) {
            String[] data = iterator.next().toString().split("::");
            hashTable.add(new Quotes(data[0]),data[1]);
        }


//        hashTable.display(5);
        hashTable.display(5);
    }


}
