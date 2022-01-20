public class Main {
    static public void main(String[] args) {
        Book book1 = new Book("Hero of Galactic", 12, 500);
        System.out.println(book1 + "\n");
        Book book2 = new Book("Blue lacunae", 16, 1200);
        System.out.println(book2 + "\n");
        Book book3 = new Book("Fairy tales", 56);
        System.out.println(book3 + "\n");
        Book book4 = new Book("Snow white and the 7 dwarfs", 6, 145);
        System.out.println(book4 + "\n");

        int age = 5;
        System.out.println(book1.canReadThis(age));
        System.out.println(book2.canReadThis(age));
        System.out.println(book3.canReadThis(age));
        System.out.println(book4.canReadThis(age));


    }
}
