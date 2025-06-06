package com.estudo.sales.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class SaleDTO extends AuditableDTO<Long> {
    private Long salesman_id;
    private CustomerDTO customer;
    private String observations;
    private Long accountId;
    private List<ItemDTO> items;
    private List<SaleEventDTO> saleEvents;
    private Instant occurredAt;
}
