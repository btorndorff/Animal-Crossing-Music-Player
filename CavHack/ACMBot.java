import java.io.*;
import java.awt.Graphics;
import java.util.Scanner;
import java.time.LocalTime;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;
    import javax.sound.sampled.LineUnavailableException;
    import javax.sound.sampled.UnsupportedAudioFileException;
    import javafx.scene.media.Media;
    import javafx.scene.media.MediaPlayer;
    import javafx.embed.swing.JFXPanel;
    import javafx.application.Application;
    import javax.sound.*;
    import java.io.*;
    import java.net.URL;
    import javax.sound.sampled.*;
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
 
public class ACMBot extends JFrame 
{
 
  // Constructor
   public ACMBot() throws InterruptedException {
      /*this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Test Sound Clip");
      this.setSize(300, 200);
      this.setVisible(true);*/

    
     
    Scanner sc = new Scanner(System.in);
    JFrame frame = new JFrame();
    Object result = JOptionPane.showInputDialog(frame, "Do you want to choose your time?");

    //System.out.println("Do you want to choose your time?");
    //String a = sc.nextLine();
    String a = result + "";
    a = a.trim().toLowerCase();
      //String resultb = result + "";
      int hour = -1;
      if(a.equals( "no" )){
         LocalTime time = LocalTime.now();
         hour = time.getHour();
   }
   
   else{
      //System.out.println("What hour?");
      Object resultb = JOptionPane.showInputDialog(frame, "What hour?");
      hour = Integer.parseInt(resultb + "");
      //hour = sc.nextInt();
   }
 
     while(LocalTime.now().getHour() == hour){
      try {
         
         // Open an audio input stream.
         File soundFile = new File(hour + ".wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);          
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
         TimeUnit.MINUTES.sleep(1);
         clip.stop();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
      
   }
}
 
 
 
  public static void main (String [] args) throws InterruptedException
   {
    //Creates clock
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
    //Plays music
     new ACMBot();     
          
  
  /* Scanner sc = new Scanner(System.in);
   System.out.println("Do you want to choose your time?");
   String a = sc.nextLine();
   int hour = -1;
   if(a.equals("no")){
      LocalTime time = LocalTime.now();
      hour = time.getHour();
   }
   else{
      System.out.println("What hour?");
      hour = sc.nextInt();
   } */
  
   /*int i = 0;
   while(i == 0){
      String song = hour + ".wav";
      while (LocalTime.now().getHour() == hour){*/

   }
   
    
}