 *     Sebastian Davids: sdavids@gmx.de - see bug 25376
        super(
    public static String getTypeId(DBPDriver driver)
        return SQLContextTypeBase.ID_SQL + "_" + driver.getProviderId() + "_" +

 * which accompanies this distribution, and is available at
 *
 * Contributors:
public class SQLContextTypeDriver extends SQLContextTypeAbstract {
            (driver.isCustom() ? driver.getDriverClassName() : driver.getId());
            getTypeId(driver),
}
 * All rights reserved. This program and the accompanying materials
    
/*******************************************************************************

        return SQLContextTypeBase.ID_SQL + "_" + providerId + "_" +driverId;

    }

import org.jkiss.dbeaver.model.connection.DBPDriver;

 *******************************************************************************/
    }
    {
 * Copyright (c) 2000, 2011 IBM Corporation and others.
package org.jkiss.dbeaver.ui.editors.sql.templates;
    {
 *     IBM Corporation - initial API and implementation
    public static String getTypeId(String providerId, String driverId) {
 * http://www.eclipse.org/legal/epl-v10.html
 * are made available under the terms of the Eclipse Public License v1.0
    public SQLContextTypeDriver(DBPDriver driver)
            driver.getName());

    }
