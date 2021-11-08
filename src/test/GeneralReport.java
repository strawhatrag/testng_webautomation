package test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class GeneralReport {
public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
	
	ExcelReportGenerator.generateExcelReport("ExeclReport.xlsx", "C:\\Users\\surupura\\Downloads\\New folder");
	
}
}
