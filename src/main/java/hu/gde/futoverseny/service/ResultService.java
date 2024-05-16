package hu.gde.futoverseny.service;

import hu.gde.futoverseny.model.Race;
import hu.gde.futoverseny.model.Result;
import hu.gde.futoverseny.model.Runner;
import hu.gde.futoverseny.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.OptionalDouble;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private RunnerService runnerService;

    @Autowired
    private RaceService raceService;

    public Result addResult(Long runnerId, Long raceId, int time) {
        Runner runner = runnerService.getRunnerById(runnerId).orElseThrow(() -> new RuntimeException("Runner not found with id: " + runnerId));
        Race race = raceService.getRaceById(raceId).orElseThrow(() -> new RuntimeException("Race not found with id: " + raceId));
        Result result = new Result();
        result.setRunner(runner);
        result.setRace(race);
        result.setTime(time);
        return resultRepository.save(result);
    }

    public List<Result> getRaceRunners(Long raceId) {
        return resultRepository.findByRaceIdOrderByTimeAsc(raceId);
    }

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Double getAverageTime(Long raceId) {
        List<Result> results = resultRepository.findByRaceId(raceId);
        OptionalDouble average = results.stream()
                .mapToInt(Result::getTime)
                .average();
        return average.isPresent() ? average.getAsDouble() : null;
    }
}