package ExcelCode;

import java.io.IOException;

public class ExcelMain 
{

	public static void main(String[] args) throws IOException 
	{
		System.out.println("My first commit to GITHUB is ready");
		ExcelCode ob=new ExcelCode();
		for(int i=0;i<ob.rowSize();i++)
		{
			for(int j=0;j<2;j++)
			{
				String m=ob.read(i, j);
				System.out.println("Value of Cell[" +i+","+j+"] is : " +m );
			}
		}

	}

}
