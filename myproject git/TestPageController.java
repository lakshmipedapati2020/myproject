/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.myproject.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/test")
public class TestPageController extends AbstractPageController
{
	private static final String TEST_CMS_PAGE = "testCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getTest(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel testCMSPage = getContentPageForLabelOrId(TEST_CMS_PAGE);
		storeCmsPageInModel(model, testCMSPage);
		setUpMetaDataForContentPage(model, testCMSPage);
		return getViewForPage(model);
	}
}

@RequestMapping("/new")
public class TestPageController extends AbstractPageController
{
	private static final String TEST_CMS_PAGE = "testCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getTest(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel testCMSPage = getContentPageForLabelOrId(TEST_CMS_PAGE);
		storeCmsPageInModel(model, testCMSPage);
		setUpMetaDataForContentPage(model, testCMSPage);
		return getViewForPage(model);
	}
}
