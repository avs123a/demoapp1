package com.example.demoapp1.repository;

import com.example.demoapp1.domain.Field_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldRepository extends JpaRepository<Field_, Long> {

    List<Field_> findAllByActiveTrue();

    void removeById(Long id);

    Field_ findOneById(Long id);
}
