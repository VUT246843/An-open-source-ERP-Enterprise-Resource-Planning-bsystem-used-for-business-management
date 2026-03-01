    private final String refAttributeName;


/**
 *
        return refAttributeName;
import org.jkiss.dbeaver.Log;
    @NotNull
        this.refAttributeName = refAttributeName;
 */
            return null;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
        return attributeName;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSEntity;
    public String getRefAttributeName() {

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (DBException e) {

 * See the License for the specific language governing permissions and
            return associatedEntity == null ? null : associatedEntity.getAttribute(new VoidProgressMonitor(), refAttributeName);
        this.refAttributeName = copy.refAttributeName;

        DBSEntity associatedEntity = foreignKey.getAssociatedEntity();
    }
    public DBVEntityForeignKeyColumn(DBVEntityForeignKey foreignKey, DBVEntityForeignKeyColumn copy) {
    @Override
 * Virtual FK column
    public String getName() {

    }
    private static final Log log = Log.getLog(DBVEntityForeignKeyColumn.class);
    private final DBVEntityForeignKey foreignKey;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        return attributeName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
            log.error("Error getting virtual FK referenced column", e);
public class DBVEntityForeignKeyColumn implements DBSTableForeignKeyColumn {
    public String getAttributeName() {
    }
}
        try {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;

    @Override
        return foreignKey.getEntity().getAttribute(new VoidProgressMonitor(), attributeName);

 * Unless required by applicable law or agreed to in writing, software
        this.foreignKey = foreignKey;
    public String toString() {
    }
 * You may obtain a copy of the License at

    public DBSEntityAttribute getReferencedColumn() {
 */
    private final String attributeName;
/*

    public DBVEntityForeignKeyColumn(DBVEntityForeignKey foreignKey, String attributeName, String refAttributeName) {
package org.jkiss.dbeaver.model.virtual;
import org.jkiss.dbeaver.DBException;
        return attributeName + ":" + refAttributeName;
        this.foreignKey = foreignKey;
import org.jkiss.code.NotNull;
        this.attributeName = attributeName;
        this.attributeName = copy.attributeName;
 * you may not use this file except in compliance with the License.
 *
    public DBSEntityAttribute getAttribute() {

