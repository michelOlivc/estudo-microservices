package com.estudo.inventory.entities.enums;

import lombok.Getter;

@Getter
public enum UnitType {
    UNITS("Units", "U"),
    KILOGRAMS("Kilograms", "Kg"),
    GRAMS("Grams", "g"),
    MILLIGRAMS("Milligrams", "mg"),
    METERS("Meters", "m"),
    CENTIMETERS("Centimeters", "cm"),
    MILLIMETERS("Millimeters", "mm"),
    SQUARE_METERS("Square Meters", "m²"),
    CUBIC_METERS("Cubic Meters", "m³"),
    LITERS("Liters", "L"),
    MILLILITERS("Milliliters", "mL"),
    ;

    private final String name;
    private final String symbol;

    UnitType(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}
