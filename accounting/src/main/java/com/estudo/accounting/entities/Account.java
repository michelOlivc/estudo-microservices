package com.estudo.accounting.entities;

import com.estudo.accounting.entities.enums.AccountStatus;
import com.estudo.accounting.entities.enums.AccountType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Account extends AuditableEntity<Long> {
    private String description;
    private Instant overdueAt;

    @Column(name = "\"value\"")
    private BigDecimal value;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private List<AccountEvent> accountEvents;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;
        return Objects.equals(description, account.description)
                && Objects.equals(overdueAt, account.overdueAt)
                && Objects.equals(value, account.value)
                && type == account.type
                && status == account.status
                && Objects.equals(accountEvents, account.accountEvents);
    }

    public void addAccountEvent(AccountEvent event) {
        if (accountEvents == null) {
            accountEvents = new ArrayList<>();
        }

        accountEvents.add(event);
    }
}
