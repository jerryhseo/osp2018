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

import com.kisti.osp.spyglass.exception.NoSuchScienceAppManagerException;
import com.kisti.osp.spyglass.model.ScienceAppManager;
import com.kisti.osp.spyglass.model.impl.ScienceAppManagerImpl;
import com.kisti.osp.spyglass.model.impl.ScienceAppManagerModelImpl;
import com.kisti.osp.spyglass.service.persistence.ScienceAppManagerPersistence;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the science app manager service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppManagerPersistence
 * @see com.kisti.osp.spyglass.service.persistence.ScienceAppManagerUtil
 * @generated
 */
@ProviderType
public class ScienceAppManagerPersistenceImpl extends BasePersistenceImpl<ScienceAppManager>
	implements ScienceAppManagerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ScienceAppManagerUtil} to access the science app manager persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ScienceAppManagerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAppId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAppId",
			new String[] { Long.class.getName() },
			ScienceAppManagerModelImpl.SCIENCEAPPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAppId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the science app managers where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @return the matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByAppId(long scienceAppId) {
		return findByAppId(scienceAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the science app managers where scienceAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param scienceAppId the science app ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @return the range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByAppId(long scienceAppId, int start,
		int end) {
		return findByAppId(scienceAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app managers where scienceAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param scienceAppId the science app ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByAppId(long scienceAppId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator) {
		return findByAppId(scienceAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app managers where scienceAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param scienceAppId the science app ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByAppId(long scienceAppId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID;
			finderArgs = new Object[] { scienceAppId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPID;
			finderArgs = new Object[] {
					scienceAppId,
					
					start, end, orderByComparator
				};
		}

		List<ScienceAppManager> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppManager>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ScienceAppManager scienceAppManager : list) {
					if ((scienceAppId != scienceAppManager.getScienceAppId())) {
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

			query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_APPID_SCIENCEAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(scienceAppId);

				if (!pagination) {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
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
	 * Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByAppId_First(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByAppId_First(scienceAppId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("scienceAppId=");
		msg.append(scienceAppId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the first science app manager in the ordered set where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByAppId_First(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		List<ScienceAppManager> list = findByAppId(scienceAppId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByAppId_Last(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByAppId_Last(scienceAppId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("scienceAppId=");
		msg.append(scienceAppId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the last science app manager in the ordered set where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByAppId_Last(long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		int count = countByAppId(scienceAppId);

		if (count == 0) {
			return null;
		}

		List<ScienceAppManager> list = findByAppId(scienceAppId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the science app managers before and after the current science app manager in the ordered set where scienceAppId = &#63;.
	 *
	 * @param scienceAppManagerId the primary key of the current science app manager
	 * @param scienceAppId the science app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app manager
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager[] findByAppId_PrevAndNext(
		long scienceAppManagerId, long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = findByPrimaryKey(scienceAppManagerId);

		Session session = null;

		try {
			session = openSession();

			ScienceAppManager[] array = new ScienceAppManagerImpl[3];

			array[0] = getByAppId_PrevAndNext(session, scienceAppManager,
					scienceAppId, orderByComparator, true);

			array[1] = scienceAppManager;

			array[2] = getByAppId_PrevAndNext(session, scienceAppManager,
					scienceAppId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ScienceAppManager getByAppId_PrevAndNext(Session session,
		ScienceAppManager scienceAppManager, long scienceAppId,
		OrderByComparator<ScienceAppManager> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

		query.append(_FINDER_COLUMN_APPID_SCIENCEAPPID_2);

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
			query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(scienceAppId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(scienceAppManager);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ScienceAppManager> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the science app managers where scienceAppId = &#63; from the database.
	 *
	 * @param scienceAppId the science app ID
	 */
	@Override
	public void removeByAppId(long scienceAppId) {
		for (ScienceAppManager scienceAppManager : findByAppId(scienceAppId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(scienceAppManager);
		}
	}

	/**
	 * Returns the number of science app managers where scienceAppId = &#63;.
	 *
	 * @param scienceAppId the science app ID
	 * @return the number of matching science app managers
	 */
	@Override
	public int countByAppId(long scienceAppId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPID;

		Object[] finderArgs = new Object[] { scienceAppId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_APPID_SCIENCEAPPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(scienceAppId);

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

	private static final String _FINDER_COLUMN_APPID_SCIENCEAPPID_2 = "scienceAppManager.scienceAppId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERID =
		new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByManagerId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID =
		new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByManagerId",
			new String[] { Long.class.getName() },
			ScienceAppManagerModelImpl.MANAGERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MANAGERID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByManagerId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the science app managers where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByManagerId(long managerId) {
		return findByManagerId(managerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the science app managers where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @return the range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByManagerId(long managerId, int start,
		int end) {
		return findByManagerId(managerId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app managers where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByManagerId(long managerId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator) {
		return findByManagerId(managerId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app managers where managerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param managerId the manager ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByManagerId(long managerId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID;
			finderArgs = new Object[] { managerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MANAGERID;
			finderArgs = new Object[] { managerId, start, end, orderByComparator };
		}

		List<ScienceAppManager> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppManager>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ScienceAppManager scienceAppManager : list) {
					if ((managerId != scienceAppManager.getManagerId())) {
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

			query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

				if (!pagination) {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
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
	 * Returns the first science app manager in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByManagerId_First(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByManagerId_First(managerId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the first science app manager in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByManagerId_First(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		List<ScienceAppManager> list = findByManagerId(managerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last science app manager in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByManagerId_Last(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByManagerId_Last(managerId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("managerId=");
		msg.append(managerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the last science app manager in the ordered set where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByManagerId_Last(long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		int count = countByManagerId(managerId);

		if (count == 0) {
			return null;
		}

		List<ScienceAppManager> list = findByManagerId(managerId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the science app managers before and after the current science app manager in the ordered set where managerId = &#63;.
	 *
	 * @param scienceAppManagerId the primary key of the current science app manager
	 * @param managerId the manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app manager
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager[] findByManagerId_PrevAndNext(
		long scienceAppManagerId, long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = findByPrimaryKey(scienceAppManagerId);

		Session session = null;

		try {
			session = openSession();

			ScienceAppManager[] array = new ScienceAppManagerImpl[3];

			array[0] = getByManagerId_PrevAndNext(session, scienceAppManager,
					managerId, orderByComparator, true);

			array[1] = scienceAppManager;

			array[2] = getByManagerId_PrevAndNext(session, scienceAppManager,
					managerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ScienceAppManager getByManagerId_PrevAndNext(Session session,
		ScienceAppManager scienceAppManager, long managerId,
		OrderByComparator<ScienceAppManager> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

		query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

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
			query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(managerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(scienceAppManager);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ScienceAppManager> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the science app managers where managerId = &#63; from the database.
	 *
	 * @param managerId the manager ID
	 */
	@Override
	public void removeByManagerId(long managerId) {
		for (ScienceAppManager scienceAppManager : findByManagerId(managerId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(scienceAppManager);
		}
	}

	/**
	 * Returns the number of science app managers where managerId = &#63;.
	 *
	 * @param managerId the manager ID
	 * @return the number of matching science app managers
	 */
	@Override
	public int countByManagerId(long managerId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MANAGERID;

		Object[] finderArgs = new Object[] { managerId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_MANAGERID_MANAGERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(managerId);

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

	private static final String _FINDER_COLUMN_MANAGERID_MANAGERID_2 = "scienceAppManager.managerId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED,
			ScienceAppManagerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ScienceAppManagerModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the science app managers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app managers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @return the range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app managers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByUserId(long userId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app managers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching science app managers
	 */
	@Override
	public List<ScienceAppManager> findByUserId(long userId, int start,
		int end, OrderByComparator<ScienceAppManager> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<ScienceAppManager> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppManager>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ScienceAppManager scienceAppManager : list) {
					if ((userId != scienceAppManager.getUserId())) {
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

			query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
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
	 * Returns the first science app manager in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByUserId_First(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByUserId_First(userId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the first science app manager in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByUserId_First(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		List<ScienceAppManager> list = findByUserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last science app manager in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager
	 * @throws NoSuchScienceAppManagerException if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager findByUserId_Last(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByUserId_Last(userId,
				orderByComparator);

		if (scienceAppManager != null) {
			return scienceAppManager;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchScienceAppManagerException(msg.toString());
	}

	/**
	 * Returns the last science app manager in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app manager, or <code>null</code> if a matching science app manager could not be found
	 */
	@Override
	public ScienceAppManager fetchByUserId_Last(long userId,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ScienceAppManager> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the science app managers before and after the current science app manager in the ordered set where userId = &#63;.
	 *
	 * @param scienceAppManagerId the primary key of the current science app manager
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app manager
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager[] findByUserId_PrevAndNext(
		long scienceAppManagerId, long userId,
		OrderByComparator<ScienceAppManager> orderByComparator)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = findByPrimaryKey(scienceAppManagerId);

		Session session = null;

		try {
			session = openSession();

			ScienceAppManager[] array = new ScienceAppManagerImpl[3];

			array[0] = getByUserId_PrevAndNext(session, scienceAppManager,
					userId, orderByComparator, true);

			array[1] = scienceAppManager;

			array[2] = getByUserId_PrevAndNext(session, scienceAppManager,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ScienceAppManager getByUserId_PrevAndNext(Session session,
		ScienceAppManager scienceAppManager, long userId,
		OrderByComparator<ScienceAppManager> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(scienceAppManager);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ScienceAppManager> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the science app managers where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (ScienceAppManager scienceAppManager : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(scienceAppManager);
		}
	}

	/**
	 * Returns the number of science app managers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching science app managers
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SCIENCEAPPMANAGER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "scienceAppManager.userId = ?";

	public ScienceAppManagerPersistenceImpl() {
		setModelClass(ScienceAppManager.class);
	}

	/**
	 * Caches the science app manager in the entity cache if it is enabled.
	 *
	 * @param scienceAppManager the science app manager
	 */
	@Override
	public void cacheResult(ScienceAppManager scienceAppManager) {
		entityCache.putResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerImpl.class, scienceAppManager.getPrimaryKey(),
			scienceAppManager);

		scienceAppManager.resetOriginalValues();
	}

	/**
	 * Caches the science app managers in the entity cache if it is enabled.
	 *
	 * @param scienceAppManagers the science app managers
	 */
	@Override
	public void cacheResult(List<ScienceAppManager> scienceAppManagers) {
		for (ScienceAppManager scienceAppManager : scienceAppManagers) {
			if (entityCache.getResult(
						ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppManagerImpl.class,
						scienceAppManager.getPrimaryKey()) == null) {
				cacheResult(scienceAppManager);
			}
			else {
				scienceAppManager.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all science app managers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ScienceAppManagerImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the science app manager.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ScienceAppManager scienceAppManager) {
		entityCache.removeResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerImpl.class, scienceAppManager.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ScienceAppManager> scienceAppManagers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ScienceAppManager scienceAppManager : scienceAppManagers) {
			entityCache.removeResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppManagerImpl.class, scienceAppManager.getPrimaryKey());
		}
	}

	/**
	 * Creates a new science app manager with the primary key. Does not add the science app manager to the database.
	 *
	 * @param scienceAppManagerId the primary key for the new science app manager
	 * @return the new science app manager
	 */
	@Override
	public ScienceAppManager create(long scienceAppManagerId) {
		ScienceAppManager scienceAppManager = new ScienceAppManagerImpl();

		scienceAppManager.setNew(true);
		scienceAppManager.setPrimaryKey(scienceAppManagerId);

		return scienceAppManager;
	}

	/**
	 * Removes the science app manager with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppManagerId the primary key of the science app manager
	 * @return the science app manager that was removed
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager remove(long scienceAppManagerId)
		throws NoSuchScienceAppManagerException {
		return remove((Serializable)scienceAppManagerId);
	}

	/**
	 * Removes the science app manager with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the science app manager
	 * @return the science app manager that was removed
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager remove(Serializable primaryKey)
		throws NoSuchScienceAppManagerException {
		Session session = null;

		try {
			session = openSession();

			ScienceAppManager scienceAppManager = (ScienceAppManager)session.get(ScienceAppManagerImpl.class,
					primaryKey);

			if (scienceAppManager == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchScienceAppManagerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(scienceAppManager);
		}
		catch (NoSuchScienceAppManagerException nsee) {
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
	protected ScienceAppManager removeImpl(ScienceAppManager scienceAppManager) {
		scienceAppManager = toUnwrappedModel(scienceAppManager);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(scienceAppManager)) {
				scienceAppManager = (ScienceAppManager)session.get(ScienceAppManagerImpl.class,
						scienceAppManager.getPrimaryKeyObj());
			}

			if (scienceAppManager != null) {
				session.delete(scienceAppManager);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (scienceAppManager != null) {
			clearCache(scienceAppManager);
		}

		return scienceAppManager;
	}

	@Override
	public ScienceAppManager updateImpl(ScienceAppManager scienceAppManager) {
		scienceAppManager = toUnwrappedModel(scienceAppManager);

		boolean isNew = scienceAppManager.isNew();

		ScienceAppManagerModelImpl scienceAppManagerModelImpl = (ScienceAppManagerModelImpl)scienceAppManager;

		Session session = null;

		try {
			session = openSession();

			if (scienceAppManager.isNew()) {
				session.save(scienceAppManager);

				scienceAppManager.setNew(false);
			}
			else {
				scienceAppManager = (ScienceAppManager)session.merge(scienceAppManager);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ScienceAppManagerModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					scienceAppManagerModelImpl.getScienceAppId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_APPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID,
				args);

			args = new Object[] { scienceAppManagerModelImpl.getManagerId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID,
				args);

			args = new Object[] { scienceAppManagerModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((scienceAppManagerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						scienceAppManagerModelImpl.getOriginalScienceAppId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID,
					args);

				args = new Object[] { scienceAppManagerModelImpl.getScienceAppId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPID,
					args);
			}

			if ((scienceAppManagerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						scienceAppManagerModelImpl.getOriginalManagerId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID,
					args);

				args = new Object[] { scienceAppManagerModelImpl.getManagerId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MANAGERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MANAGERID,
					args);
			}

			if ((scienceAppManagerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						scienceAppManagerModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { scienceAppManagerModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		entityCache.putResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
			ScienceAppManagerImpl.class, scienceAppManager.getPrimaryKey(),
			scienceAppManager, false);

		scienceAppManager.resetOriginalValues();

		return scienceAppManager;
	}

	protected ScienceAppManager toUnwrappedModel(
		ScienceAppManager scienceAppManager) {
		if (scienceAppManager instanceof ScienceAppManagerImpl) {
			return scienceAppManager;
		}

		ScienceAppManagerImpl scienceAppManagerImpl = new ScienceAppManagerImpl();

		scienceAppManagerImpl.setNew(scienceAppManager.isNew());
		scienceAppManagerImpl.setPrimaryKey(scienceAppManager.getPrimaryKey());

		scienceAppManagerImpl.setScienceAppManagerId(scienceAppManager.getScienceAppManagerId());
		scienceAppManagerImpl.setUserId(scienceAppManager.getUserId());
		scienceAppManagerImpl.setCreateDate(scienceAppManager.getCreateDate());
		scienceAppManagerImpl.setScienceAppId(scienceAppManager.getScienceAppId());
		scienceAppManagerImpl.setManagerId(scienceAppManager.getManagerId());

		return scienceAppManagerImpl;
	}

	/**
	 * Returns the science app manager with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app manager
	 * @return the science app manager
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager findByPrimaryKey(Serializable primaryKey)
		throws NoSuchScienceAppManagerException {
		ScienceAppManager scienceAppManager = fetchByPrimaryKey(primaryKey);

		if (scienceAppManager == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchScienceAppManagerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return scienceAppManager;
	}

	/**
	 * Returns the science app manager with the primary key or throws a {@link NoSuchScienceAppManagerException} if it could not be found.
	 *
	 * @param scienceAppManagerId the primary key of the science app manager
	 * @return the science app manager
	 * @throws NoSuchScienceAppManagerException if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager findByPrimaryKey(long scienceAppManagerId)
		throws NoSuchScienceAppManagerException {
		return findByPrimaryKey((Serializable)scienceAppManagerId);
	}

	/**
	 * Returns the science app manager with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the science app manager
	 * @return the science app manager, or <code>null</code> if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
				ScienceAppManagerImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ScienceAppManager scienceAppManager = (ScienceAppManager)serializable;

		if (scienceAppManager == null) {
			Session session = null;

			try {
				session = openSession();

				scienceAppManager = (ScienceAppManager)session.get(ScienceAppManagerImpl.class,
						primaryKey);

				if (scienceAppManager != null) {
					cacheResult(scienceAppManager);
				}
				else {
					entityCache.putResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
						ScienceAppManagerImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppManagerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return scienceAppManager;
	}

	/**
	 * Returns the science app manager with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppManagerId the primary key of the science app manager
	 * @return the science app manager, or <code>null</code> if a science app manager with the primary key could not be found
	 */
	@Override
	public ScienceAppManager fetchByPrimaryKey(long scienceAppManagerId) {
		return fetchByPrimaryKey((Serializable)scienceAppManagerId);
	}

	@Override
	public Map<Serializable, ScienceAppManager> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ScienceAppManager> map = new HashMap<Serializable, ScienceAppManager>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ScienceAppManager scienceAppManager = fetchByPrimaryKey(primaryKey);

			if (scienceAppManager != null) {
				map.put(primaryKey, scienceAppManager);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppManagerImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ScienceAppManager)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SCIENCEAPPMANAGER_WHERE_PKS_IN);

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

			for (ScienceAppManager scienceAppManager : (List<ScienceAppManager>)q.list()) {
				map.put(scienceAppManager.getPrimaryKeyObj(), scienceAppManager);

				cacheResult(scienceAppManager);

				uncachedPrimaryKeys.remove(scienceAppManager.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ScienceAppManagerModelImpl.ENTITY_CACHE_ENABLED,
					ScienceAppManagerImpl.class, primaryKey, nullModel);
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
	 * Returns all the science app managers.
	 *
	 * @return the science app managers
	 */
	@Override
	public List<ScienceAppManager> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the science app managers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @return the range of science app managers
	 */
	@Override
	public List<ScienceAppManager> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the science app managers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science app managers
	 */
	@Override
	public List<ScienceAppManager> findAll(int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the science app managers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ScienceAppManagerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of science app managers
	 * @param end the upper bound of the range of science app managers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of science app managers
	 */
	@Override
	public List<ScienceAppManager> findAll(int start, int end,
		OrderByComparator<ScienceAppManager> orderByComparator,
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

		List<ScienceAppManager> list = null;

		if (retrieveFromCache) {
			list = (List<ScienceAppManager>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SCIENCEAPPMANAGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SCIENCEAPPMANAGER;

				if (pagination) {
					sql = sql.concat(ScienceAppManagerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ScienceAppManager>)QueryUtil.list(q,
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
	 * Removes all the science app managers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ScienceAppManager scienceAppManager : findAll()) {
			remove(scienceAppManager);
		}
	}

	/**
	 * Returns the number of science app managers.
	 *
	 * @return the number of science app managers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SCIENCEAPPMANAGER);

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
		return ScienceAppManagerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the science app manager persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ScienceAppManagerImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SCIENCEAPPMANAGER = "SELECT scienceAppManager FROM ScienceAppManager scienceAppManager";
	private static final String _SQL_SELECT_SCIENCEAPPMANAGER_WHERE_PKS_IN = "SELECT scienceAppManager FROM ScienceAppManager scienceAppManager WHERE scienceAppManagerId IN (";
	private static final String _SQL_SELECT_SCIENCEAPPMANAGER_WHERE = "SELECT scienceAppManager FROM ScienceAppManager scienceAppManager WHERE ";
	private static final String _SQL_COUNT_SCIENCEAPPMANAGER = "SELECT COUNT(scienceAppManager) FROM ScienceAppManager scienceAppManager";
	private static final String _SQL_COUNT_SCIENCEAPPMANAGER_WHERE = "SELECT COUNT(scienceAppManager) FROM ScienceAppManager scienceAppManager WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "scienceAppManager.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ScienceAppManager exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ScienceAppManager exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ScienceAppManagerPersistenceImpl.class);
}