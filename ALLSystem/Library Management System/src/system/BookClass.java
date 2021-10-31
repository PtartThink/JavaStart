package system;

public class BookClass {
    /*图书类别类
    类别id
    类别名称*/

    private int BookClassID;
    private String BookClassName;

    public BookClass() {
    }

    public BookClass(int bookClassID, String bookClassName) {
        BookClassID = bookClassID;
        BookClassName = bookClassName;
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "BookClassID=" + BookClassID +
                ", BookClassName='" + BookClassName + '\'' +
                '}';
    }

    public int getBookClassID() {
        return BookClassID;
    }

    public void setBookClassID(int bookClassID) {
        BookClassID = bookClassID;
    }

    public String getBookClassName() {
        return BookClassName;
    }

    public void setBookClassName(String bookClassName) {
        BookClassName = bookClassName;
    }
}
