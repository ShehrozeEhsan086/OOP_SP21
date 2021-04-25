package lab9_homeactivity1;

public class Action extends Movie{

    public Action(){
        super();
    }

    public Action(String MPAA, int idNum, String movieTitle){
        super(MPAA,idNum,movieTitle);
    }

    @Override
    public double calcLateFees(int numOfDays){
        return 3*numOfDays;
    }

}