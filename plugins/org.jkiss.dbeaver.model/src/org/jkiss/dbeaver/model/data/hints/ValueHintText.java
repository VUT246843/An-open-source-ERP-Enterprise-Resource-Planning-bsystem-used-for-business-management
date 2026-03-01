
 * Unless required by applicable law or agreed to in writing, software
    @Override

 *
 * DBeaver - Universal Database Manager

 * ValueHintText
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    public String getHintText() {

 *

    }
    }
        return icon;

import org.jkiss.code.NotNull;
/*
    @Nullable
    }
 *
    }
import org.jkiss.dbeaver.model.DBPImage;
public class ValueHintText implements DBDValueHint {

    public DBPImage getHintIcon() {
    private final DBPImage icon;
package org.jkiss.dbeaver.model.data.hints;
    public HintType getHintType() {
 * You may obtain a copy of the License at
    @NotNull
 */
    private final String text;
 * See the License for the specific language governing permissions and
    @Override
    public String getHintDescription() {
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
        return description;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override

 */
        return text;
 * limitations under the License.
        this.icon = icon;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.description = description;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}        this.text = text;
/**
import org.jkiss.code.Nullable;
        return HintType.STRING;
    @Override
    private final String description;
    }
    public ValueHintText(@NotNull String text, @Nullable String description, @Nullable DBPImage icon) {
