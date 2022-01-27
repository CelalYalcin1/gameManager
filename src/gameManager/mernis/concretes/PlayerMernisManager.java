package gameManager.mernis.concretes;

import java.rmi.RemoteException;

import gameManager.entities.concretes.Player;
import gameManager.mernis.abstracts.PlayerMernisCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PlayerMernisManager implements PlayerMernisCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoap person = new KPSPublicSoapProxy();
		try {
			return person.TCKimlikNoDogrula(Long.valueOf(player.getIdentityNumber()).longValue(),
					player.getName().toUpperCase() ,
					player.getSurname().toUpperCase(), player.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			return false;
	}
	}
}
