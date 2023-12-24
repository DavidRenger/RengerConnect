package dev.shingi;

import dev.shingi.models.*;
import dev.shingi.services.*;
import dev.shingi.utils.*;

import java.io.*;

public class Main {

    private static CustomerList customerList;

    private static final String fileOutputPath = "";
    
    public static void main(String[] args) throws IOException {
        /*
         * Uncomment the two lines below if reading customers through Snelstart API
         */
        CustomerReaderSnelstart snelstartCustomerReader = new CustomerReaderSnelstart(); 
        customerList = snelstartCustomerReader.readCustomerData(true);

        /*
         * Uncomment the two lines below if reading customers from Excel file
         */
        // CustomerReaderExcel customerReaderExcel = new CustomerReaderExcel();
        // customerList = customerReaderExcel.readCustomerData(true);

        ExcelExporter excelExporter = new ExcelExporter();
        excelExporter.exportComparisonsToExcel(
            customerList.getDuplicateLedgerAccounts(), 
            customerList.getUniqueLedgerAccounts(), 
            customerList.getMismatchedLedgerAccounts(),
            customerList.getUniformLedgerAccounts(), 
            fileOutputPath + "\\Comparison results.xlsx");
    }
}