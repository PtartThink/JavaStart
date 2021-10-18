package Class;

public class Book3 {

    private String title;
    private int pageNum;
    private String type;

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void detail(){
        System.out.println("名称是："+title);
        System.out.println("页数是："+pageNum);
        System.out.println("种类是："+type);
    }
    public Book3(){

    }
    public Book3(String title,int pageNum,String type){
        this.title = title;
        this.pageNum = pageNum;
        this.type = type;
    }
    public Book3(String title,int pageNum){
        this.title = title;
        this.pageNum = pageNum;
        this.type = "计算机";
    }

}
