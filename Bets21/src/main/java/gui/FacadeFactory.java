package gui;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;

public class FacadeFactory {

	private DataAccess da;
	
	public FacadeFactory(DataAccess d) {
		this.da=d;
	}
	
	public BLFacade createFacade() {
		return new BLFacadeImplementation(this.da);
	}
}
