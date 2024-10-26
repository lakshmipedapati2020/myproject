/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.myproject.facades.suggestion.impl;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.AwardData;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.hybris.myproject.core.model.AwardModel;
import com.hybris.myproject.core.suggestion.AwardService;
import com.hybris.myproject.facades.suggestion.AwardFacade;


/**
 * Default implementation for the {@link CustomerFacade}.
 */
public class DefaultAwardFacade implements AwardFacade
{

	private static final Logger LOG = Logger.getLogger(DefaultAwardFacade.class);
	@Autowired
	private AwardService awardService;
	private Converter<AwardModel, AwardData> awardConverter;

	@Override
	public AwardData getAwardById(final String awardId)
	{
		final AwardModel awardModel = awardService.findAwardByAwardId(awardId);
		return awardConverter.convert(awardModel);
	}


	@Override
	public List<AwardData> getAwards()
	{
		final List<AwardModel> awardModel = awardService.findAllAwards();
		return awardConverter.convertAll(awardModel);
	}

	protected Converter<AwardModel, AwardData> getAwardConverter()
	{
		return awardConverter;
	}

	@Required
	public void setAwardConverter(final Converter<AwardModel, AwardData> awardConverter)
	{
		this.awardConverter = awardConverter;
	}

}
