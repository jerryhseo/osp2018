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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppInputPortsException;
import com.kisti.osp.spyglass.model.ScienceAppInputPorts;
import com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppInputPortsModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppInputPortsPersistence;

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
 * The persistence implementation for the science app input ports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppInputPortsPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppInputPortsUtil
 * @generated
 */
@ProviderType
public class ScienceAppInputPortsPersistenceImpl extends BasePersistenceImpl<ScienceAppInputPorts>
	implements ScienceAppInputPortsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppInputPortsUtil} to access the science app input ports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppInputPortsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppInputPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppInputPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ScienceAppInputPortsPersistenceImpl() {
		setModelClass(ScienceAppInputPorts.class);
	}

	/**
	 * Caches the science app input ports in the entity cache if it is enabled.
	 *
	 * @param scienceAppInputPorts the science app input ports
	 */
	@Override
	public void cacheResult(ScienceAppInputPorts scienceAppInputPorts) {
		entityCache.putResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsImpl.class,
			scienceAppInputPorts.getPrimaryKey(), scienceAppInputPorts);

		scienceAppInputPorts.resetOriginalValues();
	}

	/**
	 * Caches the science app input portses in the entity cache if it is enabled.
	 *
	 * @param scienceAppInputPortses the science app input portses
	 */
	@Override
	public void cacheResult(List<ScienceAppInputPorts> scienceAppInputPortses) {
		for (ScienceAppInputPorts scienceAppInputPorts : scienceAppInputPortses) {
			if (entityCache.getResult(
						ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppInputPortsImpl.class,
						scienceAppInputPorts.getPrimaryKey()) == null) {
				cacheResult(scienceAppInputPorts);
			}
			else {
				scienceAppInputPorts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app input portses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppInputPortsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app input ports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppInputPorts scienceAppInputPorts) {
		entityCache.removeResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsImpl.class, scienceAppInputPorts.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppInputPorts> scienceAppInputPortses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppInputPorts scienceAppInputPorts : scienceAppInputPortses) {
			entityCache.removeResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppInputPortsImpl.class,
				scienceAppInputPorts.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app input ports with the primary key. Does not add the science app input ports to the database.
	 *
	 * @param scienceAppId the primary key for the new science app input ports
	 * @return the new science app input ports
	 */
	@Override
	public ScienceAppInputPorts create(long scienceAppId) {
		ScienceAppInputPorts scienceAppInputPorts = new ScienceAppInputPortsImpl();

		scienceAppInputPorts.setNew(true);
		scienceAppInputPorts.setPrimaryKey(scienceAppId);

		return scienceAppInputPorts;
	}

	/**
	 * Removes the science app input ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app input ports
	 * @return the science app input ports that was removed
	 * @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts remove(long scienceAppId)
		throws NoSuchScienceAppInputPortsException {
		return remove((Serializable)scienceAppId);
	}

	/**
	 * Removes the science app input ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app input ports
	 * @return the science app input ports that was removed
	 * @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts remove(Serializable primaryKey)
		throws NoSuchScienceAppInputPortsException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppInputPorts scienceAppInputPorts = (ScienceAppInputPorts)session.get(ScienceAppInputPortsImpl.class,
					primaryKey);

			if (scienceAppInputPorts == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppInputPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppInputPorts);
		}
		catch (NoSuchScienceAppInputPortsException nsee) {
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
	protected ScienceAppInputPorts removeImpl(
		ScienceAppInputPorts scienceAppInputPorts) {
		scienceAppInputPorts = toUnwrappedModel(scienceAppInputPorts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppInputPorts)) {
				scienceAppInputPorts = (ScienceAppInputPorts)session.get(ScienceAppInputPortsImpl.class,
						scienceAppInputPorts.getPrimaryKeyObj());
			}

			if (scienceAppInputPorts != null) {
				session.delete(scienceAppInputPorts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppInputPorts != null) {
			clearCache(scienceAppInputPorts);
		}

		return scienceAppInputPorts;
	}

	@Override
	public ScienceAppInputPorts updateImpl(
		ScienceAppInputPorts scienceAppInputPorts) {
		scienceAppInputPorts = toUnwrappedModel(scienceAppInputPorts);

		boolean isNew = scienceAppInputPorts.isNew();

		Session session = null;

		try {
			session = openSession();

			if (scienceAppInputPorts.isNew()) {
				session.save(scienceAppInputPorts);

				scienceAppInputPorts.setNew(false);
			}
			else {
				scienceAppInputPorts = (ScienceAppInputPorts)session.merge(scienceAppInputPorts);
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

		entityCache.putResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppInputPortsImpl.class,
			scienceAppInputPorts.getPrimaryKey(), scienceAppInputPorts, false);

		scienceAppInputPorts.resetOriginalValues();

		return scienceAppInputPorts;
	}

	protected ScienceAppInputPorts toUnwrappedModel(
		ScienceAppInputPorts scienceAppInputPorts) {
		if (scienceAppInputPorts instanceof ScienceAppInputPortsImpl) {
			return scienceAppInputPorts;
		}

		ScienceAppInputPortsImpl scienceAppInputPortsImpl = new ScienceAppInputPortsImpl();

		scienceAppInputPortsImpl.setNew(scienceAppInputPorts.isNew());
		scienceAppInputPortsImpl.setPrimaryKey(scienceAppInputPorts.getPrimaryKey());

		scienceAppInputPortsImpl.setScienceAppId(scienceAppInputPorts.getScienceAppId());
		scienceAppInputPortsImpl.setSamplePath(scienceAppInputPorts.getSamplePath());
		scienceAppInputPortsImpl.setInputPorts(scienceAppInputPorts.getInputPorts());

		return scienceAppInputPortsImpl;
	}

	/**
	 * Returns the science app input ports with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app input ports
	 * @return the science app input ports
	 * @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppInputPortsException {
		ScienceAppInputPorts scienceAppInputPorts = fetchByPrimaryKey(primaryKey);

		if (scienceAppInputPorts == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppInputPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppInputPorts;
	}

	/**
	 * Returns the science app input ports with the primary key or throws a {@link NoSuchScienceAppInputPortsException} if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app input ports
	 * @return the science app input ports
	 * @throws NoSuchScienceAppInputPortsException if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppInputPortsException {
		return findByPrimaryKey((Serializable)scienceAppId);
	}

	/**
	 * Returns the science app input ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app input ports
	 * @return the science app input ports, or <code>null</code> if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppInputPortsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppInputPorts scienceAppInputPorts = (ScienceAppInputPorts)serializable;

		if (scienceAppInputPorts == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppInputPorts = (ScienceAppInputPorts)session.get(ScienceAppInputPortsImpl.class,
						primaryKey);

				if (scienceAppInputPorts != null) {
					cacheResult(scienceAppInputPorts);
				}
				else {
					entityCache.putResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppInputPortsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppInputPortsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppInputPorts;
	}

	/**
	 * Returns the science app input ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app input ports
	 * @return the science app input ports, or <code>null</code> if a science app input ports with the primary key could not be found
	 */
	@Override
	public ScienceAppInputPorts fetchByPrimaryKey(long scienceAppId) {
		return fetchByPrimaryKey((Serializable)scienceAppId);
	}

	@Override
	public Map<Serializable, ScienceAppInputPorts> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppInputPorts> map = new HashMap<Serializable, ScienceAppInputPorts>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppInputPorts scienceAppInputPorts = fetchByPrimaryKey(primaryKey);

			if (scienceAppInputPorts != null) {
				map.put(primaryKey, scienceAppInputPorts);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppInputPortsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppInputPorts)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPINPUTPORTS_WHERE_PKS_IN);

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

			for (ScienceAppInputPorts scienceAppInputPorts : (List<ScienceAppInputPorts>)q.list()) {
				map.put(scienceAppInputPorts.getPrimaryKeyObj(),
					scienceAppInputPorts);

				cacheResult(scienceAppInputPorts);

				uncachedPrimaryKeys.remove(scienceAppInputPorts.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppInputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppInputPortsImpl.class, primaryKey, nullModel);
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
	 * Returns all the science app input portses.
	 *
	 * @return the science app input portses
	 */
	@Override
	public List<ScienceAppInputPorts> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app input portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app input portses
	 * @param end the upper bound of the range of science app input portses (not inclusive)
	 * @return the range of science app input portses
	 */
	@Override
	public List<ScienceAppInputPorts> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app input portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app input portses
	 * @param end the upper bound of the range of science app input portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app input portses
	 */
	@Override
	public List<ScienceAppInputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppInputPorts> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app input portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppInputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app input portses
	 * @param end the upper bound of the range of science app input portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app input portses
	 */
	@Override
	public List<ScienceAppInputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppInputPorts> orderByComparator,
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

		List<ScienceAppInputPorts> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppInputPorts>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPINPUTPORTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPINPUTPORTS;

				if (pagination) {
					sql = sql.concat(ScienceAppInputPortsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppInputPorts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppInputPorts>)QueryUtil.list(q,
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
	 * Removes all the science app input portses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppInputPorts scienceAppInputPorts : findAll()) {
			remove(scienceAppInputPorts);
		}
	}

	/**
	 * Returns the number of science app input portses.
	 *
	 * @return the number of science app input portses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPINPUTPORTS);

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
		return ScienceAppInputPortsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app input ports persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppInputPortsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPINPUTPORTS = "SELECT scienceAppInputPorts FROM ScienceAppInputPorts scienceAppInputPorts";
	private static final String _SQL_SELECT_SCIENCEAPPINPUTPORTS_WHERE_PKS_IN = "SELECT scienceAppInputPorts FROM ScienceAppInputPorts scienceAppInputPorts WHERE scienceAppId IN (";
	private static final String _SQL_COUNT_SCIENCEAPPINPUTPORTS = "SELECT COUNT(scienceAppInputPorts) FROM ScienceAppInputPorts scienceAppInputPorts";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppInputPorts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppInputPorts exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppInputPortsPersistenceImpl.class);
}