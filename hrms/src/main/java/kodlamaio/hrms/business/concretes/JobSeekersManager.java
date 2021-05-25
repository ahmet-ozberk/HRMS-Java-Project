package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{
	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		return new SuccessDataResult<List<JobSeekers>>(this.jobSeekersDao.findAll(),"Veri listelendi.");
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		this.jobSeekersDao.save(jobSeekers);
		return new SuccessResult("Eklendi.");
	}

}
