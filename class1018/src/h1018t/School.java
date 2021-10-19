package h1018t;
/*包含类型：教员、学校、打印机，具体要求如下：*/

public class School implements Idetail{
    private Printer printer;
    //detail方法
    public String detail(){
        return "学校信息";
    }
    public Printer getPrinter() {
        return printer;
    }
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    public void print(Idetail idetail){
        printer.print(idetail.detail());
    }

}
