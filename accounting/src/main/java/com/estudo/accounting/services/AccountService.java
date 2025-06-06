package com.estudo.accounting.services;

import com.estudo.accounting.dto.AccountDTO;
import com.estudo.accounting.entities.Account;
import com.estudo.accounting.entities.AccountEvent;
import com.estudo.accounting.repositories.AccountRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class AccountService extends BaseService<Account, AccountDTO, Long> {

    public AccountService(AccountRepository repository) {
        super(repository);
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    @SneakyThrows(JsonProcessingException.class)
    public void beforeSave(Account account) {
        Account previous = null;
        String eventDescription = "The Account was created";

        if (account.getId() != null) {
            previous = repository.findById(account.getId()).orElse(null);

            if (previous != null && !previous.equals(account)) {
                eventDescription = "The Account was edited.";
            }
        }

        AccountEvent event = new AccountEvent(eventDescription,
                Instant.now(),
                objectMapper.writeValueAsString(previous),
                objectMapper.writeValueAsString(account),
                "SYSTEM");

        account.addAccountEvent(event);
    }
}
