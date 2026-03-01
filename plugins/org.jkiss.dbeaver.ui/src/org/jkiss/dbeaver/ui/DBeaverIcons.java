            return mainIcon;
        Image image;
import org.eclipse.swt.graphics.Image;
    private static IconDescriptor getIconByLocation(@NotNull String location) {
            if (image.getTopLeft() != null) {
            do {
    @NotNull
            }
        @NotNull Function<DBIconComposite, DBPImage> map
    @NotNull
            if (image.getBottomLeft() != null) {
        IconDescriptor(@NotNull String id, @NotNull Image image) {
            this.image = image;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    return getIconDescriptor(DBIcon.TYPE_UNKNOWN, useCache);
                return getCompositeIcon(icon, ic, useCache);
        if (icon == null) {
        }


        return icon.image;
import java.util.HashMap;
                    ib.getImage(),
        IconDescriptor icon = getIconByLocation(iconLocation);
    @NotNull
import org.jkiss.code.NotNull;
                if (icon == null) {
                ovrImage.setBottomRight(accumulateDecorations(image, DBIconComposite::getBottomRight));
import org.jkiss.code.Nullable;
            this.imageDescriptor = imageDescriptor;
    public static Image getImageByLocation(@NotNull String iconLocation) {
                } else {

    }
 */

        DBPImage base = image.getMain();
    }
/**
import org.eclipse.jface.resource.ImageDescriptor;
    @NotNull
 * See the License for the specific language governing permissions and
        }
            case DBIconComposite ic -> {
            try {
        } else {

    }
        return getIconDescriptor(image, true).imageDescriptor; 
 * You may obtain a copy of the License at
                return new IconDescriptor(
            }
        }


            }
    ) {
        }
            } catch (Exception e) {
        @NotNull DBIconComposite image,
}
            } while (base instanceof DBIconComposite);
        if (!image.hasOverlays()) {
    public static ImageDescriptor getImageDescriptor(@Nullable DBPImage image) {
            (image.getBottomRight() == null ? "" : image.getBottomRight().getLocation());
                icon = new IconDescriptor(location, imageDescriptor);
                IconDescriptor icon = getIconByLocation(image.getLocation());
        IconDescriptor(@NotNull String id, @NotNull Image image, @NotNull ImageDescriptor imageDescriptor) {
                }
            Image resultImage = ovrImage.createImage();
                decorations.add(getImageDescriptor(map.apply(image)));
import org.jkiss.dbeaver.Log;
            }
    private static class IconDescriptor {
        String compositeId = mainIcon.id + "^" +
                ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(URI.create(location).toURL());
            List<ImageDescriptor> decorations = new ArrayList<>();
            default -> {
    @NotNull
                log.error("Unexpected image of type " + image.getClass());
            this.image = imageDescriptor.createImage(false);
    private static IconDescriptor getCompositeIcon(@NotNull IconDescriptor mainIcon, @NotNull DBIconComposite image, boolean useCache) {
 *
            if (useCache) {
    }
    @Nullable

        if (base instanceof DBIconComposite ic) {

                ovrImage.setTopRight(accumulateDecorations(image, DBIconComposite::getTopRight));
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            return new ImageDescriptor[]{getImageDescriptor(map.apply(image))};

        }
            OverlayImageDescriptor ovrImage = new OverlayImageDescriptor(mainIcon.imageDescriptor);
 * DBeaver - Universal Database Manager
                imageMap.put(location, icon);
            }
            (image.getBottomLeft() == null ? "" : image.getBottomLeft().getLocation()) + "^" +
import org.jkiss.dbeaver.model.DBPImage;
            case DBIconBinary ib -> {

    }
            this.imageDescriptor = ImageDescriptor.createFromImage(image);

        IconDescriptor(@NotNull String id, @NotNull ImageDescriptor imageDescriptor) {
                    log.error("Image '" + image.getLocation() + "' not found");
    private static final Log log = Log.getLog(DBeaverIcons.class);
 *
/*
            return null;
                log.error(e);

import java.net.URI;

        IconDescriptor icon = useCache ? compositeMap.get(compositeId) : null;
            case DBIcon ic -> {
            if (image.getBottomRight() != null) {
 * DBeaverIcons
        switch (image) {
        return getIconDescriptor(image, true).image;

    private static ImageDescriptor[] accumulateDecorations(
                base = image.getMain();
            this.id = id;
        if (icon == null) {
        if (icon == null) {
 * Unless required by applicable law or agreed to in writing, software
            return decorations.toArray(ImageDescriptor[]::new);
                IconDescriptor icon = getIconDescriptor(ic.getMain(), useCache);
                compositeMap.put(compositeId, icon);
            if (image.getTopRight() != null) {
    }
                    return icon;
        String id;
        @NotNull
        return icon;
            }
                return null;
            (image.getTopRight() == null ? "" : image.getTopRight().getLocation()) + "^" +
package org.jkiss.dbeaver.ui;
        }
    @NotNull
        @NotNull
        return icon;
                ovrImage.setTopLeft(accumulateDecorations(image, DBIconComposite::getTopLeft));
 *
    }
        }
import java.util.function.Function;
            decorations.add(getImageDescriptor(map.apply(image)));
import java.util.Map;
    }
                return getIconDescriptor(DBIcon.TYPE_UNKNOWN, useCache);
            }

            icon = new IconDescriptor(compositeId, resultImage);
    public static Image getImage(@Nullable DBPImage image) {
        ImageDescriptor imageDescriptor;
            case null -> {
        @NotNull
            this.imageDescriptor = imageDescriptor;
        }
 * limitations under the License.
            }
    }

                image = ic;
            (image.getTopLeft() == null ? "" : image.getTopLeft().getLocation()) + "^" +
public class DBeaverIcons {
                return getIconDescriptor(DBIcon.TYPE_UNKNOWN, useCache);
    @Nullable
            }
            this.id = id;
 * Licensed under the Apache License, Version 2.0 (the "License");
                );
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static IconDescriptor getIconDescriptor(@Nullable DBPImage image, boolean useCache) {
        return getIconDescriptor(image, useCache).image;
        }
    private static final Map<String, IconDescriptor> imageMap = new HashMap<>();
            this.id = id;
                    "[" + image.getLocation() + "]",
 * you may not use this file except in compliance with the License.

            this.image = image;
import java.util.ArrayList;
    private static final Map<String, IconDescriptor> compositeMap = new HashMap<>();
                ovrImage.setBottomLeft(accumulateDecorations(image, DBIconComposite::getBottomLeft));
 */
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.model.DBIconComposite;
                    ib.getImageDescriptor()
    public static Image getImage(@Nullable DBPImage image, boolean useCache) {
        IconDescriptor icon = imageMap.get(location);
