package SeleniumAutomation.SeleniumAutomation;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadExcel {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\c.JERVIN\\Documents\\Input.xlsx"; // Update with your file path

        // Define SNo to copy from each sheet
        Set<Integer> snoToCopySheet1 = new HashSet<>();
        snoToCopySheet1.add(5); // Add serial numbers you want to copy from Sheet1
        snoToCopySheet1.add(6); // Example

        Set<Integer> snoToCopySheet2 = new HashSet<>();
        snoToCopySheet2.add(7); // Add serial numbers you want to copy from Sheet2
        snoToCopySheet2.add(8); // Example

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get sheets
            Sheet sheet1 = workbook.getSheet("Sheet1");
            Sheet sheet2 = workbook.getSheet("Sheet2");
            
            // Get or create Sheet3
            Sheet sheet3 = workbook.getSheet("Sheet3");
            if (sheet3 == null) {
                sheet3 = workbook.getSheet("Sheet3");
            }

            // Determine the starting row index for new data in Sheet3
            int startRow = getLastRowIndex(sheet3) + 1;

            List<Row> rowsToCopy = new ArrayList<>();
            rowsToCopy.addAll(getRowsBySNo(sheet1, snoToCopySheet1));
            rowsToCopy.addAll(getRowsBySNo(sheet2, snoToCopySheet2));

            // Write all rows to Sheet3 starting from the first empty row
            for (Row sourceRow : rowsToCopy) {
                Row destRow = sheet3.createRow(startRow++);
                copyRowContents(sourceRow, destRow);
            }

            // Write the output to a new file
            try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
                workbook.write(fos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getLastRowIndex(Sheet sheet) {
        int lastRowNum = sheet.getLastRowNum();
        // Find the last row with data
        for (int i = lastRowNum; i >= 0; i--) {
            Row row = sheet.getRow(i);
            if (row != null && !isRowEmpty(row)) {
                return i;
            }
        }
        return -1; // Return -1 if no rows are found, meaning the sheet is empty
    }

    private static List<Row> getRowsBySNo(Sheet sheet, Set<Integer> snoSet) {
        List<Row> rows = new ArrayList<>();
        for (Row row : sheet) {
            if (isRowEmpty(row)) {
                // Skip empty rows
                continue;
            }

            Cell snoCell = row.getCell(0); // Assuming SNo is in the first column (index 0)
            if (snoCell != null) {
                Integer snoValue = getSNoValue(snoCell);
                if (snoValue != null && snoSet.contains(snoValue)) {
                    rows.add(row);
                }
            }
        }
        return rows;
    }

    private static Integer getSNoValue(Cell snoCell) {
        try {
            switch (snoCell.getCellType()) {
                case NUMERIC:
                    return (int) snoCell.getNumericCellValue();
                case STRING:
                    return Integer.parseInt(snoCell.getStringCellValue().trim());
                default:
                    return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static void copyRowContents(Row sourceRow, Row destRow) {
        for (Cell sourceCell : sourceRow) {
            Cell destCell = destRow.createCell(sourceCell.getColumnIndex(), sourceCell.getCellType());
            switch (sourceCell.getCellType()) {
                case STRING:
                    destCell.setCellValue(sourceCell.getStringCellValue());
                    break;
                case NUMERIC:
                    destCell.setCellValue(sourceCell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    destCell.setCellValue(sourceCell.getBooleanCellValue());
                    break;
                case FORMULA:
                    destCell.setCellFormula(sourceCell.getCellFormula());
                    break;
                default:
                    destCell.setCellValue(sourceCell.toString());
                    break;
            }
        }
    }

    private static boolean isRowEmpty(Row row) {
        for (Cell cell : row) {
            if (cell != null && !cell.toString().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
