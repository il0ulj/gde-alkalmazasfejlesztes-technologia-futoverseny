package hu.gde.futoverseny.controller;

import hu.gde.futoverseny.dto.RaceUpdate;
import hu.gde.futoverseny.model.Race;
import hu.gde.futoverseny.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RaceController {
    @Autowired
    private RaceService raceService;

    // Kizárólag tesztelés céljából saját részre!
    @GetMapping("/getRaces")
    public List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }

    @PostMapping("/updateRace")
    public Race updateRace(@RequestBody RaceUpdate updateRace) {
        return raceService.updateRace(updateRace.getId(), updateRace.getName(), updateRace.getDistance());
    }
}