package org.thinkinghub.gateway.oauth.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class RepositoryRegistry {
    private static RepositoryRegistry self;
    @Autowired
    private AuthenticationHistoryRepository authRepo;

    @PostConstruct
    public void initialize(){
        RepositoryRegistry.self = this;
    }

    public AuthenticationHistoryRepository getAuthHistoryRepo(){
        return authRepo;
    }

    public static RepositoryRegistry instance(){
        return self;
    }
}
