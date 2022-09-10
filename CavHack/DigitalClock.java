import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;
 
public class DigitalClock {
 
  public static void main(String[] arguments) {
 
   ClockLabel timeLable = new ClockLabel("time");
     
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("Digital Clock");
    f.setSize(1200, 630);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(1, 1));
    f.setLocation(0,0);
    f.setContentPane(new Panel());
      
    
    f.add(timeLable);
    
 

 
    f.setVisible(true);
    
  }
}
 
class ClockLabel extends JLabel implements ActionListener {
 
  String type;
  SimpleDateFormat sdf;

  public ClockLabel(String type) {
    this.type = type;
    setForeground(Color.black);
    
    switch (type) {
            case "time" : sdf = new SimpleDateFormat("hh:mm:ss a");
                    setFont(new Font("comicsans", Font.PLAIN, 40));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
            default     : sdf = new SimpleDateFormat();
                    break;
    }
 
    Timer t = new Timer(1000, this);
    t.start();
  }
 
  public void actionPerformed(ActionEvent ae) {
    Date d = new Date();
    setText(sdf.format(d));
  }
}