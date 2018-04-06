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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppLogPortsException;
import com.kisti.osp.spyglass.model.ScienceAppLogPorts;
import com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppLogPortsModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppLogPortsPersistence;

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
 * The persistence implementation for the science app log ports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLogPortsPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppLogPortsUtil
 * @generated
 */
@ProviderType
public class ScienceAppLogPortsPersistenceImpl extends BasePersistenceImpl<ScienceAppLogPorts>
	implements ScienceAppLogPortsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppLogPortsUtil} to access the science app log ports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppLogPortsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppLogPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppLogPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ScienceAppLogPortsPersistenceImpl() {
		setModelClass(ScienceAppLogPorts.class);
	}

	/**
	 * Caches the science app log ports in the entity cache if it is enabled.
	 *
	 * @param scienceAppLogPorts the science app log ports
	 */
	@Override
	public void cacheResult(ScienceAppLogPorts scienceAppLogPorts) {
		entityCache.putResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsImpl.class, scienceAppLogPorts.getPrimaryKey(),
			scienceAppLogPorts);

		scienceAppLogPorts.resetOriginalValues();
	}

	/**
	 * Caches the science app log portses in the entity cache if it is enabled.
	 *
	 * @param scienceAppLogPortses the science app log portses
	 */
	@Override
	public void cacheResult(List<ScienceAppLogPorts> scienceAppLogPortses) {
		for (ScienceAppLogPorts scienceAppLogPorts : scienceAppLogPortses) {
			if (entityCache.getResult(
						ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppLogPortsImpl.class,
						scienceAppLogPorts.getPrimaryKey()) == null) {
				cacheResult(scienceAppLogPorts);
			}
			else {
				scienceAppLogPorts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app log portses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppLogPortsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app log ports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppLogPorts scienceAppLogPorts) {
		entityCache.removeResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsImpl.class, scienceAppLogPorts.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppLogPorts> scienceAppLogPortses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppLogPorts scienceAppLogPorts : scienceAppLogPortses) {
			entityCache.removeResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppLogPortsImpl.class, scienceAppLogPorts.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app log ports with the primary key. Does not add the science app log ports to the database.
	 *
	 * @param scienceAppId the primary key for the new science app log ports
	 * @return the new science app log ports
	 */
	@Override
	public ScienceAppLogPorts create(long scienceAppId) {
		ScienceAppLogPorts scienceAppLogPorts = new ScienceAppLogPortsImpl();

		scienceAppLogPorts.setNew(true);
		scienceAppLogPorts.setPrimaryKey(scienceAppId);

		return scienceAppLogPorts;
	}

	/**
	 * Removes the science app log ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app log ports
	 * @return the science app log ports that was removed
	 * @throws NoSuchScienceAppLogPortsException if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts remove(long scienceAppId)
		throws NoSuchScienceAppLogPortsException {
		return remove((Serializable)scienceAppId);
	}

	/**
	 * Removes the science app log ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app log ports
	 * @return the science app log ports that was removed
	 * @throws NoSuchScienceAppLogPortsException if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts remove(Serializable primaryKey)
		throws NoSuchScienceAppLogPortsException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppLogPorts scienceAppLogPorts = (ScienceAppLogPorts)session.get(ScienceAppLogPortsImpl.class,
					primaryKey);

			if (scienceAppLogPorts == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppLogPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppLogPorts);
		}
		catch (NoSuchScienceAppLogPortsException nsee) {
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
	protected ScienceAppLogPorts removeImpl(
		ScienceAppLogPorts scienceAppLogPorts) {
		scienceAppLogPorts = toUnwrappedModel(scienceAppLogPorts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppLogPorts)) {
				scienceAppLogPorts = (ScienceAppLogPorts)session.get(ScienceAppLogPortsImpl.class,
						scienceAppLogPorts.getPrimaryKeyObj());
			}

			if (scienceAppLogPorts != null) {
				session.delete(scienceAppLogPorts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppLogPorts != null) {
			clearCache(scienceAppLogPorts);
		}

		return scienceAppLogPorts;
	}

	@Override
	public ScienceAppLogPorts updateImpl(ScienceAppLogPorts scienceAppLogPorts) {
		scienceAppLogPorts = toUnwrappedModel(scienceAppLogPorts);

		boolean isNew = scienceAppLogPorts.isNew();

		Session session = null;

		try {
			session = openSession();

			if (scienceAppLogPorts.isNew()) {
				session.save(scienceAppLogPorts);

				scienceAppLogPorts.setNew(false);
			}
			else {
				scienceAppLogPorts = (ScienceAppLogPorts)session.merge(scienceAppLogPorts);
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

		entityCache.putResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLogPortsImpl.class, scienceAppLogPorts.getPrimaryKey(),
			scienceAppLogPorts, false);

		scienceAppLogPorts.resetOriginalValues();

		return scienceAppLogPorts;
	}

	protected ScienceAppLogPorts toUnwrappedModel(
		ScienceAppLogPorts scienceAppLogPorts) {
		if (scienceAppLogPorts instanceof ScienceAppLogPortsImpl) {
			return scienceAppLogPorts;
		}

		ScienceAppLogPortsImpl scienceAppLogPortsImpl = new ScienceAppLogPortsImpl();

		scienceAppLogPortsImpl.setNew(scienceAppLogPorts.isNew());
		scienceAppLogPortsImpl.setPrimaryKey(scienceAppLogPorts.getPrimaryKey());

		scienceAppLogPortsImpl.setScienceAppId(scienceAppLogPorts.getScienceAppId());
		scienceAppLogPortsImpl.setLogPorts(scienceAppLogPorts.getLogPorts());

		return scienceAppLogPortsImpl;
	}

	/**
	 * Returns the science app log ports with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app log ports
	 * @return the science app log ports
	 * @throws NoSuchScienceAppLogPortsException if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppLogPortsException {
		ScienceAppLogPorts scienceAppLogPorts = fetchByPrimaryKey(primaryKey);

		if (scienceAppLogPorts == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppLogPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppLogPorts;
	}

	/**
	 * Returns the science app log ports with the primary key or throws a {@link NoSuchScienceAppLogPortsException} if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app log ports
	 * @return the science app log ports
	 * @throws NoSuchScienceAppLogPortsException if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppLogPortsException {
		return findByPrimaryKey((Serializable)scienceAppId);
	}

	/**
	 * Returns the science app log ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app log ports
	 * @return the science app log ports, or <code>null</code> if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppLogPortsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppLogPorts scienceAppLogPorts = (ScienceAppLogPorts)serializable;

		if (scienceAppLogPorts == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppLogPorts = (ScienceAppLogPorts)session.get(ScienceAppLogPortsImpl.class,
						primaryKey);

				if (scienceAppLogPorts != null) {
					cacheResult(scienceAppLogPorts);
				}
				else {
					entityCache.putResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppLogPortsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLogPortsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppLogPorts;
	}

	/**
	 * Returns the science app log ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app log ports
	 * @return the science app log ports, or <code>null</code> if a science app log ports with the primary key could not be found
	 */
	@Override
	public ScienceAppLogPorts fetchByPrimaryKey(long scienceAppId) {
		return fetchByPrimaryKey((Serializable)scienceAppId);
	}

	@Override
	public Map<Serializable, ScienceAppLogPorts> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppLogPorts> map = new HashMap<Serializable, ScienceAppLogPorts>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppLogPorts scienceAppLogPorts = fetchByPrimaryKey(primaryKey);

			if (scienceAppLogPorts != null) {
				map.put(primaryKey, scienceAppLogPorts);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLogPortsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppLogPorts)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPLOGPORTS_WHERE_PKS_IN);

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

			for (ScienceAppLogPorts scienceAppLogPorts : (List<ScienceAppLogPorts>)q.list()) {
				map.put(scienceAppLogPorts.getPrimaryKeyObj(),
					scienceAppLogPorts);

				cacheResult(scienceAppLogPorts);

				uncachedPrimaryKeys.remove(scienceAppLogPorts.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppLogPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLogPortsImpl.class, primaryKey, nullModel);
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
	 * Returns all the science app log portses.
	 *
	 * @return the science app log portses
	 */
	@Override
	public List<ScienceAppLogPorts> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app log portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLogPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app log portses
	 * @param end the upper bound of the range of science app log portses (not inclusive)
	 * @return the range of science app log portses
	 */
	@Override
	public List<ScienceAppLogPorts> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app log portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLogPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app log portses
	 * @param end the upper bound of the range of science app log portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app log portses
	 */
	@Override
	public List<ScienceAppLogPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppLogPorts> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app log portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLogPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app log portses
	 * @param end the upper bound of the range of science app log portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app log portses
	 */
	@Override
	public List<ScienceAppLogPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppLogPorts> orderByComparator,
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

		List<ScienceAppLogPorts> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppLogPorts>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPLOGPORTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPLOGPORTS;

				if (pagination) {
					sql = sql.concat(ScienceAppLogPortsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppLogPorts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppLogPorts>)QueryUtil.list(q,
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
	 * Removes all the science app log portses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppLogPorts scienceAppLogPorts : findAll()) {
			remove(scienceAppLogPorts);
		}
	}

	/**
	 * Returns the number of science app log portses.
	 *
	 * @return the number of science app log portses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPLOGPORTS);

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
		return ScienceAppLogPortsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app log ports persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppLogPortsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPLOGPORTS = "SELECT scienceAppLogPorts FROM ScienceAppLogPorts scienceAppLogPorts";
	private static final String _SQL_SELECT_SCIENCEAPPLOGPORTS_WHERE_PKS_IN = "SELECT scienceAppLogPorts FROM ScienceAppLogPorts scienceAppLogPorts WHERE scienceAppId IN (";
	private static final String _SQL_COUNT_SCIENCEAPPLOGPORTS = "SELECT COUNT(scienceAppLogPorts) FROM ScienceAppLogPorts scienceAppLogPorts";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppLogPorts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppLogPorts exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppLogPortsPersistenceImpl.class);
}