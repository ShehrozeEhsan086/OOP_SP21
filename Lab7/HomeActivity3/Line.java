package lab7_homeactivity3;

public class Line {

    private String startPoint;
    private String endPoint;
    private Point startPointLocation;
    private Point endPointLocation;


    public Line(String startPoint, String endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    private void setCoordinates(){
        String xTemp0 = startPoint.split(",")[0];
        String yTemp0 = startPoint.split(",")[1];

        String xTemp1 = endPoint.split(",")[0];
        String yTemp1 = endPoint.split(",")[1];

        startPointLocation = new Point(Integer.parseInt(xTemp0),Integer.parseInt(yTemp0));
        endPointLocation = new Point(Integer.parseInt(xTemp1),Integer.parseInt(yTemp1));

    }

    public double findLength(){
        setCoordinates();
        int x0 = startPointLocation.getX_cord();
        int x1 = endPointLocation.getX_cord();
        int y0 = startPointLocation.getY_cord();
        int y1 = endPointLocation.getY_cord();
        double temporary = (((x1 - x0)*(x1 - x0)) + ((y1 - y0)*(y1 - y0)));
        double length = Math.sqrt(temporary);
        return length;
    }
}