 * Licensed under the Apache License, Version 2.0 (the "License");
    @ThemeColor(BaseEditorColors.COLOR_UNCOMMITTED)

import org.jkiss.dbeaver.ui.ThemeListener;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *
 * Theme settings
    @ThemeColor(BaseEditorColors.COLOR_TRANSACTION)
package org.jkiss.dbeaver.ui.controls.querylog;

 */
import org.eclipse.swt.graphics.Color;
/**
 * DBeaver - Universal Database Manager

    public volatile Color colorUncommitted;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.ThemeColor;
    public volatile Color colorTransaction;
    public static final QueryLogThemeSettings instance = new QueryLogThemeSettings();

/*
 * You may obtain a copy of the License at
 *
 *
    @ThemeColor(BaseEditorColors.COLOR_REVERTED)
    public volatile Color colorReverted;

import org.jkiss.dbeaver.ui.BaseEditorColors;
 * you may not use this file except in compliance with the License.
public class QueryLogThemeSettings extends ThemeListener {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
