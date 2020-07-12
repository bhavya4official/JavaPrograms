import java.awt.*;
import javax.swing.*;
class Login extends JFrame
{
public Login()
	{
setSize(200,400);
setTitle("GUI");
setResizable(false);
setUndecorated(false);
getContentPane().setBackground(Color.blue);
setIconImage(Toolkit.getDefaultToolkit().getImage("E:/Wallpapers/Images/new.png"));
setVisible(true);
	}
public static void main(String as[])
	{Login l=new Login();
	}

}