/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "viaje")
public class TravelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_destino", referencedColumnName = "id")
	private DestinationEntity destination;
	
	@Column(name = "fecha", columnDefinition = "DATE")
	private Date date;
	
	@Column(name = "no_asientos")
	private Short noSeats;
	
	@Column(name = "observaciones", length = 200)
	private String observation;
	
}
