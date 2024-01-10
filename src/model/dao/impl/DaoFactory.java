package model.dao.impl;

import model.dao.SellerDao;

public class DaoFactory {
	
	//Operações estaticas para instanciar os Dao's
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
