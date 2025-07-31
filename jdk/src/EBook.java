public class EBook extends Book{

    public int fileSize;

    public EBook(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public EBook(String title, int fileSize) {
        super(title);
        this.fileSize = fileSize;
    }

    @Override
    public void showBook() {
        System.out.println("책 제목 : " + title + ", 저자: " + author + " 파일 크기: " + fileSize +" 대여여부: " + (isBorrowed ? "대여중":"대여가능"));
    }
}
