import java.util.Iterator;
import java.util.List;

public class ClothesIterator implements Iterator{
    public List<Item> clothesList;
    int index = 0;

    public ClothesIterator(List<Item> clothesList){
        this.clothesList = clothesList;
    }

    public boolean hasNext() {
        return clothesList.size() > index;
    }

    public Item next(){
        return clothesList.get(index++);
    }
}
