import java.awt.Desktop;
import java.net.URI;

public class Google
{
	
public static void main(String arg[]) throws Exception
   {
 Desktop d=Desktop.getDesktop();
    d.browser(new URI("http://google.com")); 
    }
}                                    