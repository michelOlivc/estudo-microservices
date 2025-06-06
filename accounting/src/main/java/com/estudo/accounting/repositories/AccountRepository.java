package com.estudo.accounting.repositories;

import com.estudo.accounting.entities.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {
}
