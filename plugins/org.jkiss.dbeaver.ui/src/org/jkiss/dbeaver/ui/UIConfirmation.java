 *     http://www.apache.org/licenses/LICENSE-2.0
public abstract class UIConfirmation extends UITask<Boolean> {
} * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

    }
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

 *
 * limitations under the License.
    public boolean confirm() {
 */

        return CommonUtils.isTrue(execute());
