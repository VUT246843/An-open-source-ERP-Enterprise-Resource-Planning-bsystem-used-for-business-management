package org.jkiss.dbeaver.ui;
    }
    }
/*
    @Override
/**
 * Unless required by applicable law or agreed to in writing, software
 *
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.location = "binary:" + location;
    private final Image image;
        this.image.dispose();
 */
    public String getLocation() {
    private final ImageDescriptor imageDescriptor;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    @NotNull
    }
 * Image with binary data
        }
        this.location = "image:" + (location != null ? location : image.hashCode());
        return location;
 * distributed under the License is distributed on an "AS IS" BASIS,




import org.eclipse.jface.resource.ImageDescriptor;
 *
import org.jkiss.dbeaver.model.DBPImage;
import org.eclipse.swt.widgets.Display;
    public DBIconBinary(@Nullable String location, @NotNull Image image) {


}

    @Override
    public Image getImage() {
        this.image = image;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    public boolean equals(Object obj) {
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
        return image;

    public ImageDescriptor getImageDescriptor() {
        if (obj instanceof DBIconBinary) {
public class DBIconBinary implements DBPImage {
            return CommonUtils.equalObjects(location, ((DBIconBinary) obj).location);
        return false;
    }
 * You may obtain a copy of the License at
    private final String location;
import org.jkiss.utils.CommonUtils;
 */
    @Override
        this.imageDescriptor = ImageDescriptor.createFromImage(image);
    public DBIconBinary(@NotNull String location, @NotNull ImageData data) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.graphics.Image;
    }
    }
        this.image = new Image(Display.getCurrent(), data);
 *
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.swt.graphics.ImageData;
        return location;
    public void dispose() {
        this.imageDescriptor = ImageDescriptor.createFromImageDataProvider(zoom -> data);
    @NotNull
        return imageDescriptor;

    }
    public String toString() {
    @NotNull
