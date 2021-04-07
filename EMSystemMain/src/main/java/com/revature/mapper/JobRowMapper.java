package com.revature.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.Job;


@Component
public class JobRowMapper implements RowMapper{
	
	private JobExtractor jobExtractor;
	
	@Autowired
	public void setJobExtractor(JobExtractor jobExtractor) {
		this.jobExtractor = jobExtractor;
	}

	@Override
	public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return jobExtractor.extractData(rs);
	}
	
	

	

}
