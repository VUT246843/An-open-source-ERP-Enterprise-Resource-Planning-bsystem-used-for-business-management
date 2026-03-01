        }
    protected static DBPImage getOverlayImage(DBPImage columnImage, JDBCColumnKeyType keyType)
            return columnImage;
    }
public abstract class JDBCAttribute extends AbstractAttribute implements DBSObject, DBSTypedObjectJDBC, DBPImageProvider {
/*
        return columnImage;
        return columnImage;
        super(name, typeName, valueType, ordinalPosition, maxLength, scale, precision, required, sequence);

        }
 * limitations under the License.
    @Override
    }
import org.jkiss.dbeaver.model.DBValueFormatting;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 */
    }

            overImage = DBIcon.OVER_REFERENCE;


    {
}
    public DBPImage getObjectImage()
    protected JDBCAttribute(String name, String typeName, int valueType, int ordinalPosition, long maxLength, Integer scale,
import org.jkiss.dbeaver.model.DBPImageProvider;
    }

    @NotNull
    }
        DBPImage columnImage = DBValueFormatting.getTypeImage(this);
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObjectJDBC;
    }
                            Integer precision, boolean required, boolean sequence)
 * distributed under the License is distributed on an "AS IS" BASIS,
        DBPImage overImage = null;
    {
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataKind;
    {
    @Nullable
*/
import org.jkiss.code.NotNull;
    public DBPDataKind getDataKind()
        JDBCColumnKeyType keyType = getKeyType();
import org.jkiss.code.Nullable;
        if (keyType != null) {
import org.jkiss.dbeaver.model.impl.struct.AbstractAttribute;
        if (keyType == null || !(keyType.isInUniqueKey() || keyType.isInReferenceKey())) {
 */
    @Override
 * JDBC abstract column
    protected JDBCColumnKeyType getKeyType()
    protected JDBCAttribute(DBSAttributeBase source)
            return columnImage;
 * DBeaver - Universal Database Manager
    {
package org.jkiss.dbeaver.model.impl.jdbc.struct;
        return JDBCUtils.resolveDataKind(getDataSource(), typeName, valueType);
        super(source);

        }
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
        } else if (keyType.isInReferenceKey()) {
    protected JDBCAttribute()
 *
    {
    {
    // Copy constructor
        return new DBIconComposite(columnImage, false, null, null, null, overImage);
            columnImage = getOverlayImage(columnImage, keyType);
 * you may not use this file except in compliance with the License.
    @Nullable
            overImage = DBIcon.OVER_KEY;
        if (keyType.isInUniqueKey()) {
 *
        return null;

import org.jkiss.dbeaver.model.DBPImage;

        if (overImage == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.struct.DBSObject;
