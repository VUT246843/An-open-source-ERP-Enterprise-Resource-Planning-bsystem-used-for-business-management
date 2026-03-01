 *
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
/*
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Used to create an H2GIS datasource that loads the H2GIS driver from an
 * H2GIS eclipse plugin to register a H2GIS spatial database to
 *

 *

 *
 */
 * See the License for the specific language governing permissions and

public class H2GISDataSourceProvider extends GenericDataSourceProvider {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
        return new H2GISDataSource(monitor, container);
 *
 */
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver, the  Universal Database Manager
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * DBeaver - Universal Database Manager
/**
}
 * limitations under the License.
 */
 * or contact directly: info_at_h2gis.org
 * For more information, please consult: <http://www.h2gis.org/>

 * limitations under the License.
    public H2GISDataSourceProvider() {
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * @author Erwan Bocher, CNRS
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * @author Serge Rider (serge@dbeaver.com)
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * eclipse extension point, see plugin.xml
package org.jkiss.dbeaver.ext.h2gis;
 *
 *
import org.jkiss.dbeaver.ext.h2gis.model.H2GISDataSource;
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
