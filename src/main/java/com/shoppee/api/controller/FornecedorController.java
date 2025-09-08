package com.shoppee.api.controller;

import com.shoppee.api.dto.FornecedoresCreateDTO;
import com.shoppee.api.entity.Fornecedor;
import com.shoppee.api.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {
    @Autowired
     private FornecedorService service;

    //metodo para buscar todos os fornecedores
    @GetMapping("/{id}")
    public FornecedoresCreateDTO findById(@PathVariable("id") UUID id) {
        return service.findById(id);
    }
    @GetMapping
    public List<FornecedoresCreateDTO> FindAll(){
        return service.findAll();
    }

    @PostMapping
    public FornecedoresCreateDTO save(@RequestBody FornecedoresCreateDTO fornecedoresCreateDTO) {
        return service.save(fornecedoresCreateDTO);
    }

    @PutMapping ("/{id}")
    public FornecedoresCreateDTO update(@PathVariable ("id") UUID id,@RequestBody FornecedoresCreateDTO fornecedoresCreateDTO) {
        return service.update(id,fornecedoresCreateDTO);
    }
}
