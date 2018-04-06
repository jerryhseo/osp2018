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

package com.kisti.osp.zodiac.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Simulation. This utility wraps
 * {@link com.kisti.osp.zodiac.service.impl.SimulationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry H. Seo
 * @see SimulationLocalService
 * @see com.kisti.osp.zodiac.service.base.SimulationLocalServiceBaseImpl
 * @see com.kisti.osp.zodiac.service.impl.SimulationLocalServiceImpl
 * @generated
 */
@ProviderType
public class SimulationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.zodiac.service.impl.SimulationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the simulation to the database. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was added
	*/
	public static com.kisti.osp.zodiac.model.Simulation addSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return getService().addSimulation(simulation);
	}

	/**
	* Creates a new simulation with the primary key. Does not add the simulation to the database.
	*
	* @param simulationId the primary key for the new simulation
	* @return the new simulation
	*/
	public static com.kisti.osp.zodiac.model.Simulation createSimulation(
		long simulationId) {
		return getService().createSimulation(simulationId);
	}

	/**
	* Deletes the simulation from the database. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was removed
	*/
	public static com.kisti.osp.zodiac.model.Simulation deleteSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return getService().deleteSimulation(simulation);
	}

	/**
	* Deletes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation that was removed
	* @throws PortalException if a simulation with the primary key could not be found
	*/
	public static com.kisti.osp.zodiac.model.Simulation deleteSimulation(
		long simulationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSimulation(simulationId);
	}

	public static com.kisti.osp.zodiac.model.Simulation fetchSimulation(
		long simulationId) {
		return getService().fetchSimulation(simulationId);
	}

	/**
	* Returns the simulation matching the UUID and group.
	*
	* @param uuid the simulation's UUID
	* @param groupId the primary key of the group
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	public static com.kisti.osp.zodiac.model.Simulation fetchSimulationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchSimulationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the simulation with the primary key.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation
	* @throws PortalException if a simulation with the primary key could not be found
	*/
	public static com.kisti.osp.zodiac.model.Simulation getSimulation(
		long simulationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSimulation(simulationId);
	}

	/**
	* Returns the simulation matching the UUID and group.
	*
	* @param uuid the simulation's UUID
	* @param groupId the primary key of the group
	* @return the matching simulation
	* @throws PortalException if a matching simulation could not be found
	*/
	public static com.kisti.osp.zodiac.model.Simulation getSimulationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSimulationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the simulation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was updated
	*/
	public static com.kisti.osp.zodiac.model.Simulation updateSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return getService().updateSimulation(simulation);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of simulations.
	*
	* @return the number of simulations
	*/
	public static int getSimulationsCount() {
		return getService().getSimulationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.zodiac.model.impl.SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.zodiac.model.impl.SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the simulations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.zodiac.model.impl.SimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @return the range of simulations
	*/
	public static java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulations(
		int start, int end) {
		return getService().getSimulations(start, end);
	}

	/**
	* Returns all the simulations matching the UUID and company.
	*
	* @param uuid the UUID of the simulations
	* @param companyId the primary key of the company
	* @return the matching simulations, or an empty list if no matches were found
	*/
	public static java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getSimulationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of simulations matching the UUID and company.
	*
	* @param uuid the UUID of the simulations
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of simulations
	* @param end the upper bound of the range of simulations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching simulations, or an empty list if no matches were found
	*/
	public static java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.zodiac.model.Simulation> orderByComparator) {
		return getService()
				   .getSimulationsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static SimulationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SimulationLocalService, SimulationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(SimulationLocalService.class);
}