package hu.gde.futoverseny.service;

import hu.gde.futoverseny.model.Runner;
import hu.gde.futoverseny.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RunnerService {
    @Autowired
    private RunnerRepository runnerRepository;

    public List<Runner> getAllRunners() {
        return runnerRepository.findAll();
    }

    public Runner saveRunner(Runner runner) {
        return runnerRepository.save(runner);
    }

    public Optional<Runner> getRunnerById(Long id) {
        return runnerRepository.findById(id);
    }
}

