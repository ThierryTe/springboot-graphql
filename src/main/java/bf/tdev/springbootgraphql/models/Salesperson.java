package bf.tdev.springbootgraphql.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="SALESPERSON")
@Getter
@Setter
public class Salesperson {

	@Id
	@Column(name="SALESPERSON_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	@Column(name="VILLE")
	private String ville;
	
	@Column(name="QUARTIER")
	private String quartier;
	
	@Column(name="LOCALISATION")
	private String localisation;
}
