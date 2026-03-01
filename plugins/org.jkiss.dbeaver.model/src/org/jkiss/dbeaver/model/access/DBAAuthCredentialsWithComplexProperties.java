/**
 * limitations under the License.
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.access;

}
     * Updates info based on properties from DBAAuthCredentialsForm.
    void updateCredentialsFromComplexProperties(@NotNull Map<String, ?> complexProperties);
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.code.NotNull;

/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
public interface DBAAuthCredentialsWithComplexProperties {
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    /**
 *
 *
     */
 * Auth credentials that uses DBAAuthCredentialsForm for generating auth model credentials form.
