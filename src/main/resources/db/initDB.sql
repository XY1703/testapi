CREATE TABLE themes (
                        id int NOT NULL AUTO_INCREMENT,
                        theme_name varchar(255) NOT NULL,
                        PRIMARY KEY (id)
);

CREATE TABLE questions (
                           id int NOT NULL AUTO_INCREMENT,
                           text TEXT(1000) NOT NULL,
                           right_answer int NOT NULL,
                           theme_id int NOT NULL,
                           PRIMARY KEY (id)
);

CREATE TABLE answers (
                         id int NOT NULL AUTO_INCREMENT,
                         text TEXT(1000) NOT NULL,
                         question_id int NOT NULL,
                         PRIMARY KEY (id)
);


CREATE TABLE users (
                        id int NOT NULL AUTO_INCREMENT,
                        chat_id integer NOT NULL,
                        name varchar(50) NOT NULL,
                        state varchar(20) NOT NULL,
                        PRIMARY KEY (id)
);

ALTER TABLE answers
    ADD CONSTRAINT FK_answers_question_id FOREIGN KEY (question_id)
        REFERENCES questions (id) ON DELETE CASCADE;

ALTER TABLE questions
    ADD CONSTRAINT FK_questions_right_answer FOREIGN KEY (right_answer)
        REFERENCES answers (id);

ALTER TABLE questions
    ADD CONSTRAINT FK_questions_theme_id FOREIGN KEY (theme_id)
        REFERENCES themes (id);