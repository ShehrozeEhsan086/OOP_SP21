package lab9_homeactivity1;

public class Movie {

    private String MPAA;
    private int idNum;
    private String movieTitle;

    public Movie(){
        MPAA = "unknown";
        idNum = 0;
        movieTitle = "unknown";
    }

    public Movie(String MPAA, int idNum, String movieTitle){
        this.MPAA = MPAA;
        this.idNum = idNum;
        this.movieTitle = movieTitle;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMPAA(String MPAA) {
        this.MPAA = MPAA;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMPAA() {
        return MPAA;
    }

    public boolean equal(Movie movie){
        if(this.idNum == movie.idNum){
            return true;
        } else
            return false;
    }

    public double calcLateFees(int numOfDays){
        return 2*numOfDays;
    }
}