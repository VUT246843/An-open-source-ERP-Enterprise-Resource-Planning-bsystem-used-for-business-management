    }
        // use slf4j instead of java.util.logging
        // we need to set it before any driver usage
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and


        // https://github.com/databricks/databricks-jdbc/blob/main/docs/LOGGING.md
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    static {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
}
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.databricks;
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
 * Unless required by applicable law or agreed to in writing, software
 *

 * you may not use this file except in compliance with the License.
    public DatabricksDataSourceProvider() {
 *
 *
public class DatabricksDataSourceProvider extends GenericDataSourceProvider {
 * limitations under the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    }
        System.setProperty("com.databricks.jdbc.loggerImpl", "SLF4JLOGGER");
 * Copyright (C) 2010-2025 DBeaver Corp and others
