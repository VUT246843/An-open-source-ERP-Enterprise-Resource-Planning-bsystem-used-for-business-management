package org.jkiss.dbeaver.model.auth;
 * See the License for the specific language governing permissions and

public interface SMSessionExternal extends SMSession {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
import java.util.Map;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Federated session
/*
 */
    Map<String, Object> getAuthParameters();
 * DBeaver - Universal Database Manager
 * limitations under the License.

    @NotNull
 *
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * You may obtain a copy of the License at

