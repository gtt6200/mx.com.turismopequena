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
	private TravelEntity travel;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private UserEntity usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClientEntity cliente;

	@Column(nullable = false)
	private Short personas;

	@Column(nullable = false)
	private String sube;

	@Column(nullable = false)
	private LocalTime hora;
	
	@Column(nullable = false)
	private Short habitacion;

	@Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
	private Double costo;

	@Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
	private Double anticipo;

	@Column(nullable = false)
	private Boolean liquidado;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private SalesStatus estado;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pago", nullable = false)
	private PaymentMethods paymentMethod;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TravelType viaje;

	@Column(name = "hora_regreso", nullable = false)
	private LocalTime returnType;
	
	@Column(name = "fecha_regreso", nullable = false)
	private LocalDate returnDate;
	
	@Column(name = "fecha_venta", nullable = false)
	private LocalDateTime fechaVenta;

	
}
