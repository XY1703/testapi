package ru.luckydraw.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.luckydraw.testapi.model.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Integer> {
}
