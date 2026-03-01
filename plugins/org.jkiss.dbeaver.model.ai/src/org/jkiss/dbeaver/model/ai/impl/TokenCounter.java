     */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Count tokens for the WHOLE message as the model sees it (role + content if applicable).

 *
 * Unless required by applicable law or agreed to in writing, software
public interface TokenCounter {
package org.jkiss.dbeaver.model.ai.impl;
 * distributed under the License is distributed on an "AS IS" BASIS,
    int count(String message);
}
 */
    String truncateToTokenLimit(String message, int tokenLimit);
 * Copyright (C) 2010-2025 DBeaver Corp and others

/*
    /**
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
