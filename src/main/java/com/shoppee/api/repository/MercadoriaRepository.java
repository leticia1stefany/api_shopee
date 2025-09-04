package com.shoppee.api.repository;

import com.shoppee.api.entity.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MercadoriaRepository extends
        JpaRepository<Mercadoria, UUID> {
    //demais métodos específicos, se necessário
}
