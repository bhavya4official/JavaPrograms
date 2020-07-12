package clientdatasend;
import java.io.*;

public class ReadWrite implements Serializable
{
  private String filename;
  private byte[] data;
  public String getFilename()
  {
     return filename;
  }

  public byte[] getData()
  {
     return data;
  }

  public void setFilename(String filename)
  {
    this.filename=filename;
  }

  public void setData(byte[] data)
  {
      this.data=data;
  }
  


}