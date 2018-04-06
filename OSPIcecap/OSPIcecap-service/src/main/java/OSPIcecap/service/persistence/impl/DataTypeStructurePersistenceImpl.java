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

import OSPIcecap.exception.NoSuchDataTypeStructureException;

import OSPIcecap.model.DataTypeStructure;

import OSPIcecap.model.impl.DataTypeStructureImpl;
import OSPIcecap.model.impl.DataTypeStructureModelImpl;

import OSPIcecap.service.persistence.DataTypeStructurePersistence;

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
 * The persistence implementation for the data type structure service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeStructurePersistence
 * @see OSPIcecap.service.persistence.DataTypeStructureUtil
 * @generated
 */
@ProviderType
public class DataTypeStructurePersistenceImpl extends BasePersistenceImpl<DataTypeStructure>
	implements DataTypeStructurePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DataTypeStructureUtil} to access the data type structure persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DataTypeStructureImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureModelImpl.FINDER_CACHE_ENABLED,
			DataTypeStructureImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureModelImpl.FINDER_CACHE_ENABLED,
			DataTypeStructureImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DataTypeStructurePersistenceImpl() {
		setModelClass(DataTypeStructure.class);
	}

	/**
	 * Caches the data type structure in the entity cache if it is enabled.
	 *
	 * @param dataTypeStructure the data type structure
	 */
	@Override
	public void cacheResult(DataTypeStructure dataTypeStructure) {
		entityCache.putResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureImpl.class, dataTypeStructure.getPrimaryKey(),
			dataTypeStructure);

		dataTypeStructure.resetOriginalValues();
	}

	/**
	 * Caches the data type structures in the entity cache if it is enabled.
	 *
	 * @param dataTypeStructures the data type structures
	 */
	@Override
	public void cacheResult(List<DataTypeStructure> dataTypeStructures) {
		for (DataTypeStructure dataTypeStructure : dataTypeStructures) {
			if (entityCache.getResult(
						DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
						DataTypeStructureImpl.class,
						dataTypeStructure.getPrimaryKey()) == null) {
				cacheResult(dataTypeStructure);
			}
			else {
				dataTypeStructure.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all data type structures.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DataTypeStructureImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data type structure.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DataTypeStructure dataTypeStructure) {
		entityCache.removeResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureImpl.class, dataTypeStructure.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DataTypeStructure> dataTypeStructures) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DataTypeStructure dataTypeStructure : dataTypeStructures) {
			entityCache.removeResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
				DataTypeStructureImpl.class, dataTypeStructure.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data type structure with the primary key. Does not add the data type structure to the database.
	 *
	 * @param typeId the primary key for the new data type structure
	 * @return the new data type structure
	 */
	@Override
	public DataTypeStructure create(long typeId) {
		DataTypeStructure dataTypeStructure = new DataTypeStructureImpl();

		dataTypeStructure.setNew(true);
		dataTypeStructure.setPrimaryKey(typeId);

		return dataTypeStructure;
	}

	/**
	 * Removes the data type structure with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the data type structure
	 * @return the data type structure that was removed
	 * @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure remove(long typeId)
		throws NoSuchDataTypeStructureException {
		return remove((Serializable)typeId);
	}

	/**
	 * Removes the data type structure with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data type structure
	 * @return the data type structure that was removed
	 * @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure remove(Serializable primaryKey)
		throws NoSuchDataTypeStructureException {
		Session session = null;

		try {
			session = openSession();

			DataTypeStructure dataTypeStructure = (DataTypeStructure)session.get(DataTypeStructureImpl.class,
					primaryKey);

			if (dataTypeStructure == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDataTypeStructureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataTypeStructure);
		}
		catch (NoSuchDataTypeStructureException nsee) {
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
	protected DataTypeStructure removeImpl(DataTypeStructure dataTypeStructure) {
		dataTypeStructure = toUnwrappedModel(dataTypeStructure);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataTypeStructure)) {
				dataTypeStructure = (DataTypeStructure)session.get(DataTypeStructureImpl.class,
						dataTypeStructure.getPrimaryKeyObj());
			}

			if (dataTypeStructure != null) {
				session.delete(dataTypeStructure);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataTypeStructure != null) {
			clearCache(dataTypeStructure);
		}

		return dataTypeStructure;
	}

	@Override
	public DataTypeStructure updateImpl(DataTypeStructure dataTypeStructure) {
		dataTypeStructure = toUnwrappedModel(dataTypeStructure);

		boolean isNew = dataTypeStructure.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dataTypeStructure.isNew()) {
				session.save(dataTypeStructure);

				dataTypeStructure.setNew(false);
			}
			else {
				dataTypeStructure = (DataTypeStructure)session.merge(dataTypeStructure);
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

		entityCache.putResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeStructureImpl.class, dataTypeStructure.getPrimaryKey(),
			dataTypeStructure, false);

		dataTypeStructure.resetOriginalValues();

		return dataTypeStructure;
	}

	protected DataTypeStructure toUnwrappedModel(
		DataTypeStructure dataTypeStructure) {
		if (dataTypeStructure instanceof DataTypeStructureImpl) {
			return dataTypeStructure;
		}

		DataTypeStructureImpl dataTypeStructureImpl = new DataTypeStructureImpl();

		dataTypeStructureImpl.setNew(dataTypeStructure.isNew());
		dataTypeStructureImpl.setPrimaryKey(dataTypeStructure.getPrimaryKey());

		dataTypeStructureImpl.setTypeId(dataTypeStructure.getTypeId());
		dataTypeStructureImpl.setStructure(dataTypeStructure.getStructure());

		return dataTypeStructureImpl;
	}

	/**
	 * Returns the data type structure with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data type structure
	 * @return the data type structure
	 * @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDataTypeStructureException {
		DataTypeStructure dataTypeStructure = fetchByPrimaryKey(primaryKey);

		if (dataTypeStructure == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDataTypeStructureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataTypeStructure;
	}

	/**
	 * Returns the data type structure with the primary key or throws a {@link NoSuchDataTypeStructureException} if it could not be found.
	 *
	 * @param typeId the primary key of the data type structure
	 * @return the data type structure
	 * @throws NoSuchDataTypeStructureException if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure findByPrimaryKey(long typeId)
		throws NoSuchDataTypeStructureException {
		return findByPrimaryKey((Serializable)typeId);
	}

	/**
	 * Returns the data type structure with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data type structure
	 * @return the data type structure, or <code>null</code> if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
				DataTypeStructureImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DataTypeStructure dataTypeStructure = (DataTypeStructure)serializable;

		if (dataTypeStructure == null) {
			Session session = null;

			try {
				session = openSession();

				dataTypeStructure = (DataTypeStructure)session.get(DataTypeStructureImpl.class,
						primaryKey);

				if (dataTypeStructure != null) {
					cacheResult(dataTypeStructure);
				}
				else {
					entityCache.putResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
						DataTypeStructureImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
					DataTypeStructureImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataTypeStructure;
	}

	/**
	 * Returns the data type structure with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the data type structure
	 * @return the data type structure, or <code>null</code> if a data type structure with the primary key could not be found
	 */
	@Override
	public DataTypeStructure fetchByPrimaryKey(long typeId) {
		return fetchByPrimaryKey((Serializable)typeId);
	}

	@Override
	public Map<Serializable, DataTypeStructure> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DataTypeStructure> map = new HashMap<Serializable, DataTypeStructure>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DataTypeStructure dataTypeStructure = fetchByPrimaryKey(primaryKey);

			if (dataTypeStructure != null) {
				map.put(primaryKey, dataTypeStructure);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
					DataTypeStructureImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DataTypeStructure)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATATYPESTRUCTURE_WHERE_PKS_IN);

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

			for (DataTypeStructure dataTypeStructure : (List<DataTypeStructure>)q.list()) {
				map.put(dataTypeStructure.getPrimaryKeyObj(), dataTypeStructure);

				cacheResult(dataTypeStructure);

				uncachedPrimaryKeys.remove(dataTypeStructure.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DataTypeStructureModelImpl.ENTITY_CACHE_ENABLED,
					DataTypeStructureImpl.class, primaryKey, nullModel);
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
	 * Returns all the data type structures.
	 *
	 * @return the data type structures
	 */
	@Override
	public List<DataTypeStructure> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data type structures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type structures
	 * @param end the upper bound of the range of data type structures (not inclusive)
	 * @return the range of data type structures
	 */
	@Override
	public List<DataTypeStructure> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the data type structures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type structures
	 * @param end the upper bound of the range of data type structures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of data type structures
	 */
	@Override
	public List<DataTypeStructure> findAll(int start, int end,
		OrderByComparator<DataTypeStructure> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data type structures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeStructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type structures
	 * @param end the upper bound of the range of data type structures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of data type structures
	 */
	@Override
	public List<DataTypeStructure> findAll(int start, int end,
		OrderByComparator<DataTypeStructure> orderByComparator,
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

		List<DataTypeStructure> list = null;

		if (retrieveFromCache) {
			list = (List<DataTypeStructure>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATATYPESTRUCTURE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATATYPESTRUCTURE;

				if (pagination) {
					sql = sql.concat(DataTypeStructureModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DataTypeStructure>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataTypeStructure>)QueryUtil.list(q,
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
	 * Removes all the data type structures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DataTypeStructure dataTypeStructure : findAll()) {
			remove(dataTypeStructure);
		}
	}

	/**
	 * Returns the number of data type structures.
	 *
	 * @return the number of data type structures
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATATYPESTRUCTURE);

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
		return DataTypeStructureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data type structure persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DataTypeStructureImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATATYPESTRUCTURE = "SELECT dataTypeStructure FROM DataTypeStructure dataTypeStructure";
	private static final String _SQL_SELECT_DATATYPESTRUCTURE_WHERE_PKS_IN = "SELECT dataTypeStructure FROM DataTypeStructure dataTypeStructure WHERE typeId IN (";
	private static final String _SQL_COUNT_DATATYPESTRUCTURE = "SELECT COUNT(dataTypeStructure) FROM DataTypeStructure dataTypeStructure";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataTypeStructure.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataTypeStructure exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(DataTypeStructurePersistenceImpl.class);
}