    @Override
        if (container instanceof IResultSetContainerExt ext) {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetErrorAction;

import org.eclipse.core.runtime.IStatus;
 */

public final class GoToErrorAction implements IResultSetErrorAction {
    }
    public boolean isVisible(@NotNull IResultSetContainer container, @NotNull IStatus status) {
    @Override
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContainer;
 * See the License for the specific language governing permissions and
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ui.controls.resultset.view.actions;
        return container instanceof IResultSetContainerExt && status.getException() != null;

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            ext.showCurrentError();
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 *
 *
/*
    public void perform(@NotNull IResultSetContainer container, @NotNull IStatus status) {
 *
}
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContainerExt;
