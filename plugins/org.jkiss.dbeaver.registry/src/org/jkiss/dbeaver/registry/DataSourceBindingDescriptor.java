            }
    private static final Log log = Log.getLog(DataSourceBindingDescriptor.class);
import org.jkiss.dbeaver.Log;

 * limitations under the License.
public class DataSourceBindingDescriptor extends AbstractContextDescriptor {
}
 * Copyright (C) 2010-2025 DBeaver Corp and others

            if (!CommonUtils.isEmpty(id) && !driver.getProviderDescriptor().matchesId(id)) {
                return true;
                        expression.evaluate(makeContext(driver, context)));
        DataSourceInfo(IConfigurationElement cfg) {
import org.jkiss.utils.CommonUtils;
import java.util.List;
                    return CommonUtils.toBoolean(

import org.jkiss.dbeaver.DBException;
            if (!CommonUtils.isEmpty(this.driver) && !driver.matchesId(this.driver)) {
/**

 */
            String condition = cfg.getAttribute("if");
 */
import org.apache.commons.jexl3.JexlExpression;
 * you may not use this file except in compliance with the License.
    private List<DataSourceInfo> dataSources = new ArrayList<>();
    public boolean isDriverApplicable(DBPDriver driver) {
 * Datasource binding descriptor
    public static class DataSourceInfo {
        }
                }

                    log.debug("Error evaluating binding expression '" + expression + "'", e);
        private String driver;
        }
            if (expression != null) {
                } catch (Exception e) {

            if (dsi.appliesTo(driver, null)) {
        return false;

        private String id;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;

            }
 * See the License for the specific language governing permissions and
                    log.warn("Can't parse auth model datasource expression: " + condition, ex); //$NON-NLS-1$
        }
            this.dataSources.add(new DataSourceInfo(dsConfig));
        for (IConfigurationElement dsConfig : config.getChildren("datasource")) {
        }
package org.jkiss.dbeaver.registry;
            }
                    this.expression = parseExpression(condition);
import java.util.ArrayList;
            return true;
        super(config);
 *

            if (!CommonUtils.isEmpty(condition)) {
            this.driver = cfg.getAttribute("driver");
    }
        for (DataSourceInfo dsi : dataSources) {
                }

    public DataSourceBindingDescriptor(IConfigurationElement config) {
 *
                try {
 * DBeaver - Universal Database Manager
    }
        private JexlExpression expression;
            this.id = cfg.getAttribute("id");
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
                return false;
        if (dataSources.isEmpty()) {
            return true;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
                try {
            }
                } catch (DBException ex) {
 * You may obtain a copy of the License at
        }
                return false;


        public boolean appliesTo(DBPDriver driver, Object context) {
                    return false;
import org.jkiss.dbeaver.model.connection.DBPDriver;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Unless required by applicable law or agreed to in writing, software
