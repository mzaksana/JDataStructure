package data;

import data.list.ListHeadKata;
import data.list.ListKata;

import java.util.ArrayList;

/**
 * Kelas Qoutes untuk menyimpan nama dan frequensi dari nama-nama tokoh
 * * @author  Muammar Zikri Aksana
 * * @version 1.0
 * * @since   2019-Mar-20
 */
public class Quotes {
    private String name;
    private int freq;
    private ListHeadKata kata;
    /**
     * constructor
     */
    public Quotes(String name){
        this.name=name;
        this.freq=1;
        this.kata=new ListHeadKata();
    }

    public ListHeadKata getKata(){
        return kata;
    }
    public void addKata(String kata){
        this.kata.add(kata);
    }
    /**
     * Method ini digunakan untuk menambah jumlah frequensi +1
     * @see  data.Quotes#setFreq(int) ;
     * @see  data.Quotes#getFreq() ;
     */
    public void incFreq(){
        this.setFreq(this.getFreq()+1);
    }

    /**
     * Method ini digunakan untuk mengubah nilai attribute freq
     * @param freq untuk mengubah nilai attribute this.freq
     */
    public void setFreq(int freq){
        this.freq=freq;
    }

    /**
     * Method ini digunakan untuk mengambil nilai attribute freq
     */
    public int getFreq() {
        return freq;
    }

    /**
     * Method ini digunakan untuk menampilkan object dengan attribute name
     * @see java.util.Objects#toString(Object)
     */
    public String toString(){
        return this.name;
    }
}
