/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.myproject.facades.storefinder.populators;

import de.hybris.platform.commercefacades.user.data.AwardData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import com.hybris.myproject.core.model.AwardModel;



/**
 * Converter implementation for {@link de.hybris.platform.core.model.user.UserModel} as source and
 * {@link de.hybris.platform.commercefacades.user.data.CustomerData} as target type.
 */
public class AwardPopulator implements Populator<AwardModel, AwardData>
{
	private Converter<AwardModel, AwardData> awardConverter;

	@Override
	public void populate(final AwardModel source, final AwardData target) throws ConversionException
	{
		if (source != null && target != null)
		{
			target.setAwardID(source.getAwardId());
			target.setRank(source.getRank());
			target.setName(source.getName());
			target.setCompitators(source.getCompitators());
			target.setDescription(source.getDescription());
			target.setLocation(source.getLocation());
			target.setYear(source.getYear());


		}
	}

}
