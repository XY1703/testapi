package ru.luckydraw.testapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.luckydraw.testapi.model.Theme;
import ru.luckydraw.testapi.repository.ThemeRepository;

import java.util.List;

@Service
@Transactional
public class ThemeService {

    private ThemeRepository repository;

    @Autowired
    public ThemeService(ThemeRepository repository) {
        this.repository = repository;
    }

    public List<Theme> getAll(){
        return repository.findAll();
    }
}
