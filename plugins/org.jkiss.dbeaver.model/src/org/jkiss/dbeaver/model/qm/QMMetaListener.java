 * you may not use this file except in compliance with the License.
 *
 * See the License for the specific language governing permissions and
     * QM collector will clean all closed objects after listeners notification.
     * Implementation must process all events in sync mode.
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
    void metaInfoChanged(@NotNull DBRProgressMonitor monitor, @NotNull List<QMMetaEvent> events);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.qm;
     */
 * DBC meta events listener
/*
 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,

public interface QMMetaListener {
import java.util.List;
 *
 */
     * Notifies listeners about new events.

 * You may obtain a copy of the License at
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others



/**
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
