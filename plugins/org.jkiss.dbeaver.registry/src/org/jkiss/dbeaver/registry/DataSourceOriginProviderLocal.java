import org.jkiss.dbeaver.model.DBPDataSourceOrigin;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBPDataSourceOrigin getOrigin(
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import java.util.Map;
package org.jkiss.dbeaver.registry;
}
    @Override
 * You may obtain a copy of the License at

    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
/*
        // There is only one origin
{
public class DataSourceOriginProviderLocal implements DBPDataSourceOriginProvider
        @NotNull Map<String, Object> dsConfiguration,
    }
        @Nullable DBPExternalConfiguration externalConfiguration) {

        return DataSourceOriginLocal.INSTANCE;
/**
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSourceOriginProvider;
 */
 * limitations under the License.
    public static final String PROVIDER_ID = "local";
 * DataSourceOriginProviderLocal
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPExternalConfiguration;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
