            }
            return new ArrayList<>();
            return new ArrayList<>();
                log.error("Null task run statistics returned");
    public static String buildRunLogFileName(String runId) {

import java.util.ArrayList;
        try (Reader reader = Files.newBufferedReader(metaFile)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
}
import java.util.List;
package org.jkiss.dbeaver.registry.task;
        }
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(TaskUtils.class);
    static final String RUN_LOG_PREFIX = "run_";
        if (!Files.exists(metaFile)) {
    static final String RUN_LOG_EXT = "log";
 *     http://www.apache.org/licenses/LICENSE-2.0
                return new ArrayList<>();
            var statistics = gson.fromJson(reader, RunStatistics.class);
        return RUN_LOG_PREFIX + runId + "." + RUN_LOG_EXT;
        } catch (Exception e) {
import org.jkiss.dbeaver.Log;
    }
        }

            log.error("Error reading task run statistics", e);
            if (statistics == null) {
 *

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * limitations under the License.
import java.nio.file.Path;
            return statistics.getRuns();
public class TaskUtils {

 *

import java.io.Reader;
 */
    public static List<TaskRunImpl> loadRunStatistics(Path metaFile, Gson gson) {
import com.google.gson.Gson;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * See the License for the specific language governing permissions and
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.nio.file.Files;
