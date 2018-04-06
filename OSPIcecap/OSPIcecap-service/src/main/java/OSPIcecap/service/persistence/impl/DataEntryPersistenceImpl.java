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

import OSPIcecap.exception.NoSuchDataEntryException;

import OSPIcecap.model.DataEntry;

import OSPIcecap.model.impl.DataEntryImpl;
import OSPIcecap.model.impl.DataEntryModelImpl;

import OSPIcecap.service.persistence.DataEntryPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
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
 * The persistence implementation for the data entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataEntryPersistence
 * @see OSPIcecap.service.persistence.DataEntryUtil
 * @generated
 */
@ProviderType
public class DataEntryPersistenceImpl extends BasePersistenceImpl<DataEntry>
	implements DataEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DataEntryUtil} to access the data entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DataEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, DataEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, DataEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLECTIONID =
		new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, DataEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCollectionID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID =
		new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, DataEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCollectionID",
			new String[] { Long.class.getName() },
			DataEntryModelImpl.COLLECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COLLECTIONID = new FinderPath(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCollectionID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the data entries where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @return the matching data entries
	 */
	@Override
	public List<DataEntry> findByCollectionID(long collectionId) {
		return findByCollectionID(collectionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data entries where collectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param collectionId the collection ID
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @return the range of matching data entries
	 */
	@Override
	public List<DataEntry> findByCollectionID(long collectionId, int start,
		int end) {
		return findByCollectionID(collectionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the data entries where collectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param collectionId the collection ID
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching data entries
	 */
	@Override
	public List<DataEntry> findByCollectionID(long collectionId, int start,
		int end, OrderByComparator<DataEntry> orderByComparator) {
		return findByCollectionID(collectionId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the data entries where collectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param collectionId the collection ID
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching data entries
	 */
	@Override
	public List<DataEntry> findByCollectionID(long collectionId, int start,
		int end, OrderByComparator<DataEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID;
			finderArgs = new Object[] { collectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COLLECTIONID;
			finderArgs = new Object[] {
					collectionId,
					
					start, end, orderByComparator
				};
		}

		List<DataEntry> list = null;

		if (retrieveFromCache) {
			list = (List<DataEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DataEntry dataEntry : list) {
					if ((collectionId != dataEntry.getCollectionId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DATAENTRY_WHERE);

			query.append(_FINDER_COLUMN_COLLECTIONID_COLLECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DataEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(collectionId);

				if (!pagination) {
					list = (List<DataEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataEntry>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first data entry in the ordered set where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data entry
	 * @throws NoSuchDataEntryException if a matching data entry could not be found
	 */
	@Override
	public DataEntry findByCollectionID_First(long collectionId,
		OrderByComparator<DataEntry> orderByComparator)
		throws NoSuchDataEntryException {
		DataEntry dataEntry = fetchByCollectionID_First(collectionId,
				orderByComparator);

		if (dataEntry != null) {
			return dataEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("collectionId=");
		msg.append(collectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataEntryException(msg.toString());
	}

	/**
	 * Returns the first data entry in the ordered set where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data entry, or <code>null</code> if a matching data entry could not be found
	 */
	@Override
	public DataEntry fetchByCollectionID_First(long collectionId,
		OrderByComparator<DataEntry> orderByComparator) {
		List<DataEntry> list = findByCollectionID(collectionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last data entry in the ordered set where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data entry
	 * @throws NoSuchDataEntryException if a matching data entry could not be found
	 */
	@Override
	public DataEntry findByCollectionID_Last(long collectionId,
		OrderByComparator<DataEntry> orderByComparator)
		throws NoSuchDataEntryException {
		DataEntry dataEntry = fetchByCollectionID_Last(collectionId,
				orderByComparator);

		if (dataEntry != null) {
			return dataEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("collectionId=");
		msg.append(collectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataEntryException(msg.toString());
	}

	/**
	 * Returns the last data entry in the ordered set where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data entry, or <code>null</code> if a matching data entry could not be found
	 */
	@Override
	public DataEntry fetchByCollectionID_Last(long collectionId,
		OrderByComparator<DataEntry> orderByComparator) {
		int count = countByCollectionID(collectionId);

		if (count == 0) {
			return null;
		}

		List<DataEntry> list = findByCollectionID(collectionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the data entries before and after the current data entry in the ordered set where collectionId = &#63;.
	 *
	 * @param entryId the primary key of the current data entry
	 * @param collectionId the collection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next data entry
	 * @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry[] findByCollectionID_PrevAndNext(long entryId,
		long collectionId, OrderByComparator<DataEntry> orderByComparator)
		throws NoSuchDataEntryException {
		DataEntry dataEntry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			DataEntry[] array = new DataEntryImpl[3];

			array[0] = getByCollectionID_PrevAndNext(session, dataEntry,
					collectionId, orderByComparator, true);

			array[1] = dataEntry;

			array[2] = getByCollectionID_PrevAndNext(session, dataEntry,
					collectionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DataEntry getByCollectionID_PrevAndNext(Session session,
		DataEntry dataEntry, long collectionId,
		OrderByComparator<DataEntry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATAENTRY_WHERE);

		query.append(_FINDER_COLUMN_COLLECTIONID_COLLECTIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DataEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(collectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DataEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the data entries where collectionId = &#63; from the database.
	 *
	 * @param collectionId the collection ID
	 */
	@Override
	public void removeByCollectionID(long collectionId) {
		for (DataEntry dataEntry : findByCollectionID(collectionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dataEntry);
		}
	}

	/**
	 * Returns the number of data entries where collectionId = &#63;.
	 *
	 * @param collectionId the collection ID
	 * @return the number of matching data entries
	 */
	@Override
	public int countByCollectionID(long collectionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COLLECTIONID;

		Object[] finderArgs = new Object[] { collectionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATAENTRY_WHERE);

			query.append(_FINDER_COLUMN_COLLECTIONID_COLLECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(collectionId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COLLECTIONID_COLLECTIONID_2 = "dataEntry.collectionId = ?";

	public DataEntryPersistenceImpl() {
		setModelClass(DataEntry.class);
	}

	/**
	 * Caches the data entry in the entity cache if it is enabled.
	 *
	 * @param dataEntry the data entry
	 */
	@Override
	public void cacheResult(DataEntry dataEntry) {
		entityCache.putResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryImpl.class, dataEntry.getPrimaryKey(), dataEntry);

		dataEntry.resetOriginalValues();
	}

	/**
	 * Caches the data entries in the entity cache if it is enabled.
	 *
	 * @param dataEntries the data entries
	 */
	@Override
	public void cacheResult(List<DataEntry> dataEntries) {
		for (DataEntry dataEntry : dataEntries) {
			if (entityCache.getResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
						DataEntryImpl.class, dataEntry.getPrimaryKey()) == null) {
				cacheResult(dataEntry);
			}
			else {
				dataEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all data entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DataEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DataEntry dataEntry) {
		entityCache.removeResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryImpl.class, dataEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DataEntry> dataEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DataEntry dataEntry : dataEntries) {
			entityCache.removeResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
				DataEntryImpl.class, dataEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data entry with the primary key. Does not add the data entry to the database.
	 *
	 * @param entryId the primary key for the new data entry
	 * @return the new data entry
	 */
	@Override
	public DataEntry create(long entryId) {
		DataEntry dataEntry = new DataEntryImpl();

		dataEntry.setNew(true);
		dataEntry.setPrimaryKey(entryId);

		dataEntry.setCompanyId(companyProvider.getCompanyId());

		return dataEntry;
	}

	/**
	 * Removes the data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the data entry
	 * @return the data entry that was removed
	 * @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry remove(long entryId) throws NoSuchDataEntryException {
		return remove((Serializable)entryId);
	}

	/**
	 * Removes the data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data entry
	 * @return the data entry that was removed
	 * @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry remove(Serializable primaryKey)
		throws NoSuchDataEntryException {
		Session session = null;

		try {
			session = openSession();

			DataEntry dataEntry = (DataEntry)session.get(DataEntryImpl.class,
					primaryKey);

			if (dataEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataEntry);
		}
		catch (NoSuchDataEntryException nsee) {
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
	protected DataEntry removeImpl(DataEntry dataEntry) {
		dataEntry = toUnwrappedModel(dataEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataEntry)) {
				dataEntry = (DataEntry)session.get(DataEntryImpl.class,
						dataEntry.getPrimaryKeyObj());
			}

			if (dataEntry != null) {
				session.delete(dataEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataEntry != null) {
			clearCache(dataEntry);
		}

		return dataEntry;
	}

	@Override
	public DataEntry updateImpl(DataEntry dataEntry) {
		dataEntry = toUnwrappedModel(dataEntry);

		boolean isNew = dataEntry.isNew();

		DataEntryModelImpl dataEntryModelImpl = (DataEntryModelImpl)dataEntry;

		Session session = null;

		try {
			session = openSession();

			if (dataEntry.isNew()) {
				session.save(dataEntry);

				dataEntry.setNew(false);
			}
			else {
				dataEntry = (DataEntry)session.merge(dataEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DataEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { dataEntryModelImpl.getCollectionId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COLLECTIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((dataEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataEntryModelImpl.getOriginalCollectionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COLLECTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID,
					args);

				args = new Object[] { dataEntryModelImpl.getCollectionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COLLECTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COLLECTIONID,
					args);
			}
		}

		entityCache.putResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
			DataEntryImpl.class, dataEntry.getPrimaryKey(), dataEntry, false);

		dataEntry.resetOriginalValues();

		return dataEntry;
	}

	protected DataEntry toUnwrappedModel(DataEntry dataEntry) {
		if (dataEntry instanceof DataEntryImpl) {
			return dataEntry;
		}

		DataEntryImpl dataEntryImpl = new DataEntryImpl();

		dataEntryImpl.setNew(dataEntry.isNew());
		dataEntryImpl.setPrimaryKey(dataEntry.getPrimaryKey());

		dataEntryImpl.setEntryId(dataEntry.getEntryId());
		dataEntryImpl.setCollectionId(dataEntry.getCollectionId());
		dataEntryImpl.setGroupId(dataEntry.getGroupId());
		dataEntryImpl.setCompanyId(dataEntry.getCompanyId());
		dataEntryImpl.setUserId(dataEntry.getUserId());
		dataEntryImpl.setCreateDate(dataEntry.getCreateDate());
		dataEntryImpl.setComments(dataEntry.getComments());

		return dataEntryImpl;
	}

	/**
	 * Returns the data entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data entry
	 * @return the data entry
	 * @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDataEntryException {
		DataEntry dataEntry = fetchByPrimaryKey(primaryKey);

		if (dataEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataEntry;
	}

	/**
	 * Returns the data entry with the primary key or throws a {@link NoSuchDataEntryException} if it could not be found.
	 *
	 * @param entryId the primary key of the data entry
	 * @return the data entry
	 * @throws NoSuchDataEntryException if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry findByPrimaryKey(long entryId)
		throws NoSuchDataEntryException {
		return findByPrimaryKey((Serializable)entryId);
	}

	/**
	 * Returns the data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data entry
	 * @return the data entry, or <code>null</code> if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
				DataEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DataEntry dataEntry = (DataEntry)serializable;

		if (dataEntry == null) {
			Session session = null;

			try {
				session = openSession();

				dataEntry = (DataEntry)session.get(DataEntryImpl.class,
						primaryKey);

				if (dataEntry != null) {
					cacheResult(dataEntry);
				}
				else {
					entityCache.putResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
						DataEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
					DataEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataEntry;
	}

	/**
	 * Returns the data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the data entry
	 * @return the data entry, or <code>null</code> if a data entry with the primary key could not be found
	 */
	@Override
	public DataEntry fetchByPrimaryKey(long entryId) {
		return fetchByPrimaryKey((Serializable)entryId);
	}

	@Override
	public Map<Serializable, DataEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DataEntry> map = new HashMap<Serializable, DataEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DataEntry dataEntry = fetchByPrimaryKey(primaryKey);

			if (dataEntry != null) {
				map.put(primaryKey, dataEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
					DataEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DataEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATAENTRY_WHERE_PKS_IN);

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

			for (DataEntry dataEntry : (List<DataEntry>)q.list()) {
				map.put(dataEntry.getPrimaryKeyObj(), dataEntry);

				cacheResult(dataEntry);

				uncachedPrimaryKeys.remove(dataEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DataEntryModelImpl.ENTITY_CACHE_ENABLED,
					DataEntryImpl.class, primaryKey, nullModel);
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
	 * Returns all the data entries.
	 *
	 * @return the data entries
	 */
	@Override
	public List<DataEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @return the range of data entries
	 */
	@Override
	public List<DataEntry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of data entries
	 */
	@Override
	public List<DataEntry> findAll(int start, int end,
		OrderByComparator<DataEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data entries
	 * @param end the upper bound of the range of data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of data entries
	 */
	@Override
	public List<DataEntry> findAll(int start, int end,
		OrderByComparator<DataEntry> orderByComparator,
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

		List<DataEntry> list = null;

		if (retrieveFromCache) {
			list = (List<DataEntry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATAENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATAENTRY;

				if (pagination) {
					sql = sql.concat(DataEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DataEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataEntry>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the data entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DataEntry dataEntry : findAll()) {
			remove(dataEntry);
		}
	}

	/**
	 * Returns the number of data entries.
	 *
	 * @return the number of data entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATAENTRY);

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
		return DataEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DataEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATAENTRY = "SELECT dataEntry FROM DataEntry dataEntry";
	private static final String _SQL_SELECT_DATAENTRY_WHERE_PKS_IN = "SELECT dataEntry FROM DataEntry dataEntry WHERE entryId IN (";
	private static final String _SQL_SELECT_DATAENTRY_WHERE = "SELECT dataEntry FROM DataEntry dataEntry WHERE ";
	private static final String _SQL_COUNT_DATAENTRY = "SELECT COUNT(dataEntry) FROM DataEntry dataEntry";
	private static final String _SQL_COUNT_DATAENTRY_WHERE = "SELECT COUNT(dataEntry) FROM DataEntry dataEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DataEntry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DataEntryPersistenceImpl.class);
}