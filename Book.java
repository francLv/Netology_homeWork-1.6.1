public class Book {
    public String title; // Название книги
    public int age18; // Ограничение по возрасту
    public int page; // Количество страниц

    // Конструктор с тремя параметрами
    public Book(String title, int age18, int page) {
        this.title = title;
        this.age18 = age18;
        this.page = page;
    }

    // Конструктор с двумя параметрами
    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    // Определяем ограничения по возрасту
    public boolean canReadThis(int age) {
        return age >= age18;
    }

    // Печатаем параметры книги
    public String toString() {
        return "title: " + title + "\n" + "Recommend Age: " + age18 + "+" + "\n" + "Pages: " + page;
    }
}
