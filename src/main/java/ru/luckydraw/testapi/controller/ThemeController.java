package ru.luckydraw.testapi.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.luckydraw.testapi.model.Theme;
import ru.luckydraw.testapi.model.dto.ThemeDTO;
import ru.luckydraw.testapi.service.ThemeService;
import ru.luckydraw.testapi.util.MappingUtil;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ThemeController {

    @Autowired
    private ThemeService service;

    @Autowired
    private MappingUtil mappingUtil;


    @GetMapping("/api/themes")
    public List<ThemeDTO> getAll(){

        List<ThemeDTO> themes = new ArrayList<>();

        for(Theme theme : service.getAll()){
            themes.add(mappingUtil.convertThemeToDTO(theme));
        }

        return themes;
    }
}
