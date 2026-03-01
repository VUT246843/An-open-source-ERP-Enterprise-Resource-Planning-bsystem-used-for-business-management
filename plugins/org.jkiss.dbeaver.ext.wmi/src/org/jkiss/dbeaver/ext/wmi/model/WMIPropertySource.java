 * Unless required by applicable law or agreed to in writing, software
{
/**

package org.jkiss.dbeaver.ext.wmi.model;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    @NotNull
    @Override

public abstract class WMIPropertySource implements DBPPropertySource
        WMIQualifiedObject qualifiedObject = getQualifiedObject();
        }
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            log.error(e);
    public void resetPropertyValueToDefault(@NotNull String id) {
    {
    {

    public Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
 * you may not use this file except in compliance with the License.
 * Property source based on WMI qualifiers
    @Override
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id)
            if (qualifiedObject == null) {
 * See the License for the specific language governing permissions and
        try {
    {
            WMIQualifiedObject qualifiedObject = getQualifiedObject();
    {
    @Override
    public void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value)
            return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
    }

    }
        return false;
import org.jkiss.wmi.service.WMIQualifier;
    {
 */
            }
            for (WMIQualifier qualifier : qualifiers) {

                result[index++] = prop;
import org.jkiss.code.Nullable;
        try {
    }
 *
    @NotNull
    {
    protected abstract WMIQualifiedObject getQualifiedObject();

}
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
 *
    {
            return EMPTY_PROPERTIES;
            throw new DBException("Can't extract object qualifiers", e);
/*
import org.jkiss.code.NotNull;
 * limitations under the License.
    public Object getEditableValue()
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    public boolean isPropertySet(@NotNull String id)
import org.jkiss.wmi.service.WMIQualifiedObject;
            return getQualifiedObject().getQualifier(id.toString()) != null;
    }
        } catch (WMIException e) {
    @Override
            log.error(e);


        } catch (WMIException e) {

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Collection;


            Collection<WMIQualifier> qualifiers = qualifiedObject.getQualifiers();
    public DBPPropertyDescriptor[] getProperties()
    private static final DBPPropertyDescriptor[] EMPTY_PROPERTIES = new DBPPropertyDescriptor[0];
    private static final Log log = Log.getLog(WMIPropertySource.class);
            return null;

        return this;//getQualifiedObject();
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                String name = qualifier.getName();
            log.error(e);
        try {
            int index = 0;
    }
    @Nullable
        } catch (WMIException e) {
    public boolean isPropertyResettable(@NotNull String id) {

    @Override
    @Override
            return result;
                qualifiedObject.getQualifier(qName));
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                PropertyDescriptor prop = new PropertyDescriptor("WMI", name, name, null, null, false, null, null, false);
            DBPPropertyDescriptor[] result = new DBPPropertyDescriptor[qualifiers.size()];

    }

            return getQualifiedObject().getQualifier(id.toString());
import org.jkiss.wmi.service.WMIException;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        try {
        }
                return EMPTY_PROPERTIES;
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *


    @Override
        }
        } catch (WMIException e) {
            return qualifiedObject != null && Boolean.TRUE.equals(
    }
    protected boolean getFlagQualifier(String qName) throws DBException
    }
    }
