package me.dio.santanderdev.controller.dto;

import java.math.BigDecimal;
import me.dio.santanderdev.domain.model.Card;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}