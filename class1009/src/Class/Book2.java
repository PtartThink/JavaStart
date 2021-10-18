package Class;

import java.awt.print.Book;

public class Book2 {
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum>=200){
            this.pageNum = pageNum;
        }else {
            this.pageNum = 200;
            System.out.println("页数不足");
        }

    }

    public Book2(){

    }

    /*private static Book2[] books = new Book2[20];
    static{
        books[0] = new Book2("好书",500);

    }*/

    public Book2(String title,int pageNum){
        this.title = title;
        if(pageNum>=200){
            this.pageNum = pageNum;
        }else {
            this.pageNum = 200;
            System.out.println("页数不足");
        }

    }

    /*public Book2[] detail(){
        return books;
    }*/
    public void detail(){
        System.out.println("名称是："+title);
        System.out.println("页数："+pageNum);
    }


}
