package com.shoppee.api.repository;

import com.shoppee.api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriaRepository extends
        JpaRepository<Categoria, UUID> {

}
