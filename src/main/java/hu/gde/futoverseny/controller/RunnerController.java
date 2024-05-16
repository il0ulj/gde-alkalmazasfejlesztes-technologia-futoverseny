package hu.gde.futoverseny.controller;

import hu.gde.futoverseny.model.Runner;
import hu.gde.futoverseny.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RunnerController {
    @Autowired
    private RunnerService runnerService;

    @GetMapping("/getRunners")
    public List<Runner> getAllRunners() {
        return runnerService.getAllRunners();
    }

    @PostMapping("/addRunner")
    public Runner addRunner(@RequestBody Runner runner) {
        return runnerService.saveRunner(runner);
    }
}