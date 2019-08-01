/**
 * Copyright (C), 2012-2019, www.shopin.net
 * FileName: ExportSXXFwork
 * Author:   pengweiqiang
 * Date:     2019/7/31 18:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tanzk.export;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.FileOutputStream;

/**
 * 使用SXSSFWorkbook导出大数据.
 *
 * @author pengweiqiang
 * @version V1.0 2019/7/31
 */
public class ExportSXXFwork {
    public static void main(String[] args) throws Throwable {
        long start = System.currentTimeMillis();
        SXSSFWorkbook wb = new SXSSFWorkbook(1000); // keep 100 rows in memory, exceeding rows will be flushed to disk
        Sheet sh = wb.createSheet();
        for (int rownum = 0; rownum < 10000; rownum++) {
            Row row = sh.createRow(rownum);
            for (int cellnum = 0; cellnum < 19; cellnum++) {
                Cell cell = row.createCell(cellnum);
                String address = new CellReference(cell).formatAsString();
                cell.setCellValue(address);
            }

        }

//        // Rows with rownum < 900 are flushed and not accessible
//        for (int rownum = 0; rownum < 900; rownum++) {
//            sh.getRow(rownum);
//        }
//
//        // ther last 100 rows are still in memory
//        for (int rownum = 900; rownum < 1000; rownum++) {
//            sh.getRow(rownum);
//        }

        FileOutputStream out = new FileOutputStream("/Users/pengweiqiang/tanzhou/export/file/sxssf.xlsx");
        wb.write(out);
        out.close();

        // dispose of temporary files backing this workbook on disk
        wb.dispose();
        System.out.println((System.currentTimeMillis()-start)+"ms");

    }
}