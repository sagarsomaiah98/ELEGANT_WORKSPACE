package com.data;

public class ReadExcel {

	public static void main(String[] args) {
		Xls_Reader xls = new Xls_Reader("S:\\ELEGANT_WORKSPACE\\QA_CLASS_13_DATA_PARAMETERIZATION\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("GMAIL");
		
		System.out.println(rowCount);
		
		
		//String value=xls.getCellData("GMAIL", "STATUS", 11);
		
		//System.out.println(value);
		
		
		for(int i=1;i<=rowCount;i++) {
	    String v=xls.getCellData("GMAIL", "TCID", i);
	    String v1=xls.getCellData("GMAIL", "TESTCASE", i);
	    String v2=xls.getCellData("GMAIL", "STATUS", i);
			System.out.println(v+"  | "+ v1+" | "+v2);
			
		}
	}

}
