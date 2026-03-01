        }
            } else {
        }
    }
    @Override
            if (valueHint instanceof DBDValueHintActionHandler actionHandler) {
            return ah.getActionText();
    private final IResultSetController controller;
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.runtime.DBWorkbench;
 * you may not use this file except in compliance with the License.
        this.valueHint = valueHint;
import org.jkiss.utils.CommonUtils;
    @Override
    @Nullable
    @Nullable
 * You may obtain a copy of the License at
    @Override
        if (valueHint instanceof DBDValueHintActionHandler ah) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
/*
 * limitations under the License.

        return CommonUtils.isBitSet(valueHint.getHintOptions(), DBDValueHint.OPTION_READ_ONLY);
        this.controller = controller;
    public void performAction(@NotNull IGridController grid, @NotNull Point location, long state) {
    private final DBDValueHint valueHint;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
}
    public boolean isReadOnly() {

package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
        } catch (DBException e) {
    public boolean isError() {
 */
    }
    @Override
    @Nullable
 * Spreadsheet cell hint implementation

import org.jkiss.dbeaver.ui.data.DBDValueHintActionHandler;
                actionHandler.performAction(controller, location, state);
import org.jkiss.dbeaver.model.exec.DBCException;
/**
    public String getActionToolTip() {
        return null;
 * See the License for the specific language governing permissions and


        return valueHint.getHintStyle() == DBDValueHint.HintStyle.ERROR;
    public DBPImage getIcon() {
            DBWorkbench.getPlatformUI().showError("Hint error", "Error execution hint action", e);
    }

 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

 */
    }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 *

import org.jkiss.dbeaver.model.DBPImage;
    }

        return valueHint instanceof DBDValueHintActionHandler;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
import org.eclipse.swt.graphics.Point;
        return valueHint.getHintText();

    }
                throw new DBCException("Hint doesn't support action");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

        try {
public class SpreadsheetHint implements IGridHint {
        return valueHint.getHintDescription();
 *
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software
    public SpreadsheetHint(IResultSetController controller, DBDValueHint valueHint) {
    public String getText() {
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridHint;
    public String getHintLabel() {
    public boolean hasAction() {
            }
        return valueHint.getHintIcon();
    }
import org.jkiss.dbeaver.ui.controls.lightgrid.IGridController;
    }
