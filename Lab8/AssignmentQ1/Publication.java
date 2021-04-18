package lab8_assignment_q1;

public class Publication {

    private String title;
    private int price;

    public Publication(){
        title = "unknown";
        price = 0;
    }

    public Publication(String title,int price){
        this.title = title;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("Title: "+title+"\nPrice: "+price);
    }
}