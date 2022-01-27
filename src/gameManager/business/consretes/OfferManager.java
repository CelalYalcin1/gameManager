package gameManager.business.consretes;

import gameManager.business.abstracts.OfferService;
import gameManager.entities.concretes.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getName()+" is added");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getName()+" is deleted");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getName()+" is updated");
		
	}

}
