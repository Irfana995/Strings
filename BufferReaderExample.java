package buffer;
import java.io.*;
public class BufferReaderExample 
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			float a=Float.parseFloat(br.readLine());
			double b=Double.parseDouble(br.readLine());
			System.out.print(a+"\n"+b);
		}
		catch(Exception e)
		{
			
		}
	}
}
