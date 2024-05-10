/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.entity;

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
@Table(name = "asientos")
public class SeatEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "numero")
	private Integer numberSeat;
	
	@ManyToOne
	@JoinColumn(name = "id_viaje", referencedColumnName = "id")
	private TravelEntity travel;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClientEntity client;
	
	@Column(name = "disponible")
	private Boolean isAvailable;
}
