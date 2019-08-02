package edu.launchcode.liftoffhelper.controller;

import edu.launchcode.liftoffhelper.model.Labradoodle;
import edu.launchcode.liftoffhelper.service.LabradoodleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labradoodle")
public class LabradoodleController
{
    private LabradoodleService labradoodleService;

    public LabradoodleController(LabradoodleService labradoodleService)
    {
        this.labradoodleService = labradoodleService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Labradoodle> getAll()
    {
        return labradoodleService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public Labradoodle addNew(@RequestBody Labradoodle labradoodle)
    {
        return labradoodleService.addLabradoodle(labradoodle);
    }
}
