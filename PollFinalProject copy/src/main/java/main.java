
/**
 *
 * @author sohambhatt
 */

import javax.swing.*;
import PollingSystem.LoginWindow;



public class main 
{
    public static void main(String[] args) 
    {
        LoginWindow Info = new LoginWindow();
        Info.setVisible(true);
        
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f," Hello: Welcome to the Poll Website \n ");
        JOptionPane.showInputDialog(f," 1) Create Poll \n 2) Check Poll Results \n 3) Send Emergency Message ");
        
    }
    
    
}
