package bf.tdev.springbootgraphql.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ORDERS")
@Getter
@Setter
public class Order {
	
	@Id
	@Column(name="ORDER_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID", nullable=false, updatable=false)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="SALESPERSON_ID", nullable=false, updatable=false)
	private Salesperson saleperson;
	
	@OneToMany(mappedBy="order")
	private List<OrderLine> orderLines;
	

}
