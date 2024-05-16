package mx.com.turismopequena.persistence.projection.interfacebased.detail.closed;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.entity.TravelEntity;
import mx.com.turismopequena.persistence.entity.UserEntity;
import mx.com.turismopequena.persistence.entity.enums.TravelType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface DetailClosedView {

    Long getId();

    Short getPeople();
    String getBoard();
    LocalTime getHour();
    Short getRoomCount();
    Double getPrice();
    Double getInitialPayment();
    Boolean getIsPaidOff();

    TravelType getTravel();
    LocalTime getReturnTime();
    LocalDate getReturnDate();
    LocalDateTime getSaleDate();
}
