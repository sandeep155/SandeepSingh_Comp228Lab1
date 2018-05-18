package exercise3;

import javax.swing.*;

public class GameObjectTest {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        int x= Integer.parseInt(JOptionPane.showInputDialog("Enter x coordinate of Game Object:"));
        int y= Integer.parseInt(JOptionPane.showInputDialog("Enter y coordinate of Game Object:"));
        int center=(x+y)/2;
        String velocity = JOptionPane.showInputDialog("Enter velocity of Game Object:");
        String state = JOptionPane.showInputDialog("Enter state of Game Object:alive or dead");
        String rotation = JOptionPane.showInputDialog("Enter rotation of Game Object::");


        GameObject gameObject = new GameObject( center, velocity, state, rotation);

        String message = gameObject.getGameObjectInformation();

        JOptionPane.showMessageDialog(null, message );

    }
}

