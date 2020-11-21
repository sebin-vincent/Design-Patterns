package com.designpatterns.creational_pattern.singleton_pattern;

import java.util.Optional;
import java.util.logging.Logger;

public class Database {
		private final static Logger logger=Logger.getLogger("logger");
		
		private static Database databaseInstance;
		
		private Database(){
		
		}
		
		
		public static Database getDatabaseInstance() {
				
				if(! Optional.ofNullable(databaseInstance).isPresent()){
						databaseInstance=new Database();
				}
				
				return databaseInstance;
		}
		
		public void sendDataToDatabase(){
				logger.info("Data sent to database through db object "+this.toString());
		}
		
		public void getDataFromDatabase(){
				logger.info("Data received from database through db object "+this.toString());
		}
}
