package ru.luckydraw.testapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "chat_id", nullable = false)
    @NotNull
    private Long chatId;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name = "state")
    @NotBlank
    private String state;

}
