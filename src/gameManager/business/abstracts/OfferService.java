package gameManager.business.abstracts;

import gameManager.entities.concretes.Offer;

public interface OfferService {
	void add(Offer offer);
	void delete(Offer offer);
	void update(Offer offer);
}
