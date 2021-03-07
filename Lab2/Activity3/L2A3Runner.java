package l2a3;

import javax.swing.JOptionPane;

public class L2A3Runner {
    public static void main(String[] args){
        CarPart carOne = new CarPart();
        String x = JOptionPane.showInputDialog("What is Model Number?" );
        String y = JOptionPane.showInputDialog("What is Part Number?" );
        String z = JOptionPane.showInputDialog("What is Cost?" );
        carOne.setparameters(x,y,z);
        carOne.display();
    }
}
