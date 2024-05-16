package mx.com.turismopequena.persistence.repository.dto;

import mx.com.turismopequena.persistence.entity.enums.ClientType;

public record ClientResponseDTO(String name, String phone, String email, ClientType clientType) {
}
