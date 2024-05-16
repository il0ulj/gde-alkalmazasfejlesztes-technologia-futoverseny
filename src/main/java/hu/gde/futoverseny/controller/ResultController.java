package hu.gde.futoverseny.controller;

import hu.gde.futoverseny.dto.ResultCreate;
import hu.gde.futoverseny.model.Result;
import hu.gde.futoverseny.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping("/addResult")
    public Result addResult(@RequestBody ResultCreate createResultRequest) {
        return resultService.addResult(createResultRequest.getRunnerId(), createResultRequest.getRaceId(), createResultRequest.getTime());
    }

    @GetMapping("/getRaceRunners/{id}")
    public List<Result> getRaceRunners(@PathVariable Long id) {
        return resultService.getRaceRunners(id);
    }

    @GetMapping("/getAverageTime/{raceId}")
    public Double getAverageTime(@PathVariable Long raceId) {
        return resultService.getAverageTime(raceId);
    }
}