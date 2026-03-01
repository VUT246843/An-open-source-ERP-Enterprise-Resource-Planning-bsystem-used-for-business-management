}
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void checkContextAlive(DBRProgressMonitor monitor) throws DBException {
    }
public class StreamExecutionContext extends AbstractExecutionContext<StreamDataSource, StreamDataSource> {
    }
/**
    @Override
        return new StreamTransferSession(monitor, this, purpose, task);
    }
    @Override
        // nothing to do
        return true;
 *

/*
    @NotNull
    public boolean isConnected() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 */
 * DBeaver - Universal Database Manager
 *
    public StreamTransferSession openSession(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionPurpose purpose, @NotNull String task) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }
    }
 */
    public void invalidateContext(@NotNull DBRProgressMonitor monitor, @NotNull DBCInvalidatePhase phase) throws DBException {
 * limitations under the License.
 * Data container transfer producer

    }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

    @Override
    @Override
package org.jkiss.dbeaver.tools.transfer.stream.model;


 * You may obtain a copy of the License at

        super(dataSource, purpose);
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void close() {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.impl.AbstractExecutionContext;
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;
    StreamExecutionContext(@NotNull StreamDataSource dataSource, String purpose) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


