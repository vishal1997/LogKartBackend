package com.logkart.common;

public class Constants {
	
	/**
	 * 
	 * @author Vishal Gupta
	 *
	 */
	public class Database {
		public static final String DATABASE = "logkart";
		public static final String ADDRESS = "ds255347.mlab.com";
		public static final int PORT = 55347;
		
		//Move this to properties file.
		public static final String USER = "vishalgupta";
		public static final String PWD = "logkart123";
	}
	
	public class StatusCode {
		public static final String SUCCESS = "Success";
		public static final String DUPLICATE = "Duplicate";
		public static final String ERROR = "Delete";
		public static final String INVALID = "Invalid";
		public static final String FAILED = "Failed";
	}
	
	public class MongoDbSignature {
		public static final String DUPLICATE_CODE = "error code 11000";
	}

}
