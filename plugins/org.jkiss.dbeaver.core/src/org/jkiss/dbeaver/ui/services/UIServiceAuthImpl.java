                UIUtils.syncExec(dialog::close);
    public void showCodePopup(
            future.handle((result, exception) -> {
 *
import java.net.URI;


        @NotNull String userCode,
        UIUtils.asyncExec(() -> {
                // No shell - can't show the dialog
    ) {
        @NotNull URI browserUrl,
                return;
import org.jkiss.dbeaver.runtime.ui.UIServiceAuth;
/*
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Shell;
package org.jkiss.dbeaver.ui.services;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
            dialog.open();
public class UIServiceAuthImpl implements UIServiceAuth {
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
            Shell shell = UIUtils.getActiveWorkbenchShell();
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull CompletableFuture<Void> future
                return null;
 */

 *
 *
            CodeAuthDialog dialog = new CodeAuthDialog(shell, browserUrl, userCode, future);
    }
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
            });
 * You may obtain a copy of the License at
 * limitations under the License.
        });
    @Override
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.dialogs.CodeAuthDialog;
            }
import java.util.concurrent.CompletableFuture;
import org.jkiss.code.NotNull;
            if (shell == null) {
