package edu.launchcode.liftoffhelper.repository;

import edu.launchcode.liftoffhelper.model.Labradoodle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabradoodleRepository extends JpaRepository<Labradoodle, Long>
{
}
