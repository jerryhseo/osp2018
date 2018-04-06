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

package com.kisti.osp.spyglass.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.kisti.osp.spyglass.exception.NoSuchScienceAppException;
import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.model.ScienceAppInputPorts;
import com.kisti.osp.spyglass.model.ScienceAppLayout;
import com.kisti.osp.spyglass.model.ScienceAppLogPorts;
import com.kisti.osp.spyglass.model.ScienceAppOutputPorts;
import com.kisti.osp.spyglass.service.base.ScienceAppLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the science app local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.kisti.osp.spyglass.service.ScienceAppLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Jerry H. Seo
 * @see ScienceAppLocalServiceBaseImpl
 * @see com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil
 */
public class ScienceAppLocalServiceImpl extends ScienceAppLocalServiceBaseImpl {
	public ScienceApp addScienceApp( 
			String name, 
			String version, 
			Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap,
			long iconId,
			Map<Locale, String>  manualMap,
			String exeFileName,
			String appType,
			String runType,
			int maxCpus,
			int defaultCpus,
			String inputPorts,
			String logPorts,
			String outputPorts,
			String layout,
			int openLevel,
			String license,
			ServiceContext sc) throws SystemException, PortalException{
		long newId = super.counterLocalService.increment();
		ScienceApp newApp = super.createScienceApp(newId);
		Locale locale = sc.getLocale();
		newApp.setName(name);
		newApp.setVersion(version);
		newApp.setTitleMap(titleMap, locale);
		newApp.setDescriptionMap(descriptionMap, locale);
		newApp.setIconId(iconId);
		newApp.setManualMap(manualMap, locale);;
		newApp.setExeFileName(exeFileName);
		newApp.setAppType(appType);
		newApp.setRunType(runType);
		newApp.setMaxCpus(maxCpus);
		newApp.setDefaultCpus(defaultCpus);
		newApp.setOpenLevel(openLevel);
		newApp.setLicense(license);
		
		newApp.setUserId(sc.getUserId());
		newApp.setCompanyId(sc.getCompanyId());
		newApp.setGroupId(sc.getScopeGroupId());
		Date now = new Date();
		newApp.setCreateDate(now);
		newApp.setModifiedDate(now);
		
		super.addScienceApp(newApp);
		
		super.scienceAppInputPortsLocalService.addInputPorts( newId, inputPorts );
		super.scienceAppLogPortsLocalService.addLogPorts( newId, logPorts );
		super.scienceAppOutputPortsLocalService.addOutputPorts( newId, outputPorts );
		super.scienceAppLayoutLocalService.addLayout( newId, layout );
		
		this.addResources(sc.getCompanyId(), sc.getScopeGroupId(), sc.getUserId(), newApp.getPrimaryKey());
		this.updateScienceAppAsset(newApp, sc);
		
		return newApp;
	}
	
	public ScienceApp updateScienceApp( 
			String name, 
			String version, 
			Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap,
			long iconId,
			Map<Locale, String> manualMap,
			String exeFileName,
			String appType,
			String runType,
			int maxCpus,
			int defaultCpus,
			String inputPorts,
			String logPorts,
			String outputPorts,
			String layout,
			int openLevel,
			String license,
			ServiceContext sc) throws SystemException, PortalException{
		ScienceApp app = super.scienceAppPersistence.fetchByNameVersion(name, version);
		Locale locale = sc.getLocale();
		app.setName(name);
		app.setVersion(version);
		app.setTitleMap(titleMap);
		app.setDescriptionMap(descriptionMap, locale);
		app.setIconId(iconId);
		app.setManualMap(manualMap, locale);
		app.setExeFileName(exeFileName);
		app.setAppType(appType);
		app.setRunType(runType);
		app.setMaxCpus(maxCpus);
		app.setDefaultCpus(defaultCpus);
		app.setOpenLevel(openLevel);
		app.setLicense(license);
		
		if( Validator.isNotNull(inputPorts))
			super.scienceAppInputPortsLocalService.addInputPorts( app.getPrimaryKey(), inputPorts );
		if( Validator.isNotNull(logPorts))
			super.scienceAppLogPortsLocalService.addLogPorts( app.getPrimaryKey(), logPorts );
		if( Validator.isNotNull(outputPorts))
			super.scienceAppOutputPortsLocalService.addOutputPorts( app.getPrimaryKey(), outputPorts );
		if( Validator.isNotNull(layout))
		super.scienceAppLayoutLocalService.addLayout( app.getPrimaryKey(), layout );
		
		app.setRecentModifierId(sc.getUserId());
		Date now = new Date();
		app.setModifiedDate(now);
		super.updateScienceApp(app);
		
		this.updateResources(app.getPrimaryKey(), sc);
		this.updateScienceAppAsset(app, sc);
		
		return app;
	}
	
	public ScienceApp updateScienceApp( ScienceApp scienceApp, ServiceContext sc) throws SystemException, PortalException{
		super.updateScienceApp(scienceApp);
		
		this.updateResources(scienceApp.getPrimaryKey(), sc);
		this.updateScienceAppAsset(scienceApp, sc);
		return scienceApp;
	}
	
	public List<ScienceApp> removeScienceApps( String scienceAppName, ServiceContext sc ) throws PortalException{
		List<ScienceApp> apps = super.scienceAppPersistence.findByName(scienceAppName);
		for( ScienceApp app : apps ){
			this.removeScienceApp(app.getPrimaryKey(), sc);
		}
		
		return apps;
	}
	
	public ScienceApp removeScienceApp( long scienceAppId, ServiceContext sc ) throws PortalException{
		ScienceApp app = super.deleteScienceApp(scienceAppId);
		super.scienceAppInputPortsLocalService.deleteScienceAppInputPorts(scienceAppId);
		super.scienceAppLogPortsLocalService.deleteScienceAppLogPorts(scienceAppId);
		super.scienceAppOutputPortsLocalService.deleteScienceAppOutputPorts(scienceAppId);
		super.scienceAppLayoutLocalService.deleteScienceAppLayout(scienceAppId);
		this.deleteResources(scienceAppId, sc);
		this.deleteScienceAppAsset(app, sc);
		
		return app;
	}
	
	public ScienceApp removeScienceApp( String scienceAppName, String scienceAppVersion, ServiceContext sc ) throws NoSuchScienceAppException, PortalException{
		ScienceApp app = super.scienceAppPersistence.findByNameVersion(scienceAppName, scienceAppVersion);
		return this.removeScienceApp(app.getPrimaryKey(), sc);
	}
	
	public ScienceApp removeScienceApp( ScienceApp app, ServiceContext sc ) throws PortalException{
		return this.removeScienceApp(app.getPrimaryKey(), sc);
	}
	
	public void setInputPorts( long scienceAppId, String inputPorts ){
		super.scienceAppInputPortsLocalService.addInputPorts(scienceAppId, inputPorts);
	}
	
	public void updateInputPorts( long scienceAppId, String inputPorts ) throws PortalException{
		super.scienceAppInputPortsLocalService.updateInputPorts(scienceAppId, inputPorts);
	}
	
	public void removeInputPorts( long scienceAppId ) throws PortalException{
		super.scienceAppInputPortsLocalService.deleteScienceAppInputPorts(scienceAppId);
	}
	
	public String getInputPorts( long scienceAppId ) throws PortalException{
		ScienceAppInputPorts inputPorts = super.scienceAppInputPortsLocalService.getScienceAppInputPorts(scienceAppId); 
		return inputPorts.getInputPorts();
	}
	
	public void setLogPorts( long scienceAppId, String logPorts ){
		super.scienceAppLogPortsLocalService.addLogPorts(scienceAppId, logPorts);
	}
	
	public void updateLogPorts( long scienceAppId, String logPorts ) throws PortalException{
		super.scienceAppLogPortsLocalService.updateLogPorts(scienceAppId, logPorts);
	}
	
	public void removeLogPorts( long scienceAppId ) throws PortalException{
		super.scienceAppLogPortsLocalService.deleteScienceAppLogPorts(scienceAppId);
	}
	
	public String getLogPorts( long scienceAppId ) throws PortalException{
		ScienceAppLogPorts logPorts = super.scienceAppLogPortsLocalService.getScienceAppLogPorts(scienceAppId); 
		return logPorts.getLogPorts();
	}
	
	public void setOutputPorts( long scienceAppId, String outputPorts ){
		super.scienceAppOutputPortsLocalService.addOutputPorts(scienceAppId, outputPorts);
	}
	
	public void updateOutputPorts( long scienceAppId, String outputPorts ) throws PortalException{
		super.scienceAppOutputPortsLocalService.updateOutputPorts(scienceAppId, outputPorts);
	}
	
	public void removeOutputPorts( long scienceAppId ) throws PortalException{
		super.scienceAppOutputPortsLocalService.deleteScienceAppOutputPorts(scienceAppId);
	}
	
	public String getOutputPorts( long scienceAppId ) throws PortalException{
		ScienceAppOutputPorts outputPorts = super.scienceAppOutputPortsLocalService.getScienceAppOutputPorts(scienceAppId); 
		return outputPorts.getOutputPorts();
	}

	public void setLayout( long scienceAppId, String layout ){
		super.scienceAppLayoutLocalService.addLayout(scienceAppId, layout);
	}
	
	public void updateLayout( long scienceAppId, String layout ) throws PortalException{
		super.scienceAppLayoutLocalService.updateLayout(scienceAppId, layout);
	}
	
	public void removeLayout( long scienceAppId ) throws PortalException{
		super.scienceAppLayoutLocalService.deleteScienceAppLayout(scienceAppId);
	}
	
	public String getLayout( long scienceAppId ) throws PortalException{
		ScienceAppLayout layout = super.scienceAppLayoutLocalService.getScienceAppLayout(scienceAppId); 
		return layout.getLayout();
	}
	
	
	/* **********************************************************************************
	 * private functions
	 * **********************************************************************************/
	
	
	private void addResources( long companyId, long groupId, long userId, long scienceAppId ) throws PortalException{
		super.resourceLocalService.addResources(
				companyId, 
				groupId, 
				userId, 
				ScienceApp.class.getName(), 
				scienceAppId, 
				false, 
				true, 
				true);
	}
	
	private void updateResources( long scienceAppId, ServiceContext sc) throws PortalException{
		super.resourceLocalService.updateResources(
				sc.getCompanyId(), 
				sc.getScopeGroupId(), 
				ScienceApp.class.getName(), 
				scienceAppId, 
				sc.getGroupPermissions(), 
				sc.getGuestPermissions());
	}
	
	private void deleteResources( long scienceAppId, ServiceContext sc ) throws PortalException{
		super.resourceLocalService.deleteResource(
				sc.getCompanyId(), 
				ScienceApp.class.getName(), 
				ResourceConstants.SCOPE_INDIVIDUAL, 
				scienceAppId);
	}
	
	private void updateScienceAppAsset( ScienceApp scienceApp, ServiceContext sc ) throws PortalException, SystemException{
		long userId = scienceApp.getUserId();
		long groupId = scienceApp.getGroupId();
		Date createDate = scienceApp.getCreateDate();
		Date modifiedDate = scienceApp.getModifiedDate();
		String className = ScienceApp.class.getName();
		long primaryKey = scienceApp.getPrimaryKey();
		String classUuid = scienceApp.getUuid();
		long classTypeId = 0; // identifies the particular variation of this class, if it has any variations. Otherwise, use 0.
		long[] categoryIds = sc.getAssetCategoryIds(); // represent the categories selected for the entity.
		String[] tagNames = sc.getAssetTagNames(); // represent the tags selected for the entity.
		boolean listable = true; // specifies whether the entity can be shown in dynamic lists of content
		boolean visible = true; //  specifies whether the entity is approved.
	    Date startDate = null; //  the entity’s publish date. You can use it to specify when an Asset Publisher should show the entity’s content.
	    Date endDate = null; // the date the entity is taken down. You can use it to specify when an Asset Publisher should stop showing the entity’s content.
	    Date publishDate = null;
	    Date expirationDate = null; // the date the entity will no longer be shown.
	    String mimeType = ContentTypes.TEXT_PLAIN_UTF8; // the Multi-Purpose Internet Mail Extensions type, such as ContentTypes.TEXT_HTML, used for the content.
	    String title = scienceApp.getName(); //  the entity’s name.
	    String description = scienceApp.getTitle();
	    String summary = scienceApp.getTitle();
	    String url = null;
	    String layoutUuid = null;
	    int height = 0;
	    int width = 0; 
	    Double priority = null;
		
		AssetEntry assetEntry = super.assetEntryLocalService.updateEntry(
				userId, 
				groupId, 
				createDate, 
				modifiedDate, 
				className, 
				primaryKey, 
				classUuid, 
				classTypeId, 
				categoryIds, 
				tagNames,
				listable,
				visible, 
				startDate, 
				endDate, 
				publishDate,
				expirationDate, 
				mimeType, 
				title, 
				description, 
				summary, 
				url, 
				layoutUuid, 
				height, 
				width, 
				priority);
		Indexer<ScienceApp> indexer = IndexerRegistryUtil.nullSafeGetIndexer(ScienceApp.class);
		indexer.reindex(scienceApp);
		super.assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
                 sc.getAssetLinkEntryIds(),
                 AssetLinkConstants.TYPE_RELATED);
	}
	
	private void deleteScienceAppAsset( ScienceApp scienceApp, ServiceContext sc) throws PortalException{
		AssetEntry assetEntry = super.assetEntryLocalService.fetchEntry(
					ScienceApp.class.getName(), scienceApp.getPrimaryKey());

		super.assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
		super.assetEntryLocalService.deleteEntry(assetEntry);
	}
}