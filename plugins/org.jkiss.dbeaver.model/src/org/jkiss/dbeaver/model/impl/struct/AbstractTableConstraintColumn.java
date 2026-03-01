
    }
/**
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        return DBValueFormatting.getObjectImage(getAttribute());
 * limitations under the License.

 */
 * You may obtain a copy of the License at
    public DBPImage getObjectImage()
 *
    {
    }
import org.jkiss.dbeaver.model.DBValueFormatting;
 */
{
public abstract class AbstractTableConstraintColumn implements DBSTableConstraintColumn, DBPImageProvider
package org.jkiss.dbeaver.model.impl.struct;
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.DBPImage;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
import org.jkiss.dbeaver.model.DBPImageProvider;
} * Abstract constraint column
 *
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

    public boolean isPersisted()
 * DBeaver - Universal Database Manager
        return getParentObject().isPersisted();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
