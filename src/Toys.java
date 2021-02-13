import java.util.Iterator;

public class Toys implements ItemList {
    static final int MAX_TOYS = 5;
    int numOfToys = 0;
    Item[] toys = new Item[MAX_TOYS];

    public Toys(){
        addToy("The baseball gear", false );
        addToy("The legos", true);
        addToy("The race cars", true);
        addToy("The board Games", false);
        addToy("The video games", true);
    }
    public void addToy(String name, boolean putAway){
        Item toy = new Item(name, putAway);
        if (numOfToys >= MAX_TOYS) {
            System.err.println("Too many toys. This can't be right");
        }
        else {
            toys[numOfToys] = toy;
            numOfToys++;
        }
    }
    public Item[] getItems() {
        return toys;
    }
    public Iterator<Item> createIterator() {
        return new ToyIterator(toys);
    }

}
