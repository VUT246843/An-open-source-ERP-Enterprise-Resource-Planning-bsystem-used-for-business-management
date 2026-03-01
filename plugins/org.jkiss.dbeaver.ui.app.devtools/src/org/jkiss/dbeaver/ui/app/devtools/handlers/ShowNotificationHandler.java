public class ShowNotificationHandler extends AbstractHandler {
        if (message == null) {
 *
}
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

        }
    }
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DBWorkbench.getPlatformUI().showNotification("Test notification", message, false, null);
package org.jkiss.dbeaver.ui.app.devtools.handlers;
    private static String lastMessage = "This is a test message";
 * See the License for the specific language governing permissions and

        return null;
        lastMessage = message;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.AbstractHandler;

 *
import org.eclipse.core.commands.ExecutionEvent;
 */
            return null;
    public Object execute(ExecutionEvent event) {
        String message = DBWorkbench.getPlatformUI().promptProperty("Enter message", lastMessage);
    @Override
 *
/*
 * you may not use this file except in compliance with the License.
