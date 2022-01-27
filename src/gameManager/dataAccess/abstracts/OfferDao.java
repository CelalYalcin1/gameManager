package gameManager.dataAccess.abstracts;

import gameManager.entities.concretes.Offer;

public interface OfferDao {
	void add(Offer offer);
	void delete(Offer offer);
	void update(Offer offer);
}
