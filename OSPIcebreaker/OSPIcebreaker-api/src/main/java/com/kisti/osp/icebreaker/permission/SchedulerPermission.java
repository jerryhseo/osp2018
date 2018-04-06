package com.kisti.osp.icebreaker.permission;

import com.kisti.osp.icebreaker.model.OSPSchedulerEntry;
import com.kisti.osp.icebreaker.service.OSPSchedulerEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

public class SchedulerPermission {
	public static void check(PermissionChecker permissionChecker,
            long entryId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, entryId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long schedulerId, String actionId) throws PortalException,
            SystemException {

        OSPSchedulerEntry scheduler = OSPSchedulerEntryLocalServiceUtil.getOSPSchedulerEntry(schedulerId);

        return permissionChecker
                .hasPermission(scheduler.getGroupId(),
                        OSPSchedulerEntry.class.getName(), scheduler.getSchedulerEntryId(),
                        actionId);

    }
}
