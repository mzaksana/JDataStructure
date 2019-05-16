package data.hash;

import data.Quotes;

public class Hash {
    public Quotes[] data = new Quotes[10];

    public int index (Quotes value) {
        return value.toString().length() % data.length;
    }

    public int cek(Quotes value) {
        int index = this.index(value);
        if (data[index].toString().compareTo(value.toString()) == 0) {
            return index;
        } else {
            int max=0;
            while (data[index].toString().compareTo(value.toString()) != 0 && max++ != data.length) {
                index++;
                if (index == data.length)
                    index=0;
            }
            return index;
        }
    }

    public void add(Quotes value) {
        int index = this.index(value);
        int max = data.length;
        int min = 0;

        while (min++ != max) {
            if (data[index] == null) {
                data[index] = value;
                break;
            }
            index++;
            if (index>= data.length) {
                index=0;
            }
        }
    }


}
