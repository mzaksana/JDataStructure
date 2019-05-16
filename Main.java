import data.Quotes;
import data.bst.Bst;
import data.bst.Node;
import data.hash.Hash;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Hash hash = new Hash();
        Quotes data1 = new Quotes("saya");
        Quotes data2 = new Quotes("lima");
        Quotes data3 = new Quotes("adi");
        hash.add(data1);
        hash.add(data2);
        hash.add(data3);
        System.out.println("cari "+ data1.toString() +" di index "+ hash.cek(new Quotes("saya")));
    }
}
