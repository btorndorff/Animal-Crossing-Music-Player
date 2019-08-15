  import javax.swing.*;
  import java.awt.*;
  public class Panel extends JPanel
  {
   public void paintComponent(Graphics g)
    {
     ImageIcon thomas = new ImageIcon("background.png");
     g.drawImage(thomas.getImage(), 0, 0, null);      
    }
}