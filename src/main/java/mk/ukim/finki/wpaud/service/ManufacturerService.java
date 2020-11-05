package mk.ukim.finki.wpaud.service;

import mk.ukim.finki.wpaud.model.Manufacturer;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {
    List<Manufacturer> findAll();

    Optional<Manufacturer> findById(Long id);
}
