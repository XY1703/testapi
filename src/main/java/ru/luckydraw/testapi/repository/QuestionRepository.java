package ru.luckydraw.testapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.luckydraw.testapi.model.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query("select q from Question q where q.theme.id = ?1")
    List<Question> findByThemeId(Integer themeId);
}
