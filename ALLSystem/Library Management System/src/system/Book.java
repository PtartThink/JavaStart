package system;

public class Book {
    /*图书类
    图书id
    书名
    出版社
    作者
    类别id（对应类别类）
    借阅者id（对应用户类）*/
    private int BookID;
    private String BookName;
    private String PublishingHouse;
    private String Author;

    public Book() {
    }

    public Book(int bookID, String bookName, String publishingHouse, String author) {
        BookID = bookID;
        BookName = bookName;
        PublishingHouse = publishingHouse;
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", BookName='" + BookName + '\'' +
                ", PublishingHouse='" + PublishingHouse + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getPublishingHouse() {
        return PublishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        PublishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
