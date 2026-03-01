 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    @Override
 */
    @Override
 *
    DBSTableConstraint getParentObject();
    DBSTableColumn getAttribute();
 * DBSTableConstraintColumn
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;

/**
 *

import org.jkiss.dbeaver.model.DBPObjectWithOrdinalPosition;
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface DBSTableConstraintColumn extends DBSObject, DBSEntityAttributeRef, DBPObjectWithOrdinalPosition

 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.struct.rdb;
 *
    @NotNull
{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
