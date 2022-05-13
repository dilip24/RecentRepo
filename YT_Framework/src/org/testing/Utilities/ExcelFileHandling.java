package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileHandling 
{
	public static void ReadDataBasedUponRowNoAndColumnNo(int a, int b) throws BiffException, IOException
	{
		File f = new File("../YT_Framework/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		Cell wc = ws.getCell(b,a);
		System.out.println("Content in the Cell is : "+wc.getContents());
	}
	
	public static void ReadDataBasedUponRowNo(int rowNo) throws BiffException, IOException
	{
		File f = new File("../YT_Framework/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=0;i<r;i++)
		{
			if(i==rowNo)
			for(int j=0;j<c;j++)
			{
				Cell wc = ws.getCell(j,i);
				System.out.println("Content in row "+rowNo+" and column "+(j)+" is : "+wc.getContents());
			}
		}	
	}
	
	public static void ReadDataBasedUponRange(int s, int e) throws BiffException, IOException
	{
		File f = new File("../YT_Framework/ReadExcel.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for(int i=s;i<=e;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell wc = ws.getCell(j,i);
				System.out.println("Content available in rows "+s+" to "+e+" of column "+(j)+" : "+wc.getContents());
			}
		}	
	}

}
