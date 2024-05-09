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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.com.turismopequena.persistence.entity.enumsDetalle.Estado;
import mx.com.turismopequena.persistence.entity.enumsDetalle.Pago;
import mx.com.turismopequena.persistence.entity.enumsDetalle.Viaje;

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
	@Column(name = "id_cliente")
	private Long idCliente;
	@Column(name = "id_usuario")
	private Long idUsuario;

	private Short personas;

	private String sube;

	private Time hora;
	@Column(columnDefinition = "TINYINT(4)")
	private Short habitacion;

	private Double costo;

	private Double anticipo;

	@Column(columnDefinition = "TINYINT")
	private Boolean liquidado;

	@Enumerated(EnumType.STRING)
	private Estado estado;
	@Enumerated(EnumType.STRING)
	private Pago pago;
	@Enumerated(EnumType.STRING)
	private Viaje viaje;

	@Column(name = "hora_regreso")
	private Time horaRegreso;
	@Column(name = "fecha_regreso")
	private Date fechaRegreso;
	@Column(name = "fechaVenta")
	private LocalDateTime fechaVenta;

}
