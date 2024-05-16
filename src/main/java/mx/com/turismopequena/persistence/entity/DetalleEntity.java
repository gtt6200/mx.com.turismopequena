package mx.com.turismopequena.persistence.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
import mx.com.turismopequena.persistence.entity.enums.SalesStatus;
import mx.com.turismopequena.persistence.entity.enums.PaymentMethods;
import mx.com.turismopequena.persistence.entity.enums.TravelType;
/*
 * author Alxy
 * */
@Entity
@Table(name = "detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_viaje", referencedColumnName = "id")
	private TravelEntity travelId;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private UserEntity userId;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClientEntity clientId;

	@Column(nullable = false, name = "personas")
	private Short people;

	@Column(nullable = false, name = "sube")
	private String board;

	@Column(nullable = false, name = "hora")
	private LocalTime hour;
	
	@Column(nullable = false, name = "habitacion")
	private Short roomCount;

	@Column(nullable = false, columnDefinition = "DECIMAL(10,2)", name = "costo")
	private Double price;

	@Column(nullable = false, columnDefinition = "DECIMAL(10,2)", name = "anticipo")
	private Double initialPayment;

	@Column(nullable = false, name = "liquidado")
	private Boolean isPaidOff;

	@Enumerated(EnumType.STRING)
	@Column(name = "estado", nullable = false)
	private SalesStatus status;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pago", nullable = false)
	private PaymentMethods paymentMethod;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "viaje", nullable = false)
	private TravelType travel;

	@Column(name = "hora_regreso", nullable = false)
	private LocalTime returnTime;
	
	@Column(name = "fecha_regreso", nullable = false)
	private LocalDate returnDate;
	
	@Column(name = "fecha_venta", nullable = false)
	private LocalDateTime saleDate;

	
}
