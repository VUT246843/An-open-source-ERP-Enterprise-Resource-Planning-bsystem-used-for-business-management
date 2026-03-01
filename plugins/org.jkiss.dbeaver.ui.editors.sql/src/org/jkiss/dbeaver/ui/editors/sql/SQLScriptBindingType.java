        public void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec) {
import org.jkiss.utils.CommonUtils;
        return name;
    public String getName() {
    EXTERNAL("N/A", "External binding (IDE resources)") {
            for (Map.Entry<String, String> param : params.entrySet()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Override
            if (!CommonUtils.isEmpty(cfg.getHostName())) {
        }
    PARAMS("PARAMS", SQLEditorMessages.sql_script_binding_type_radio_button_connection_parameters) { //$NON-NLS-1$
    private final String description;
    };
        public void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec) {
 * See the License for the specific language governing permissions and
    },
 *

            DBPConnectionConfiguration cfg = dataSource.getConnectionConfiguration();

                    }
        return description;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.DataSourceUtils;
    },
    },
            spec.append(DataSourceUtils.PARAM_ID).append("=").append(dataSource.getId()); //$NON-NLS-1$
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        public void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    String propName = prop.getKey();
                if (!handler.isEnabled()) {
        }
                params.put(DataSourceUtils.PARAM_USER, cfg.getUserName());
                spec.append(param.getKey()).append("=").append(param.getValue());
            boolean first = true;
            spec.append(DataSourceUtils.PARAM_NAME).append("=").append(dataSource.getName()); //$NON-NLS-1$
import java.util.LinkedHashMap;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
    }
            // do nothing
            }
        }
        @Override
        public void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec) {
                        params.put("handler." + handler.getId() + "." + propName, CommonUtils.toString(prop.getValue()));
 *
 * you may not use this file except in compliance with the License.
            }
    ID("ID", SQLEditorMessages.sql_script_binding_type_radio_button_connection_unique) { //$NON-NLS-1$

                params.put(DataSourceUtils.PARAM_HOST, cfg.getHostName());

    public abstract void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec);
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * Unless required by applicable law or agreed to in writing, software
public enum SQLScriptBindingType {

            }
        }
                params.put(DataSourceUtils.PARAM_SERVER, cfg.getServerName());
                }
            }
    NAME("NAME", SQLEditorMessages.sql_script_binding_type_radio_button_connection_name) { //$NON-NLS-1$
 * You may obtain a copy of the License at
            spec.append(DataSourceUtils.PARAM_URL).append("=").append(dataSource.getConnectionConfiguration().getUrl()); //$NON-NLS-1$
import java.util.Map;
    URL("URL", SQLEditorMessages.sql_script_binding_type_radio_button_connection_url) { //$NON-NLS-1$
                    if (propName.contains(DataSourceUtils.PARAM_SERVER) || propName.contains(DataSourceUtils.PARAM_HOST) || propName.contains(DataSourceUtils.PARAM_PORT)) {
            Map<String,String> params = new LinkedHashMap<>();
/*
        this.description = description;
                for (Map.Entry<String, Object> prop : handler.getProperties().entrySet()) {
            if (!CommonUtils.isEmpty(cfg.getServerName())) {
}
 * Script-to-datasource binding type
/**
            for (DBWHandlerConfiguration handler : cfg.getHandlers()) {
    },
            if (!CommonUtils.isEmpty(cfg.getDatabaseName())) {

            if (!CommonUtils.isEmpty(cfg.getHostPort())) {
            if (!CommonUtils.isEmpty(cfg.getUserName())) {


        public void appendSpec(DBPDataSourceContainer dataSource, StringBuilder spec) {
            }
                if (!first) spec.append("|");
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public String getDescription() {
        }
        @Override
            }
                params.put(DataSourceUtils.PARAM_PORT, cfg.getHostPort());
package org.jkiss.dbeaver.ui.editors.sql;
                params.put(DataSourceUtils.PARAM_DATABASE, cfg.getDatabaseName());
        @Override
                first = false;
 */
        @Override
                    continue;
        this.name = name;
    }
                }
    private final String name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    SQLScriptBindingType(String name, String description) {
 */


