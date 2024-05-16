package hu.gde.futoverseny.service;

import hu.gde.futoverseny.model.Race;
import hu.gde.futoverseny.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;

    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    public Optional<Race> getRaceById(Long id) {
        return raceRepository.findById(id);
    }

    public Race updateRace(Long id, String name, double distance) {
        Optional<Race> raceOptional = raceRepository.findById(id);
        if (raceOptional.isPresent()) {
            Race race = raceOptional.get();
            race.setName(name);
            race.setDistance(distance);
            return raceRepository.save(race);
        } else {
            throw new RuntimeException("Race not found with id: " + id);
        }
    }
}


