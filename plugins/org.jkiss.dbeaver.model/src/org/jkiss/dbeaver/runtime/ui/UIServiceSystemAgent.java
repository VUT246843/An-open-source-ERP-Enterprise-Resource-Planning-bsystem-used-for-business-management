/*

    /**
 * limitations under the License.
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
} * you may not use this file except in compliance with the License.

 */
 * System agent interactions
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 *
public interface UIServiceSystemAgent {
 * Unless required by applicable law or agreed to in writing, software
    void notifyAgent(String message, int status);
 *     http://www.apache.org/licenses/LICENSE-2.0

    /**
     */
 * See the License for the specific language governing permissions and
 *
     */
     * Timeout for long operations notification


 *

     * Notify agent
 * distributed under the License is distributed on an "AS IS" BASIS,
    long getLongOperationTimeout();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package org.jkiss.dbeaver.runtime.ui;
