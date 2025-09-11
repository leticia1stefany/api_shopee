package com.shoppee.api.service;
import com.shoppee.api.dto.MercadoriaDTO;
import com.shoppee.api.entity.Mercadoria;
import com.shoppee.api.repository.MercadoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MercadoriaService {
    @Autowired
    private MercadoriaRepository repository;

    public MercadoriaDTO findById(UUID id){
        return convertToDto(repository.findById(id).orElseThrow());
    }
    public MercadoriaDTO save (MercadoriaDTO dto){
        Mercadoria mercadoria = new Mercadoria();
        mercadoria = convertToEntity(dto);
        return convertToDto(repository.save(mercadoria));
    }

    public MercadoriaDTO update (UUID id, MercadoriaDTO dto){
        Mercadoria mercadoria = convertToEntity(dto);
        mercadoria.setId(id);
        return convertToDto(repository.save(mercadoria));
    }
    public MercadoriaDTO convertToDto(Mercadoria mercadoria){
        MercadoriaDTO dto = new MercadoriaDTO();
        dto.setNome(mercadoria.getNome());
        dto.setPreco (mercadoria.getPreco());
        dto.setQuantidade(mercadoria.getQuantidade());
        dto.setCategoria(mercadoria.getCategoria());
        dto.setFornecedor(mercadoria.getFornecedor());
        return dto;
    }
    public Mercadoria convertToEntity(MercadoriaDTO dto){
        Mercadoria mercadoria = new Mercadoria();
        mercadoria.setNome(dto.getNome());
        mercadoria.setPreco(dto.getPreco());
        mercadoria.setQuantidade(dto.getQuantidade());
        mercadoria.setCategoria(dto.getCategoria());
        mercadoria.setFornecedor(dto.getFornecedor());
        return mercadoria;
    }

    public List<MercadoriaDTO> findAll() {
        List<Mercadoria> listMercadorias = repository.findAll();
        List<MercadoriaDTO> mercadoriaDTOS = new ArrayList<>();
        for(Mercadoria mercadoria : listMercadorias){
            mercadoriaDTOS.add(convertToDto(mercadoria));
        }
        return mercadoriaDTOS;
    }
}
