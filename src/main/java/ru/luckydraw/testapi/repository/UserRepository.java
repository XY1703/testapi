package ru.luckydraw.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.luckydraw.testapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getByChatId(Long id);

}
