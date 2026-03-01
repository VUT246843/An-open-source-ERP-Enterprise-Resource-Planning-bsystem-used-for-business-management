 * Result set attribute meta data
     */
     * @return table metadata
     * Attribute label in result set
    /**
     * Owner table metadata

{
package org.jkiss.dbeaver.model.exec;
    @Nullable
     * @return read-only attribute state
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * Unless required by applicable law or agreed to in writing, software
    Object getSource();

     */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager

     * Source of this metadata object
    /**
     */
     * @return entity name
 * You may obtain a copy of the License at
    String getLabel();
 * See the License for the specific language governing permissions and
    @Nullable
    /**
    @NotNull
    boolean isReadOnly();
public interface DBCAttributeMetaData extends DBSAttributeBase
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
     * Owner entity name
    /**
 *
     * Read-only flag
     * @return label
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
}
     */
    DBCEntityMetaData getEntityMetaData();
import org.jkiss.code.NotNull;
/**

 *
 */
 * limitations under the License.
    String getEntityName();

     */
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.code.Nullable;

