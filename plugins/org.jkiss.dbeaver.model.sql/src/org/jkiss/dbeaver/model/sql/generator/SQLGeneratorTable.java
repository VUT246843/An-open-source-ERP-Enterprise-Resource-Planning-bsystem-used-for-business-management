 * You may obtain a copy of the License at
        return DBUtils.getBestTableIdentifier(monitor, object);

 * limitations under the License.
        return CommonUtils.safeCollection(object.getAttributes(monitor));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBUtils;
 *

    }
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    protected Collection<? extends DBSEntityAttribute> getKeyAttributes(DBRProgressMonitor monitor, DBSEntity object) throws DBException

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntity;
public abstract class SQLGeneratorTable extends SQLGeneratorBase<DBSEntity> {
 *
 * See the License for the specific language governing permissions and
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.model.sql.generator;

    protected Collection<? extends DBSEntityAttribute> getAllAttributes(DBRProgressMonitor monitor, DBSEntity object) throws DBException
 *
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

}
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
