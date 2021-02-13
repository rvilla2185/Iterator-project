import java.util.Iterator;
public class ToyIterator implements Iterator {
    Item[] toyList;
    int index = 0;

    public ToyIterator(Item[] toyList){
        this.toyList = toyList;
    }
    public Item next(){
        return toyList[index++];
    }
    public boolean hasNext(){
        return toyList.length > index;
    }
    public void remove(){
        if (index <= 0){
            throw new IllegalStateException("You need to have at least one item");
        }
        if (toyList[index-1] != null){
            for (int i = index-1; i < (toyList.length-1); i++){
                toyList[i] = toyList[i+1];
            }
            toyList[toyList.length-1] = null;
        }
    }
}
