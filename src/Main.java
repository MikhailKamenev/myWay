public class Main {
    public static void main(String[] args) {
        System.out.println("Let's start!");
        Author writer1 = new Author("Robert", "Stevenson");
        Author writer2 = new Author("George", "Orwell");
        Bk book1 = new Bk("Treasure island", writer1, 1883);
        Bk book2 = new Bk("1984", writer2, 1949);
        book1.setYear(1881);
        System.out.println("Имя автора - " + writer1.getFullName());
        System.out.println("Название книги - " + book1.getName() + ". Писатель - " + book1.getWriter().getFullName() + ". Издана в " + book1.getYear() + " году.");
        System.out.println("Название книги - " + book2.getName() + ". Писатель - " + book2.getWriter().getFullName() + ". Издана в " + book2.getYear() + " году.");
    }
}