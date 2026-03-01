
import java.nio.file.Path;

    DBTTaskRun getLastRun();
     * Refreshes run statistics. This is a <b>thread blocking operation</b>.
import org.jkiss.dbeaver.model.app.DBPProject;
    void setProperties(@NotNull Map<String, Object> properties);
 * You may obtain a copy of the License at
    String getId();

 * DBeaver - Universal Database Manager

    @NotNull
    Map<String, Object> getProperties();
    boolean isTemporary();
 */
    /**
    Path getRunLog(@NotNull DBTTaskRun run);

     *
    /**
/*
     * A duration that represent the total execution time allocated for a task to finish. When expired, the task is terminated.

import java.io.InputStream;
import java.util.Map;
    @NotNull

    void refreshRunStatistics();

 * you may not use this file except in compliance with the License.
    @NotNull
import java.io.IOException;

    Date getCreateTime();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
 *
}
    @Nullable
import org.jkiss.code.NotNull;
    DBTTaskRun[] getAllRuns();
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull

package org.jkiss.dbeaver.model.task;
 * Licensed under the Apache License, Version 2.0 (the "License");
    DBTTaskFolder getTaskFolder();

     * The duration must be ignored if it's not {@link Duration#isPositive()}.
    Date getUpdateTime();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    @NotNull
     * <p>

import org.jkiss.dbeaver.model.DBPNamedObject;
    DBTTaskType getType();
public interface DBTTask extends DBPNamedObject, DBPObjectWithDescription {

    @NotNull
import java.util.Date;
 */

    @NotNull
 * See the License for the specific language governing permissions and
    Duration getMaxExecutionTime();
    void removeRun(DBTTaskRun taskRun);
import java.time.Duration;

    DBPProject getProject();
 *
 * Task configuration
     */

    @NotNull
     */
    @Nullable
 *
    InputStream getRunLogInputStream(@NotNull DBTTaskRun run) throws DBException, IOException;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.Nullable;

     * @return total execution time allocated for a task to finish
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
/**
    void cleanRunStatistics();

