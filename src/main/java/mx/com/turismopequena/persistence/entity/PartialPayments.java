/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.entity;

import java.time.LocalDateTime;

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
import mx.com.turismopequena.persistence.entity.enums.PaymentMethods;

/**
 * 
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "abonos")
public class PartialPayments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_detalle", referencedColumnName = "id")
	private DetalleEntity detail;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private UserEntity usuario;
	
	@Column(name = "monto", columnDefinition = "DECIMAL(10,2)", nullable = false)
	private Double amount;
	
	@Column(name = "fecha_abono", nullable = false)
	private LocalDateTime dateAmount;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pago", nullable = false)
	private PaymentMethods paymentMethod;

}
