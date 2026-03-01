import org.eclipse.ui.services.IDisposable;
interface Painter extends IDisposable {
package org.jkiss.dbeaver.ui.controls.decorations;
 */
 *
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

 * See the License for the specific language governing permissions and
 *
 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.eclipse.swt.graphics.GC;
 * you may not use this file except in compliance with the License.
    void paint(@NotNull GC gc);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    void update(int width, int height, double dt);
    void reset(int width, int height);

 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
