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
@Table(name = "detalle_hotel_destino_viaje")
public class DetailHotelDestinationTravel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_detalle", referencedColumnName = "id")
	private DetalleEntity detail;
	
	@ManyToOne
	@JoinColumn(name = "id_hotel_destino_viaje", referencedColumnName = "id")
	private HotelDestinationTravelEntity hotelDestinationTrave;
	
	@Column(name = "habitaciones")
	private Integer habitations;

}
