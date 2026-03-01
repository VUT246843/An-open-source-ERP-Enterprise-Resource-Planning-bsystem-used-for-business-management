

    DBSObjectType getObjectType();
import org.jkiss.dbeaver.model.DBPNamedObject;

 * You may obtain a copy of the License at
public interface DBSObjectReference extends DBPNamedObject, DBPQualifiedObject
 *
        throws DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

/**

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

 * Unless required by applicable law or agreed to in writing, software
    DBSObject getContainer();
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
{
 */

package org.jkiss.dbeaver.model.struct;
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * Object reference

 * you may not use this file except in compliance with the License.
    String getObjectDescription();
 *
 * See the License for the specific language governing permissions and
    Class<?> getObjectClass();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * DBeaver - Universal Database Manager
    DBSObject resolveObject(DBRProgressMonitor monitor)
}
import org.jkiss.dbeaver.DBException;
