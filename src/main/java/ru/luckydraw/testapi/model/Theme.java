package ru.luckydraw.testapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "themes")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "theme_name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "theme", fetch = FetchType.LAZY)
    private List<Question> questions;


}
