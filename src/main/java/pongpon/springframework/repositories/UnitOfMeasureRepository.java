package pongpon.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import pongpon.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
