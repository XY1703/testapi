package ru.luckydraw.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.luckydraw.testapi.model.User;
import ru.luckydraw.testapi.repository.UserRepository;

@Service
@Transactional
public class UserService {

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User save(User user){
        return repository.save(user);
    }

    public User getByChatId(Long id){return repository.getByChatId(id);}

}
