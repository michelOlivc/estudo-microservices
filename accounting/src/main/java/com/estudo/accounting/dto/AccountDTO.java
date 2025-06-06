package com.estudo.accounting.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class AccountDTO extends AuditableDTO<Long> {
    private String description;
    private Instant overdueAt;
    private BigDecimal value;
    private String type;
    private String status;
    private List<AccountEventDTO> accountEvents;
}
