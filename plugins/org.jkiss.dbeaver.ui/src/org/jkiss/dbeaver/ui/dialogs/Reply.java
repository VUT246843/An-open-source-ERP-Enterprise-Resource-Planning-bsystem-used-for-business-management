    public static final Reply CANCEL = new Reply(IDialogConstants.CANCEL_LABEL);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final Reply YES = new Reply(IDialogConstants.YES_LABEL);
    public static final Reply OK = new Reply(IDialogConstants.OK_LABEL);
    public static final Reply NO = new Reply(IDialogConstants.NO_LABEL);
 *
import org.jkiss.code.NotNull;
    public static final Reply CLOSE = new Reply(IDialogConstants.CLOSE_LABEL);
 * DBeaver - Universal Database Manager

public final class Reply {
    public Reply(@NotNull String displayString) {
        this.displayString = displayString;
    private final String displayString;
 *

}
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.dialogs.IDialogConstants;
    public String getDisplayString() {
 */
 *
    }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.ui.dialogs;
    }
        return displayString;
    @NotNull
 * limitations under the License.
 * See the License for the specific language governing permissions and

/*
