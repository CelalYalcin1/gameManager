package gameManager.business.consretes;

import gameManager.business.abstracts.SalesService;
import gameManager.entities.concretes.Sales;

public class SalesManager implements SalesService {

	@Override
	public void add(Sales sales) {
		System.out.println(sales.getSalesId()+" is added");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getSalesId()+" is deleted");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getSalesId()+" is updated");
		
	}

}
