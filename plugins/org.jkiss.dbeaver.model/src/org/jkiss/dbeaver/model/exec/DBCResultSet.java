    String FEATURE_NAME_DOCUMENT        = "document";

    Object getAttributeValue(String name) throws DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
     * @throws DBCException
     */
import org.jkiss.code.NotNull;


 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDValueMeta;
 */
    @Nullable
    @Nullable
    @NotNull
import org.jkiss.dbeaver.model.DBPObject;
 */
 *
     * @param index    index (zero-based)

 * DBeaver - Universal Database Manager
    String FEATURE_NAME_JDBC            = "jdbc";
    @NotNull
    String getResultSetName() throws DBCException;
 * you may not use this file except in compliance with the License.
    DBDValueMeta getAttributeValueMeta(int index) throws DBCException;
}
 * Unless required by applicable law or agreed to in writing, software
    DBDValueMeta getRowMeta() throws DBCException;
    @Nullable
    Object getAttributeValue(int index) throws DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and

 *
import org.jkiss.dbeaver.model.DBPCloseableObject;

package org.jkiss.dbeaver.model.exec;
 * You may obtain a copy of the License at
    String FEATURE_NAME_LOCAL           = "local";
 * distributed under the License is distributed on an "AS IS" BASIS,


{
    DBCStatement getSourceStatement();
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    @Nullable

/**
    DBCSession getSession();
/*
     * @return         value (nullable)
    boolean nextRow() throws DBCException;
    /**
    DBCResultSetMetaData getMeta() throws DBCException;
     * Gets attribute value
public interface DBCResultSet extends DBPObject, DBPCloseableObject
    @Nullable
 * DBCResultSet
    boolean moveTo(int position) throws DBCException;
    Object getFeature(String name);

    @NotNull
