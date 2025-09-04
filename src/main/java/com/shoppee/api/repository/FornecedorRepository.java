package com.shoppee.api.repository;

import com.shoppee.api.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FornecedorRepository extends
        JpaRepository<Fornecedor, UUID>{
    //demais métodos específicos, se necessário
    //repository.save(fornecedor);

}
