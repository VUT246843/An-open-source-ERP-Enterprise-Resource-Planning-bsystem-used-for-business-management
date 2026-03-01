
    @Override
        @Nullable String errorStackTrace
    }
import org.jkiss.dbeaver.model.task.DBTTaskRun;
    @Override
/*


    @Override

import org.jkiss.utils.CommonUtils;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return duration >= 0;

        extraMessage = message;
    @NotNull
import org.jkiss.code.Nullable;
    @NotNull
    public String getId() {
public class TaskRunImpl implements DBTTaskRun {
    private final String startedBy;
        this.startUser = startUser;
    private final String id;
 * TaskRunImpl
    public boolean isFinished() {

    private long duration = -1;
    @Override
        return errorStackTrace;
    @NotNull
    }
    }
    public Date getStartTime() {
 * Unless required by applicable law or agreed to in writing, software

    }
    @Nullable
    }
        this.id = id;
import org.jkiss.code.NotNull;
    }
        this.errorMessage = errorMessage;
        this.startTime = startTime;
    public void setErrorMessage(String errorMessage) {

/**
    public int hashCode() {
    public void setExtraMessage(String message) {
    @Override
    private String errorStackTrace;
 */
    public String getStartedBy() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String errorMessage;
    public String toString() {
    @Override
    }
    private String extraMessage;
    @Override
        @NotNull String id,
        this.startedBy = startedBy;

 * you may not use this file except in compliance with the License.
    @Override
    public boolean equals(Object obj) {
    public String getErrorMessage() {

}
        @NotNull Date startTime,
    @Override
        @NotNull String startUser,
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isRunSuccess() {
        return id + "; " + startUser + "; " + startedBy + "; " + (isRunSuccess() ? "Success" : CommonUtils.notEmpty(errorMessage));


    public void setErrorStackTrace(String errorStackTrace) {
 * You may obtain a copy of the License at
    }
    }
        return startUser;

package org.jkiss.dbeaver.registry.task;
        return errorMessage == null;
        this.errorStackTrace = errorStackTrace;
    @Override

    @NotNull
        this.errorStackTrace = errorStackTrace;
    @Override
    }
    }

 *
    }

        return errorMessage;
    private final Date startTime;
 * See the License for the specific language governing permissions and
    public long getRunDuration() {
 */
        @NotNull String startedBy,
    ) {
    }
    public String getExtraMessage() {
        return extraMessage;
        return startTime;
        return startedBy;
    @Nullable
    public void setRunDuration(long duration) {
import java.util.Date;
        return id;

    @Nullable
        return id.hashCode();
    public String getStartUser() {

        this.duration = duration;
    protected TaskRunImpl(
        this.errorMessage = errorMessage;
    }
 *
    private final String startUser;
    }
 *
        return duration;
 * DBeaver - Universal Database Manager
    public String getErrorStackTrace() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Copyright (C) 2010-2024 DBeaver Corp and others

        return obj instanceof TaskRunImpl && id.equals(((TaskRunImpl) obj).id);
    }
    }
        @Nullable String errorMessage,
