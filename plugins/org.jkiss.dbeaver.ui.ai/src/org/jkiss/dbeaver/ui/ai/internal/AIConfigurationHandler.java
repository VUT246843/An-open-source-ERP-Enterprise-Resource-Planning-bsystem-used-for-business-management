    public Object execute(ExecutionEvent event) {
 * limitations under the License.
public class AIConfigurationHandler extends AbstractHandler {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.ai.internal;
import org.jkiss.dbeaver.ui.ai.AIUIUtils;
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
    @Override
 * you may not use this file except in compliance with the License.
/*
import org.eclipse.core.commands.ExecutionEvent;
 */
import org.eclipse.core.commands.AbstractHandler;

import org.eclipse.ui.handlers.HandlerUtil;

 * You may obtain a copy of the License at
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        AIUIUtils.showPreferences(HandlerUtil.getActiveShell(event));
 *
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
