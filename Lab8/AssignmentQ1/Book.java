package lab8_assignment_q1;

public class Book extends Publication{

    private int pageCount;

    public Book(){
        pageCount = 0;
    }

    public Book(String title,int price,int pageCount){
        super(title,price);
        this.pageCount = pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void display(){
        super.display();
        System.out.println("Page Count: "+pageCount);
    }
}