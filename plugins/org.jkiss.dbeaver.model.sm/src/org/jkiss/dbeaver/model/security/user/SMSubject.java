        metaParameters.clear();
        @NotNull String subjectId,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * you may not use this file except in compliance with the License.
    ) {
        return subjectId;
    @NotNull
import java.util.LinkedHashMap;
    public void setMetaParameter(String name, String value) {
    private final boolean secretStorage;
    }
public abstract class SMSubject implements DBPNamedObject {
    }

        return metaParameters;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Map<String, String> getMetaParameters() {
        }

package org.jkiss.dbeaver.model.security.user;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        @Nullable Map<String, String> metaParameters,
        this.subjectId = subjectId;
import java.util.Map;
    @NotNull
    public boolean isSecretStorage() {

    }
    public String getSubjectId() {

        return secretStorage;
    @NotNull
 * You may obtain a copy of the License at

import org.jkiss.code.Nullable;
 */
 * Unless required by applicable law or agreed to in writing, software
/*
        if (metaParameters != null) {
    }
 *
 *

        metaParameters.putAll(parameters);
        this.secretStorage = secretStorage;
import org.jkiss.dbeaver.model.DBPNamedObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}

    private final Map<String, String> metaParameters = new LinkedHashMap<>();
    public void setMetaParameters(@NotNull Map<String, String> parameters) {
import org.jkiss.code.NotNull;
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
    protected final String subjectId;
    }
        boolean secretStorage
        metaParameters.put(name, value);
    @NotNull
 * DBeaver - Universal Database Manager
            this.metaParameters.putAll(metaParameters);
    public SMSubject(

