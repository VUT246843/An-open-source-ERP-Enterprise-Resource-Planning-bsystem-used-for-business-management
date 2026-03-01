/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.DBException;
/**
 *
    @Override
    }
import org.jkiss.dbeaver.model.struct.DBSObjectType;

 * You may obtain a copy of the License at
 * limitations under the License.
 *

    public DirectObjectReference(DBSObject container, DBSObjectType type, DBSObject object) {


 */

    public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
 * DBeaver - Universal Database Manager
    private final DBSObject object;
 * See the License for the specific language governing permissions and
        super(object.getName(), container, object.getDescription(), object.getClass(), type);
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        return object;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.impl.struct;
 * Direct object reference
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;
public class DirectObjectReference extends AbstractObjectReference<DBSObject> {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        this.object = object;
