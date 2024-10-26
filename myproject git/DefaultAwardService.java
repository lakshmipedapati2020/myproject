/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.myproject.core.suggestion.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hybris.myproject.core.model.AwardModel;
import com.hybris.myproject.core.suggestion.AwardService;
import com.hybris.myproject.core.suggestion.dao.AwardDao;


/**
 * Provides methods for retrieving the customer and verify customer id
 */
public class DefaultAwardService implements AwardService
{
	@Autowired
	private AwardDao awardDao;
	//private AwardDao awardDao;

	@Override
	public AwardModel findAwardByAwardId(final String awardId)
	{
		// XXX Auto-generated method stub
		return getAwardDao().findAwardByAwardId(awardId);
	}

	protected AwardDao getAwardDao()
	{
		return awardDao;
	}

	@Override
	public List<AwardModel> findAllAwards()
	{
		// XXX Auto-generated method stub
		return awardDao.findAllAwards();
	}
}
