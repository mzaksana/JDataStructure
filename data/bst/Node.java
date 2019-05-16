package data.bst;

import data.Quotes;

public class Node {
    public Quotes data;
    public Node kiri;
    public Node kanan;


    public void setData(Quotes data) {
        this.data = data;
    }

    public void setKiri(Node kiri) {
        this.kiri = kiri;
    }

    public void setKanan(Node kanan) {
        this.kanan = kanan;
    }
}
