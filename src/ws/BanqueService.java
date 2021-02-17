package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConversionEuroToDh")
	public double conversion(@WebParam(name="montant") double mt) {
		return mt*11;
	}
	@WebMethod
	public Compte getCompte(int code) {
		return new Compte(code, 100+Math.random()*900, new Date());
	} 
	@WebMethod
	public List<Compte> listeCompte(){
		List<Compte> comptes= new ArrayList<Compte>();
		comptes.add(new Compte(1, 100+Math.random()*900, new Date()));
		comptes.add(new Compte(2, 100+Math.random()*900, new Date()));
		comptes.add(new Compte(3, 100+Math.random()*900, new Date()));
		return comptes;
		
	}

}
