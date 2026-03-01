
/**

    // Default generator
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

        } else if (object instanceof Date) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    {
    }

 *
 * you may not use this file except in compliance with the License.
        return super.getValueDisplayString(column, value, format);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return Date.class;
 * Date/time value handler
import org.jkiss.code.NotNull;
} * Licensed under the Apache License, Version 2.0 (the "License");

            log.debug("Error getting current time stamp", e);
 *
    @Override
    @NotNull
 * limitations under the License.
import java.util.Date;
/*

    public String getDefaultValueLabel() {
    ////////////////////////////////////////////////////////
import org.jkiss.dbeaver.model.exec.DBCException;
            return object;

 *     http://www.apache.org/licenses/LICENSE-2.0
public abstract class DateTimeValueHandler extends BaseValueHandler implements DBDValueDefaultGenerator {
    }
            return (copy ? ((Date)object).clone() : object);

        try {
            return null;

 */
 * See the License for the specific language governing permissions and
    @Override
        } else {
    }
package org.jkiss.dbeaver.model.impl.data;
    public Class<Date> getValueObjectType(@NotNull DBSTypedObject attribute)
        }
    @Override
    {
import org.jkiss.dbeaver.model.data.DBDValueDefaultGenerator;
    public String getValueDisplayString(@NotNull DBSTypedObject column, Object value, @NotNull DBDDisplayFormat format) {
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    protected static final Log log = Log.getLog(DateTimeValueHandler.class);
import org.jkiss.dbeaver.model.exec.DBCSession;
            return getValueFromObject(session, type, new Date(), false, false);
import org.jkiss.dbeaver.Log;
    }

    @Override
 *
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy, boolean validateValue) throws DBCException
    public Object generateDefaultValue(DBCSession session, DBSTypedObject type) {
            return null;
        } catch (DBCException e) {

        return "Current Time";
        if (object == null) {
 */
 * You may obtain a copy of the License at
