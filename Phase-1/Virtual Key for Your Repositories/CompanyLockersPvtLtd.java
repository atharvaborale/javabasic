package com.database;

public class CompanyLockersPvtLtd {
	public static void main(String[] args) {
		
		OperationsWithFile.createMainFolderIfNotPresent("main");
		
		Options.printWelcomeScreen("Company Lockers Private limited", "Atharva");
		
		ControlOptions.handleWelcomeScreenInput();
	}


}
