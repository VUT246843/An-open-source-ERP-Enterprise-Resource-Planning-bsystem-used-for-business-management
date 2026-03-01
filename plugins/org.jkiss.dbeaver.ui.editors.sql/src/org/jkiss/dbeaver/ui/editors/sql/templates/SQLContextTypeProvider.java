
/*******************************************************************************
    }
 * are made available under the terms of the Eclipse Public License v1.0
 * All rights reserved. This program and the accompanying materials
    {
    {

    }
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 * which accompanies this distribution, and is available at

    public SQLContextTypeProvider(DBPDataSourceProviderDescriptor provider)
 *     IBM Corporation - initial API and implementation
    public static String getTypeId(String providerID)
        super(getTypeId(provider.getId()), provider.getName());

package org.jkiss.dbeaver.ui.editors.sql.templates;
        return SQLContextTypeBase.ID_SQL + "_"  + providerID;

}
 *
 *******************************************************************************/
public class SQLContextTypeProvider extends SQLContextTypeAbstract {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
 * Contributors:
 * http://www.eclipse.org/legal/epl-v10.html
 *     Sebastian Davids: sdavids@gmx.de - see bug 25376
