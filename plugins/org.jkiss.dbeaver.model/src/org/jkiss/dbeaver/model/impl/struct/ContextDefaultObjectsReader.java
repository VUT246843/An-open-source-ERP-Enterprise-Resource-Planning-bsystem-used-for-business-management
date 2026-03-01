                    }
                    if (defObject != null) {
        return executionContext;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;
                        Class<? extends DBSObject> catalogChildrenType = defObject.getPrimaryChildType(monitor);
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                    defObject = contextDefaults.getDefaultSchema();
    public DBSObject getDefaultObject() {

    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
        return nodeList;
    public DBPDataSource getDataSource() {
                }

                enabled = false;
    public Collection<? extends DBSObject> getObjectList() {
                defaultObject = defObject;
    }
import org.jkiss.dbeaver.DBException;
    public void setReadNodes(boolean readNodes) {
        if (objectContainer == null) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import java.lang.reflect.InvocationTargetException;
                } else if (DBSSchema.class.isAssignableFrom(childType)) {
import org.jkiss.dbeaver.model.DBUtils;
        }

                        }
                    DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
    private DBSObject defaultObject;
                                defObject = defaultSchema;
    private Collection<? extends DBSObject> objectList;
        }
        this.dataSource = dataSource;
        }
 * Unless required by applicable law or agreed to in writing, software
                if (readNodes && navigatorModel != null) {
                            currentDatabaseInstanceName = defObject.getName();
                    Collections.singletonList(defObject) :
                        if (DBSSchema.class.isAssignableFrom(catalogChildrenType)) {
        if (contextDefaults == null) {
                enabled = true;
import java.util.Collections;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            monitor.done();

                        }
    private boolean enabled;
                        for (DBSObject child : objectList) {
    private final DBPDataSource dataSource;

            return;
        DBCExecutionContextDefaults<?,?> contextDefaults = null;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                                // Nothing can be changed
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.navigator.DBNUtils;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    }

                                if (node != null) {

            throw new InvocationTargetException(e);
            currentDatabaseInstanceName = null;
            Class<? extends DBSObject> childType = objectContainer.getPrimaryChildType(monitor);
    }
 * limitations under the License.
                objectList = objectContainer == null ?
                if (DBSCatalog.class.isAssignableFrom(childType)) {
            contextDefaults = executionContext.getContextDefaults();
                    objectContainer.getChildren(monitor);
 *
package org.jkiss.dbeaver.model.impl.struct;
                            if (DBUtils.getAdapter(DBSObjectContainer.class, child) != null) {
                            }
/*
import java.util.ArrayList;
                            DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
                                }

    private final List<DBNDatabaseNode> nodeList = new ArrayList<>();
        DBSObjectContainer objectContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
                            }
                    }
                            } else if (!contextDefaults.supportsCatalogChange()) {
    public List<DBNDatabaseNode> getNodeList() {
        try {
                    // Cache navigator nodes

        return dataSource;
    }
 *
        this.readNodes = readNodes;
 */
                DBNModel navigatorModel = DBNUtils.getNavigatorModel(navigatorSource);

import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.List;
        }
    }
                            }
            if (!DBSObjectContainer.class.isAssignableFrom(childType)) {
    }
                                DBNDatabaseNode node = navigatorModel.getNodeByObject(monitor, child, false);
    public String getDefaultCatalogName() {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 *
    public DBCExecutionContext getExecutionContext() {


                    if (objectList != null) {
        this.executionContext = executionContext;
    }
            return;
    private final DBCExecutionContext executionContext;
                                objectContainer = defObject;
                    defObject = contextDefaults.getDefaultCatalog();
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
    private boolean readNodes = false;

 *     http://www.apache.org/licenses/LICENSE-2.0
                                    nodeList.add(node);
        return defaultObject;
import org.jkiss.dbeaver.model.navigator.DBNModel;
    }
        return objectList;
public class ContextDefaultObjectsReader implements DBRRunnableWithProgress {
            } else {
 * See the License for the specific language governing permissions and
    // Remote instance node
    public ContextDefaultObjectsReader(DBPDataSource dataSource, DBCExecutionContext executionContext) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                            if (defaultSchema != null) {
            monitor.beginTask("Read default objects", 1);
                            if (contextDefaults.supportsSchemaChange()) {
}
    private String currentDatabaseInstanceName;
                DBSObjectContainer navigatorSource = objectContainer != null ? objectContainer :
                DBSObjectContainer defObject = null;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
                                objectContainer = null;

                }
        } finally {
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        if (executionContext != null) {
        return currentDatabaseInstanceName;
            }
import java.util.Collection;
        } catch (DBException e) {
