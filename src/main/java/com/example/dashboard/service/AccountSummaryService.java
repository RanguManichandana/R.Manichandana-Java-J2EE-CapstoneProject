package com.example.dashboard.service;
import com.example.dashboard.model.AccountSummary;
import com.example.dashboard.repository.AccountSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AccountSummaryService {

    @Autowired
    private AccountSummaryRepository repository;

    public Mono<AccountSummary> getAccountSummary(String accountId) {
        return repository.findById(accountId);
    }

    public Mono<AccountSummary> createAccountSummary(AccountSummary accountSummary) {
        return repository.save(accountSummary);
    }
}
