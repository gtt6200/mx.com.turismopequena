package mx.com.turismopequena.persistence.repository.detail;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.entity.TravelEntity;
import mx.com.turismopequena.persistence.entity.UserEntity;

public record DetailDTO(
        Long id,
        String travelId,
        String user,
        String client,
        Short people,
        String board
) {
}
