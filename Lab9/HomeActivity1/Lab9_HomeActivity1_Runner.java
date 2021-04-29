package lab9_homeactivity1;

public class Lab9_HomeActivity1_Runner {
    public static void main(String[] args) {

        Action movie1 = new Action("Rated G",1,"Fast and Furious 6");

        Comedy movie2 = new Comedy();
        movie2.setMPAA("PG-13");
        movie2.setIdNum(2);
        movie2.setMovieTitle("Mr Bean.");

        Drama movie3 = new Drama("Rated G",1,"Fast 6");

        if (movie1.equal(movie3)){
            System.out.println("\""+movie1.getMovieTitle()+"\" is same as \""+movie3.getMovieTitle()+"\"");
        } else
            System.out.println("\""+movie1.getMovieTitle()+"\" and  \""+movie3.getMovieTitle()+"\" are not same.");

        System.out.println();

        System.out.println("Movie List: ");
        System.out.println("Movie Name: "+movie1.getMovieTitle()+", Rated: "+movie1.getMPAA()+", Movie ID: "+ movie1.getIdNum()+", Late Fee(15 days): $"+movie1.calcLateFees(15));
        System.out.println("Movie Name: "+movie2.getMovieTitle()+", Rated: "+movie2.getMPAA()+", Movie ID: "+ movie2.getIdNum()+", Late Fee(4 days): $"+movie2.calcLateFees(4));
        System.out.println("Movie Name: "+movie3.getMovieTitle()+", Rated: "+movie3.getMPAA()+", Movie ID: "+ movie3.getIdNum()+", Late Fee(15 Days): $"+movie3.calcLateFees(15));
    }
}