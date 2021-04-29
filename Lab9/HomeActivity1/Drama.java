package lab9_homeactivity1;

public class Drama extends Movie{

    public Drama(){
        super();
    }

    public Drama(String MPAA, int idNum, String movieTitle){
        super(MPAA,idNum,movieTitle);
    }

    @Override
    public double calcLateFees(int numOfDays){
        return 2*numOfDays;
    }
}