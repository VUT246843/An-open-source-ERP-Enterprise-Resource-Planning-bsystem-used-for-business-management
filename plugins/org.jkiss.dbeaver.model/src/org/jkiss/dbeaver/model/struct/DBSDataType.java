    @Nullable
    DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor)

     * @return component type or null
     * For collection types returns element type
 * You may obtain a copy of the License at

 * Data type descriptor.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
import org.jkiss.code.NotNull;
    }
 * See the License for the specific language governing permissions and
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.struct;

}
    @NotNull

    DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute);
public interface DBSDataType extends DBSObject, DBSTypedObject
 * limitations under the License.
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**

    
{
        return this.getDataKind().isComplex() == metaData.getDataKind().isComplex();
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException;
    int getMinScale();
    int getMaxScale();

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
 *
     */
 * you may not use this file except in compliance with the License.
    Object geTypeExtension();
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;

 *
    default boolean isStructurallyConsistentTypeWith(@NotNull DBCAttributeMetaData metaData) {
/*
