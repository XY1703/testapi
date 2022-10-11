package ru.luckydraw.testapi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.luckydraw.testapi.model.Question;
import ru.luckydraw.testapi.repository.QuestionRepository;

import java.util.List;

@Service
@Transactional
public class   QuestionService {

    private QuestionRepository repository;

    @Autowired
    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Question> getByThemeId(Integer themId){
        return repository.findByThemeId(themId);
    }

    public Question getById(Integer id){
        return repository.getById(id);
    }

    public List<Question> getAll(){
        return repository.findAll();
    }
}
