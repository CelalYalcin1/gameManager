package gameManager.dataAccess.concretes;

import gameManager.dataAccess.abstracts.OfferDao;
import gameManager.entities.concretes.Offer;

public class OfferJdbcDao implements OfferDao{

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getName()+" added to JDBC database");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getName()+" deleted from JDBC database");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getName()+" updated to JDBC database");
		
	}

}
