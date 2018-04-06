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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppOutputPortsException;
import com.kisti.osp.spyglass.model.ScienceAppOutputPorts;
import com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppOutputPortsModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppOutputPortsPersistence;

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
 * The persistence implementation for the science app output ports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppOutputPortsPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppOutputPortsUtil
 * @generated
 */
@ProviderType
public class ScienceAppOutputPortsPersistenceImpl extends BasePersistenceImpl<ScienceAppOutputPorts>
	implements ScienceAppOutputPortsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppOutputPortsUtil} to access the science app output ports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppOutputPortsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppOutputPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppOutputPortsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ScienceAppOutputPortsPersistenceImpl() {
		setModelClass(ScienceAppOutputPorts.class);
	}

	/**
	 * Caches the science app output ports in the entity cache if it is enabled.
	 *
	 * @param scienceAppOutputPorts the science app output ports
	 */
	@Override
	public void cacheResult(ScienceAppOutputPorts scienceAppOutputPorts) {
		entityCache.putResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsImpl.class,
			scienceAppOutputPorts.getPrimaryKey(), scienceAppOutputPorts);

		scienceAppOutputPorts.resetOriginalValues();
	}

	/**
	 * Caches the science app output portses in the entity cache if it is enabled.
	 *
	 * @param scienceAppOutputPortses the science app output portses
	 */
	@Override
	public void cacheResult(List<ScienceAppOutputPorts> scienceAppOutputPortses) {
		for (ScienceAppOutputPorts scienceAppOutputPorts : scienceAppOutputPortses) {
			if (entityCache.getResult(
						ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppOutputPortsImpl.class,
						scienceAppOutputPorts.getPrimaryKey()) == null) {
				cacheResult(scienceAppOutputPorts);
			}
			else {
				scienceAppOutputPorts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app output portses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppOutputPortsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app output ports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppOutputPorts scienceAppOutputPorts) {
		entityCache.removeResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsImpl.class,
			scienceAppOutputPorts.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppOutputPorts> scienceAppOutputPortses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppOutputPorts scienceAppOutputPorts : scienceAppOutputPortses) {
			entityCache.removeResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppOutputPortsImpl.class,
				scienceAppOutputPorts.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app output ports with the primary key. Does not add the science app output ports to the database.
	 *
	 * @param scienceAppId the primary key for the new science app output ports
	 * @return the new science app output ports
	 */
	@Override
	public ScienceAppOutputPorts create(long scienceAppId) {
		ScienceAppOutputPorts scienceAppOutputPorts = new ScienceAppOutputPortsImpl();

		scienceAppOutputPorts.setNew(true);
		scienceAppOutputPorts.setPrimaryKey(scienceAppId);

		return scienceAppOutputPorts;
	}

	/**
	 * Removes the science app output ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app output ports
	 * @return the science app output ports that was removed
	 * @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts remove(long scienceAppId)
		throws NoSuchScienceAppOutputPortsException {
		return remove((Serializable)scienceAppId);
	}

	/**
	 * Removes the science app output ports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app output ports
	 * @return the science app output ports that was removed
	 * @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts remove(Serializable primaryKey)
		throws NoSuchScienceAppOutputPortsException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppOutputPorts scienceAppOutputPorts = (ScienceAppOutputPorts)session.get(ScienceAppOutputPortsImpl.class,
					primaryKey);

			if (scienceAppOutputPorts == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppOutputPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppOutputPorts);
		}
		catch (NoSuchScienceAppOutputPortsException nsee) {
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
	protected ScienceAppOutputPorts removeImpl(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		scienceAppOutputPorts = toUnwrappedModel(scienceAppOutputPorts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppOutputPorts)) {
				scienceAppOutputPorts = (ScienceAppOutputPorts)session.get(ScienceAppOutputPortsImpl.class,
						scienceAppOutputPorts.getPrimaryKeyObj());
			}

			if (scienceAppOutputPorts != null) {
				session.delete(scienceAppOutputPorts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppOutputPorts != null) {
			clearCache(scienceAppOutputPorts);
		}

		return scienceAppOutputPorts;
	}

	@Override
	public ScienceAppOutputPorts updateImpl(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		scienceAppOutputPorts = toUnwrappedModel(scienceAppOutputPorts);

		boolean isNew = scienceAppOutputPorts.isNew();

		Session session = null;

		try {
			session = openSession();

			if (scienceAppOutputPorts.isNew()) {
				session.save(scienceAppOutputPorts);

				scienceAppOutputPorts.setNew(false);
			}
			else {
				scienceAppOutputPorts = (ScienceAppOutputPorts)session.merge(scienceAppOutputPorts);
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

		entityCache.putResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppOutputPortsImpl.class,
			scienceAppOutputPorts.getPrimaryKey(), scienceAppOutputPorts, false);

		scienceAppOutputPorts.resetOriginalValues();

		return scienceAppOutputPorts;
	}

	protected ScienceAppOutputPorts toUnwrappedModel(
		ScienceAppOutputPorts scienceAppOutputPorts) {
		if (scienceAppOutputPorts instanceof ScienceAppOutputPortsImpl) {
			return scienceAppOutputPorts;
		}

		ScienceAppOutputPortsImpl scienceAppOutputPortsImpl = new ScienceAppOutputPortsImpl();

		scienceAppOutputPortsImpl.setNew(scienceAppOutputPorts.isNew());
		scienceAppOutputPortsImpl.setPrimaryKey(scienceAppOutputPorts.getPrimaryKey());

		scienceAppOutputPortsImpl.setScienceAppId(scienceAppOutputPorts.getScienceAppId());
		scienceAppOutputPortsImpl.setOutputPorts(scienceAppOutputPorts.getOutputPorts());

		return scienceAppOutputPortsImpl;
	}

	/**
	 * Returns the science app output ports with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app output ports
	 * @return the science app output ports
	 * @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppOutputPortsException {
		ScienceAppOutputPorts scienceAppOutputPorts = fetchByPrimaryKey(primaryKey);

		if (scienceAppOutputPorts == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppOutputPortsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppOutputPorts;
	}

	/**
	 * Returns the science app output ports with the primary key or throws a {@link NoSuchScienceAppOutputPortsException} if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app output ports
	 * @return the science app output ports
	 * @throws NoSuchScienceAppOutputPortsException if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppOutputPortsException {
		return findByPrimaryKey((Serializable)scienceAppId);
	}

	/**
	 * Returns the science app output ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app output ports
	 * @return the science app output ports, or <code>null</code> if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppOutputPortsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppOutputPorts scienceAppOutputPorts = (ScienceAppOutputPorts)serializable;

		if (scienceAppOutputPorts == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppOutputPorts = (ScienceAppOutputPorts)session.get(ScienceAppOutputPortsImpl.class,
						primaryKey);

				if (scienceAppOutputPorts != null) {
					cacheResult(scienceAppOutputPorts);
				}
				else {
					entityCache.putResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppOutputPortsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppOutputPortsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppOutputPorts;
	}

	/**
	 * Returns the science app output ports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app output ports
	 * @return the science app output ports, or <code>null</code> if a science app output ports with the primary key could not be found
	 */
	@Override
	public ScienceAppOutputPorts fetchByPrimaryKey(long scienceAppId) {
		return fetchByPrimaryKey((Serializable)scienceAppId);
	}

	@Override
	public Map<Serializable, ScienceAppOutputPorts> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppOutputPorts> map = new HashMap<Serializable, ScienceAppOutputPorts>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppOutputPorts scienceAppOutputPorts = fetchByPrimaryKey(primaryKey);

			if (scienceAppOutputPorts != null) {
				map.put(primaryKey, scienceAppOutputPorts);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppOutputPortsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppOutputPorts)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPOUTPUTPORTS_WHERE_PKS_IN);

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

			for (ScienceAppOutputPorts scienceAppOutputPorts : (List<ScienceAppOutputPorts>)q.list()) {
				map.put(scienceAppOutputPorts.getPrimaryKeyObj(),
					scienceAppOutputPorts);

				cacheResult(scienceAppOutputPorts);

				uncachedPrimaryKeys.remove(scienceAppOutputPorts.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppOutputPortsModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppOutputPortsImpl.class, primaryKey, nullModel);
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
	 * Returns all the science app output portses.
	 *
	 * @return the science app output portses
	 */
	@Override
	public List<ScienceAppOutputPorts> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app output portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app output portses
	 * @param end the upper bound of the range of science app output portses (not inclusive)
	 * @return the range of science app output portses
	 */
	@Override
	public List<ScienceAppOutputPorts> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app output portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app output portses
	 * @param end the upper bound of the range of science app output portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app output portses
	 */
	@Override
	public List<ScienceAppOutputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppOutputPorts> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app output portses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppOutputPortsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app output portses
	 * @param end the upper bound of the range of science app output portses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app output portses
	 */
	@Override
	public List<ScienceAppOutputPorts> findAll(int start, int end,
		OrderByComparator<ScienceAppOutputPorts> orderByComparator,
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

		List<ScienceAppOutputPorts> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppOutputPorts>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPOUTPUTPORTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPOUTPUTPORTS;

				if (pagination) {
					sql = sql.concat(ScienceAppOutputPortsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppOutputPorts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppOutputPorts>)QueryUtil.list(q,
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
	 * Removes all the science app output portses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppOutputPorts scienceAppOutputPorts : findAll()) {
			remove(scienceAppOutputPorts);
		}
	}

	/**
	 * Returns the number of science app output portses.
	 *
	 * @return the number of science app output portses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPOUTPUTPORTS);

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
		return ScienceAppOutputPortsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app output ports persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppOutputPortsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPOUTPUTPORTS = "SELECT scienceAppOutputPorts FROM ScienceAppOutputPorts scienceAppOutputPorts";
	private static final String _SQL_SELECT_SCIENCEAPPOUTPUTPORTS_WHERE_PKS_IN = "SELECT scienceAppOutputPorts FROM ScienceAppOutputPorts scienceAppOutputPorts WHERE scienceAppId IN (";
	private static final String _SQL_COUNT_SCIENCEAPPOUTPUTPORTS = "SELECT COUNT(scienceAppOutputPorts) FROM ScienceAppOutputPorts scienceAppOutputPorts";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppOutputPorts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppOutputPorts exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppOutputPortsPersistenceImpl.class);
}