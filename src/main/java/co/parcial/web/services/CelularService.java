package co.parcial.web.services;

import co.parcial.web.dtos.CelularDTO;
import co.parcial.web.entity.Celular;
import co.parcial.web.repository.CelularRepository;
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
        List<Celular> celulares = celularRepository.findAll();
        return celulares.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public CelularDTO getCelularById(Long id) {
        Optional<Celular> optionalCelular = celularRepository.findById(id);
        if (optionalCelular.isPresent()) {
            return convertToDTO(optionalCelular.get());
        } else {
            throw new RuntimeException("Celular no encontrado");
        }
    }

    public CelularDTO createCelular(CelularDTO celularDTO) {
        Celular celular = convertToEntity(celularDTO);
        Celular savedCelular = celularRepository.save(celular);
        return convertToDTO(savedCelular);
    }

    public CelularDTO updateCelular(Long id, CelularDTO celularDTO) {
        if (!celularRepository.existsById(id)) {
            throw new RuntimeException("Celular no encontrado");
        }
        Celular celular = convertToEntity(celularDTO);
        celular.setId(id);
        Celular updatedCelular = celularRepository.save(celular);
        return convertToDTO(updatedCelular);
    }

    public void deleteCelular(Long id) {
        if (!celularRepository.existsById(id)) {
            throw new RuntimeException("Celular no encontrado");
        }
        celularRepository.deleteById(id);
    }

    private CelularDTO convertToDTO(Celular celular) {
        CelularDTO celularDTO = new CelularDTO();
        celularDTO.setMarca(celular.getMarca());
        celularDTO.setSerial(celular.getSerial());
        celularDTO.setFechaCompra(celular.getFechaCompra());
        celularDTO.setAnoLanzamiento(celular.getAñoLanzamiento());
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
        celular.setAñoLanzamiento(celularDTO.getAnoLanzamiento());
        celular.setPrecio(celularDTO.getPrecio());
        celular.setSistemaOperativo(celularDTO.getSistemaOperativo());
        celular.setGama(celularDTO.getGama());
        return celular;
    }
}
