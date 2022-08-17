public class Bk {
    private String name;
    private Author writer;
    private int year;

    public Bk(String name, Author writer, int year) {
        this.name = name;
        this.writer = writer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getWriter() {
        return writer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
