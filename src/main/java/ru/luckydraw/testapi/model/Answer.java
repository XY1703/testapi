package ru.luckydraw.testapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "text", nullable = false)
    private String text;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private Question question;
}

