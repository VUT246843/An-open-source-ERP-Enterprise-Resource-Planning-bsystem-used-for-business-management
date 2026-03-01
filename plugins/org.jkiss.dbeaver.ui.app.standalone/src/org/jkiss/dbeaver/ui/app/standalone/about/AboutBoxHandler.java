import org.eclipse.core.commands.ExecutionEvent;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.app.standalone.about;
 *
}    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.ui.handlers.HandlerUtil;

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
        AboutBoxDialog dialog = new AboutBoxDialog(HandlerUtil.getActiveShellChecked(event));
 *
    }
        return null;
 * DBeaver - Universal Database Manager

        dialog.open();
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override

public class AboutBoxHandler extends AbstractHandler {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionException;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and
 *
