            default -> false;
 * Unless required by applicable law or agreed to in writing, software
/**
    public static final String PROP_CONNECTING = "connecting";
    static protected final Log log = Log.getLog(DataSourceContainerPropertyTester.class);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.core.expressions.PropertyTester;

{
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            return false;
    public static final String PROP_SUPPORTS_SCHEMAS = "supportsSchemas";
 *
        if (!(receiver instanceof DBPDataSourceContainer container)) {
        return switch (property) {

    public static final String PROP_CONNECTED = "connected";
        };
 * you may not use this file except in compliance with the License.
        }
            case PROP_DRIVER_ID -> container.getDriver().getId().equals(expectedValue);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DatabaseEditorPropertyTester
import org.jkiss.dbeaver.Log;
    public static final String PROP_DRIVER_CLASS = "driverClass";
import java.util.Objects;


 */
 * See the License for the specific language governing permissions and
 *
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.dbeaver.model.struct.DBStructUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String PROP_DRIVER_ID = "driverId";
/*


            case PROP_CONNECTED -> container.isConnected();
            case PROP_SUPPORTS_SCHEMAS -> DBStructUtils.isSchemasSupported(container);
 * You may obtain a copy of the License at
 *
package org.jkiss.dbeaver.ui.actions;
    }
 * limitations under the License.
    @Override
}public class DataSourceContainerPropertyTester extends PropertyTester
            case PROP_DRIVER_CLASS -> Objects.equals(container.getDriver().getDriverClassName(), expectedValue);
            case PROP_CONNECTING -> container.isConnecting();
 * distributed under the License is distributed on an "AS IS" BASIS,
