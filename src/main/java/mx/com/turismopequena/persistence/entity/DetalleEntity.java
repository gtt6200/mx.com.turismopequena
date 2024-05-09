package mx.com.turismopequena.persistence.entity;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

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

	@Column(name = "id_viaje")
	private Long idViaje;
	
//	@Column(name = "id_cliente")
//	private Long idCliente;
//	
//	@Column(name = "id_usuario")
//	private Long idUsuario;

	private Short personas;

	private String sube;

	private Time hora;
	private Short habitacion;

	private Double costo;

	private Double anticipo;

	private Boolean liquidado;

	@Enumerated(EnumType.STRING)
	private SalesStatus estado;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pago")
	private PaymentMethods paymentMethod;
	
	@Enumerated(EnumType.STRING)
	private TravelType viaje;

	@Column(name = "hora_regreso")
	private Time horaRegreso;
	
	@Column(name = "fecha_regreso")
	private Date fechaRegreso;
	
	@Column(name = "fechaVenta")
	private LocalDateTime fechaVenta;

	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private UsuarioEntity usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private ClientEntity cliente;
}
