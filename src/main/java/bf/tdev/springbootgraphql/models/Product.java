package bf.tdev.springbootgraphql.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PRODUCT")
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SIZE")
	private String size;
	
	@Column(name="VARIETY")
	private String variety;

	@Column(name="PRICE")
	private BigDecimal price;
	
	@Column(name="STATUS")
	private String status;
}
