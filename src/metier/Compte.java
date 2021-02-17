package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
	@XmlAttribute
	private int code;
	@XmlElement
	private double solde;
	@XmlTransient //pour specifier les attribut qui ne sont pas serialisables ou qui nous voulons pas les affichers dans le body de response.
	private Date dateCreation;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreaction() {
		return dateCreation;
	}
	public void setDateCreaction(Date dateCreaction) {
		this.dateCreation = dateCreaction;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int code, double solde, Date dateCreaction) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreaction;
	}
	

}
