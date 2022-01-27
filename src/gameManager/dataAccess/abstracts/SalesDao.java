package gameManager.dataAccess.abstracts;

import gameManager.entities.concretes.Sales;

public interface SalesDao {
	void add(Sales sales);
	void delete(Sales sales);
	void update(Sales sales);
}
