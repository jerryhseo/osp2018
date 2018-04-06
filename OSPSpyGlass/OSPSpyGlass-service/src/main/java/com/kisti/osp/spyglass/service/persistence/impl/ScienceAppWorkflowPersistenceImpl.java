/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.kisti.osp.spyglass.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.spyglass.exception.NoSuchScienceAppWorkflowException;
import com.kisti.osp.spyglass.model.ScienceAppWorkflow;
import com.kisti.osp.spyglass.model.impl.ScienceAppWorkflowImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppWorkflowModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppWorkflowPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the science app workflow service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppWorkflowPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppWorkflowUtil
 * @generated
 */
@ProviderType
public class ScienceAppWorkflowPersistenceImpl extends BasePersistenceImpl<ScienceAppWorkflow>
	implements ScienceAppWorkflowPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppWorkflowUtil} to access the science app workflow persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppWorkflowImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppWorkflowImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppWorkflowImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ScienceAppWorkflowPersistenceImpl() {
		setModelClass(ScienceAppWorkflow.class);
	}

	/**
	 * Caches the science app workflow in the entity cache if it is enabled.
	 *
	 * @param scienceAppWorkflow the science app workflow
	 */
	@Override
	public void cacheResult(ScienceAppWorkflow scienceAppWorkflow) {
		entityCache.putResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowImpl.class, scienceAppWorkflow.getPrimaryKey(),
			scienceAppWorkflow);

		scienceAppWorkflow.resetOriginalValues();
	}

	/**
	 * Caches the science app workflows in the entity cache if it is enabled.
	 *
	 * @param scienceAppWorkflows the science app workflows
	 */
	@Override
	public void cacheResult(List<ScienceAppWorkflow> scienceAppWorkflows) {
		for (ScienceAppWorkflow scienceAppWorkflow : scienceAppWorkflows) {
			if (entityCache.getResult(
						ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppWorkflowImpl.class,
						scienceAppWorkflow.getPrimaryKey()) == null) {
				cacheResult(scienceAppWorkflow);
			}
			else {
				scienceAppWorkflow.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app workflows.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppWorkflowImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app workflow.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppWorkflow scienceAppWorkflow) {
		entityCache.removeResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowImpl.class, scienceAppWorkflow.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppWorkflow> scienceAppWorkflows) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppWorkflow scienceAppWorkflow : scienceAppWorkflows) {
			entityCache.removeResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppWorkflowImpl.class, scienceAppWorkflow.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app workflow with the primary key. Does not add the science app workflow to the database.
	 *
	 * @param scienceAppId the primary key for the new science app workflow
	 * @return the new science app workflow
	 */
	@Override
	public ScienceAppWorkflow create(long scienceAppId) {
		ScienceAppWorkflow scienceAppWorkflow = new ScienceAppWorkflowImpl();

		scienceAppWorkflow.setNew(true);
		scienceAppWorkflow.setPrimaryKey(scienceAppId);

		return scienceAppWorkflow;
	}

	/**
	 * Removes the science app workflow with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app workflow
	 * @return the science app workflow that was removed
	 * @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow remove(long scienceAppId)
		throws NoSuchScienceAppWorkflowException {
		return remove((Serializable)scienceAppId);
	}

	/**
	 * Removes the science app workflow with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app workflow
	 * @return the science app workflow that was removed
	 * @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow remove(Serializable primaryKey)
		throws NoSuchScienceAppWorkflowException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppWorkflow scienceAppWorkflow = (ScienceAppWorkflow)session.get(ScienceAppWorkflowImpl.class,
					primaryKey);

			if (scienceAppWorkflow == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppWorkflowException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppWorkflow);
		}
		catch (NoSuchScienceAppWorkflowException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ScienceAppWorkflow removeImpl(
		ScienceAppWorkflow scienceAppWorkflow) {
		scienceAppWorkflow = toUnwrappedModel(scienceAppWorkflow);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppWorkflow)) {
				scienceAppWorkflow = (ScienceAppWorkflow)session.get(ScienceAppWorkflowImpl.class,
						scienceAppWorkflow.getPrimaryKeyObj());
			}

			if (scienceAppWorkflow != null) {
				session.delete(scienceAppWorkflow);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppWorkflow != null) {
			clearCache(scienceAppWorkflow);
		}

		return scienceAppWorkflow;
	}

	@Override
	public ScienceAppWorkflow updateImpl(ScienceAppWorkflow scienceAppWorkflow) {
		scienceAppWorkflow = toUnwrappedModel(scienceAppWorkflow);

		boolean isNew = scienceAppWorkflow.isNew();

		Session session = null;

		try {
			session = openSession();

			if (scienceAppWorkflow.isNew()) {
				session.save(scienceAppWorkflow);

				scienceAppWorkflow.setNew(false);
			}
			else {
				scienceAppWorkflow = (ScienceAppWorkflow)session.merge(scienceAppWorkflow);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppWorkflowImpl.class, scienceAppWorkflow.getPrimaryKey(),
			scienceAppWorkflow, false);

		scienceAppWorkflow.resetOriginalValues();

		return scienceAppWorkflow;
	}

	protected ScienceAppWorkflow toUnwrappedModel(
		ScienceAppWorkflow scienceAppWorkflow) {
		if (scienceAppWorkflow instanceof ScienceAppWorkflowImpl) {
			return scienceAppWorkflow;
		}

		ScienceAppWorkflowImpl scienceAppWorkflowImpl = new ScienceAppWorkflowImpl();

		scienceAppWorkflowImpl.setNew(scienceAppWorkflow.isNew());
		scienceAppWorkflowImpl.setPrimaryKey(scienceAppWorkflow.getPrimaryKey());

		scienceAppWorkflowImpl.setScienceAppId(scienceAppWorkflow.getScienceAppId());
		scienceAppWorkflowImpl.setDefinition(scienceAppWorkflow.getDefinition());

		return scienceAppWorkflowImpl;
	}

	/**
	 * Returns the science app workflow with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app workflow
	 * @return the science app workflow
	 * @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppWorkflowException {
		ScienceAppWorkflow scienceAppWorkflow = fetchByPrimaryKey(primaryKey);

		if (scienceAppWorkflow == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppWorkflowException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppWorkflow;
	}

	/**
	 * Returns the science app workflow with the primary key or throws a {@link NoSuchScienceAppWorkflowException} if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app workflow
	 * @return the science app workflow
	 * @throws NoSuchScienceAppWorkflowException if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppWorkflowException {
		return findByPrimaryKey((Serializable)scienceAppId);
	}

	/**
	 * Returns the science app workflow with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app workflow
	 * @return the science app workflow, or <code>null</code> if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppWorkflowImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppWorkflow scienceAppWorkflow = (ScienceAppWorkflow)serializable;

		if (scienceAppWorkflow == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppWorkflow = (ScienceAppWorkflow)session.get(ScienceAppWorkflowImpl.class,
						primaryKey);

				if (scienceAppWorkflow != null) {
					cacheResult(scienceAppWorkflow);
				}
				else {
					entityCache.putResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppWorkflowImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppWorkflowImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppWorkflow;
	}

	/**
	 * Returns the science app workflow with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app workflow
	 * @return the science app workflow, or <code>null</code> if a science app workflow with the primary key could not be found
	 */
	@Override
	public ScienceAppWorkflow fetchByPrimaryKey(long scienceAppId) {
		return fetchByPrimaryKey((Serializable)scienceAppId);
	}

	@Override
	public Map<Serializable, ScienceAppWorkflow> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppWorkflow> map = new HashMap<Serializable, ScienceAppWorkflow>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppWorkflow scienceAppWorkflow = fetchByPrimaryKey(primaryKey);

			if (scienceAppWorkflow != null) {
				map.put(primaryKey, scienceAppWorkflow);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppWorkflowImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppWorkflow)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPWORKFLOW_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ScienceAppWorkflow scienceAppWorkflow : (List<ScienceAppWorkflow>)q.list()) {
				map.put(scienceAppWorkflow.getPrimaryKeyObj(),
					scienceAppWorkflow);

				cacheResult(scienceAppWorkflow);

				uncachedPrimaryKeys.remove(scienceAppWorkflow.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppWorkflowModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppWorkflowImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the science app workflows.
	 *
	 * @return the science app workflows
	 */
	@Override
	public List<ScienceAppWorkflow> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app workflows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app workflows
	 * @param end the upper bound of the range of science app workflows (not inclusive)
	 * @return the range of science app workflows
	 */
	@Override
	public List<ScienceAppWorkflow> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app workflows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app workflows
	 * @param end the upper bound of the range of science app workflows (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app workflows
	 */
	@Override
	public List<ScienceAppWorkflow> findAll(int start, int end,
		OrderByComparator<ScienceAppWorkflow> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app workflows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppWorkflowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app workflows
	 * @param end the upper bound of the range of science app workflows (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app workflows
	 */
	@Override
	public List<ScienceAppWorkflow> findAll(int start, int end,
		OrderByComparator<ScienceAppWorkflow> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ScienceAppWorkflow> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppWorkflow>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPWORKFLOW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPWORKFLOW;

				if (pagination) {
					sql = sql.concat(ScienceAppWorkflowModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppWorkflow>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppWorkflow>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the science app workflows from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppWorkflow scienceAppWorkflow : findAll()) {
			remove(scienceAppWorkflow);
		}
	}

	/**
	 * Returns the number of science app workflows.
	 *
	 * @return the number of science app workflows
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPWORKFLOW);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ScienceAppWorkflowModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app workflow persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppWorkflowImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPWORKFLOW = "SELECT scienceAppWorkflow FROM ScienceAppWorkflow scienceAppWorkflow";
	private static final String _SQL_SELECT_SCIENCEAPPWORKFLOW_WHERE_PKS_IN = "SELECT scienceAppWorkflow FROM ScienceAppWorkflow scienceAppWorkflow WHERE scienceAppId IN (";
	private static final String _SQL_COUNT_SCIENCEAPPWORKFLOW = "SELECT COUNT(scienceAppWorkflow) FROM ScienceAppWorkflow scienceAppWorkflow";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppWorkflow.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppWorkflow exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppWorkflowPersistenceImpl.class);
}