package com.phong.polo.services.impl;

import com.phong.polo.dao.polo.entities.Account;
import com.phong.polo.dao.polo.repositories.AccountRepository;
import com.phong.polo.services.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    private Logger LOGGER= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Override
    public List<Account> getAllAccount() {
        List<Account> listAccount=new ArrayList<Account>();
        try{
            listAccount=accountRepository.getAllAccount();
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
        return listAccount;
    }
}
