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

package com.kisti.osp.zodiac.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.zodiac.exception.NoSuchSimulationException;
import com.kisti.osp.zodiac.model.Simulation;
import com.kisti.osp.zodiac.model.impl.SimulationImpl;
import com.kisti.osp.zodiac.model.impl.SimulationModelImpl;
import com.kisti.osp.zodiac.service.persistence.SimulationPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the simulation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see SimulationPersistence
 * @see com.kisti.osp.zodiac.service.persistence.SimulationUtil
 * @generated
 */
@ProviderType
public class SimulationPersistenceImpl extends BasePersistenceImpl<Simulation>
	implements SimulationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SimulationUtil} to access the simulation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SimulationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			SimulationModelImpl.UUID_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the simulations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid(String uuid, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid(String uuid, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if (!Objects.equals(uuid, simulation.getUuid())) {
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

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUuid_First(String uuid,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUuid_First(uuid, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUuid_First(String uuid,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUuid_Last(String uuid,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUuid_Last(uuid, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUuid_Last(String uuid,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where uuid = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByUuid_PrevAndNext(long simulationId, String uuid,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByUuid_PrevAndNext(session, simulation, uuid,
					orderByComparator, true);

			array[1] = simulation;

			array[2] = getByUuid_PrevAndNext(session, simulation, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByUuid_PrevAndNext(Session session,
		Simulation simulation, String uuid,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Simulation simulation : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching simulations
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "simulation.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "simulation.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(simulation.uuid IS NULL OR simulation.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			SimulationModelImpl.UUID_COLUMN_BITMASK |
			SimulationModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the simulation where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSimulationException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUUID_G(String uuid, long groupId)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUUID_G(uuid, groupId);

		if (simulation == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchSimulationException(msg.toString());
		}

		return simulation;
	}

	/**
	 * Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the simulation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Simulation) {
			Simulation simulation = (Simulation)result;

			if (!Objects.equals(uuid, simulation.getUuid()) ||
					(groupId != simulation.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Simulation> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Simulation simulation = list.get(0);

					result = simulation;

					cacheResult(simulation);

					if ((simulation.getUuid() == null) ||
							!simulation.getUuid().equals(uuid) ||
							(simulation.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, simulation);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Simulation)result;
		}
	}

	/**
	 * Removes the simulation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the simulation that was removed
	 */
	@Override
	public Simulation removeByUUID_G(String uuid, long groupId)
		throws NoSuchSimulationException {
		Simulation simulation = findByUUID_G(uuid, groupId);

		return remove(simulation);
	}

	/**
	 * Returns the number of simulations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching simulations
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "simulation.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "simulation.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(simulation.uuid IS NULL OR simulation.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "simulation.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			SimulationModelImpl.UUID_COLUMN_BITMASK |
			SimulationModelImpl.COMPANYID_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the simulations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Simulation> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if (!Objects.equals(uuid, simulation.getUuid()) ||
							(companyId != simulation.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByUuid_C_PrevAndNext(long simulationId,
		String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, simulation, uuid,
					companyId, orderByComparator, true);

			array[1] = simulation;

			array[2] = getByUuid_C_PrevAndNext(session, simulation, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByUuid_C_PrevAndNext(Session session,
		Simulation simulation, String uuid, long companyId,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Simulation simulation : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching simulations
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "simulation.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "simulation.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(simulation.uuid IS NULL OR simulation.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "simulation.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			SimulationModelImpl.USERID_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the simulations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByUserId(long userId) {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByUserId(long userId, int start, int end) {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUserId(long userId, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findByUserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByUserId(long userId, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
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

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((userId != simulation.getUserId())) {
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

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUserId_First(long userId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUserId_First(userId, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUserId_First(long userId,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByUserId_Last(long userId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByUserId_Last(userId, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByUserId_Last(long userId,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where userId = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByUserId_PrevAndNext(long simulationId,
		long userId, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByUserId_PrevAndNext(session, simulation, userId,
					orderByComparator, true);

			array[1] = simulation;

			array[2] = getByUserId_PrevAndNext(session, simulation, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByUserId_PrevAndNext(Session session,
		Simulation simulation, long userId,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByUserId(long userId) {
		for (Simulation simulation : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching simulations
	 */
	@Override
	public int countByUserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "simulation.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			SimulationModelImpl.GROUPID_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the simulations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((groupId != simulation.getGroupId())) {
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

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByGroupId_First(long groupId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByGroupId_First(groupId, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByGroupId_First(long groupId,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByGroupId_Last(long groupId,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByGroupId_Last(groupId, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByGroupId_Last(long groupId,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where groupId = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByGroupId_PrevAndNext(long simulationId,
		long groupId, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, simulation, groupId,
					orderByComparator, true);

			array[1] = simulation;

			array[2] = getByGroupId_PrevAndNext(session, simulation, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByGroupId_PrevAndNext(Session session,
		Simulation simulation, long groupId,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Simulation simulation : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching simulations
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "simulation.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySimulationStatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySimulationStatus", new String[] { String.class.getName() },
			SimulationModelImpl.SIMULATIONSTATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SIMULATIONSTATUS = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySimulationStatus", new String[] { String.class.getName() });

	/**
	 * Returns all the simulations where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus(String simulationStatus) {
		return findBySimulationStatus(simulationStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus(String simulationStatus,
		int start, int end) {
		return findBySimulationStatus(simulationStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus(String simulationStatus,
		int start, int end, OrderByComparator<Simulation> orderByComparator) {
		return findBySimulationStatus(simulationStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus(String simulationStatus,
		int start, int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS;
			finderArgs = new Object[] { simulationStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS;
			finderArgs = new Object[] {
					simulationStatus,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if (!Objects.equals(simulationStatus,
								simulation.getSimulationStatus())) {
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

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_First(String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_First(simulationStatus,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_First(String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findBySimulationStatus(simulationStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_Last(String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_Last(simulationStatus,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_Last(String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countBySimulationStatus(simulationStatus);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findBySimulationStatus(simulationStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where simulationStatus = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findBySimulationStatus_PrevAndNext(long simulationId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getBySimulationStatus_PrevAndNext(session, simulation,
					simulationStatus, orderByComparator, true);

			array[1] = simulation;

			array[2] = getBySimulationStatus_PrevAndNext(session, simulation,
					simulationStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getBySimulationStatus_PrevAndNext(Session session,
		Simulation simulation, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		boolean bindSimulationStatus = false;

		if (simulationStatus == null) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_1);
		}
		else if (simulationStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_3);
		}
		else {
			bindSimulationStatus = true;

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_2);
		}

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSimulationStatus) {
			qPos.add(simulationStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where simulationStatus = &#63; from the database.
	 *
	 * @param simulationStatus the simulation status
	 */
	@Override
	public void removeBySimulationStatus(String simulationStatus) {
		for (Simulation simulation : findBySimulationStatus(simulationStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where simulationStatus = &#63;.
	 *
	 * @param simulationStatus the simulation status
	 * @return the number of matching simulations
	 */
	@Override
	public int countBySimulationStatus(String simulationStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SIMULATIONSTATUS;

		Object[] finderArgs = new Object[] { simulationStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

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

	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_1 =
		"simulation.simulationStatus IS NULL";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_2 =
		"simulation.simulationStatus = ?";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_SIMULATIONSTATUS_3 =
		"(simulation.simulationStatus IS NULL OR simulation.simulationStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySimulationStatus_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySimulationStatus_U",
			new String[] { Long.class.getName(), String.class.getName() },
			SimulationModelImpl.USERID_COLUMN_BITMASK |
			SimulationModelImpl.SIMULATIONSTATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_U = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySimulationStatus_U",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the simulations where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_U(long userId,
		String simulationStatus) {
		return findBySimulationStatus_U(userId, simulationStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_U(long userId,
		String simulationStatus, int start, int end) {
		return findBySimulationStatus_U(userId, simulationStatus, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_U(long userId,
		String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findBySimulationStatus_U(userId, simulationStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_U(long userId,
		String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U;
			finderArgs = new Object[] { userId, simulationStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_U;
			finderArgs = new Object[] {
					userId, simulationStatus,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((userId != simulation.getUserId()) ||
							!Objects.equals(simulationStatus,
								simulation.getSimulationStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_USERID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_U_First(long userId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_U_First(userId,
				simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_U_First(long userId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findBySimulationStatus_U(userId,
				simulationStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_U_Last(long userId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_U_Last(userId,
				simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_U_Last(long userId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator) {
		int count = countBySimulationStatus_U(userId, simulationStatus);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findBySimulationStatus_U(userId,
				simulationStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findBySimulationStatus_U_PrevAndNext(
		long simulationId, long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getBySimulationStatus_U_PrevAndNext(session, simulation,
					userId, simulationStatus, orderByComparator, true);

			array[1] = simulation;

			array[2] = getBySimulationStatus_U_PrevAndNext(session, simulation,
					userId, simulationStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getBySimulationStatus_U_PrevAndNext(Session session,
		Simulation simulation, long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_USERID_2);

		boolean bindSimulationStatus = false;

		if (simulationStatus == null) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_1);
		}
		else if (simulationStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_3);
		}
		else {
			bindSimulationStatus = true;

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_2);
		}

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (bindSimulationStatus) {
			qPos.add(simulationStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where userId = &#63; and simulationStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 */
	@Override
	public void removeBySimulationStatus_U(long userId, String simulationStatus) {
		for (Simulation simulation : findBySimulationStatus_U(userId,
				simulationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @return the number of matching simulations
	 */
	@Override
	public int countBySimulationStatus_U(long userId, String simulationStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_U;

		Object[] finderArgs = new Object[] { userId, simulationStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_USERID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

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

	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_U_USERID_2 = "simulation.userId = ? AND ";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_1 =
		"simulation.simulationStatus IS NULL";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_2 =
		"simulation.simulationStatus = ?";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_U_SIMULATIONSTATUS_3 =
		"(simulation.simulationStatus IS NULL OR simulation.simulationStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_G =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySimulationStatus_G",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySimulationStatus_G",
			new String[] { Long.class.getName(), String.class.getName() },
			SimulationModelImpl.GROUPID_COLUMN_BITMASK |
			SimulationModelImpl.SIMULATIONSTATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySimulationStatus_G",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the simulations where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G(long groupId,
		String simulationStatus) {
		return findBySimulationStatus_G(groupId, simulationStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G(long groupId,
		String simulationStatus, int start, int end) {
		return findBySimulationStatus_G(groupId, simulationStatus, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G(long groupId,
		String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findBySimulationStatus_G(groupId, simulationStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G(long groupId,
		String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G;
			finderArgs = new Object[] { groupId, simulationStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_G;
			finderArgs = new Object[] {
					groupId, simulationStatus,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((groupId != simulation.getGroupId()) ||
							!Objects.equals(simulationStatus,
								simulation.getSimulationStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_GROUPID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_G_First(long groupId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_G_First(groupId,
				simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_G_First(long groupId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findBySimulationStatus_G(groupId,
				simulationStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_G_Last(long groupId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_G_Last(groupId,
				simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_G_Last(long groupId,
		String simulationStatus, OrderByComparator<Simulation> orderByComparator) {
		int count = countBySimulationStatus_G(groupId, simulationStatus);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findBySimulationStatus_G(groupId,
				simulationStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findBySimulationStatus_G_PrevAndNext(
		long simulationId, long groupId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getBySimulationStatus_G_PrevAndNext(session, simulation,
					groupId, simulationStatus, orderByComparator, true);

			array[1] = simulation;

			array[2] = getBySimulationStatus_G_PrevAndNext(session, simulation,
					groupId, simulationStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getBySimulationStatus_G_PrevAndNext(Session session,
		Simulation simulation, long groupId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_GROUPID_2);

		boolean bindSimulationStatus = false;

		if (simulationStatus == null) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_1);
		}
		else if (simulationStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_3);
		}
		else {
			bindSimulationStatus = true;

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_2);
		}

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindSimulationStatus) {
			qPos.add(simulationStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where groupId = &#63; and simulationStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 */
	@Override
	public void removeBySimulationStatus_G(long groupId, String simulationStatus) {
		for (Simulation simulation : findBySimulationStatus_G(groupId,
				simulationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where groupId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param simulationStatus the simulation status
	 * @return the number of matching simulations
	 */
	@Override
	public int countBySimulationStatus_G(long groupId, String simulationStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G;

		Object[] finderArgs = new Object[] { groupId, simulationStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_GROUPID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

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

	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_GROUPID_2 = "simulation.groupId = ? AND ";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_1 =
		"simulation.simulationStatus IS NULL";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_2 =
		"simulation.simulationStatus = ?";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_SIMULATIONSTATUS_3 =
		"(simulation.simulationStatus IS NULL OR simulation.simulationStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySimulationStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySimulationStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			SimulationModelImpl.GROUPID_COLUMN_BITMASK |
			SimulationModelImpl.USERID_COLUMN_BITMASK |
			SimulationModelImpl.SIMULATIONSTATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G_U = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySimulationStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, String simulationStatus) {
		return findBySimulationStatus_G_U(groupId, userId, simulationStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, String simulationStatus, int start, int end) {
		return findBySimulationStatus_G_U(groupId, userId, simulationStatus,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findBySimulationStatus_G_U(groupId, userId, simulationStatus,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findBySimulationStatus_G_U(long groupId,
		long userId, String simulationStatus, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U;
			finderArgs = new Object[] { groupId, userId, simulationStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U;
			finderArgs = new Object[] {
					groupId, userId, simulationStatus,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((groupId != simulation.getGroupId()) ||
							(userId != simulation.getUserId()) ||
							!Objects.equals(simulationStatus,
								simulation.getSimulationStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_USERID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_G_U_First(long groupId,
		long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_G_U_First(groupId,
				userId, simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_G_U_First(long groupId,
		long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findBySimulationStatus_G_U(groupId, userId,
				simulationStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findBySimulationStatus_G_U_Last(long groupId,
		long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchBySimulationStatus_G_U_Last(groupId,
				userId, simulationStatus, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", simulationStatus=");
		msg.append(simulationStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchBySimulationStatus_G_U_Last(long groupId,
		long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countBySimulationStatus_G_U(groupId, userId,
				simulationStatus);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findBySimulationStatus_G_U(groupId, userId,
				simulationStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findBySimulationStatus_G_U_PrevAndNext(
		long simulationId, long groupId, long userId, String simulationStatus,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getBySimulationStatus_G_U_PrevAndNext(session,
					simulation, groupId, userId, simulationStatus,
					orderByComparator, true);

			array[1] = simulation;

			array[2] = getBySimulationStatus_G_U_PrevAndNext(session,
					simulation, groupId, userId, simulationStatus,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getBySimulationStatus_G_U_PrevAndNext(
		Session session, Simulation simulation, long groupId, long userId,
		String simulationStatus,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_GROUPID_2);

		query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_USERID_2);

		boolean bindSimulationStatus = false;

		if (simulationStatus == null) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_1);
		}
		else if (simulationStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_3);
		}
		else {
			bindSimulationStatus = true;

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_2);
		}

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		if (bindSimulationStatus) {
			qPos.add(simulationStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 */
	@Override
	public void removeBySimulationStatus_G_U(long groupId, long userId,
		String simulationStatus) {
		for (Simulation simulation : findBySimulationStatus_G_U(groupId,
				userId, simulationStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where groupId = &#63; and userId = &#63; and simulationStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param simulationStatus the simulation status
	 * @return the number of matching simulations
	 */
	@Override
	public int countBySimulationStatus_G_U(long groupId, long userId,
		String simulationStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G_U;

		Object[] finderArgs = new Object[] { groupId, userId, simulationStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_USERID_2);

			boolean bindSimulationStatus = false;

			if (simulationStatus == null) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_1);
			}
			else if (simulationStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_3);
			}
			else {
				bindSimulationStatus = true;

				query.append(_FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				if (bindSimulationStatus) {
					qPos.add(simulationStatus);
				}

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

	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_U_GROUPID_2 = "simulation.groupId = ? AND ";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_U_USERID_2 = "simulation.userId = ? AND ";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_1 =
		"simulation.simulationStatus IS NULL";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_2 =
		"simulation.simulationStatus = ?";
	private static final String _FINDER_COLUMN_SIMULATIONSTATUS_G_U_SIMULATIONSTATUS_3 =
		"(simulation.simulationStatus IS NULL OR simulation.simulationStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			SimulationModelImpl.STATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the simulations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByStatus(int status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus(int status, int start, int end) {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus(int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findByStatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus(int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((status != simulation.getStatus())) {
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

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_First(int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_First(status, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_First(int status,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByStatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_Last(int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_Last(status, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_Last(int status,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where status = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByStatus_PrevAndNext(long simulationId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByStatus_PrevAndNext(session, simulation, status,
					orderByComparator, true);

			array[1] = simulation;

			array[2] = getByStatus_PrevAndNext(session, simulation, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByStatus_PrevAndNext(Session session,
		Simulation simulation, int status,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(int status) {
		for (Simulation simulation : findByStatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching simulations
	 */
	@Override
	public int countByStatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "simulation.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_U = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus_U",
			new String[] { Long.class.getName(), Integer.class.getName() },
			SimulationModelImpl.USERID_COLUMN_BITMASK |
			SimulationModelImpl.STATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS_U = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus_U",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the simulations where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_U(long userId, int status) {
		return findByStatus_U(userId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_U(long userId, int status, int start,
		int end) {
		return findByStatus_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_U(long userId, int status, int start,
		int end, OrderByComparator<Simulation> orderByComparator) {
		return findByStatus_U(userId, status, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the simulations where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_U(long userId, int status, int start,
		int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U;
			finderArgs = new Object[] { userId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_U;
			finderArgs = new Object[] {
					userId, status,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((userId != simulation.getUserId()) ||
							(status != simulation.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_U_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_U_First(long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_U_First(userId, status,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_U_First(long userId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByStatus_U(userId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_U_Last(long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_U_Last(userId, status,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_U_Last(long userId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByStatus_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByStatus_U(userId, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByStatus_U_PrevAndNext(long simulationId,
		long userId, int status, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByStatus_U_PrevAndNext(session, simulation, userId,
					status, orderByComparator, true);

			array[1] = simulation;

			array[2] = getByStatus_U_PrevAndNext(session, simulation, userId,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByStatus_U_PrevAndNext(Session session,
		Simulation simulation, long userId, int status,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_STATUS_U_USERID_2);

		query.append(_FINDER_COLUMN_STATUS_U_STATUS_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeByStatus_U(long userId, int status) {
		for (Simulation simulation : findByStatus_U(userId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching simulations
	 */
	@Override
	public int countByStatus_U(long userId, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS_U;

		Object[] finderArgs = new Object[] { userId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_U_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_U_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_U_USERID_2 = "simulation.userId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_U_STATUS_2 = "simulation.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_G = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus_G",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus_G",
			new String[] { Long.class.getName(), Integer.class.getName() },
			SimulationModelImpl.GROUPID_COLUMN_BITMASK |
			SimulationModelImpl.STATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS_G = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus_G",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the simulations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G(long groupId, int status) {
		return findByStatus_G(groupId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G(long groupId, int status, int start,
		int end) {
		return findByStatus_G(groupId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G(long groupId, int status, int start,
		int end, OrderByComparator<Simulation> orderByComparator) {
		return findByStatus_G(groupId, status, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G(long groupId, int status, int start,
		int end, OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G;
			finderArgs = new Object[] { groupId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_G;
			finderArgs = new Object[] {
					groupId, status,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((groupId != simulation.getGroupId()) ||
							(status != simulation.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_G_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_G_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_G_First(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_G_First(groupId, status,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_G_First(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByStatus_G(groupId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_G_Last(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_G_Last(groupId, status,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_G_Last(long groupId, int status,
		OrderByComparator<Simulation> orderByComparator) {
		int count = countByStatus_G(groupId, status);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByStatus_G(groupId, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByStatus_G_PrevAndNext(long simulationId,
		long groupId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByStatus_G_PrevAndNext(session, simulation, groupId,
					status, orderByComparator, true);

			array[1] = simulation;

			array[2] = getByStatus_G_PrevAndNext(session, simulation, groupId,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByStatus_G_PrevAndNext(Session session,
		Simulation simulation, long groupId, int status,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_STATUS_G_GROUPID_2);

		query.append(_FINDER_COLUMN_STATUS_G_STATUS_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	@Override
	public void removeByStatus_G(long groupId, int status) {
		for (Simulation simulation : findByStatus_G(groupId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching simulations
	 */
	@Override
	public int countByStatus_G(long groupId, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS_G;

		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_G_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_G_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_G_GROUPID_2 = "simulation.groupId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_G_STATUS_2 = "simulation.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_G_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U =
		new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, SimulationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			},
			SimulationModelImpl.GROUPID_COLUMN_BITMASK |
			SimulationModelImpl.USERID_COLUMN_BITMASK |
			SimulationModelImpl.STATUS_COLUMN_BITMASK |
			SimulationModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS_G_U = new FinderPath(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus_G_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status) {
		return findByStatus_G_U(groupId, userId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end) {
		return findByStatus_G_U(groupId, userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findByStatus_G_U(groupId, userId, status, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching simulations
	 */
	@Override
	public List<Simulation> findByStatus_G_U(long groupId, long userId,
		int status, int start, int end,
		OrderByComparator<Simulation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U;
			finderArgs = new Object[] { groupId, userId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS_G_U;
			finderArgs = new Object[] {
					groupId, userId, status,
					
					start, end, orderByComparator
				};
		}

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Simulation simulation : list) {
					if ((groupId != simulation.getGroupId()) ||
							(userId != simulation.getUserId()) ||
							(status != simulation.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_G_U_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_G_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SimulationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(status);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_G_U_First(groupId, userId,
				status, orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the first simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_G_U_First(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator) {
		List<Simulation> list = findByStatus_G_U(groupId, userId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation
	 * @throws NoSuchSimulationException if a matching simulation could not be found
	 */
	@Override
	public Simulation findByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByStatus_G_U_Last(groupId, userId, status,
				orderByComparator);

		if (simulation != null) {
			return simulation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSimulationException(msg.toString());
	}

	/**
	 * Returns the last simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching simulation, or <code>null</code> if a matching simulation could not be found
	 */
	@Override
	public Simulation fetchByStatus_G_U_Last(long groupId, long userId,
		int status, OrderByComparator<Simulation> orderByComparator) {
		int count = countByStatus_G_U(groupId, userId, status);

		if (count == 0) {
			return null;
		}

		List<Simulation> list = findByStatus_G_U(groupId, userId, status,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the simulations before and after the current simulation in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param simulationId the primary key of the current simulation
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation[] findByStatus_G_U_PrevAndNext(long simulationId,
		long groupId, long userId, int status,
		OrderByComparator<Simulation> orderByComparator)
		throws NoSuchSimulationException {
		Simulation simulation = findByPrimaryKey(simulationId);

		Session session = null;

		try {
			session = openSession();

			Simulation[] array = new SimulationImpl[3];

			array[0] = getByStatus_G_U_PrevAndNext(session, simulation,
					groupId, userId, status, orderByComparator, true);

			array[1] = simulation;

			array[2] = getByStatus_G_U_PrevAndNext(session, simulation,
					groupId, userId, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Simulation getByStatus_G_U_PrevAndNext(Session session,
		Simulation simulation, long groupId, long userId, int status,
		OrderByComparator<Simulation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_SIMULATION_WHERE);

		query.append(_FINDER_COLUMN_STATUS_G_U_GROUPID_2);

		query.append(_FINDER_COLUMN_STATUS_G_U_USERID_2);

		query.append(_FINDER_COLUMN_STATUS_G_U_STATUS_2);

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
			query.append(SimulationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(userId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(simulation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Simulation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the simulations where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeByStatus_G_U(long groupId, long userId, int status) {
		for (Simulation simulation : findByStatus_G_U(groupId, userId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching simulations
	 */
	@Override
	public int countByStatus_G_U(long groupId, long userId, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS_G_U;

		Object[] finderArgs = new Object[] { groupId, userId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SIMULATION_WHERE);

			query.append(_FINDER_COLUMN_STATUS_G_U_GROUPID_2);

			query.append(_FINDER_COLUMN_STATUS_G_U_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_G_U_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(userId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_G_U_GROUPID_2 = "simulation.groupId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_G_U_USERID_2 = "simulation.userId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_G_U_STATUS_2 = "simulation.status = ?";

	public SimulationPersistenceImpl() {
		setModelClass(Simulation.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the simulation in the entity cache if it is enabled.
	 *
	 * @param simulation the simulation
	 */
	@Override
	public void cacheResult(Simulation simulation) {
		entityCache.putResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationImpl.class, simulation.getPrimaryKey(), simulation);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { simulation.getUuid(), simulation.getGroupId() },
			simulation);

		simulation.resetOriginalValues();
	}

	/**
	 * Caches the simulations in the entity cache if it is enabled.
	 *
	 * @param simulations the simulations
	 */
	@Override
	public void cacheResult(List<Simulation> simulations) {
		for (Simulation simulation : simulations) {
			if (entityCache.getResult(
						SimulationModelImpl.ENTITY_CACHE_ENABLED,
						SimulationImpl.class, simulation.getPrimaryKey()) == null) {
				cacheResult(simulation);
			}
			else {
				simulation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all simulations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SimulationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the simulation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Simulation simulation) {
		entityCache.removeResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationImpl.class, simulation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SimulationModelImpl)simulation, true);
	}

	@Override
	public void clearCache(List<Simulation> simulations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Simulation simulation : simulations) {
			entityCache.removeResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
				SimulationImpl.class, simulation.getPrimaryKey());

			clearUniqueFindersCache((SimulationModelImpl)simulation, true);
		}
	}

	protected void cacheUniqueFindersCache(
		SimulationModelImpl simulationModelImpl) {
		Object[] args = new Object[] {
				simulationModelImpl.getUuid(), simulationModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			simulationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		SimulationModelImpl simulationModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					simulationModelImpl.getUuid(),
					simulationModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((simulationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					simulationModelImpl.getOriginalUuid(),
					simulationModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new simulation with the primary key. Does not add the simulation to the database.
	 *
	 * @param simulationId the primary key for the new simulation
	 * @return the new simulation
	 */
	@Override
	public Simulation create(long simulationId) {
		Simulation simulation = new SimulationImpl();

		simulation.setNew(true);
		simulation.setPrimaryKey(simulationId);

		String uuid = PortalUUIDUtil.generate();

		simulation.setUuid(uuid);

		simulation.setCompanyId(companyProvider.getCompanyId());

		return simulation;
	}

	/**
	 * Removes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param simulationId the primary key of the simulation
	 * @return the simulation that was removed
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation remove(long simulationId)
		throws NoSuchSimulationException {
		return remove((Serializable)simulationId);
	}

	/**
	 * Removes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the simulation
	 * @return the simulation that was removed
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation remove(Serializable primaryKey)
		throws NoSuchSimulationException {
		Session session = null;

		try {
			session = openSession();

			Simulation simulation = (Simulation)session.get(SimulationImpl.class,
					primaryKey);

			if (simulation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSimulationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(simulation);
		}
		catch (NoSuchSimulationException nsee) {
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
	protected Simulation removeImpl(Simulation simulation) {
		simulation = toUnwrappedModel(simulation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(simulation)) {
				simulation = (Simulation)session.get(SimulationImpl.class,
						simulation.getPrimaryKeyObj());
			}

			if (simulation != null) {
				session.delete(simulation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (simulation != null) {
			clearCache(simulation);
		}

		return simulation;
	}

	@Override
	public Simulation updateImpl(Simulation simulation) {
		simulation = toUnwrappedModel(simulation);

		boolean isNew = simulation.isNew();

		SimulationModelImpl simulationModelImpl = (SimulationModelImpl)simulation;

		if (Validator.isNull(simulation.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			simulation.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (simulation.getCreateDate() == null)) {
			if (serviceContext == null) {
				simulation.setCreateDate(now);
			}
			else {
				simulation.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!simulationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				simulation.setModifiedDate(now);
			}
			else {
				simulation.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (simulation.isNew()) {
				session.save(simulation);

				simulation.setNew(false);
			}
			else {
				simulation = (Simulation)session.merge(simulation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SimulationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { simulationModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					simulationModelImpl.getUuid(),
					simulationModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { simulationModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] { simulationModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			args = new Object[] { simulationModelImpl.getSimulationStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS,
				args);

			args = new Object[] {
					simulationModelImpl.getUserId(),
					simulationModelImpl.getSimulationStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_U,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U,
				args);

			args = new Object[] {
					simulationModelImpl.getGroupId(),
					simulationModelImpl.getSimulationStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G,
				args);

			args = new Object[] {
					simulationModelImpl.getGroupId(),
					simulationModelImpl.getUserId(),
					simulationModelImpl.getSimulationStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G_U,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U,
				args);

			args = new Object[] { simulationModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] {
					simulationModelImpl.getUserId(),
					simulationModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_U, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U,
				args);

			args = new Object[] {
					simulationModelImpl.getGroupId(),
					simulationModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G,
				args);

			args = new Object[] {
					simulationModelImpl.getGroupId(),
					simulationModelImpl.getUserId(),
					simulationModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G_U, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { simulationModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalUuid(),
						simulationModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						simulationModelImpl.getUuid(),
						simulationModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { simulationModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { simulationModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS,
					args);

				args = new Object[] { simulationModelImpl.getSimulationStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalUserId(),
						simulationModelImpl.getOriginalSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_U,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U,
					args);

				args = new Object[] {
						simulationModelImpl.getUserId(),
						simulationModelImpl.getSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_U,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_U,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalGroupId(),
						simulationModelImpl.getOriginalSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G,
					args);

				args = new Object[] {
						simulationModelImpl.getGroupId(),
						simulationModelImpl.getSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalGroupId(),
						simulationModelImpl.getOriginalUserId(),
						simulationModelImpl.getOriginalSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G_U,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U,
					args);

				args = new Object[] {
						simulationModelImpl.getGroupId(),
						simulationModelImpl.getUserId(),
						simulationModelImpl.getSimulationStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SIMULATIONSTATUS_G_U,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SIMULATIONSTATUS_G_U,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { simulationModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalUserId(),
						simulationModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U,
					args);

				args = new Object[] {
						simulationModelImpl.getUserId(),
						simulationModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_U,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalGroupId(),
						simulationModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G,
					args);

				args = new Object[] {
						simulationModelImpl.getGroupId(),
						simulationModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G,
					args);
			}

			if ((simulationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						simulationModelImpl.getOriginalGroupId(),
						simulationModelImpl.getOriginalUserId(),
						simulationModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U,
					args);

				args = new Object[] {
						simulationModelImpl.getGroupId(),
						simulationModelImpl.getUserId(),
						simulationModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS_G_U, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS_G_U,
					args);
			}
		}

		entityCache.putResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
			SimulationImpl.class, simulation.getPrimaryKey(), simulation, false);

		clearUniqueFindersCache(simulationModelImpl, false);
		cacheUniqueFindersCache(simulationModelImpl);

		simulation.resetOriginalValues();

		return simulation;
	}

	protected Simulation toUnwrappedModel(Simulation simulation) {
		if (simulation instanceof SimulationImpl) {
			return simulation;
		}

		SimulationImpl simulationImpl = new SimulationImpl();

		simulationImpl.setNew(simulation.isNew());
		simulationImpl.setPrimaryKey(simulation.getPrimaryKey());

		simulationImpl.setUuid(simulation.getUuid());
		simulationImpl.setSimulationId(simulation.getSimulationId());
		simulationImpl.setGroupId(simulation.getGroupId());
		simulationImpl.setCompanyId(simulation.getCompanyId());
		simulationImpl.setUserId(simulation.getUserId());
		simulationImpl.setCreateDate(simulation.getCreateDate());
		simulationImpl.setModifiedDate(simulation.getModifiedDate());
		simulationImpl.setTitle(simulation.getTitle());
		simulationImpl.setWebContentId(simulation.getWebContentId());
		simulationImpl.setIconId(simulation.getIconId());
		simulationImpl.setSimulationStatus(simulation.getSimulationStatus());
		simulationImpl.setStatus(simulation.getStatus());
		simulationImpl.setTasks(simulation.getTasks());

		return simulationImpl;
	}

	/**
	 * Returns the simulation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the simulation
	 * @return the simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSimulationException {
		Simulation simulation = fetchByPrimaryKey(primaryKey);

		if (simulation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSimulationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return simulation;
	}

	/**
	 * Returns the simulation with the primary key or throws a {@link NoSuchSimulationException} if it could not be found.
	 *
	 * @param simulationId the primary key of the simulation
	 * @return the simulation
	 * @throws NoSuchSimulationException if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation findByPrimaryKey(long simulationId)
		throws NoSuchSimulationException {
		return findByPrimaryKey((Serializable)simulationId);
	}

	/**
	 * Returns the simulation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the simulation
	 * @return the simulation, or <code>null</code> if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
				SimulationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Simulation simulation = (Simulation)serializable;

		if (simulation == null) {
			Session session = null;

			try {
				session = openSession();

				simulation = (Simulation)session.get(SimulationImpl.class,
						primaryKey);

				if (simulation != null) {
					cacheResult(simulation);
				}
				else {
					entityCache.putResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
						SimulationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
					SimulationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return simulation;
	}

	/**
	 * Returns the simulation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param simulationId the primary key of the simulation
	 * @return the simulation, or <code>null</code> if a simulation with the primary key could not be found
	 */
	@Override
	public Simulation fetchByPrimaryKey(long simulationId) {
		return fetchByPrimaryKey((Serializable)simulationId);
	}

	@Override
	public Map<Serializable, Simulation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Simulation> map = new HashMap<Serializable, Simulation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Simulation simulation = fetchByPrimaryKey(primaryKey);

			if (simulation != null) {
				map.put(primaryKey, simulation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
					SimulationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Simulation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SIMULATION_WHERE_PKS_IN);

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

			for (Simulation simulation : (List<Simulation>)q.list()) {
				map.put(simulation.getPrimaryKeyObj(), simulation);

				cacheResult(simulation);

				uncachedPrimaryKeys.remove(simulation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SimulationModelImpl.ENTITY_CACHE_ENABLED,
					SimulationImpl.class, primaryKey, nullModel);
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
	 * Returns all the simulations.
	 *
	 * @return the simulations
	 */
	@Override
	public List<Simulation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the simulations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @return the range of simulations
	 */
	@Override
	public List<Simulation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the simulations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of simulations
	 */
	@Override
	public List<Simulation> findAll(int start, int end,
		OrderByComparator<Simulation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the simulations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of simulations
	 * @param end the upper bound of the range of simulations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of simulations
	 */
	@Override
	public List<Simulation> findAll(int start, int end,
		OrderByComparator<Simulation> orderByComparator,
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

		List<Simulation> list = null;

		if (retrieveFromCache) {
			list = (List<Simulation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SIMULATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SIMULATION;

				if (pagination) {
					sql = sql.concat(SimulationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Simulation>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the simulations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Simulation simulation : findAll()) {
			remove(simulation);
		}
	}

	/**
	 * Returns the number of simulations.
	 *
	 * @return the number of simulations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SIMULATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SimulationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the simulation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SimulationImpl.class.getName());
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
	private static final String _SQL_SELECT_SIMULATION = "SELECT simulation FROM Simulation simulation";
	private static final String _SQL_SELECT_SIMULATION_WHERE_PKS_IN = "SELECT simulation FROM Simulation simulation WHERE simulationId IN (";
	private static final String _SQL_SELECT_SIMULATION_WHERE = "SELECT simulation FROM Simulation simulation WHERE ";
	private static final String _SQL_COUNT_SIMULATION = "SELECT COUNT(simulation) FROM Simulation simulation";
	private static final String _SQL_COUNT_SIMULATION_WHERE = "SELECT COUNT(simulation) FROM Simulation simulation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "simulation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Simulation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Simulation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SimulationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}