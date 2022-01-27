package gameManager.dataAccess.concretes;

import gameManager.dataAccess.abstracts.SalesDao;
import gameManager.entities.concretes.Sales;

public class SalesJdbcDao implements SalesDao{

	@Override
	public void add(Sales sales) {
		System.out.println(sales.getSalesId()+" added to JDBC database");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getSalesId()+" deleted from JDBC database");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getSalesId()+" updated to JDBC database");
		
	}

}
