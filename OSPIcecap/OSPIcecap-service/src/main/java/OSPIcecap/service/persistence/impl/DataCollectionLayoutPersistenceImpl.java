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

package OSPIcecap.service.persistence.impl;

import OSPIcecap.exception.NoSuchDataCollectionLayoutException;

import OSPIcecap.model.DataCollectionLayout;

import OSPIcecap.model.impl.DataCollectionLayoutImpl;
import OSPIcecap.model.impl.DataCollectionLayoutModelImpl;

import OSPIcecap.service.persistence.DataCollectionLayoutPersistence;

import aQute.bnd.annotation.ProviderType;

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
 * The persistence implementation for the data collection layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataCollectionLayoutPersistence
 * @see OSPIcecap.service.persistence.DataCollectionLayoutUtil
 * @generated
 */
@ProviderType
public class DataCollectionLayoutPersistenceImpl extends BasePersistenceImpl<DataCollectionLayout>
	implements DataCollectionLayoutPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DataCollectionLayoutUtil} to access the data collection layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DataCollectionLayoutImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutModelImpl.FINDER_CACHE_ENABLED,
			DataCollectionLayoutImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutModelImpl.FINDER_CACHE_ENABLED,
			DataCollectionLayoutImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DataCollectionLayoutPersistenceImpl() {
		setModelClass(DataCollectionLayout.class);
	}

	/**
	 * Caches the data collection layout in the entity cache if it is enabled.
	 *
	 * @param dataCollectionLayout the data collection layout
	 */
	@Override
	public void cacheResult(DataCollectionLayout dataCollectionLayout) {
		entityCache.putResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutImpl.class,
			dataCollectionLayout.getPrimaryKey(), dataCollectionLayout);

		dataCollectionLayout.resetOriginalValues();
	}

	/**
	 * Caches the data collection layouts in the entity cache if it is enabled.
	 *
	 * @param dataCollectionLayouts the data collection layouts
	 */
	@Override
	public void cacheResult(List<DataCollectionLayout> dataCollectionLayouts) {
		for (DataCollectionLayout dataCollectionLayout : dataCollectionLayouts) {
			if (entityCache.getResult(
						DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
						DataCollectionLayoutImpl.class,
						dataCollectionLayout.getPrimaryKey()) == null) {
				cacheResult(dataCollectionLayout);
			}
			else {
				dataCollectionLayout.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all data collection layouts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DataCollectionLayoutImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data collection layout.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DataCollectionLayout dataCollectionLayout) {
		entityCache.removeResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutImpl.class, dataCollectionLayout.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DataCollectionLayout> dataCollectionLayouts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DataCollectionLayout dataCollectionLayout : dataCollectionLayouts) {
			entityCache.removeResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
				DataCollectionLayoutImpl.class,
				dataCollectionLayout.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data collection layout with the primary key. Does not add the data collection layout to the database.
	 *
	 * @param collectionId the primary key for the new data collection layout
	 * @return the new data collection layout
	 */
	@Override
	public DataCollectionLayout create(long collectionId) {
		DataCollectionLayout dataCollectionLayout = new DataCollectionLayoutImpl();

		dataCollectionLayout.setNew(true);
		dataCollectionLayout.setPrimaryKey(collectionId);

		return dataCollectionLayout;
	}

	/**
	 * Removes the data collection layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param collectionId the primary key of the data collection layout
	 * @return the data collection layout that was removed
	 * @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout remove(long collectionId)
		throws NoSuchDataCollectionLayoutException {
		return remove((Serializable)collectionId);
	}

	/**
	 * Removes the data collection layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data collection layout
	 * @return the data collection layout that was removed
	 * @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout remove(Serializable primaryKey)
		throws NoSuchDataCollectionLayoutException {
		Session session = null;

		try {
			session = openSession();

			DataCollectionLayout dataCollectionLayout = (DataCollectionLayout)session.get(DataCollectionLayoutImpl.class,
					primaryKey);

			if (dataCollectionLayout == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDataCollectionLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataCollectionLayout);
		}
		catch (NoSuchDataCollectionLayoutException nsee) {
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
	protected DataCollectionLayout removeImpl(
		DataCollectionLayout dataCollectionLayout) {
		dataCollectionLayout = toUnwrappedModel(dataCollectionLayout);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataCollectionLayout)) {
				dataCollectionLayout = (DataCollectionLayout)session.get(DataCollectionLayoutImpl.class,
						dataCollectionLayout.getPrimaryKeyObj());
			}

			if (dataCollectionLayout != null) {
				session.delete(dataCollectionLayout);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataCollectionLayout != null) {
			clearCache(dataCollectionLayout);
		}

		return dataCollectionLayout;
	}

	@Override
	public DataCollectionLayout updateImpl(
		DataCollectionLayout dataCollectionLayout) {
		dataCollectionLayout = toUnwrappedModel(dataCollectionLayout);

		boolean isNew = dataCollectionLayout.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dataCollectionLayout.isNew()) {
				session.save(dataCollectionLayout);

				dataCollectionLayout.setNew(false);
			}
			else {
				dataCollectionLayout = (DataCollectionLayout)session.merge(dataCollectionLayout);
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

		entityCache.putResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
			DataCollectionLayoutImpl.class,
			dataCollectionLayout.getPrimaryKey(), dataCollectionLayout, false);

		dataCollectionLayout.resetOriginalValues();

		return dataCollectionLayout;
	}

	protected DataCollectionLayout toUnwrappedModel(
		DataCollectionLayout dataCollectionLayout) {
		if (dataCollectionLayout instanceof DataCollectionLayoutImpl) {
			return dataCollectionLayout;
		}

		DataCollectionLayoutImpl dataCollectionLayoutImpl = new DataCollectionLayoutImpl();

		dataCollectionLayoutImpl.setNew(dataCollectionLayout.isNew());
		dataCollectionLayoutImpl.setPrimaryKey(dataCollectionLayout.getPrimaryKey());

		dataCollectionLayoutImpl.setCollectionId(dataCollectionLayout.getCollectionId());
		dataCollectionLayoutImpl.setLayout(dataCollectionLayout.getLayout());

		return dataCollectionLayoutImpl;
	}

	/**
	 * Returns the data collection layout with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data collection layout
	 * @return the data collection layout
	 * @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDataCollectionLayoutException {
		DataCollectionLayout dataCollectionLayout = fetchByPrimaryKey(primaryKey);

		if (dataCollectionLayout == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDataCollectionLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataCollectionLayout;
	}

	/**
	 * Returns the data collection layout with the primary key or throws a {@link NoSuchDataCollectionLayoutException} if it could not be found.
	 *
	 * @param collectionId the primary key of the data collection layout
	 * @return the data collection layout
	 * @throws NoSuchDataCollectionLayoutException if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout findByPrimaryKey(long collectionId)
		throws NoSuchDataCollectionLayoutException {
		return findByPrimaryKey((Serializable)collectionId);
	}

	/**
	 * Returns the data collection layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data collection layout
	 * @return the data collection layout, or <code>null</code> if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
				DataCollectionLayoutImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DataCollectionLayout dataCollectionLayout = (DataCollectionLayout)serializable;

		if (dataCollectionLayout == null) {
			Session session = null;

			try {
				session = openSession();

				dataCollectionLayout = (DataCollectionLayout)session.get(DataCollectionLayoutImpl.class,
						primaryKey);

				if (dataCollectionLayout != null) {
					cacheResult(dataCollectionLayout);
				}
				else {
					entityCache.putResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
						DataCollectionLayoutImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
					DataCollectionLayoutImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataCollectionLayout;
	}

	/**
	 * Returns the data collection layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param collectionId the primary key of the data collection layout
	 * @return the data collection layout, or <code>null</code> if a data collection layout with the primary key could not be found
	 */
	@Override
	public DataCollectionLayout fetchByPrimaryKey(long collectionId) {
		return fetchByPrimaryKey((Serializable)collectionId);
	}

	@Override
	public Map<Serializable, DataCollectionLayout> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DataCollectionLayout> map = new HashMap<Serializable, DataCollectionLayout>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DataCollectionLayout dataCollectionLayout = fetchByPrimaryKey(primaryKey);

			if (dataCollectionLayout != null) {
				map.put(primaryKey, dataCollectionLayout);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
					DataCollectionLayoutImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DataCollectionLayout)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATACOLLECTIONLAYOUT_WHERE_PKS_IN);

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

			for (DataCollectionLayout dataCollectionLayout : (List<DataCollectionLayout>)q.list()) {
				map.put(dataCollectionLayout.getPrimaryKeyObj(),
					dataCollectionLayout);

				cacheResult(dataCollectionLayout);

				uncachedPrimaryKeys.remove(dataCollectionLayout.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DataCollectionLayoutModelImpl.ENTITY_CACHE_ENABLED,
					DataCollectionLayoutImpl.class, primaryKey, nullModel);
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
	 * Returns all the data collection layouts.
	 *
	 * @return the data collection layouts
	 */
	@Override
	public List<DataCollectionLayout> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data collection layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data collection layouts
	 * @param end the upper bound of the range of data collection layouts (not inclusive)
	 * @return the range of data collection layouts
	 */
	@Override
	public List<DataCollectionLayout> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the data collection layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data collection layouts
	 * @param end the upper bound of the range of data collection layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of data collection layouts
	 */
	@Override
	public List<DataCollectionLayout> findAll(int start, int end,
		OrderByComparator<DataCollectionLayout> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data collection layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataCollectionLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data collection layouts
	 * @param end the upper bound of the range of data collection layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of data collection layouts
	 */
	@Override
	public List<DataCollectionLayout> findAll(int start, int end,
		OrderByComparator<DataCollectionLayout> orderByComparator,
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

		List<DataCollectionLayout> list = null;

		if (retrieveFromCache) {
			list = (List<DataCollectionLayout>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATACOLLECTIONLAYOUT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATACOLLECTIONLAYOUT;

				if (pagination) {
					sql = sql.concat(DataCollectionLayoutModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DataCollectionLayout>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataCollectionLayout>)QueryUtil.list(q,
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
	 * Removes all the data collection layouts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DataCollectionLayout dataCollectionLayout : findAll()) {
			remove(dataCollectionLayout);
		}
	}

	/**
	 * Returns the number of data collection layouts.
	 *
	 * @return the number of data collection layouts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATACOLLECTIONLAYOUT);

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
		return DataCollectionLayoutModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data collection layout persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DataCollectionLayoutImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATACOLLECTIONLAYOUT = "SELECT dataCollectionLayout FROM DataCollectionLayout dataCollectionLayout";
	private static final String _SQL_SELECT_DATACOLLECTIONLAYOUT_WHERE_PKS_IN = "SELECT dataCollectionLayout FROM DataCollectionLayout dataCollectionLayout WHERE collectionId IN (";
	private static final String _SQL_COUNT_DATACOLLECTIONLAYOUT = "SELECT COUNT(dataCollectionLayout) FROM DataCollectionLayout dataCollectionLayout";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataCollectionLayout.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataCollectionLayout exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(DataCollectionLayoutPersistenceImpl.class);
}