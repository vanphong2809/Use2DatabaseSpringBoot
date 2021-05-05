package com.phong.polo.controllers;

import com.phong.polo.dao.polo.entities.Account;
import com.phong.polo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Account> getAllAccount(){
        List<Account> listAccount=null;
        listAccount=accountService.getAllAccount();
        return listAccount;
    }
}
