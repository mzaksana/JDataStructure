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
            ListQuotes listQuotes = new ListQuotes(new Quotes(parseLine[0]),listHeadQuotes.getHead());
            listHeadQuotes.setHead(listQuotes);
            //             System.out.println("line "+(a++)+" : "+line);
        }

        ListQuotes listQuotes1 = listHeadQuotes.getHead();
        while (listQuotes1.hasNext()){
            System.out.println(listQuotes1.getQuotes()+"\n");
            listQuotes1=listQuotes1.getNext();
        }
    }
}
