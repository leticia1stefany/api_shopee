package com.shoppee.api.controller;

import com.shoppee.api.dto.CategoriaDto;
import com.shoppee.api.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    //listar todas as categorias
    @GetMapping
    public List<CategoriaDto> findAll() {
        return service.findAll();;
    }
    //buscar uma categoria por id
    @GetMapping("/{id}")
    public CategoriaDto findById(@PathVariable UUID id){

        return service.findById(id);
    }
    //criar uma nova categoria
    @PostMapping
    public CategoriaDto save(@RequestBody CategoriaDto dto){
        return service.save(dto);
    }
    //atualizar uma categoria existente
    @PutMapping("/{id}")
    public CategoriaDto update(@PathVariable UUID id,
                               @RequestBody CategoriaDto dto ){
        return service.update(id, dto);
    }
    //deletar uma categoria por id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

}
