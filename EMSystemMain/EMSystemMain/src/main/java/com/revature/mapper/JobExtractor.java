package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.revature.pojo.Job;

@Component
public class JobExtractor implements ResultSetExtractor<Job>{

	@Override
	public Job extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		Job job=new Job();
		
		job.setJobId(rs.getInt("job_id"));
		job.setJobTitle(rs.getString("jobtitle"));
		job.setMinSalary(rs.getDouble("min_salary"));
		job.setMaxSalary(rs.getDouble("max_salary"));
		
		return job;
	}
	
	

}
