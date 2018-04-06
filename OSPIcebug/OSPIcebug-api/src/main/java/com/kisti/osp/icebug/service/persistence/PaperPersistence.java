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

package com.kisti.osp.icebug.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebug.exception.NoSuchPaperException;
import com.kisti.osp.icebug.model.Paper;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the paper service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.kisti.osp.icebug.service.persistence.impl.PaperPersistenceImpl
 * @see PaperUtil
 * @generated
 */
@ProviderType
public interface PaperPersistence extends BasePersistence<Paper> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaperUtil} to access the paper persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the papers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching papers
	*/
	public java.util.List<Paper> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the papers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @return the range of matching papers
	*/
	public java.util.List<Paper> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the papers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching papers
	*/
	public java.util.List<Paper> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns an ordered range of all the papers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching papers
	*/
	public java.util.List<Paper> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first paper in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching paper
	* @throws NoSuchPaperException if a matching paper could not be found
	*/
	public Paper findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Returns the first paper in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns the last paper in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching paper
	* @throws NoSuchPaperException if a matching paper could not be found
	*/
	public Paper findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Returns the last paper in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns the papers before and after the current paper in the ordered set where uuid = &#63;.
	*
	* @param paperId the primary key of the current paper
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next paper
	* @throws NoSuchPaperException if a paper with the primary key could not be found
	*/
	public Paper[] findByUuid_PrevAndNext(long paperId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Removes all the papers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of papers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching papers
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the paper where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPaperException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching paper
	* @throws NoSuchPaperException if a matching paper could not be found
	*/
	public Paper findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchPaperException;

	/**
	* Returns the paper where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the paper where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the paper where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the paper that was removed
	*/
	public Paper removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchPaperException;

	/**
	* Returns the number of papers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching papers
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the papers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching papers
	*/
	public java.util.List<Paper> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the papers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @return the range of matching papers
	*/
	public java.util.List<Paper> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the papers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching papers
	*/
	public java.util.List<Paper> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns an ordered range of all the papers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching papers
	*/
	public java.util.List<Paper> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first paper in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching paper
	* @throws NoSuchPaperException if a matching paper could not be found
	*/
	public Paper findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Returns the first paper in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns the last paper in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching paper
	* @throws NoSuchPaperException if a matching paper could not be found
	*/
	public Paper findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Returns the last paper in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching paper, or <code>null</code> if a matching paper could not be found
	*/
	public Paper fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns the papers before and after the current paper in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param paperId the primary key of the current paper
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next paper
	* @throws NoSuchPaperException if a paper with the primary key could not be found
	*/
	public Paper[] findByUuid_C_PrevAndNext(long paperId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator)
		throws NoSuchPaperException;

	/**
	* Removes all the papers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of papers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching papers
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the paper in the entity cache if it is enabled.
	*
	* @param paper the paper
	*/
	public void cacheResult(Paper paper);

	/**
	* Caches the papers in the entity cache if it is enabled.
	*
	* @param papers the papers
	*/
	public void cacheResult(java.util.List<Paper> papers);

	/**
	* Creates a new paper with the primary key. Does not add the paper to the database.
	*
	* @param paperId the primary key for the new paper
	* @return the new paper
	*/
	public Paper create(long paperId);

	/**
	* Removes the paper with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paperId the primary key of the paper
	* @return the paper that was removed
	* @throws NoSuchPaperException if a paper with the primary key could not be found
	*/
	public Paper remove(long paperId) throws NoSuchPaperException;

	public Paper updateImpl(Paper paper);

	/**
	* Returns the paper with the primary key or throws a {@link NoSuchPaperException} if it could not be found.
	*
	* @param paperId the primary key of the paper
	* @return the paper
	* @throws NoSuchPaperException if a paper with the primary key could not be found
	*/
	public Paper findByPrimaryKey(long paperId) throws NoSuchPaperException;

	/**
	* Returns the paper with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paperId the primary key of the paper
	* @return the paper, or <code>null</code> if a paper with the primary key could not be found
	*/
	public Paper fetchByPrimaryKey(long paperId);

	@Override
	public java.util.Map<java.io.Serializable, Paper> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the papers.
	*
	* @return the papers
	*/
	public java.util.List<Paper> findAll();

	/**
	* Returns a range of all the papers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @return the range of papers
	*/
	public java.util.List<Paper> findAll(int start, int end);

	/**
	* Returns an ordered range of all the papers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of papers
	*/
	public java.util.List<Paper> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator);

	/**
	* Returns an ordered range of all the papers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaperModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of papers
	* @param end the upper bound of the range of papers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of papers
	*/
	public java.util.List<Paper> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Paper> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the papers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of papers.
	*
	* @return the number of papers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}