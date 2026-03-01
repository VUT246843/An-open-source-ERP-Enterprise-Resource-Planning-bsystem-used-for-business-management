        service.showCodePopup(
public class ShowAuthCodeHandler extends AbstractHandler {
    @Override
import org.jkiss.dbeaver.runtime.ui.UIServiceAuth;
 * you may not use this file except in compliance with the License.
        var service = DBWorkbench.getService(UIServiceAuth.class);
    private static final Log log = Log.getLog(ShowAuthCodeHandler.class);
 * limitations under the License.
    public Object execute(ExecutionEvent event) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
            return null;
            log.debug("Auth UI service is not available");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.commands.ExecutionEvent;
package org.jkiss.dbeaver.ui.app.devtools.handlers;
        }

 */
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return null;
            URI.create("https://device.sso.us-east-2.amazonaws.com/"),
 * Licensed under the Apache License, Version 2.0 (the "License");

            new CompletableFuture<>()
        if (service == null) {
import org.eclipse.core.commands.AbstractHandler;
}
        );

 *

 * Unless required by applicable law or agreed to in writing, software
            "ABCD-EF00",
 *
import java.util.concurrent.CompletableFuture;
 * DBeaver - Universal Database Manager
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import java.net.URI;
