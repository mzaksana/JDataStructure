package data.list;

import data.Quotes;

/**
 * Kelas untuk head dari list
 * terdiri dari head dan size
 * * @author  Muammar Zikri Aksana
 * * @version 1.0
 * * @since   2019-Mar-20
 */

public class ListHeadQuotes {
    private ListQuotes head;
    private int size;

    /**
     * Method untuk memindahkan/memberikan nilai untuk head
     * Setiap pemberian nilai pada head maka size data bertambah
     * @param head
     * @see ListHeadQuotes#incSize()
     */
    public void setHead(ListQuotes head) {
        this.head = head;
        this.incSize();
    }
    /**
     * Method ini digunakan untuk menambah jumlah frequensi +1
     * @see ListHeadQuotes#setSize(int);
     * @see ListHeadQuotes#getSize();
     */
    public void incSize(){
        this.setSize(this.getSize()+1);
    }

    /**
     * Method ini digunakan untuk memberikan nilai kepada attribute this.size
     * @param size
     */
    public void setSize(int size){
        this.size=size;
    }

    /**
     * Method ini digunakan untuk mengambil nilai dar attribute this.size
     */
    public int getSize() {
        return size;
    }

    /**
     * Method ini digunakan untuk mendapat head dari list
     */
    public ListQuotes getHead() {
        return head;
    }

    /**
     * Method ini digunakan untuk menambah data kedalam list
     * @param quotes
     * @see ListQuotes
     * @see ListHeadQuotes#setHead(ListQuotes)
     * @see ListHeadQuotes#getHead()
     */
    public void add(Quotes quotes){
        this.setHead(new ListQuotes(quotes,this.getHead()));
    }

    public boolean search(Quotes a){
        ListQuotes listQuotes1 = this.getHead();
        while (listQuotes1 != null) {
            if(listQuotes1.getQuotes().toString().compareToIgnoreCase(a.toString())==0){
                return true;
            }
            listQuotes1 = listQuotes1.getNext();
        }
        return false;
    }
//public static void main(String[] args) {
//        ListHeadQuotes listHeadQuotes = new ListHeadQuotes();
//        ReadFile readFile = new ReadFile("data/file.txt");
//        for (String line : readFile.getLine()) {
//            String[] parseLine = line.split("::");
//            Quotes who = new Quotes(parseLine[0]);
//            if(!listHeadQuotes.search(who)){
//                listHeadQuotes.add(who);
//            }
//        }
//
//        ListQuotes listQuotes1 = listHeadQuotes.getHead();
//        while (listQuotes1 != null) {
//            System.out.println(listQuotes1.getQuotes() + "\n");
//            listQuotes1 = listQuotes1.getNext();
//        }
//        System.out.println(listHeadQuotes.getSize());
//    }
}
