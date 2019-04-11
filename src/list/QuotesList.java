package list;

/**
 * Kelas untuk head dari list terdiri dari head dan size * @author Muammar Zikri
 * Aksana * @version 1.0 * @since 2019-Mar-20
 */

public class QuotesList {
	private NodeList head;
	private int size;

	/**
	 * Method untuk memindahkan/memberikan nilai untuk head Setiap pemberian nilai
	 * pada head maka size data bertambah
	 * 
	 * @param head
	 * @see QuotesList#incSize()
	 */
	public void setHead(NodeList head) {
		this.head = head;
		this.incSize();
	}

	/**
	 * Method ini digunakan untuk menambah jumlah frequensi +1
	 * 
	 * @see ListHeadQuotes#setSize(int);
	 * @see ListHeadQuotes#getSize();
	 */
	public void incSize() {
		this.setSize(this.getSize() + 1);
	}

	/**
	 * Method ini digunakan untuk memberikan nilai kepada attribute this.size
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
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
	public NodeList getHead() {
		return head;
	}

	/**
	 * Method ini digunakan untuk menambah data kedalam list
	 * 
	 * @param quotes
	 * @see NodeList
	 * @see QuotesList#setHead(NodeList)
	 * @see QuotesList#getHead()
	 */
	public void add(Quotes quotes) {
		this.setHead(new NodeList(quotes, this.getHead()));
	}

	/**
	 * 
	 * @param quotes adalah objek yang namanya ingin dicari dalam list
	 * @return true jika nama yang dicari tedapat dalam list else false
	 */
	public boolean search(Quotes quotes) {
		NodeList listQuotes1 = this.getHead();
		while (listQuotes1 != null) {
			if (listQuotes1.getQuotes().toString().compareToIgnoreCase(quotes.toString()) == 0) {
				return true;
			}
			listQuotes1 = listQuotes1.getNext();
		}
		return false;
	}

	public void display() {
		NodeList listQuotes1 = this.getHead();
		while (listQuotes1 != null) {
			System.out.println(listQuotes1.getQuotes() + "\n");
			listQuotes1 = listQuotes1.getNext();
		}
	}
}
