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
 * @author alxyg
 * 
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel_destino_viaje")
public class HotelDestinationTravelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_hotel", referencedColumnName = "id")
	private HotelEntity hotel;
	
	@ManyToOne
	@JoinColumn(name = "id_destino", referencedColumnName = "id")
	private DestinationEntity destination;
	
	@ManyToOne
	@JoinColumn(name = "id_viaje", referencedColumnName = "id")
	private TravelEntity travel;
	
	@Column(name = "no_habitaciones")
	private Integer noHabitations;
	
	@Column(name = "habitaciones_disponibles")
	private Integer availableHabitations;
}
