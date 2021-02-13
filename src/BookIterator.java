import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {
    List<Item> books;
    int index = 0;

    public BookIterator(List<Item> books){
        this.books = books;
    }
    public boolean hasNext(){
        return books.size() > index;
    }
    public Item next(){
        return books.get(index++);
    }
}
