/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package mx.myb2bhybris.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import mx.myb2bhybris.core.constants.Myb2bhybrisCoreConstants;
import mx.myb2bhybris.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class Myb2bhybrisCoreManager extends GeneratedMyb2bhybrisCoreManager
{
	public static final Myb2bhybrisCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Myb2bhybrisCoreManager) em.getExtension(Myb2bhybrisCoreConstants.EXTENSIONNAME);
	}
}
