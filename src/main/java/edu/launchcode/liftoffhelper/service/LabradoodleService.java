package edu.launchcode.liftoffhelper.service;

import edu.launchcode.liftoffhelper.model.Labradoodle;
import edu.launchcode.liftoffhelper.repository.LabradoodleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabradoodleService {

    private LabradoodleRepository labradoodleRepository;


    public LabradoodleService(LabradoodleRepository labradoodleRepository)
    {
        this.labradoodleRepository = labradoodleRepository;
    }

    public List<Labradoodle> getAll()
    {
        return labradoodleRepository.findAll();
    }

    public Labradoodle addLabradoodle(Labradoodle labradoodle)
    {
        return labradoodleRepository.save(labradoodle);
    }
}
