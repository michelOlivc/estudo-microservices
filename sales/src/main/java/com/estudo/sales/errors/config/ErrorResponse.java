package com.estudo.sales.errors.config;

import lombok.Builder;

@Builder
public record ErrorResponse(int statusCode, String message, String details, String path) {
}
