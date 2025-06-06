package com.estudo.accounting.controllers;

import com.estudo.accounting.dto.AccountDTO;
import com.estudo.accounting.services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/accounts")
public class AccountController extends BaseController<AccountDTO, Long> {

    public AccountController(AccountService service) {
        super(service);
    }
}
