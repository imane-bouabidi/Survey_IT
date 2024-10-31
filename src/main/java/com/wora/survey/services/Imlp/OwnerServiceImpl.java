package com.wora.survey.services.Imlp;

import com.wora.survey.dtos.owner.OwnerCreateDTO;
import com.wora.survey.dtos.owner.OwnerDTO;
import com.wora.survey.dtos.owner.OwnerUpdateDTO;
import com.wora.survey.entities.Owner;
import com.wora.survey.mappers.OwnerMapper;
import com.wora.survey.repositories.OwnerRepository;
import com.wora.survey.services.Interfaces.OwnerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final OwnerMapper ownerMapper;

    public OwnerDTO save(OwnerCreateDTO ownerCreateDTO) {
        Owner owner = ownerMapper.toEntity(ownerCreateDTO);
        return ownerMapper.toDTO(ownerRepository.save(owner));
    }

    public List<OwnerDTO> findAll() {
        return ownerRepository.findAll()
                .stream()
                .map(ownerMapper::toDTO)
                .toList();
    }

    public OwnerDTO findById(Integer id) {
        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Owner not found"));
        return ownerMapper.toDTO(owner);
    }

    public OwnerDTO update(OwnerUpdateDTO ownerUpdateDTO) {
        Owner owner = ownerRepository.findById(ownerUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Owner not found"));

        owner.setName(ownerUpdateDTO.getName());
        return ownerMapper.toDTO(ownerRepository.save(owner));
    }

    public void delete(Integer id) {
        if (!ownerRepository.existsById(id)) {
            throw new EntityNotFoundException("Owner not found");
        }
        ownerRepository.deleteById(id);
    }
}
