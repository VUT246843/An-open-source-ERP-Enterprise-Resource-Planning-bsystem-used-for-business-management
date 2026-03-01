*
*
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
        if (dataSource.getInfo().isDynamicMetadata()) {
        DBPDataSource dataSource = object.getDataContainer().getDataSource();
            monitor,
public class SQLGeneratorDDLFromResultSet extends SQLGenerator<IResultSetController> {
            return;
import org.jkiss.dbeaver.model.sql.SQLUtils;
* Copyright (C) 2010-2024 DBeaver Corp and others
        
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
        DBCExecutionContext executionContext = DBUtils.getDefaultContext(dataSource, true);
        }

        DatabaseMappingContainer mapping = new DatabaseMappingContainer(new DatabaseConsumerSettings(), dataContainer);
        if (ArrayUtils.isEmpty(ddl)) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            return;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
* You may obtain a copy of the License at
* DBeaver - Universal Database Manager
        
import org.jkiss.dbeaver.DBException;
* Licensed under the Apache License, Version 2.0 (the "License");
        

        while (!DBSEntity.class.isAssignableFrom(objContainer.getPrimaryChildType(monitor))) {
*     http://www.apache.org/licenses/LICENSE-2.0
    
* limitations under the License.
        @NotNull DBRProgressMonitor monitor, @NotNull StringBuilder sql, @NotNull IResultSetController object
            return;
* you may not use this file except in compliance with the License.
            Collections.emptyMap());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetDataContainer;
*
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingType;
import org.jkiss.dbeaver.model.DBPDataSource;
        String text = SQLUtils.generateScript(dataSource, ddl, true);
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferUtils;
        mapping.refreshMappingType(monitor, DatabaseMappingType.create, true, true);
        ResultSetDataContainer dataContainer = new ResultSetDataContainer(object, new ResultSetDataContainerOptions());
            sql.append(SQLEditorMessages.sql_generator_no_ddl_text);
    protected void generateSQL(
        return false;
            objContainer,
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
    }
*/
    @Override
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;
        }

            }
        }
    ) throws DBException {
    @Override
            if (obj instanceof DBSObjectContainer) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
/*

        sql.append(text);
        }

}
        }
        DBSDataContainer container = object.getModel().getAttributes()[0].getDataContainer();
package org.jkiss.dbeaver.ui.editors.sql.generator;
import org.jkiss.code.NotNull;
            executionContext,
            objContainer = (DBSObjectContainer) objContainer.getChildren(monitor).iterator().next();
        if (objContainer == null && dataSource instanceof DBSObjectContainer) {
import org.jkiss.dbeaver.model.sql.generator.SQLGenerator;
import org.jkiss.utils.ArrayUtils;
    }
* See the License for the specific language governing permissions and
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
* Unless required by applicable law or agreed to in writing, software
        DBEPersistAction[] ddl = DatabaseTransferUtils.generateTargetTableDDL(
        DBSObjectContainer objContainer = null;
            sql.append(SQLEditorMessages.sql_generator_no_obj_container_text);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetDataContainerOptions;
* distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBUtils;
            mapping,

        if (objContainer == null) {
import java.util.Collections;
            sql.append(SQLEditorMessages.sql_generator_nonsql_text);
    public boolean hasOptions() {
            objContainer = (DBSObjectContainer) dataSource;
        for (DBSObject obj = container; obj != null; obj = obj.getParentObject()) {
                objContainer = (DBSObjectContainer) obj;

