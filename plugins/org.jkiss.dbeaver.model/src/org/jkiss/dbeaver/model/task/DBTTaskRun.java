 */
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.task;
 * Licensed under the Apache License, Version 2.0 (the "License");

/**
    @NotNull
    @Nullable
 * limitations under the License.
    boolean isFinished();

    String getErrorStackTrace();
 * DBeaver - Universal Database Manager

    @NotNull
}
    String getStartUser();

import java.util.Date;
 *
    long getRunDuration();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public interface DBTTaskRun {
 * Unless required by applicable law or agreed to in writing, software
    String getId();
 *

    String getErrorMessage();
    String getStartedBy();
import org.jkiss.code.NotNull;
    Date getStartTime();
    boolean isRunSuccess();


import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,

    @NotNull
    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Task run information
    @Nullable

 */
/*
    @Nullable
 *
    String getExtraMessage();
 * You may obtain a copy of the License at


