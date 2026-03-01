 * limitations under the License.
    @Nullable
 * You may obtain a copy of the License at
/*

import org.jkiss.dbeaver.model.DBPObject;
     * Returns target object or null if alias is broken or target object is unavailable.
 *
public interface DBSAlias extends DBPObject, DBSObject
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.struct;
 */
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException;

 */
    DBSObject getTargetObject(@Nullable DBRProgressMonitor monitor)
 * DBSAlias - refers to some other metadata object
{

/**
import org.jkiss.code.Nullable;

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
     */
    /**
 *
