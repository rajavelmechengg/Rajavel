package com.Helper_Adactin;

import java.io.IOException;

public class FileReaderManager_Adac {
	
	private FileReaderManager_Adac() {
		
	}
	
	public static FileReaderManager_Adac getInstance () {
		FileReaderManager_Adac frm = new FileReaderManager_Adac();
		return frm;
	}
	
	public ConfigurationReader_Adac getcrInstance () throws IOException {
		
		ConfigurationReader_Adac cr = new ConfigurationReader_Adac();
		return cr;
		
	}

}
