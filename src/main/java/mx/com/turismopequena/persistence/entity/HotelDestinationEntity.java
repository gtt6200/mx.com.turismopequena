/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "hotel_destino")
public class HotelDestinationEntity {
	
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "id_hotel", referencedColumnName = "id")
	private HotelEntity hotel;
	
	@EmbeddedId
	@ManyToOne
	@JoinColumn(name = "id_destino", referencedColumnName = "id")
	private DestinationEntity destino;
	

}
