package com.hybris.myproject.core.job;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import java.util.logging.Logger; 

/*import de.hybris.platform.cronjob.constants.GeneratedCronJobConstants.Enumerations.CronJobResult;
import de.hybris.platform.cronjob.constants.GeneratedCronJobConstants.Enumerations.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.logging.Logger;*/

public class StudentCronJobPerformable extends AbstractJobPerformable
{
	private static final Logger LOG = Logger.getLogger(StudentCronJobPerformable.class.getName());

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		LOG.info("**********************************");

		LOG.info("Greeting from MyJobPerformable!!!");

		LOG.info("**********************************");

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}
