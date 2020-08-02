package com.example.task5.Service;

import com.example.task5.Entity.accountTableEntity;
import com.example.task5.Repository.accountRepo;
import com.example.task5.type.accountDAO;
import com.example.task5.type.accountDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class accountService
{


    private accountRepo repo;
    private ModelMapper modelMapper;
    private accountDAO  accountdao;
    private accountDTO accountDTO;

    
    public accountService(accountRepo repo) {
        this.repo = repo;
        this.modelMapper = new ModelMapper();
        this.accountdao = new accountDAO();
        this.accountDTO = new accountDTO();
    }

    //addAccount

    public accountDAO postAccount(accountDTO accountdto)
    {
        accountTableEntity addAccount = modelMapper.map(accountdto, accountTableEntity.class);
        repo.save(addAccount);
        Optional<accountTableEntity> account = repo.findById(addAccount.getId());

        if(account.isPresent())
        {
            accountTableEntity foundAccount = account.get();
            accountdao.setId(foundAccount.getId());
            accountdao.setStatus("Account Created");

        }
        return accountdao;

    }
}
