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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppLayoutException;
import com.kisti.osp.spyglass.model.ScienceAppLayout;
import com.kisti.osp.spyglass.model.impl.ScienceAppLayoutImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppLayoutModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppLayoutPersistence;

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
 * The persistence implementation for the science app layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLayoutPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppLayoutUtil
 * @generated
 */
@ProviderType
public class ScienceAppLayoutPersistenceImpl extends BasePersistenceImpl<ScienceAppLayout>
	implements ScienceAppLayoutPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppLayoutUtil} to access the science app layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppLayoutImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppLayoutImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppLayoutImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ScienceAppLayoutPersistenceImpl() {
		setModelClass(ScienceAppLayout.class);
	}

	/**
	 * Caches the science app layout in the entity cache if it is enabled.
	 *
	 * @param scienceAppLayout the science app layout
	 */
	@Override
	public void cacheResult(ScienceAppLayout scienceAppLayout) {
		entityCache.putResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutImpl.class, scienceAppLayout.getPrimaryKey(),
			scienceAppLayout);

		scienceAppLayout.resetOriginalValues();
	}

	/**
	 * Caches the science app layouts in the entity cache if it is enabled.
	 *
	 * @param scienceAppLayouts the science app layouts
	 */
	@Override
	public void cacheResult(List<ScienceAppLayout> scienceAppLayouts) {
		for (ScienceAppLayout scienceAppLayout : scienceAppLayouts) {
			if (entityCache.getResult(
						ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppLayoutImpl.class,
						scienceAppLayout.getPrimaryKey()) == null) {
				cacheResult(scienceAppLayout);
			}
			else {
				scienceAppLayout.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app layouts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppLayoutImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app layout.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppLayout scienceAppLayout) {
		entityCache.removeResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutImpl.class, scienceAppLayout.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppLayout> scienceAppLayouts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppLayout scienceAppLayout : scienceAppLayouts) {
			entityCache.removeResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppLayoutImpl.class, scienceAppLayout.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app layout with the primary key. Does not add the science app layout to the database.
	 *
	 * @param scienceAppId the primary key for the new science app layout
	 * @return the new science app layout
	 */
	@Override
	public ScienceAppLayout create(long scienceAppId) {
		ScienceAppLayout scienceAppLayout = new ScienceAppLayoutImpl();

		scienceAppLayout.setNew(true);
		scienceAppLayout.setPrimaryKey(scienceAppId);

		return scienceAppLayout;
	}

	/**
	 * Removes the science app layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app layout
	 * @return the science app layout that was removed
	 * @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout remove(long scienceAppId)
		throws NoSuchScienceAppLayoutException {
		return remove((Serializable)scienceAppId);
	}

	/**
	 * Removes the science app layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app layout
	 * @return the science app layout that was removed
	 * @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout remove(Serializable primaryKey)
		throws NoSuchScienceAppLayoutException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppLayout scienceAppLayout = (ScienceAppLayout)session.get(ScienceAppLayoutImpl.class,
					primaryKey);

			if (scienceAppLayout == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppLayout);
		}
		catch (NoSuchScienceAppLayoutException nsee) {
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
	protected ScienceAppLayout removeImpl(ScienceAppLayout scienceAppLayout) {
		scienceAppLayout = toUnwrappedModel(scienceAppLayout);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppLayout)) {
				scienceAppLayout = (ScienceAppLayout)session.get(ScienceAppLayoutImpl.class,
						scienceAppLayout.getPrimaryKeyObj());
			}

			if (scienceAppLayout != null) {
				session.delete(scienceAppLayout);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppLayout != null) {
			clearCache(scienceAppLayout);
		}

		return scienceAppLayout;
	}

	@Override
	public ScienceAppLayout updateImpl(ScienceAppLayout scienceAppLayout) {
		scienceAppLayout = toUnwrappedModel(scienceAppLayout);

		boolean isNew = scienceAppLayout.isNew();

		Session session = null;

		try {
			session = openSession();

			if (scienceAppLayout.isNew()) {
				session.save(scienceAppLayout);

				scienceAppLayout.setNew(false);
			}
			else {
				scienceAppLayout = (ScienceAppLayout)session.merge(scienceAppLayout);
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

		entityCache.putResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppLayoutImpl.class, scienceAppLayout.getPrimaryKey(),
			scienceAppLayout, false);

		scienceAppLayout.resetOriginalValues();

		return scienceAppLayout;
	}

	protected ScienceAppLayout toUnwrappedModel(
		ScienceAppLayout scienceAppLayout) {
		if (scienceAppLayout instanceof ScienceAppLayoutImpl) {
			return scienceAppLayout;
		}

		ScienceAppLayoutImpl scienceAppLayoutImpl = new ScienceAppLayoutImpl();

		scienceAppLayoutImpl.setNew(scienceAppLayout.isNew());
		scienceAppLayoutImpl.setPrimaryKey(scienceAppLayout.getPrimaryKey());

		scienceAppLayoutImpl.setScienceAppId(scienceAppLayout.getScienceAppId());
		scienceAppLayoutImpl.setLayout(scienceAppLayout.getLayout());

		return scienceAppLayoutImpl;
	}

	/**
	 * Returns the science app layout with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app layout
	 * @return the science app layout
	 * @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppLayoutException {
		ScienceAppLayout scienceAppLayout = fetchByPrimaryKey(primaryKey);

		if (scienceAppLayout == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppLayout;
	}

	/**
	 * Returns the science app layout with the primary key or throws a {@link NoSuchScienceAppLayoutException} if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app layout
	 * @return the science app layout
	 * @throws NoSuchScienceAppLayoutException if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppLayoutException {
		return findByPrimaryKey((Serializable)scienceAppId);
	}

	/**
	 * Returns the science app layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app layout
	 * @return the science app layout, or <code>null</code> if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppLayoutImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppLayout scienceAppLayout = (ScienceAppLayout)serializable;

		if (scienceAppLayout == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppLayout = (ScienceAppLayout)session.get(ScienceAppLayoutImpl.class,
						primaryKey);

				if (scienceAppLayout != null) {
					cacheResult(scienceAppLayout);
				}
				else {
					entityCache.putResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppLayoutImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLayoutImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppLayout;
	}

	/**
	 * Returns the science app layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app layout
	 * @return the science app layout, or <code>null</code> if a science app layout with the primary key could not be found
	 */
	@Override
	public ScienceAppLayout fetchByPrimaryKey(long scienceAppId) {
		return fetchByPrimaryKey((Serializable)scienceAppId);
	}

	@Override
	public Map<Serializable, ScienceAppLayout> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppLayout> map = new HashMap<Serializable, ScienceAppLayout>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppLayout scienceAppLayout = fetchByPrimaryKey(primaryKey);

			if (scienceAppLayout != null) {
				map.put(primaryKey, scienceAppLayout);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLayoutImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppLayout)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPLAYOUT_WHERE_PKS_IN);

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

			for (ScienceAppLayout scienceAppLayout : (List<ScienceAppLayout>)q.list()) {
				map.put(scienceAppLayout.getPrimaryKeyObj(), scienceAppLayout);

				cacheResult(scienceAppLayout);

				uncachedPrimaryKeys.remove(scienceAppLayout.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppLayoutModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppLayoutImpl.class, primaryKey, nullModel);
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
	 * Returns all the science app layouts.
	 *
	 * @return the science app layouts
	 */
	@Override
	public List<ScienceAppLayout> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app layouts
	 * @param end the upper bound of the range of science app layouts (not inclusive)
	 * @return the range of science app layouts
	 */
	@Override
	public List<ScienceAppLayout> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app layouts
	 * @param end the upper bound of the range of science app layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app layouts
	 */
	@Override
	public List<ScienceAppLayout> findAll(int start, int end,
		OrderByComparator<ScienceAppLayout> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app layouts
	 * @param end the upper bound of the range of science app layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app layouts
	 */
	@Override
	public List<ScienceAppLayout> findAll(int start, int end,
		OrderByComparator<ScienceAppLayout> orderByComparator,
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

		List<ScienceAppLayout> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppLayout>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPLAYOUT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPLAYOUT;

				if (pagination) {
					sql = sql.concat(ScienceAppLayoutModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppLayout>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppLayout>)QueryUtil.list(q,
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
	 * Removes all the science app layouts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppLayout scienceAppLayout : findAll()) {
			remove(scienceAppLayout);
		}
	}

	/**
	 * Returns the number of science app layouts.
	 *
	 * @return the number of science app layouts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPLAYOUT);

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
		return ScienceAppLayoutModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app layout persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppLayoutImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPLAYOUT = "SELECT scienceAppLayout FROM ScienceAppLayout scienceAppLayout";
	private static final String _SQL_SELECT_SCIENCEAPPLAYOUT_WHERE_PKS_IN = "SELECT scienceAppLayout FROM ScienceAppLayout scienceAppLayout WHERE scienceAppId IN (";
	private static final String _SQL_COUNT_SCIENCEAPPLAYOUT = "SELECT COUNT(scienceAppLayout) FROM ScienceAppLayout scienceAppLayout";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppLayout.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppLayout exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppLayoutPersistenceImpl.class);
}