
        p2UpdateHandlerActivation = null;
    @Override
 * limitations under the License.
        setId("org.jkiss.dbeaver.action.checkForUpdate");
    }
    }
        new DBeaverVersionChecker(true).schedule();
        IHandlerService srv = window.getService(IHandlerService.class);

        });
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 *
 * DBeaver - Universal Database Manager
    }
 * See the License for the specific language governing permissions and
 *
 * You may obtain a copy of the License at
        super(CoreMessages.actions_menu_check_update);
public class CheckForUpdateAction extends Action {
        IHandlerService srv = window.getService(IHandlerService.class);

import org.eclipse.ui.IWorkbenchWindow;

    public static void activateStandardHandler(IWorkbenchWindow window) {
            @Override
import org.eclipse.core.commands.ExecutionEvent;
            public Object execute(ExecutionEvent event) throws ExecutionException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        srv.deactivateHandler(p2UpdateHandlerActivation);
import org.eclipse.core.commands.AbstractHandler;
    public static final String P2_PLUGIN_ID = "org.eclipse.equinox.p2.ui.sdk";
import org.eclipse.jface.action.Action;
        }
    public static void deactivateStandardHandler(IWorkbenchWindow window) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.ui.handlers.IHandlerService;

                new CheckForUpdateAction().run();
            }
    private static IHandlerActivation p2UpdateHandlerActivation;

import org.eclipse.ui.handlers.IHandlerActivation;
        p2UpdateHandlerActivation = srv.activateHandler(CheckForUpdateAction.P2_UPDATE_COMMAND, new AbstractHandler() {
 * Unless required by applicable law or agreed to in writing, software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.core.CoreMessages;

    public void run() {
    public CheckForUpdateAction() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
            return;
}package org.jkiss.dbeaver.ui.app.standalone.update;
import org.eclipse.core.commands.ExecutionException;

        if (p2UpdateHandlerActivation == null) {
            return;
        if (p2UpdateHandlerActivation != null) {
 * you may not use this file except in compliance with the License.
    public static final String P2_UPDATE_COMMAND = "org.eclipse.equinox.p2.ui.sdk.update";
                return null;
/*
