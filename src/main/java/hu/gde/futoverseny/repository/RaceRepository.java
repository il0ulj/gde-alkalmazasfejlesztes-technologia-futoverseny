package hu.gde.futoverseny.repository;

import hu.gde.futoverseny.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
}