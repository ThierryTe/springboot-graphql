package bf.tdev.springbootgraphql.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerInput {
	
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String ville;
	private String quartier;
	private String localisation;
	
	
	public Customer getCustomerEntity() {
		Customer customer = new Customer();
		customer.setNom(this.nom);
		customer.setPrenom(this.prenom);
		customer.setEmail(this.email);
		customer.setTelephone(this.telephone);
		customer.setVille(this.ville);
		customer.setQuartier(this.quartier);
		customer.setLocalisation(this.localisation);
		
		return customer;
	}
}
