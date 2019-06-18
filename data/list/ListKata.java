package data.list;

import data.Quotes;

/**
 * Kelas ListQuotes untuk list data yang menyimpan quotes dan index berikutnya
 * * @author  Muammar Zikri Aksana
 * * @version 1.0
 * * @since   2019-Mar-20
 */
public class ListKata {
    private String kata;
    private ListKata next;

    /**
     * Constructor
     * @param next
     */
    public ListKata(String kata, ListKata next){
        this.setKata(kata);
        this.setNext(next);
    }

    /**
     * Method untuk memeberikan nilai list sebelumnya pada atribute next
     * @param next
     */
    public void setNext(ListKata next) {
        this.next = next;
    }

    /**
     * Method untuk memeberikan nilai pada atribute quotes
     * @param kata
     */
    public void setKata(String kata) {
        this.kata = kata;
    }

    /**
     * Method untuk mengambil isi list
     * @return Quotes
     */
    public String getKata() {
        return kata;
    }

    /**
     * Method ini digunakan untuk mengambil data selanjutnya dari list
     * @return mengembalikan nilai list selanjutnya
     * @see ListKata
     */
    public ListKata getNext() {
        if (this.hasNext())
            return next;
        return null;
    }

    /**
     * Method ini digunakan untuk mengetahui apakah terdapat data berikutnya pada list
     * @return true jika masih ada data selanjutnya dari list
     */
    private boolean hasNext(){
        return this.next!=null ;
    }
}
