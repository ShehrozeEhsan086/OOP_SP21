package lab5_homeactivity2;

public class Lab5_HomeActivity2_Runner {
    public static void main(String[] args) {

        Book physicsBook = new Book();
        physicsBook.setAuthorName("Jason");
        physicsBook.setChapterName(new String[] {"Chapter 1","Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6"});

        Book mathsBook = new Book("Micheal",new String[] {"Introduction","Calculus","Derivatives","Integration","Wave Behaviour"});

        Boolean compareAuthorName = physicsBook.compareBooks(mathsBook);
        if (compareAuthorName){
            System.out.println("Both books have same authors.");
        } else{
            System.out.println("Both books have different authors.");
        }

        Boolean compareChapters = physicsBook.compareChapterName(mathsBook);
        if (compareChapters){
            System.out.println("Physics book has more chapters.");
        } else{
            System.out.println("Maths book has more chapters.");
        }
    }
}
