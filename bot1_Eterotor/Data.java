package bot1_Eterotor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data{

	static XSSFWorkbook workbook;

	static XSSFSheet sheet;

	public static void main(String[] args) {
		// for (int i = 2; i > 0 ; i++) {

		getdata();

		// }
	}

	public static ArrayList<Object[]> getdata() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		File src = new File("C:\\Users\\Administrator\\eclipse-workspace\\test1234\\Exel_file\\data.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			workbook = new XSSFWorkbook("C:\\Users\\Administrator\\eclipse-workspace\\test1234\\Exel_file\\data.xlsx");
			sheet = workbook.getSheetAt(0);
		} catch (IOException e) {

			e.printStackTrace();
		}

		int howcnt = sheet.getPhysicalNumberOfRows();

		// Random random = new Random();

		// int number = random.nextInt(howcnt);

		// int rowNum = number;

		for (int rowNum = 0; rowNum < howcnt; rowNum++) {

			String rowcnt = sheet.getRow(rowNum).getCell(0).getStringCellValue();

			// System.out.println(rowcnt);

			Object ob[] = { rowcnt };

			mydata.add(ob);

		}

		return mydata;
	}

}
