package ru.luckydraw.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.luckydraw.testapi.model.Answer;
import ru.luckydraw.testapi.repository.AnswerRepository;

import java.util.List;

@Service
@Transactional
public class AnswerService {

    private AnswerRepository repository;

    @Autowired
    public AnswerService(AnswerRepository repository) {
        this.repository = repository;
    }

    public List<Answer> getByQuestionId(Integer questionId){
        return repository.findByQuestionId(questionId);
    }

    public Answer getById(Integer id){
        return repository.getById(id);
    }

    public List<Answer> getAll(){
        return repository.findAll();
    }
}
