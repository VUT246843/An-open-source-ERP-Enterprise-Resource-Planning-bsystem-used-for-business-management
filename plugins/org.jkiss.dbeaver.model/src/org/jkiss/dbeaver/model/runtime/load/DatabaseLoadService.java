 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(serviceName);
 * limitations under the License.
    }
    }
 * Lazy loading service

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.runtime.load;
        super(serviceName);
public abstract class DatabaseLoadService<RESULT> extends AbstractLoadService<RESULT> {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * @param <RESULT> result type
        return dataSource;

 * Unless required by applicable law or agreed to in writing, software
 *

    protected DatabaseLoadService(String serviceName, DBCExecutionContext context) {
    }
    public Object getFamily() {
import org.jkiss.dbeaver.model.struct.DBSWrapper;
 * You may obtain a copy of the License at
        this.dataSource = context.getDataSource();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }

} *

    private DBPDataSource dataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    protected DatabaseLoadService(String serviceName, DBPDataSource dataSource) {
    @Override
/*
/**
    protected DatabaseLoadService(String serviceName, DBSWrapper wrapper) {
        this(serviceName, wrapper == null || wrapper.getObject() == null ? null : wrapper.getObject().getDataSource());
 */
 */

import org.jkiss.dbeaver.model.DBPDataSource;
 *
        this.dataSource = dataSource;
