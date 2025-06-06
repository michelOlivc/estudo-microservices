package com.estudo.sales.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class SaleEventDTO extends BaseDTO<Long> {
    private Instant occurredAt;
    private String description;
    private Long recordId;
    private String path;
    private String username;
}
