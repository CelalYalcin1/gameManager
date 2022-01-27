package gameManager.business.abstracts;

import gameManager.entities.concretes.Sales;

public interface SalesService {
	void add(Sales sales);
	void delete(Sales sales);
	void update(Sales sales);
}
