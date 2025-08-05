public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public Book(String title) {
        this.title = title;
        this.author = "저자없음";
        this.isBorrowed = false;
    }

    public void showBook() {
        System.out.println("책 제목 : " + title + ", 저자: " + author + " 대여여부: " + (isBorrowed ? "대여중":"대여가능"));
    }
}
