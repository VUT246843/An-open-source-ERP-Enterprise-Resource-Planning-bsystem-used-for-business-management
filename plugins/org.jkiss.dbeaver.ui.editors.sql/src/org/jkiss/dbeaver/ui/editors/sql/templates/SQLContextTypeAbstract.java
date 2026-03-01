 * are made available under the terms of the Eclipse Public License v1.0

        addDatabaseProposals();
    private void addDatabaseProposals()
    }
public abstract class SQLContextTypeAbstract extends TemplateContextType {
        super(id, name);
    {
 * All rights reserved. This program and the accompanying materials
    }
        addResolver(new GlobalTemplateVariables.Date());
        addResolver(new SQLDataTypeResolver());
        return getId().hashCode() + getName().hashCode();


        addResolver(new GlobalTemplateVariables.LineSelection());
 * http://www.eclipse.org/legal/epl-v10.html
        addResolver(new GlobalTemplateVariables.WordSelection());
}
    public String toString()

/*******************************************************************************
        addGlobalResolvers();
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        addResolver(new GlobalTemplateVariables.Year());
            SQLContainerResolver.VAR_NAME_CATALOG, "Catalog", DBSCatalog.class));
        return getId() + " [" + getName() + "]";

        addResolver(new GlobalTemplateVariables.Time());
 *******************************************************************************/
    public int hashCode()
 * Contributors:
    @Override
            SQLContainerResolver.VAR_NAME_SCHEMA, "Schema", DBSSchema.class));
        addResolver(new SQLContainerResolver<>(
 *     IBM Corporation - initial API and implementation
    {


        addResolver(new SQLEntityResolver());

    {
 *
        addResolver(new GlobalTemplateVariables.User());
 * which accompanies this distribution, and is available at
    }
 *     Sebastian Davids: sdavids@gmx.de - see bug 25376
import org.eclipse.jface.text.templates.TemplateContextType;

package org.jkiss.dbeaver.ui.editors.sql.templates;
    }
    {
 * Copyright (c) 2000, 2011 IBM Corporation and others.
        addResolver(new SQLContainerResolver<>(
        addResolver(new GlobalTemplateVariables.Dollar());
        addResolver(new GlobalTemplateVariables.Cursor());
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
        addResolver(new SQLAttributeResolver());
import org.eclipse.jface.text.templates.GlobalTemplateVariables;
    protected SQLContextTypeAbstract(String id, String name)

    private void addGlobalResolvers() {
    @Override
    }
