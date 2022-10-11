package ru.luckydraw.testapi.util;

import org.springframework.stereotype.Service;
import ru.luckydraw.testapi.model.Answer;
import ru.luckydraw.testapi.model.Question;
import ru.luckydraw.testapi.model.Theme;
import ru.luckydraw.testapi.model.dto.AnswerDTO;
import ru.luckydraw.testapi.model.dto.QuestionDTO;
import ru.luckydraw.testapi.model.dto.ThemeDTO;

@Service
public class MappingUtil {

    public ThemeDTO convertThemeToDTO(Theme theme){
        ThemeDTO themeDTO = new ThemeDTO();

        themeDTO.setId(theme.getId());
        themeDTO.setName(theme.getName());

        return themeDTO;
    }

    public QuestionDTO convertQuestionToDTO(Question question){
        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setId(question.getId());
        questionDTO.setText(question.getText());
        questionDTO.setRightAnswerId(question.getRightAnswer().getId());

        return questionDTO;
    }

    public AnswerDTO convertAnswerToDTO(Answer answer){
        AnswerDTO answerDTO = new AnswerDTO();

        answerDTO.setId(answer.getId());
        answerDTO.setText(answer.getText());
        answerDTO.setQuestionId(answer.getQuestion().getId());

        return answerDTO;
    }
}
