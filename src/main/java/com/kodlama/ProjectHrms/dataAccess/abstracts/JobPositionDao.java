package com.kodlama.ProjectHrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kodlama.ProjectHrms.entities.concretes.JobPosition;


public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
