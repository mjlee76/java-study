package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        // 기본생성자 -> 다른생성자들이 밑에 정의되있으므로 기본생성자를 직접 선언해줘야함.
        this.title = "";
        this.author = "";
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page  = page;
    }

    Book(String title, String author) {
        //this(title, author, 0);
        this.title = title;
        this.author = author;
        this.page = 0;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
