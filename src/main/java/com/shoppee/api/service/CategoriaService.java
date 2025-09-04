package com.shoppee.api.service;

import com.shoppee.api.dto.CategoriaDto;
import com.shoppee.api.entity.Categoria;
import com.shoppee.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    //listar todas as categorias
    public List<CategoriaDto> findAll() {
        List<Categoria> listCategorias = repository.findAll();
        //criar lista de eventoCreateDTO
        List<CategoriaDto> categoriassDTO = new ArrayList<>();
        for(Categoria categoria : listCategorias){
            categoriassDTO.add(convertToDto(categoria));
        }
        return categoriassDTO;
    }
    //buscar uma categoria por id
    public CategoriaDto findById(UUID id){
        Categoria categoria = repository.findById(id).orElseThrow(()->new RuntimeException("Categoria não encontrada."));
    return convertToDto(categoria);
    }
    //criar categoria
    public CategoriaDto save(CategoriaDto dto){
       Categoria categoria = convertToEntity(dto);
       return convertToDto(repository.save(categoria));
    }
    //update
    public CategoriaDto update(UUID id, CategoriaDto dto){
        Categoria categoria = convertToEntity(dto);
        categoria.setId(id);
        return convertToDto(repository.save(categoria));
    }


    public CategoriaDto convertToDto(Categoria categoria){
        CategoriaDto dto = new CategoriaDto();
        dto.setNome(categoria.getNome());
        dto.setDescricao(categoria.getDescricao());
        return dto;
    }
    public Categoria convertToEntity(CategoriaDto dto){
        Categoria categoria = new Categoria();
        categoria.setNome(dto.getNome());
        categoria.setDescricao(dto.getDescricao());
        return categoria;
    }


}
