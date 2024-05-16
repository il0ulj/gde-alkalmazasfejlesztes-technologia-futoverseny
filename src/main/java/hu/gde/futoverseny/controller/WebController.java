package hu.gde.futoverseny.controller;

import hu.gde.futoverseny.service.RunnerService;
import hu.gde.futoverseny.service.RaceService;
import hu.gde.futoverseny.model.Race;
import hu.gde.futoverseny.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired
    private RunnerService runnerService;

    @Autowired
    private RaceService raceService;

    @Autowired
    private ResultService resultService;

    @GetMapping("/")
    public String showRaces(Model model) {
        model.addAttribute("races", raceService.getAllRaces());
        return "index";
    }

    @PostMapping("/addRace")
    public String addRace(Race race) {
        raceService.saveRace(race);
        return "redirect:/";
    }

    @GetMapping("/race-details/{id}")
    public String raceDetails(@PathVariable Long id, Model model) {
        Race race = raceService.getRaceById(id).orElseThrow(() -> new RuntimeException("Race not found"));
        model.addAttribute("race", race);
        model.addAttribute("results", resultService.getRaceRunners(id));
        return "race-details";
    }
}