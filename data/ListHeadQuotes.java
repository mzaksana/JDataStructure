package data;

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
     * @see data.ListHeadQuotes#incSize()
     */
    public void setHead(ListQuotes head) {
        this.head = head;
        this.incSize();
    }
    /**
     * Method ini digunakan untuk menambah jumlah frequensi +1
     * @see data.ListHeadQuotes#setSize(int);
     * @see data.ListHeadQuotes#getSize();
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
     * @see data.ListHeadQuotes#setHead(ListQuotes)
     * @see data.ListHeadQuotes#getHead()
     */
    public void add(Quotes quotes){
        this.setHead(new ListQuotes(quotes,this.getHead()));
    }
}
