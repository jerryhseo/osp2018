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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SimulationLocalService}.
 *
 * @author Jerry H. Seo
 * @see SimulationLocalService
 * @generated
 */
@ProviderType
public class SimulationLocalServiceWrapper implements SimulationLocalService,
	ServiceWrapper<SimulationLocalService> {
	public SimulationLocalServiceWrapper(
		SimulationLocalService simulationLocalService) {
		_simulationLocalService = simulationLocalService;
	}

	/**
	* Adds the simulation to the database. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was added
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation addSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return _simulationLocalService.addSimulation(simulation);
	}

	/**
	* Creates a new simulation with the primary key. Does not add the simulation to the database.
	*
	* @param simulationId the primary key for the new simulation
	* @return the new simulation
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation createSimulation(
		long simulationId) {
		return _simulationLocalService.createSimulation(simulationId);
	}

	/**
	* Deletes the simulation from the database. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was removed
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation deleteSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return _simulationLocalService.deleteSimulation(simulation);
	}

	/**
	* Deletes the simulation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation that was removed
	* @throws PortalException if a simulation with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation deleteSimulation(
		long simulationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simulationLocalService.deleteSimulation(simulationId);
	}

	@Override
	public com.kisti.osp.zodiac.model.Simulation fetchSimulation(
		long simulationId) {
		return _simulationLocalService.fetchSimulation(simulationId);
	}

	/**
	* Returns the simulation matching the UUID and group.
	*
	* @param uuid the simulation's UUID
	* @param groupId the primary key of the group
	* @return the matching simulation, or <code>null</code> if a matching simulation could not be found
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation fetchSimulationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _simulationLocalService.fetchSimulationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the simulation with the primary key.
	*
	* @param simulationId the primary key of the simulation
	* @return the simulation
	* @throws PortalException if a simulation with the primary key could not be found
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation getSimulation(
		long simulationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simulationLocalService.getSimulation(simulationId);
	}

	/**
	* Returns the simulation matching the UUID and group.
	*
	* @param uuid the simulation's UUID
	* @param groupId the primary key of the group
	* @return the matching simulation
	* @throws PortalException if a matching simulation could not be found
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation getSimulationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simulationLocalService.getSimulationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the simulation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param simulation the simulation
	* @return the simulation that was updated
	*/
	@Override
	public com.kisti.osp.zodiac.model.Simulation updateSimulation(
		com.kisti.osp.zodiac.model.Simulation simulation) {
		return _simulationLocalService.updateSimulation(simulation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _simulationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _simulationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _simulationLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _simulationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simulationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _simulationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of simulations.
	*
	* @return the number of simulations
	*/
	@Override
	public int getSimulationsCount() {
		return _simulationLocalService.getSimulationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _simulationLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _simulationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _simulationLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _simulationLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulations(
		int start, int end) {
		return _simulationLocalService.getSimulations(start, end);
	}

	/**
	* Returns all the simulations matching the UUID and company.
	*
	* @param uuid the UUID of the simulations
	* @param companyId the primary key of the company
	* @return the matching simulations, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _simulationLocalService.getSimulationsByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.kisti.osp.zodiac.model.Simulation> getSimulationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.kisti.osp.zodiac.model.Simulation> orderByComparator) {
		return _simulationLocalService.getSimulationsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _simulationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _simulationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SimulationLocalService getWrappedService() {
		return _simulationLocalService;
	}

	@Override
	public void setWrappedService(SimulationLocalService simulationLocalService) {
		_simulationLocalService = simulationLocalService;
	}

	private SimulationLocalService _simulationLocalService;
}