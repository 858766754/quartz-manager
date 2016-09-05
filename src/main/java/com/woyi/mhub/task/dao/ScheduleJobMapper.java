package com.woyi.mhub.task.dao;

import java.util.List;

import com.woyi.mhub.task.domain.ScheduleJob;

public interface ScheduleJobMapper {
	int deleteByPrimaryKey(String jobId);

	int insert(ScheduleJob record);

	int insertSelective(ScheduleJob record);

	ScheduleJob selectByPrimaryKey(String jobId);

	int updateByPrimaryKeySelective(ScheduleJob record);

	int updateByPrimaryKey(ScheduleJob record);

	List<ScheduleJob> getAll();
}