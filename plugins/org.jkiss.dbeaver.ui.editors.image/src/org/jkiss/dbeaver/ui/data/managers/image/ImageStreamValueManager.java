        return imageDetector.isImage() ? MatchType.PRIMARY : MatchType.NONE;
            if (!content.isNull()) {
public class ImageStreamValueManager implements IStreamValueManager {
import org.eclipse.swt.graphics.ImageLoader;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        }
        private final DBDContent content;
                        isImage = true;
import org.jkiss.dbeaver.ui.data.IValueController;
    public MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
            return isImage;
        {
                }
 */
                catch (Exception e) {
        return new ImageEditorPart(controller);
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException
 *
 * Unless required by applicable law or agreed to in writing, software
            } catch (Throwable e) {
 *
}
 * limitations under the License.
                imageDetector.run(monitor);

/**
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                return MatchType.NONE;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            try {
import org.jkiss.dbeaver.Log;

                    DBDContentStorage contents = content.getContents(monitor);
        {
    }
        return new ImagePanelEditor();
            }
import java.lang.reflect.InvocationTargetException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
                    //log.debug("Can't detect image type: " + e.getMessage());
                    // this is not an image
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
import java.io.InputStream;
        if (!DBUtils.isNullValue(value)) {
    @Override
 * Hex editor manager
 * DBeaver - Universal Database Manager


import org.jkiss.dbeaver.model.DBUtils;
    }

        private ImageDetector(DBDContent content)
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
                    }
        }
 */
import org.eclipse.ui.IEditorPart;
 * Licensed under the Apache License, Version 2.0 (the "License");
        private boolean isImage;
    @Override
        ImageDetector imageDetector = new ImageDetector(value);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException
 * you may not use this file except in compliance with the License.

    }
        @Override
        {

import org.jkiss.dbeaver.ui.data.IStreamValueManager;
    {
    private static class ImageDetector implements DBRRunnableWithProgress {
    @Override
import org.jkiss.dbeaver.model.data.DBDContent;
package org.jkiss.dbeaver.ui.data.managers.image;


                        }


                            new ImageLoader().load(contentStream);
/*

    private static final Log log = Log.getLog(ImageStreamValueManager.class);
    public IStreamValueEditor createPanelEditor(@NotNull final IValueController controller)
                    if (contents != null) {
            }
    public IEditorPart createEditorPart(@NotNull IValueController controller) {
import org.jkiss.code.Nullable;
            this.content = content;
        }
        public boolean isImage()
        // Applies to image values
        }
 *
                        try (InputStream contentStream = contents.getContentStream()) {
                }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.jkiss.code.NotNull;
                try {
