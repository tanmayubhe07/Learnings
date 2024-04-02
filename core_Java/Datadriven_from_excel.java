package core_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_from_excel {

	// Indentify testcase column by scannin whole 1st row
	// Once column is identified then scan entire testcases column to get the
	// purchase test case.
	// After we get the purchase test case row, pull all the data of that row and
	// feed it into test

	public  ArrayList<String> getData(String TestcaseName) throws IOException {
		ArrayList<String> arrayList = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Tanmay Ubhe\\eclipse-workspace\\Training\\Excel files\\DataDriven testing.xlsx");

//		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Load the workbook

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				// Indentify testcase column by scanning whole 1st row

				Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator(); // row is collection of cells

				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell Value = ce.next();
					if (Value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						// desired column
						column = k;
						break; // Exit the loop once column is identified
					}
					k++;
				}
				System.out.println(column);

//********** Once column is identified then scan entire testcases column to get the purchase test case.

				while (rows.hasNext()) // Checks whether there are rows below it OR not
				{
					Row r = rows.next(); // Control goes to the first row
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(TestcaseName)) // From first row
																										// based on
																										// Column index
																										// we will scan
																										// whole column
																										// to get
																										// desired
																										// testcase
					{
						// we get the desired testcase row so get all the data for that testcase
						Iterator<Cell> rc = r.cellIterator(); // Now as we got desired testcase we can implement cell
																// iterator on it

						while (rc.hasNext()) // This checks if next cell is present
						{
							Cell c = rc.next();
							if (c.getCellType() == CellType.STRING) {
//*************** After we get the purchase test case row, pull all the data of that row and

								arrayList.add(c.getStringCellValue());
							} else {

								arrayList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}

					}
				}

			}
		}
		return arrayList;

	}
}