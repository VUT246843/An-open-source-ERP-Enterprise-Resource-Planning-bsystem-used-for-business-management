    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.gbase8s;
    @Override
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 *
 * @author Chao Tian
 */
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.gbase8s.model.meta.GBase8sMetaModel;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            throws DBException {
    public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
}


        return new GBase8sDataSource(monitor, container, new GBase8sMetaModel());
 *
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.DBException;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
import org.jkiss.dbeaver.ext.gbase8s.model.GBase8sDataSource;

/*
 * See the License for the specific language governing permissions and
 */
public class GBase8sDataSourceProvider extends GenericDataSourceProvider {
import org.jkiss.code.NotNull;

