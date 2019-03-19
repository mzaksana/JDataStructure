package data;

/**
 * Kelas untuk head dari list
 * terdiri dari head dan size
 */
public class ListHeadQuotes {
    private ListQuotes head;
    private int size;

    /**
     * Method untuk memindahkan/memberikan nilai untuk head
     * Setiap pemberian nilai pada head maka size data bertambah
     * @param head
     * @see this.incSize()
     */
    public void setHead(ListQuotes head) {
        this.head = head;
        this.incSize();
    }
    /**
     * Method ini digunakan untuk menambah jumlah frequensi +1
     * @see this.setFreq();
     * @see this.getFreq();
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
     * @see this.setHead()
     * @see this.getHead()
     */
    public void add(Quotes quotes){
        this.setHead(new ListQuotes(quotes,this.getHead()));
    }
}
