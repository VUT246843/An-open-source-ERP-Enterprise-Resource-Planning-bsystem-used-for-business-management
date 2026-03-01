    }
    HintType getHintType();
        return null;

    String getHintDescription();
    default DBPImage getHintIcon() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    int OPTION_READ_ONLY = 1;

    enum HintStyle {
        IMAGE,

import org.jkiss.code.NotNull;
 *
    @NotNull
 * You may obtain a copy of the License at
    default int getHintOptions() {
 * limitations under the License.
    String getHintText();
    }

    enum HintType {
        WEB,
 */
    }
 * See the License for the specific language governing permissions and
    @Nullable
public interface DBDValueHint {
    @NotNull
/**
        SOUND,



 * DBeaver - Universal Database Manager
        WARNING,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
    default HintStyle getHintStyle() {
 * Value hint

        return 0;
        ERROR

        return HintStyle.NORMAL;
    }
    @Nullable
        ACTION
import org.jkiss.dbeaver.model.DBPImage;
 */
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");

/*
 *
    @Nullable
 * you may not use this file except in compliance with the License.
        NORMAL,
import org.jkiss.code.Nullable;
 *
 * Unless required by applicable law or agreed to in writing, software
}
        STRING,
        NONE,
package org.jkiss.dbeaver.model.data.hints;
