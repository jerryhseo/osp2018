package com.kisti.osp.spyglass.service.permission;

import org.osgi.service.component.annotations.Reference;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.kisti.osp.spyglass.service.ScienceAppLocalService;
import com.kisti.osp.spyglass.service.ScienceAppLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

public class ScienceAppPermission implements BaseModelPermissionChecker {
	private static ScienceAppLocalService _scienceAppLocalService;
	
	@Override
	public void checkBaseModel(PermissionChecker permissionChecker, long groupId, long scienceAppId, String actionId)
			throws PortalException {
		check(permissionChecker, scienceAppId, actionId);
	}
	
	@Reference(unbind = "-")
    protected void setScienceAppLocalService(ScienceAppLocalService scienceAppLocalService) {
        _scienceAppLocalService = scienceAppLocalService;
    }

	public static void check(
			PermissionChecker permissionChecker,
			long scienceApp, 
			String actionId) throws PortalException, SystemException {

		if (!contains(permissionChecker, scienceApp, actionId)) {
			throw new PrincipalException();
		}
	}
	
	public static void check(
									PermissionChecker permissionChecker, 
									long groupId, 
									long scienceAppId,
									String actionId) throws PortalException {
		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException.MustHavePermission(
					permissionChecker, 
					ScienceApp.class.getName(), 
					scienceAppId,
					actionId);
		}
	}
	
	public static boolean contains(
									PermissionChecker permissionChecker, 
									long groupId, 
									long scienceAppId, 
									String actionId) throws PortalException {

		ScienceApp scienceApp = _scienceAppLocalService.getScienceApp(scienceAppId);

		return SpyGlassModelPermission.contains(permissionChecker, groupId, actionId);
	}

	public static boolean contains(
									PermissionChecker permissionChecker, 
									long scienceAppId, 
									String actionId) throws PortalException, SystemException {
		ScienceApp scienceApp = _scienceAppLocalService.getScienceApp(scienceAppId);
		return contains(permissionChecker, scienceApp, actionId);
	}

	public static boolean contains(
									PermissionChecker permissionChecker, 
									ScienceApp scienceApp, 
									String actionId) throws PortalException, SystemException {
		return permissionChecker.hasPermission(
									scienceApp.getGroupId(), 
									ScienceApp.class.getName(), 
									scienceApp.getScienceAppId(), 
									actionId);
	}
}
