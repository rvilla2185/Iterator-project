import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parent {
    ItemList toys;
    ItemList books;
    ItemList clothes;
    List<String> pickup;
    List<String> fine;

    public Parent(ItemList toys, ItemList books, ItemList clothesList){
        this.toys = toys;
        this.books = books;
        this.clothes = clothesList;
    }
    public void printResponse(){
        Iterator<Item> toyIterator = toys.createIterator();
        Iterator<Item> bookIterator = books.createIterator();
        Iterator<Item> clothesIterator = clothes.createIterator();

        System.out.println("Lets see what needs to be picked up.\n");
        System.out.println("*****TOYS*****");
        printResponse(toyIterator);

        System.out.println("*****Books*****");
        printResponse(bookIterator);

        System.out.println("*****Clothes*****");
        printResponse(clothesIterator);
    }

    private void printResponse(Iterator<Item> iterator){
        fine = new ArrayList<String>();
        pickup = new ArrayList<String>();
        while (iterator.hasNext()){
            Item item = iterator.next();
            if (item.isPutAway()) {
                fine.add(item.getItemName());
            } else {
                pickup.add(item.getItemName());
            }
        }
        if (!(fine.isEmpty())) {
            System.out.println("Good Job on picking up the following items: ");
            for (String fineEle : fine) {
                System.out.println(fineEle);
            }
        }
        System.out.println();
        if (!(pickup.isEmpty())){
            System.out.println("Pick up the following items and don't be a slob: ");
            for (String pickupEle : pickup){
                System.out.println(pickupEle);
            }
        }
        System.out.println();
    }
}
