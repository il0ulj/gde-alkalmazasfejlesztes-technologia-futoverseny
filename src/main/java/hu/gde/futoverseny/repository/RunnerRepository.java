package hu.gde.futoverseny.repository;

import hu.gde.futoverseny.model.Runner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunnerRepository extends JpaRepository<Runner, Long> {
}