package com.kisti.osp.spyglass.listener;

import org.osgi.service.component.annotations.Component;

import com.kisti.osp.spyglass.model.ScienceApp;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

@Component(
	    immediate = true,
	    service = ModelListener.class
)
public class ScienceAppModelListener extends BaseModelListener<ScienceApp> {

	@Override
	public void onAfterAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		System.out.println("onAfterAddAssociation( "+classPK+", "+associationClassName+", "+associationClassPK+" )");
		super.onAfterAddAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onAfterCreate(ScienceApp model) throws ModelListenerException {
		System.out.println("onAfterCreate( "+model.getScienceAppId()+" )");
		super.onAfterCreate(model);
	}

	@Override
	public void onAfterRemove(ScienceApp model) throws ModelListenerException {
		System.out.println("onAfterRemove( "+model.getScienceAppId()+" )");
		super.onAfterRemove(model);
	}

	@Override
	public void onAfterRemoveAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		System.out.println("onAfterRemoveAssociation( "+classPK+", "+associationClassName+", "+associationClassPK+" )");
		super.onAfterRemoveAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onAfterUpdate(ScienceApp model) throws ModelListenerException {
		System.out.println("onAfterUpdate( "+model.getScienceAppId()+" )");
		super.onAfterUpdate(model);
	}

	@Override
	public void onBeforeAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		System.out.println("onBeforeAddAssociation( "+classPK+", "+associationClassName+", "+associationClassPK+" )");
		super.onBeforeAddAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onBeforeCreate(ScienceApp model) throws ModelListenerException {
		System.out.println("onBeforeCreate( "+model.getScienceAppId()+" )");
		super.onBeforeCreate(model);
	}

	@Override
	public void onBeforeRemove(ScienceApp model) throws ModelListenerException {
		System.out.println("onBeforeRemove( "+model.getScienceAppId()+" )");
		super.onBeforeRemove(model);
	}

	@Override
	public void onBeforeRemoveAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		System.out.println("onBeforeRemoveAssociation( "+classPK+", "+associationClassName+", "+associationClassPK+" )");
		super.onBeforeRemoveAssociation(classPK, associationClassName, associationClassPK);
	}

	@Override
	public void onBeforeUpdate(ScienceApp model) throws ModelListenerException {
		System.out.println("onBeforeUpdate( "+model.getScienceAppId()+" )");
		super.onBeforeUpdate(model);
	}

}
