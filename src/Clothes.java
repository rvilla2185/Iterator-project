import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clothes implements ItemList{
    List<Item> clothesList;
    public Clothes(){
        clothesList = new ArrayList<Item>();
        addClothes("The coat", true);
        addClothes("The pants", false);
        addClothes("The shirts", true);
        addClothes("The underwear", false);
        addClothes("The shoes", false);
    }
    public void addClothes(String name, boolean putAway){
        Item clothes = new Item(name, putAway);
        clothesList.add(clothes);
    }

    public List<Item> getItems(){
        return clothesList;
    }
    public Iterator<Item> createIterator(){
        return clothesList.iterator();
    }

}
