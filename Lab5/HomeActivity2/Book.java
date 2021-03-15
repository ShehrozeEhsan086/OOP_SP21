package lab5_homeactivity2;

public class Book {
    private String authorName;
    private String[] chapterName = new String[100];

    public Book(){
        authorName = "unknown";
        chapterName = new String[]{"unknown"};
    }

    public Book(String name, String[] chapter){
        authorName = name;
        chapterName = chapter;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setChapterName(String[] chapterName) {
        this.chapterName = chapterName;
    }

    public boolean compareBooks(Book a){
        String firstName = authorName;
        String secondName = a.authorName;
        if (firstName.equals(secondName)){
            return true;
        } else{
            return false;
        }
    }

    public boolean compareChapterName(Book x){
        int numberOfEntriesInFirstArray=0, numberOfEntriesInSecondArray=0;

        numberOfEntriesInFirstArray = chapterName.length;
        numberOfEntriesInSecondArray = x.chapterName.length;

        if (numberOfEntriesInFirstArray > numberOfEntriesInSecondArray){
            return true;
        } else{
            return false;
        }
    }
}
