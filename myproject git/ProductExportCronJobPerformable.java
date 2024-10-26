package com.hybris.myproject.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.logging.Logger;

import com.hybris.myproject.core.model.ProductExportCronJobModel;

/*import de.hybris.platform.cronjob.constants.GeneratedCronJobConstants.Enumerations.CronJobResult;
import de.hybris.platform.cronjob.constants.GeneratedCronJobConstants.Enumerations.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.logging.Logger;*/


public class ProductExportCronJobPerformable extends AbstractJobPerformable<ProductExportCronJobModel>
{
	private static final Logger LOG = Logger.getLogger(ProductExportCronJobPerformable.class.getName());

	@Override
	public PerformResult perform(final ProductExportCronJobModel productExport)
	{
		LOG.info("**********************************");

		LOG.info(productExport.getExportFilePath());
		LOG.info(productExport.getImportFilePath());
		LOG.info(productExport.getErrorFilePath());
		//LOG.info(productExport.error);

		LOG.info("Greeting from ProductExportCronJobPerformables!!!");

		LOG.info("**********************************");

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}




}
