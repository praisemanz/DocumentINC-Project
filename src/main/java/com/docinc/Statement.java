package com.docinc;

import java.util.Date;

public class Statement {

	private String statementId;
	private Date date;
	public String pdfPath;

	public String download() {
		return pdfPath;
	}

}