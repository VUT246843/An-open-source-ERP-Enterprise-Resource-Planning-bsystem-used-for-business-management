    void collectTaskInfo(@NotNull DBTTask task, @NotNull TaskInformation information);
import java.util.LinkedHashSet;
 *
 * you may not use this file except in compliance with the License.
        public void addDataSource(@Nullable DBPDataSourceContainer ds) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 */
import org.jkiss.utils.CommonUtils;
 */




        }
import org.jkiss.code.NotNull;

/**
        public Collection<String> getIOLocations() {
                dataSources.add(ds);
        @NotNull
        public void addInetAddress(@Nullable String hostOrIp) {
 *

public interface DBTTaskInfoCollector {

    class TaskInformation {
            }
        public void addLocation(@Nullable String pathOrURI) {
        }
        }
import java.util.Collection;
 * limitations under the License.
        public Collection<String> getInetAddresses() {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!CommonUtils.isEmpty(pathOrURI)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
            }
            return dataSources;
 * Task info collector.
        public Collection<DBPDataSourceContainer> getDataSources() {
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }

        private final Set<String> inetAddresses = new LinkedHashSet<>();
import org.jkiss.code.Nullable;
            if (ds != null) {
 * You may obtain a copy of the License at
        private final Set<String> ioLocations = new LinkedHashSet<>();
            return ioLocations;
            return inetAddresses;
/*
 * May be implemented by {@link DBTTaskHandler}
        @NotNull
            if (!CommonUtils.isEmpty(hostOrIp)) {
                inetAddresses.add(hostOrIp);
                ioLocations.add(pathOrURI);

 * Unless required by applicable law or agreed to in writing, software
        @NotNull

        private final Set<DBPDataSourceContainer> dataSources = new LinkedHashSet<>();
 * See the License for the specific language governing permissions and
}

package org.jkiss.dbeaver.model.task;
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import java.util.Set;
