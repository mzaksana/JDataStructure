import data.ListHeadQuotes;
import data.ListQuotes;
import data.Quotes;
import file_reader.ReadFile;

public class Main {
    public static void main(String[] args) {
        ListHeadQuotes listHeadQuotes = new ListHeadQuotes();
        ReadFile readFile = new ReadFile("data/file.txt");
            for (String line:readFile.getLine()) {
                String []parseLine = line.split("::");
                listHeadQuotes.add(new Quotes(parseLine[0]));
        }

        ListQuotes listQuotes1 = listHeadQuotes.getHead();
        while (listQuotes1!=null){
            System.out.println(listQuotes1.getQuotes()+"\n");
            listQuotes1=listQuotes1.getNext();
        }
    }
}
