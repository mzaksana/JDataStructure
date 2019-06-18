package data.hash;

import data.Quotes;
import data.list.ListHeadQuotes;

public class HashTable {
    ListHeadQuotes[] hash;

    public HashTable(int size){
        this.hash=new ListHeadQuotes[size];
    }

    public void add(Quotes data,String kata){
        int index=this.f(data.toString());
        if(hash[index]==null){
            hash[index]= new ListHeadQuotes();
        }
        hash[index].add(data,kata);
    }
    public void display(){
        for (int a=0;a<hash.length;a++){
            System.out.println("data "+a);
            if(this.hash[a]==null)
                continue;
            this.display(a);
        }
    }
    public void display(int index){
        this.hash[index].display();
    }

    private int f(String a){
        return a.length()%hash.length;
    }
}
