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

package com.kisti.osp.meridian.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.meridian.exception.NoSuchLabException;
import com.kisti.osp.meridian.model.Lab;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the lab service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.kisti.osp.meridian.service.persistence.impl.LabPersistenceImpl
 * @see LabUtil
 * @generated
 */
@ProviderType
public interface LabPersistence extends BasePersistence<Lab> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LabUtil} to access the lab persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the labs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching labs
	*/
	public java.util.List<Lab> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the labs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @return the range of matching labs
	*/
	public java.util.List<Lab> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the labs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching labs
	*/
	public java.util.List<Lab> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns an ordered range of all the labs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching labs
	*/
	public java.util.List<Lab> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab
	* @throws NoSuchLabException if a matching lab could not be found
	*/
	public Lab findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Returns the first lab in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns the last lab in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab
	* @throws NoSuchLabException if a matching lab could not be found
	*/
	public Lab findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Returns the last lab in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns the labs before and after the current lab in the ordered set where uuid = &#63;.
	*
	* @param labId the primary key of the current lab
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab
	* @throws NoSuchLabException if a lab with the primary key could not be found
	*/
	public Lab[] findByUuid_PrevAndNext(long labId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Removes all the labs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of labs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching labs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the lab where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLabException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lab
	* @throws NoSuchLabException if a matching lab could not be found
	*/
	public Lab findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLabException;

	/**
	* Returns the lab where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the lab where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the lab where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the lab that was removed
	*/
	public Lab removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchLabException;

	/**
	* Returns the number of labs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching labs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the labs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching labs
	*/
	public java.util.List<Lab> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the labs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @return the range of matching labs
	*/
	public java.util.List<Lab> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the labs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching labs
	*/
	public java.util.List<Lab> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns an ordered range of all the labs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching labs
	*/
	public java.util.List<Lab> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lab in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab
	* @throws NoSuchLabException if a matching lab could not be found
	*/
	public Lab findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Returns the first lab in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns the last lab in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab
	* @throws NoSuchLabException if a matching lab could not be found
	*/
	public Lab findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Returns the last lab in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lab, or <code>null</code> if a matching lab could not be found
	*/
	public Lab fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns the labs before and after the current lab in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param labId the primary key of the current lab
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lab
	* @throws NoSuchLabException if a lab with the primary key could not be found
	*/
	public Lab[] findByUuid_C_PrevAndNext(long labId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator)
		throws NoSuchLabException;

	/**
	* Removes all the labs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of labs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching labs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the lab in the entity cache if it is enabled.
	*
	* @param lab the lab
	*/
	public void cacheResult(Lab lab);

	/**
	* Caches the labs in the entity cache if it is enabled.
	*
	* @param labs the labs
	*/
	public void cacheResult(java.util.List<Lab> labs);

	/**
	* Creates a new lab with the primary key. Does not add the lab to the database.
	*
	* @param labId the primary key for the new lab
	* @return the new lab
	*/
	public Lab create(long labId);

	/**
	* Removes the lab with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param labId the primary key of the lab
	* @return the lab that was removed
	* @throws NoSuchLabException if a lab with the primary key could not be found
	*/
	public Lab remove(long labId) throws NoSuchLabException;

	public Lab updateImpl(Lab lab);

	/**
	* Returns the lab with the primary key or throws a {@link NoSuchLabException} if it could not be found.
	*
	* @param labId the primary key of the lab
	* @return the lab
	* @throws NoSuchLabException if a lab with the primary key could not be found
	*/
	public Lab findByPrimaryKey(long labId) throws NoSuchLabException;

	/**
	* Returns the lab with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param labId the primary key of the lab
	* @return the lab, or <code>null</code> if a lab with the primary key could not be found
	*/
	public Lab fetchByPrimaryKey(long labId);

	@Override
	public java.util.Map<java.io.Serializable, Lab> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the labs.
	*
	* @return the labs
	*/
	public java.util.List<Lab> findAll();

	/**
	* Returns a range of all the labs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @return the range of labs
	*/
	public java.util.List<Lab> findAll(int start, int end);

	/**
	* Returns an ordered range of all the labs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of labs
	*/
	public java.util.List<Lab> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator);

	/**
	* Returns an ordered range of all the labs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LabModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of labs
	* @param end the upper bound of the range of labs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of labs
	*/
	public java.util.List<Lab> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Lab> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the labs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of labs.
	*
	* @return the number of labs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}