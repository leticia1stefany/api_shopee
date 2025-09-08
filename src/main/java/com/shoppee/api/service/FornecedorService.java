package com.shoppee.api.service;

import com.shoppee.api.dto.CategoriaDto;
import com.shoppee.api.dto.FornecedoresCreateDTO;
import com.shoppee.api.entity.Categoria;
import com.shoppee.api.entity.Fornecedor;
import com.shoppee.api.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository repository;
    public List<FornecedoresCreateDTO> findAll() {
        List<Fornecedor> listFornecedores = repository.findAll();
        //criar lista de eventoCreateDTO
        List<FornecedoresCreateDTO> fornecedoresDTO = new ArrayList<>();
        for(Fornecedor Fornecedor : listFornecedores){
            fornecedoresDTO.add(convertToDto(Fornecedor));
        }
        return fornecedoresDTO;
    }

    public FornecedoresCreateDTO findById(UUID id){
        return convertToDto(repository.findById(id).orElseThrow());
    }
    public FornecedoresCreateDTO save (FornecedoresCreateDTO dto){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor = convertToEntity(dto);
        return convertToDto(repository.save(fornecedor));
    }

    public FornecedoresCreateDTO update (UUID id, FornecedoresCreateDTO dto){
        Fornecedor fornecedor = convertToEntity(dto);
        fornecedor.setId(id);
        return convertToDto(repository.save(fornecedor));
    }

    public FornecedoresCreateDTO convertToDto(Fornecedor fornecedor){
        FornecedoresCreateDTO dto = new FornecedoresCreateDTO();
        dto.setNome(fornecedor.getNome());
        dto.setContato (fornecedor.getContato());
        dto.setEndereco(fornecedor.getEndereco());
        return dto;
    }
    public Fornecedor convertToEntity(FornecedoresCreateDTO dto){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(dto.getNome());
        fornecedor.setEndereco(dto.getEndereco());
        fornecedor.setContato(dto.getContato());
        return fornecedor;
    }


}
