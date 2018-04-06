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

import OSPIcecap.exception.NoSuchDataTypeAnalyzerLinkException;

import OSPIcecap.model.DataTypeAnalyzerLink;

import OSPIcecap.model.impl.DataTypeAnalyzerLinkImpl;
import OSPIcecap.model.impl.DataTypeAnalyzerLinkModelImpl;

import OSPIcecap.service.persistence.DataTypeAnalyzerLinkPK;
import OSPIcecap.service.persistence.DataTypeAnalyzerLinkPersistence;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the data type analyzer link service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see DataTypeAnalyzerLinkPersistence
 * @see OSPIcecap.service.persistence.DataTypeAnalyzerLinkUtil
 * @generated
 */
@ProviderType
public class DataTypeAnalyzerLinkPersistenceImpl extends BasePersistenceImpl<DataTypeAnalyzerLink>
	implements DataTypeAnalyzerLinkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DataTypeAnalyzerLinkUtil} to access the data type analyzer link persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DataTypeAnalyzerLinkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ANALYZER = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAnalyzer",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER =
		new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAnalyzer",
			new String[] { Long.class.getName() },
			DataTypeAnalyzerLinkModelImpl.ANALYZERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ANALYZER = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAnalyzer",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the data type analyzer links where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @return the matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId) {
		return findByAnalyzer(analyzerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the data type analyzer links where analyzerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param analyzerId the analyzer ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @return the range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end) {
		return findByAnalyzer(analyzerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links where analyzerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param analyzerId the analyzer ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return findByAnalyzer(analyzerId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links where analyzerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param analyzerId the analyzer ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByAnalyzer(long analyzerId,
		int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER;
			finderArgs = new Object[] { analyzerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ANALYZER;
			finderArgs = new Object[] { analyzerId, start, end, orderByComparator };
		}

		List<DataTypeAnalyzerLink> list = null;

		if (retrieveFromCache) {
			list = (List<DataTypeAnalyzerLink>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DataTypeAnalyzerLink dataTypeAnalyzerLink : list) {
					if ((analyzerId != dataTypeAnalyzerLink.getAnalyzerId())) {
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

			query.append(_SQL_SELECT_DATATYPEANALYZERLINK_WHERE);

			query.append(_FINDER_COLUMN_ANALYZER_ANALYZERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DataTypeAnalyzerLinkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(analyzerId);

				if (!pagination) {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
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
	 * Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByAnalyzer_First(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByAnalyzer_First(analyzerId,
				orderByComparator);

		if (dataTypeAnalyzerLink != null) {
			return dataTypeAnalyzerLink;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("analyzerId=");
		msg.append(analyzerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataTypeAnalyzerLinkException(msg.toString());
	}

	/**
	 * Returns the first data type analyzer link in the ordered set where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByAnalyzer_First(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		List<DataTypeAnalyzerLink> list = findByAnalyzer(analyzerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByAnalyzer_Last(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByAnalyzer_Last(analyzerId,
				orderByComparator);

		if (dataTypeAnalyzerLink != null) {
			return dataTypeAnalyzerLink;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("analyzerId=");
		msg.append(analyzerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataTypeAnalyzerLinkException(msg.toString());
	}

	/**
	 * Returns the last data type analyzer link in the ordered set where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByAnalyzer_Last(long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		int count = countByAnalyzer(analyzerId);

		if (count == 0) {
			return null;
		}

		List<DataTypeAnalyzerLink> list = findByAnalyzer(analyzerId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where analyzerId = &#63;.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	 * @param analyzerId the analyzer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink[] findByAnalyzer_PrevAndNext(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK, long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = findByPrimaryKey(dataTypeAnalyzerLinkPK);

		Session session = null;

		try {
			session = openSession();

			DataTypeAnalyzerLink[] array = new DataTypeAnalyzerLinkImpl[3];

			array[0] = getByAnalyzer_PrevAndNext(session, dataTypeAnalyzerLink,
					analyzerId, orderByComparator, true);

			array[1] = dataTypeAnalyzerLink;

			array[2] = getByAnalyzer_PrevAndNext(session, dataTypeAnalyzerLink,
					analyzerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DataTypeAnalyzerLink getByAnalyzer_PrevAndNext(Session session,
		DataTypeAnalyzerLink dataTypeAnalyzerLink, long analyzerId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATATYPEANALYZERLINK_WHERE);

		query.append(_FINDER_COLUMN_ANALYZER_ANALYZERID_2);

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
			query.append(DataTypeAnalyzerLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(analyzerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataTypeAnalyzerLink);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DataTypeAnalyzerLink> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the data type analyzer links where analyzerId = &#63; from the database.
	 *
	 * @param analyzerId the analyzer ID
	 */
	@Override
	public void removeByAnalyzer(long analyzerId) {
		for (DataTypeAnalyzerLink dataTypeAnalyzerLink : findByAnalyzer(
				analyzerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dataTypeAnalyzerLink);
		}
	}

	/**
	 * Returns the number of data type analyzer links where analyzerId = &#63;.
	 *
	 * @param analyzerId the analyzer ID
	 * @return the number of matching data type analyzer links
	 */
	@Override
	public int countByAnalyzer(long analyzerId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ANALYZER;

		Object[] finderArgs = new Object[] { analyzerId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATATYPEANALYZERLINK_WHERE);

			query.append(_FINDER_COLUMN_ANALYZER_ANALYZERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(analyzerId);

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

	private static final String _FINDER_COLUMN_ANALYZER_ANALYZERID_2 = "dataTypeAnalyzerLink.id.analyzerId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTypeID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID =
		new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTypeID",
			new String[] { Long.class.getName() },
			DataTypeAnalyzerLinkModelImpl.TYPEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPEID = new FinderPath(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTypeID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the data type analyzer links where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByTypeID(long typeId) {
		return findByTypeID(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data type analyzer links where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @return the range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByTypeID(long typeId, int start,
		int end) {
		return findByTypeID(typeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByTypeID(long typeId, int start,
		int end, OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return findByTypeID(typeId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param typeId the type ID
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findByTypeID(long typeId, int start,
		int end, OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] { typeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID;
			finderArgs = new Object[] { typeId, start, end, orderByComparator };
		}

		List<DataTypeAnalyzerLink> list = null;

		if (retrieveFromCache) {
			list = (List<DataTypeAnalyzerLink>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DataTypeAnalyzerLink dataTypeAnalyzerLink : list) {
					if ((typeId != dataTypeAnalyzerLink.getTypeId())) {
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

			query.append(_SQL_SELECT_DATATYPEANALYZERLINK_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DataTypeAnalyzerLinkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (!pagination) {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
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
	 * Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByTypeID_First(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByTypeID_First(typeId,
				orderByComparator);

		if (dataTypeAnalyzerLink != null) {
			return dataTypeAnalyzerLink;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataTypeAnalyzerLinkException(msg.toString());
	}

	/**
	 * Returns the first data type analyzer link in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByTypeID_First(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		List<DataTypeAnalyzerLink> list = findByTypeID(typeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByTypeID_Last(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByTypeID_Last(typeId,
				orderByComparator);

		if (dataTypeAnalyzerLink != null) {
			return dataTypeAnalyzerLink;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("typeId=");
		msg.append(typeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDataTypeAnalyzerLinkException(msg.toString());
	}

	/**
	 * Returns the last data type analyzer link in the ordered set where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching data type analyzer link, or <code>null</code> if a matching data type analyzer link could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByTypeID_Last(long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		int count = countByTypeID(typeId);

		if (count == 0) {
			return null;
		}

		List<DataTypeAnalyzerLink> list = findByTypeID(typeId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the data type analyzer links before and after the current data type analyzer link in the ordered set where typeId = &#63;.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key of the current data type analyzer link
	 * @param typeId the type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink[] findByTypeID_PrevAndNext(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK, long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = findByPrimaryKey(dataTypeAnalyzerLinkPK);

		Session session = null;

		try {
			session = openSession();

			DataTypeAnalyzerLink[] array = new DataTypeAnalyzerLinkImpl[3];

			array[0] = getByTypeID_PrevAndNext(session, dataTypeAnalyzerLink,
					typeId, orderByComparator, true);

			array[1] = dataTypeAnalyzerLink;

			array[2] = getByTypeID_PrevAndNext(session, dataTypeAnalyzerLink,
					typeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DataTypeAnalyzerLink getByTypeID_PrevAndNext(Session session,
		DataTypeAnalyzerLink dataTypeAnalyzerLink, long typeId,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATATYPEANALYZERLINK_WHERE);

		query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

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
			query.append(DataTypeAnalyzerLinkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dataTypeAnalyzerLink);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DataTypeAnalyzerLink> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the data type analyzer links where typeId = &#63; from the database.
	 *
	 * @param typeId the type ID
	 */
	@Override
	public void removeByTypeID(long typeId) {
		for (DataTypeAnalyzerLink dataTypeAnalyzerLink : findByTypeID(typeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dataTypeAnalyzerLink);
		}
	}

	/**
	 * Returns the number of data type analyzer links where typeId = &#63;.
	 *
	 * @param typeId the type ID
	 * @return the number of matching data type analyzer links
	 */
	@Override
	public int countByTypeID(long typeId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPEID;

		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DATATYPEANALYZERLINK_WHERE);

			query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

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

	private static final String _FINDER_COLUMN_TYPEID_TYPEID_2 = "dataTypeAnalyzerLink.typeId = ?";

	public DataTypeAnalyzerLinkPersistenceImpl() {
		setModelClass(DataTypeAnalyzerLink.class);
	}

	/**
	 * Caches the data type analyzer link in the entity cache if it is enabled.
	 *
	 * @param dataTypeAnalyzerLink the data type analyzer link
	 */
	@Override
	public void cacheResult(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		entityCache.putResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			dataTypeAnalyzerLink.getPrimaryKey(), dataTypeAnalyzerLink);

		dataTypeAnalyzerLink.resetOriginalValues();
	}

	/**
	 * Caches the data type analyzer links in the entity cache if it is enabled.
	 *
	 * @param dataTypeAnalyzerLinks the data type analyzer links
	 */
	@Override
	public void cacheResult(List<DataTypeAnalyzerLink> dataTypeAnalyzerLinks) {
		for (DataTypeAnalyzerLink dataTypeAnalyzerLink : dataTypeAnalyzerLinks) {
			if (entityCache.getResult(
						DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
						DataTypeAnalyzerLinkImpl.class,
						dataTypeAnalyzerLink.getPrimaryKey()) == null) {
				cacheResult(dataTypeAnalyzerLink);
			}
			else {
				dataTypeAnalyzerLink.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all data type analyzer links.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DataTypeAnalyzerLinkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data type analyzer link.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		entityCache.removeResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class, dataTypeAnalyzerLink.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DataTypeAnalyzerLink> dataTypeAnalyzerLinks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DataTypeAnalyzerLink dataTypeAnalyzerLink : dataTypeAnalyzerLinks) {
			entityCache.removeResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
				DataTypeAnalyzerLinkImpl.class,
				dataTypeAnalyzerLink.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data type analyzer link with the primary key. Does not add the data type analyzer link to the database.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key for the new data type analyzer link
	 * @return the new data type analyzer link
	 */
	@Override
	public DataTypeAnalyzerLink create(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = new DataTypeAnalyzerLinkImpl();

		dataTypeAnalyzerLink.setNew(true);
		dataTypeAnalyzerLink.setPrimaryKey(dataTypeAnalyzerLinkPK);

		return dataTypeAnalyzerLink;
	}

	/**
	 * Removes the data type analyzer link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	 * @return the data type analyzer link that was removed
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink remove(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws NoSuchDataTypeAnalyzerLinkException {
		return remove((Serializable)dataTypeAnalyzerLinkPK);
	}

	/**
	 * Removes the data type analyzer link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data type analyzer link
	 * @return the data type analyzer link that was removed
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink remove(Serializable primaryKey)
		throws NoSuchDataTypeAnalyzerLinkException {
		Session session = null;

		try {
			session = openSession();

			DataTypeAnalyzerLink dataTypeAnalyzerLink = (DataTypeAnalyzerLink)session.get(DataTypeAnalyzerLinkImpl.class,
					primaryKey);

			if (dataTypeAnalyzerLink == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDataTypeAnalyzerLinkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dataTypeAnalyzerLink);
		}
		catch (NoSuchDataTypeAnalyzerLinkException nsee) {
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
	protected DataTypeAnalyzerLink removeImpl(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		dataTypeAnalyzerLink = toUnwrappedModel(dataTypeAnalyzerLink);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dataTypeAnalyzerLink)) {
				dataTypeAnalyzerLink = (DataTypeAnalyzerLink)session.get(DataTypeAnalyzerLinkImpl.class,
						dataTypeAnalyzerLink.getPrimaryKeyObj());
			}

			if (dataTypeAnalyzerLink != null) {
				session.delete(dataTypeAnalyzerLink);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dataTypeAnalyzerLink != null) {
			clearCache(dataTypeAnalyzerLink);
		}

		return dataTypeAnalyzerLink;
	}

	@Override
	public DataTypeAnalyzerLink updateImpl(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		dataTypeAnalyzerLink = toUnwrappedModel(dataTypeAnalyzerLink);

		boolean isNew = dataTypeAnalyzerLink.isNew();

		DataTypeAnalyzerLinkModelImpl dataTypeAnalyzerLinkModelImpl = (DataTypeAnalyzerLinkModelImpl)dataTypeAnalyzerLink;

		Session session = null;

		try {
			session = openSession();

			if (dataTypeAnalyzerLink.isNew()) {
				session.save(dataTypeAnalyzerLink);

				dataTypeAnalyzerLink.setNew(false);
			}
			else {
				dataTypeAnalyzerLink = (DataTypeAnalyzerLink)session.merge(dataTypeAnalyzerLink);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DataTypeAnalyzerLinkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					dataTypeAnalyzerLinkModelImpl.getAnalyzerId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ANALYZER, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER,
				args);

			args = new Object[] { dataTypeAnalyzerLinkModelImpl.getTypeId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((dataTypeAnalyzerLinkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataTypeAnalyzerLinkModelImpl.getOriginalAnalyzerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ANALYZER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER,
					args);

				args = new Object[] {
						dataTypeAnalyzerLinkModelImpl.getAnalyzerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ANALYZER, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ANALYZER,
					args);
			}

			if ((dataTypeAnalyzerLinkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dataTypeAnalyzerLinkModelImpl.getOriginalTypeId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);

				args = new Object[] { dataTypeAnalyzerLinkModelImpl.getTypeId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
					args);
			}
		}

		entityCache.putResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
			DataTypeAnalyzerLinkImpl.class,
			dataTypeAnalyzerLink.getPrimaryKey(), dataTypeAnalyzerLink, false);

		dataTypeAnalyzerLink.resetOriginalValues();

		return dataTypeAnalyzerLink;
	}

	protected DataTypeAnalyzerLink toUnwrappedModel(
		DataTypeAnalyzerLink dataTypeAnalyzerLink) {
		if (dataTypeAnalyzerLink instanceof DataTypeAnalyzerLinkImpl) {
			return dataTypeAnalyzerLink;
		}

		DataTypeAnalyzerLinkImpl dataTypeAnalyzerLinkImpl = new DataTypeAnalyzerLinkImpl();

		dataTypeAnalyzerLinkImpl.setNew(dataTypeAnalyzerLink.isNew());
		dataTypeAnalyzerLinkImpl.setPrimaryKey(dataTypeAnalyzerLink.getPrimaryKey());

		dataTypeAnalyzerLinkImpl.setLinkId(dataTypeAnalyzerLink.getLinkId());
		dataTypeAnalyzerLinkImpl.setTypeId(dataTypeAnalyzerLink.getTypeId());
		dataTypeAnalyzerLinkImpl.setAnalyzerId(dataTypeAnalyzerLink.getAnalyzerId());

		return dataTypeAnalyzerLinkImpl;
	}

	/**
	 * Returns the data type analyzer link with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data type analyzer link
	 * @return the data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDataTypeAnalyzerLinkException {
		DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByPrimaryKey(primaryKey);

		if (dataTypeAnalyzerLink == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDataTypeAnalyzerLinkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dataTypeAnalyzerLink;
	}

	/**
	 * Returns the data type analyzer link with the primary key or throws a {@link NoSuchDataTypeAnalyzerLinkException} if it could not be found.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	 * @return the data type analyzer link
	 * @throws NoSuchDataTypeAnalyzerLinkException if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink findByPrimaryKey(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK)
		throws NoSuchDataTypeAnalyzerLinkException {
		return findByPrimaryKey((Serializable)dataTypeAnalyzerLinkPK);
	}

	/**
	 * Returns the data type analyzer link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data type analyzer link
	 * @return the data type analyzer link, or <code>null</code> if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
				DataTypeAnalyzerLinkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DataTypeAnalyzerLink dataTypeAnalyzerLink = (DataTypeAnalyzerLink)serializable;

		if (dataTypeAnalyzerLink == null) {
			Session session = null;

			try {
				session = openSession();

				dataTypeAnalyzerLink = (DataTypeAnalyzerLink)session.get(DataTypeAnalyzerLinkImpl.class,
						primaryKey);

				if (dataTypeAnalyzerLink != null) {
					cacheResult(dataTypeAnalyzerLink);
				}
				else {
					entityCache.putResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
						DataTypeAnalyzerLinkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DataTypeAnalyzerLinkModelImpl.ENTITY_CACHE_ENABLED,
					DataTypeAnalyzerLinkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dataTypeAnalyzerLink;
	}

	/**
	 * Returns the data type analyzer link with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dataTypeAnalyzerLinkPK the primary key of the data type analyzer link
	 * @return the data type analyzer link, or <code>null</code> if a data type analyzer link with the primary key could not be found
	 */
	@Override
	public DataTypeAnalyzerLink fetchByPrimaryKey(
		DataTypeAnalyzerLinkPK dataTypeAnalyzerLinkPK) {
		return fetchByPrimaryKey((Serializable)dataTypeAnalyzerLinkPK);
	}

	@Override
	public Map<Serializable, DataTypeAnalyzerLink> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DataTypeAnalyzerLink> map = new HashMap<Serializable, DataTypeAnalyzerLink>();

		for (Serializable primaryKey : primaryKeys) {
			DataTypeAnalyzerLink dataTypeAnalyzerLink = fetchByPrimaryKey(primaryKey);

			if (dataTypeAnalyzerLink != null) {
				map.put(primaryKey, dataTypeAnalyzerLink);
			}
		}

		return map;
	}

	/**
	 * Returns all the data type analyzer links.
	 *
	 * @return the data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the data type analyzer links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @return the range of data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findAll(int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the data type analyzer links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DataTypeAnalyzerLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of data type analyzer links
	 * @param end the upper bound of the range of data type analyzer links (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of data type analyzer links
	 */
	@Override
	public List<DataTypeAnalyzerLink> findAll(int start, int end,
		OrderByComparator<DataTypeAnalyzerLink> orderByComparator,
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

		List<DataTypeAnalyzerLink> list = null;

		if (retrieveFromCache) {
			list = (List<DataTypeAnalyzerLink>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATATYPEANALYZERLINK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATATYPEANALYZERLINK;

				if (pagination) {
					sql = sql.concat(DataTypeAnalyzerLinkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DataTypeAnalyzerLink>)QueryUtil.list(q,
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
	 * Removes all the data type analyzer links from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DataTypeAnalyzerLink dataTypeAnalyzerLink : findAll()) {
			remove(dataTypeAnalyzerLink);
		}
	}

	/**
	 * Returns the number of data type analyzer links.
	 *
	 * @return the number of data type analyzer links
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATATYPEANALYZERLINK);

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
		return DataTypeAnalyzerLinkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data type analyzer link persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DataTypeAnalyzerLinkImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DATATYPEANALYZERLINK = "SELECT dataTypeAnalyzerLink FROM DataTypeAnalyzerLink dataTypeAnalyzerLink";
	private static final String _SQL_SELECT_DATATYPEANALYZERLINK_WHERE = "SELECT dataTypeAnalyzerLink FROM DataTypeAnalyzerLink dataTypeAnalyzerLink WHERE ";
	private static final String _SQL_COUNT_DATATYPEANALYZERLINK = "SELECT COUNT(dataTypeAnalyzerLink) FROM DataTypeAnalyzerLink dataTypeAnalyzerLink";
	private static final String _SQL_COUNT_DATATYPEANALYZERLINK_WHERE = "SELECT COUNT(dataTypeAnalyzerLink) FROM DataTypeAnalyzerLink dataTypeAnalyzerLink WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dataTypeAnalyzerLink.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataTypeAnalyzerLink exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DataTypeAnalyzerLink exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DataTypeAnalyzerLinkPersistenceImpl.class);
}