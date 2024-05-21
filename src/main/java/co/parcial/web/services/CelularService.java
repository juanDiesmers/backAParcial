package co.parcial.web.services;

import co.parcial.web.dtos.CelularDTO;
import co.parcial.web.entity.Celular;
import co.parcial.web.repositories.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CelularService {
    
    @Autowired
    private CelularRepository celularRepository;

    public List<CelularDTO> getAllCelulares() {
        return celularRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public CelularDTO getCelularById(Long id) {
        Optional<Celular> celular = celularRepository.findById(id);
        return celular.map(this::convertToDTO).orElse(null);
    }

    public CelularDTO createCelular(CelularDTO celularDTO) {
        Celular celular = convertToEntity(celularDTO);
        return convertToDTO(celularRepository.save(celular));
    }

    public CelularDTO updateCelular(Long id, CelularDTO celularDTO) {
        Celular celular = convertToEntity(celularDTO);
        celular.setId(id);  // Asegúrate de establecer el ID para actualizar
        return convertToDTO(celularRepository.save(celular));
    }

    public void deleteCelular(Long id) {
        celularRepository.deleteById(id);
    }

    private CelularDTO convertToDTO(Celular celular) {
        CelularDTO celularDTO = new CelularDTO();
        celularDTO.setId(celular.getId());
        celularDTO.setMarca(celular.getGama());
        celularDTO.setSerial(celular.getSerial());
        celularDTO.setFechaCompra(celular.getFechaCompra());
        celularDTO.setAnoLanzamiento(celular.getAnoLanzamiento());
        celularDTO.setPrecio(celular.getPrecio());
        celularDTO.setSistemaOperativo(celular.getSistemaOperativo());
        celularDTO.setGama(celular.getGama());
        return celularDTO;
    }

    private Celular convertToEntity(CelularDTO celularDTO) {
        Celular celular = new Celular();
        celular.setMarca(celularDTO.getMarca());
        celular.setSerial(celularDTO.getSerial());
        celular.setFechaCompra(celularDTO.getFechaCompra());
        celular.setAnoLanzamiento(celularDTO.getAnoLanzamiento());
        celular.setPrecio(celularDTO.getPrecio());
        celular.setSistemaOperativo(celularDTO.getSistemaOperativo());
        celular.setMarca(celularDTO.getGama());
        return celular;
    }
}
