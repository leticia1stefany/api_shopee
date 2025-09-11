package com.shoppee.api.controller;
import com.shoppee.api.dto.MercadoriaDTO;
import com.shoppee.api.service.MercadoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/mercadoria")
public class MercadoriaController {
@Autowired
private MercadoriaService service;

    //metodo para buscar todos as mercadorias
    @GetMapping("/{id}")
    public MercadoriaDTO findById(@PathVariable("id") UUID id) {
        return service.findById(id);
    }

    //metodo para listar  mercadoria
    @GetMapping
    public List<MercadoriaDTO> FindAll(){
        return service.findAll();
    }

    //metodo para salvar uma mercadoria
    @PostMapping
    public MercadoriaDTO save(@RequestBody MercadoriaDTO dto) {
        return service.save(new MercadoriaDTO());
    }

    //metodo para atualizar  uma mercadoria
    @PutMapping ("/{id}")
    public MercadoriaDTO update(@PathVariable ("id") UUID id,@RequestBody MercadoriaDTO mercadoriaCreateDTO) {
        return service.update(id,mercadoriaCreateDTO);
    }
}

