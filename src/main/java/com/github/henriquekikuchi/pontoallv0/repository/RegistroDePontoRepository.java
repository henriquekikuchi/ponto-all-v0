package com.github.henriquekikuchi.pontoallv0.repository;

import com.github.henriquekikuchi.pontoallv0.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroDePontoRepository extends JpaRepository<ProfessorEntity, Long> {
}
