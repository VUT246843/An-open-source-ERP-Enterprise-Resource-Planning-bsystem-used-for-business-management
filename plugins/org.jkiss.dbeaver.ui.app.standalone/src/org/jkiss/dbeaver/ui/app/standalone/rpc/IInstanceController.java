
        @RequestParameter("id") @NotNull String commandID);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    void closeAllEditors();
 * Unless required by applicable law or agreed to in writing, software

    void quit();
    void openDatabaseConnection(
 * DBeaver instance controller.

/*
import org.jkiss.utils.rest.RequestParameter;

    @RequestMapping("openConnection")

 *     http://www.apache.org/licenses/LICENSE-2.0
    @RequestMapping("quit")
 * you may not use this file except in compliance with the License.
import java.util.Map;
public interface IInstanceController extends ApplicationInstanceController {
    void executeWorkbenchCommand(
/**
        @RequestParameter("spec") @NotNull String connectionSpec);
        @RequestParameter("id") @NotNull String eventId,
    @RequestMapping("bringToFront")
        @RequestParameter("properties") @NotNull Map<String, Object> properties);

 * Copyright (C) 2010-2025 DBeaver Corp and others

 */
 *
    void bringToFront();
    @RequestMapping("closeEditors")
package org.jkiss.dbeaver.ui.app.standalone.rpc;
 * limitations under the License.
import org.jkiss.dbeaver.model.cli.ApplicationInstanceController;

import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *



    @RequestMapping("fireEvent")
 *
        @RequestParameter("files") @NotNull String[] fileNames);
 * You may obtain a copy of the License at
    void openExternalFiles(
    @RequestMapping("executeCommand")
    @RequestMapping("openFiles")
    void fireGlobalEvent(
import org.jkiss.utils.rest.RequestMapping;
 */
 * See the License for the specific language governing permissions and
}
 * DBeaver - Universal Database Manager
