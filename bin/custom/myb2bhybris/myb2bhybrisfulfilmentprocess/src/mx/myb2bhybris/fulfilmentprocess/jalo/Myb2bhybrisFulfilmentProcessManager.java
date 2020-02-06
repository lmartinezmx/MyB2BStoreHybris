/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package mx.myb2bhybris.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import mx.myb2bhybris.fulfilmentprocess.constants.Myb2bhybrisFulfilmentProcessConstants;

public class Myb2bhybrisFulfilmentProcessManager extends GeneratedMyb2bhybrisFulfilmentProcessManager
{
	public static final Myb2bhybrisFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Myb2bhybrisFulfilmentProcessManager) em.getExtension(Myb2bhybrisFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
