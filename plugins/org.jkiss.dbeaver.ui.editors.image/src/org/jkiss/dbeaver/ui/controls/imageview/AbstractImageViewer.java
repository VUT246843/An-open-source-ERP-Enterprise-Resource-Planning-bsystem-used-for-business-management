

 * See the License for the specific language governing permissions and

    public void fillToolBar(IContributionManager toolBar) {
 *

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.controls.imageview;

     * Fills provided toolbar with actions

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    public Path getExternalFilePath() {
    /**
     */
public abstract class AbstractImageViewer extends Composite implements ImageViewer {
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
import java.nio.file.Path;
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public AbstractImageViewer(Composite parent, int style) {
 *
        super(parent, style);
        return null;
 *
import org.eclipse.jface.action.IContributionManager;
 */
     * @param toolBar toolbar to fill
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
     *
import org.jkiss.code.Nullable;
/*
    @Nullable
 * limitations under the License.
