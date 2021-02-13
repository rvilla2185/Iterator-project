public class ParentCheck {
    public static void main(String args[]) {
        Books books = new Books();
        Toys toys = new Toys();
        Clothes clothesList = new Clothes();

        Parent parent = new Parent(toys, books, clothesList);

        parent.printResponse();

    }
}
