 *
        super(DataSourceProviderRegistry.getInstance().getDataSourceProvider(


import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        );
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String DRIVER_ID = "file-stream-driver";
}
 *
    }

 */
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * You may obtain a copy of the License at
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.tools.transfer.stream.model;
/*
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * StreamDataSourceDialect
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            StreamDataSourceProvider.PROVIDER_ID), DRIVER_ID
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
    public StreamDataSourceDriver() {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
 * you may not use this file except in compliance with the License.
public class StreamDataSourceDriver extends DriverDescriptor {
    public static final DBPDriver INSTANCE = new StreamDataSourceDriver();
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
