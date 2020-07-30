package com.example.task5.Controller;

import com.example.task5.Service.accountService;
import com.example.task5.type.accountDAO;
import com.example.task5.type.accountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/account")
public class accountController
{
    @Autowired
    private accountService service;

    @PostMapping("/newAccount")
    public accountDAO newAccount(@RequestBody accountDTO account_dto)
    {
        return service.postAccount(account_dto);
    }
}
