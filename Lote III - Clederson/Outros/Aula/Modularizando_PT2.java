import javax.swing.JOptionPane;
public class Modularizando_PT2 {

  public static void main(String args [])
  	{
     int B,H;
     B = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE DO TRINGULO"));
     H = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA DO TRINGULO"));
     JOptionPane.showMessageDialog(null,"A AREA HE " + FAREA(B,H));
   }

  static int FAREA (int X,int Y){
    int AR = 0;
    AR = (X*Y)/2;
    return AR;
  }
}