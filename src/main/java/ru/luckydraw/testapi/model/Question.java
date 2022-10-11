package ru.luckydraw.testapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "text", nullable = false)
    private String text;

    @OneToOne
    @JoinColumn(name = "right_answer")
    private Answer rightAnswer;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "theme_id")
    private Theme theme;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Answer> answers;
}
