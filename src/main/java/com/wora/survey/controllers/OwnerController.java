package com.wora.survey.controllers;

import com.wora.survey.dtos.owner.OwnerCreateDTO;
import com.wora.survey.dtos.owner.OwnerDTO;
import com.wora.survey.dtos.owner.OwnerUpdateDTO;
import com.wora.survey.services.Imlp.OwnerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {

    private OwnerServiceImpl ownerService;

    @PostMapping
    public ResponseEntity<OwnerDTO> createOwner(@Validated @RequestBody OwnerCreateDTO ownerCreateDTO) {
        OwnerDTO createdOwner = ownerService.save(ownerCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOwner);
    }

    @GetMapping
    public ResponseEntity<List<OwnerDTO>> getAllOwners() {
        List<OwnerDTO> owners = ownerService.findAll();
        return ResponseEntity.ok(owners);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OwnerDTO> getOwnerById(@PathVariable Integer id) {
        OwnerDTO owner = ownerService.findById(id);
        return ResponseEntity.ok(owner);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OwnerDTO> updateOwner(@PathVariable Integer id,@Validated @RequestBody OwnerUpdateDTO ownerUpdateDTO) {
        ownerUpdateDTO.setId(id);
        OwnerDTO updatedOwner = ownerService.update(ownerUpdateDTO);
        return ResponseEntity.ok(updatedOwner);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Integer id) {
        ownerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

