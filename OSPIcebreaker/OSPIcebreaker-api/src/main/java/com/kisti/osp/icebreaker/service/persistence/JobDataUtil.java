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

package com.kisti.osp.icebreaker.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.kisti.osp.icebreaker.model.JobData;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the job data service. This utility wraps {@link com.kisti.osp.icebreaker.service.persistence.impl.JobDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry H. Seo
 * @see JobDataPersistence
 * @see com.kisti.osp.icebreaker.service.persistence.impl.JobDataPersistenceImpl
 * @generated
 */
@ProviderType
public class JobDataUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(JobData jobData) {
		getPersistence().clearCache(jobData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JobData> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JobData> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JobData update(JobData jobData) {
		return getPersistence().update(jobData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JobData update(JobData jobData, ServiceContext serviceContext) {
		return getPersistence().update(jobData, serviceContext);
	}

	/**
	* Caches the job data in the entity cache if it is enabled.
	*
	* @param jobData the job data
	*/
	public static void cacheResult(JobData jobData) {
		getPersistence().cacheResult(jobData);
	}

	/**
	* Caches the job datas in the entity cache if it is enabled.
	*
	* @param jobDatas the job datas
	*/
	public static void cacheResult(List<JobData> jobDatas) {
		getPersistence().cacheResult(jobDatas);
	}

	/**
	* Creates a new job data with the primary key. Does not add the job data to the database.
	*
	* @param jobId the primary key for the new job data
	* @return the new job data
	*/
	public static JobData create(long jobId) {
		return getPersistence().create(jobId);
	}

	/**
	* Removes the job data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the primary key of the job data
	* @return the job data that was removed
	* @throws NoSuchJobDataException if a job data with the primary key could not be found
	*/
	public static JobData remove(long jobId)
		throws com.kisti.osp.icebreaker.exception.NoSuchJobDataException {
		return getPersistence().remove(jobId);
	}

	public static JobData updateImpl(JobData jobData) {
		return getPersistence().updateImpl(jobData);
	}

	/**
	* Returns the job data with the primary key or throws a {@link NoSuchJobDataException} if it could not be found.
	*
	* @param jobId the primary key of the job data
	* @return the job data
	* @throws NoSuchJobDataException if a job data with the primary key could not be found
	*/
	public static JobData findByPrimaryKey(long jobId)
		throws com.kisti.osp.icebreaker.exception.NoSuchJobDataException {
		return getPersistence().findByPrimaryKey(jobId);
	}

	/**
	* Returns the job data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jobId the primary key of the job data
	* @return the job data, or <code>null</code> if a job data with the primary key could not be found
	*/
	public static JobData fetchByPrimaryKey(long jobId) {
		return getPersistence().fetchByPrimaryKey(jobId);
	}

	public static java.util.Map<java.io.Serializable, JobData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the job datas.
	*
	* @return the job datas
	*/
	public static List<JobData> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the job datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job datas
	* @param end the upper bound of the range of job datas (not inclusive)
	* @return the range of job datas
	*/
	public static List<JobData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the job datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job datas
	* @param end the upper bound of the range of job datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of job datas
	*/
	public static List<JobData> findAll(int start, int end,
		OrderByComparator<JobData> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the job datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job datas
	* @param end the upper bound of the range of job datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of job datas
	*/
	public static List<JobData> findAll(int start, int end,
		OrderByComparator<JobData> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the job datas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of job datas.
	*
	* @return the number of job datas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JobDataPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobDataPersistence, JobDataPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JobDataPersistence.class);
}