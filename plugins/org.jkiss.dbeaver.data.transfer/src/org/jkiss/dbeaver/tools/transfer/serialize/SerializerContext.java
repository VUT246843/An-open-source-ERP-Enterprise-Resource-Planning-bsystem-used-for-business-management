 *
    }

/*
        this.errors.clear();

package org.jkiss.dbeaver.tools.transfer.serialize;
 * SerializerContext
import java.util.ArrayList;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 */
    }
import java.util.HashSet;
    public void addDataSourceFail(DBPDataSourceContainer dataSourceContainer) {

 * limitations under the License.
public class SerializerContext {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        failedDataSources.add(dataSourceContainer.getId());
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
    }
        errors.add(error);
        return failedDataSources.contains(dataSourceContainer.getId());
    private final Set<String> failedDataSources = new HashSet<>();
import java.util.Set;

 *
    public boolean isDataSourceFailed(DBPDataSourceContainer dataSourceContainer) {
        return res;
import java.util.List;

}
    public void addError(Throwable error) {
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
    public List<Throwable> getErrors() {
    }

        List<Throwable> res = new ArrayList<>(this.errors);

 * You may obtain a copy of the License at
    private final List<Throwable> errors = new ArrayList<>();
        return errors;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

    public List<Throwable> resetErrors() {
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
