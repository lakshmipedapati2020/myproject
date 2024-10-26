/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company All rights reserved.
 */
package com.hybris.myproject.core.suggestion.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hybris.myproject.core.model.AwardModel;
import com.hybris.myproject.core.suggestion.dao.AwardDao;


/**
 * Dao for retrieving the customer
 */
public class DefaultAwardDao extends AbstractItemDao implements AwardDao
{

	/**
	 * @param typecode
	 */
	public DefaultAwardDao(final String typecode)
	{
		super();
		// XXX Auto-generated constructor stub
	}

	/**
	 * @param typecode
	 */


	@Override
	public AwardModel findAwardByAwardId(final String awardId)
	{
		final Map<String, Object> params = new HashMap<>();
		params.put("awardId", awardId);
		final String query = "SELECT {pk} FROM {Award} where {awardId} = ?awardId ";
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
		fQuery.addQueryParameters(params);
		//final SearchResult<AwardModel> searchResult = getFlexibleSearchService().search(fQuery);
		final SearchResult<AwardModel> searchResult = getFlexibleSearchService().search(fQuery);
		if (!searchResult.getResult().isEmpty())
		{
			return searchResult.getResult().get(0);
		}
		return null;
	}

	@Override
	public List<AwardModel> findAllAwards()
	{
		final Map<String, Object> params = new HashMap<String, Object>();
		final String query = "SELECT {pk} FROM {Award}";
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
		final SearchResult<AwardModel> searchResult = getFlexibleSearchService().search(fQuery);
		//	final SearchResult<AwardModel> searchResult = getFlexibleSearchService().search(query);

		return searchResult.getResult();

	}

}
/*
 * @Override public List<OrderModel> findOrdersByCustomerAndStore(final CustomerModel customerModel, final
 * BaseStoreModel store, final OrderStatus[] status) { validateParameterNotNull(customerModel,
 * "Customer must not be null"); validateParameterNotNull(store, "Store must not be null");
 *
 * final Map<String, Object> queryParams = new HashMap<String, Object>(); queryParams.put("customer", customerModel);
 * queryParams.put("store", store);
 *
 * String filterClause = StringUtils.EMPTY; if (CollectionUtils.isNotEmpty(getFilterOrderStatusList())) {
 * queryParams.put("filterStatusList", getFilterOrderStatusList()); filterClause = FILTER_ORDER_STATUS; }
 *
 * String query; if (ArrayUtils.isNotEmpty(status)) { queryParams.put("statusList", Arrays.asList(status)); query =
 * createQuery(FIND_ORDERS_BY_CUSTOMER_STORE_QUERY_AND_STATUS + getFindOrdersAdditionalFilter(), filterClause); } else {
 * query = createQuery(FIND_ORDERS_BY_CUSTOMER_STORE_QUERY + getFindOrdersAdditionalFilter(), filterClause); }
 *
 * final SearchResult<OrderModel> result = getFlexibleSearchService().search(query, queryParams); return
 * result.getResult(); } * }
 */
