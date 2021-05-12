package com.kodlama.ProjectHrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.ProjectHrms.business.abstracts.JobPostitonService;
import com.kodlama.ProjectHrms.dataAccess.abstracts.JobPositionDao;
import com.kodlama.ProjectHrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPostitonService {
	
	@Autowired
	private JobPositionDao jobPositionDao;
	
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}
