import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Books implements ItemList{
    List<Item> books;
    public Books(){
        books = new ArrayList<Item>();
        addBook("'The Long Walk'", true);
        addBook("'Green Eggs and Ham'", false);
        addBook("'C Programming for Dummies'", true);
        addBook("'The Drawing of the Three'", false);
    }
    public void addBook(String name, boolean putAway){
        Item book = new Item(name, putAway);
        books.add(book);
    }

    public List<Item> getItems(){
        return books;
    }
    public Iterator<Item> createIterator(){
        return books.iterator();
    }

}
