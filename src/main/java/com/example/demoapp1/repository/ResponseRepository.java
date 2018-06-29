package com.example.demoapp1.repository;

import com.example.demoapp1.domain.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

    Response findOneById(Long id);

    List<Response> findAllByUserId(Long userId);

    void removeById(Long id);
}
