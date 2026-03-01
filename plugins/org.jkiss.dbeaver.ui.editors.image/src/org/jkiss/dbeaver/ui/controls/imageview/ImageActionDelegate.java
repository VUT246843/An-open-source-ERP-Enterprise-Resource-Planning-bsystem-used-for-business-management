/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.imageViewControl = viewControl;
                for (int j = 0; j < src.height; j++) {
    /**

 * Action delegate for all toolbar push-buttons.
import org.eclipse.jface.action.Action;
 *
            imageViewCanvas.fitCanvas();
                    int pixel = src.getPixel(i, j);
    public ImageActionDelegate(SWTImageViewer viewControl, String id, String name, DBPImage image) {
            if (src == null) return;
    public static final String TOOLBAR_ORIGINAL = "toolbar.original";
    public static final String TOOLBAR_ROTATE = "toolbar.rotate";
 * <p/>

                    dest.setPixel(j, src.width - 1 - i, pixel);
 * See the License for the specific language governing permissions and
    }

public class ImageActionDelegate extends Action {
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.controls.imageview;
 * you may not use this file except in compliance with the License.
}
     * Action id of this delegate
                destPal = new PaletteData(srcPal.getRGBs());
/*
            for (int i = 0; i < src.width; i++) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
            /* construct a new ImageData */
        } else if (id.equals(TOOLBAR_FIT)) {

 */
            imageViewCanvas.zoomIn();
    public static final String TOOLBAR_FIT = "toolbar.fit";
        this.id = id;
import org.eclipse.swt.graphics.ImageData;
                }
    public String id;
 *
     * pointer to image view
            PaletteData destPal;
    }
        if (imageViewCanvas.getSourceImage() == null) return;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            imageViewCanvas.showOriginal();
    {

    public void run()
        super(name, DBeaverIcons.getImageDescriptor(image));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 *
            /* rotate image anti-clockwise */
     */
            ImageData dest;
        ImageViewCanvas imageViewCanvas = imageViewControl.getCanvas();
 */
            }

            imageViewCanvas.updateImage(dest);
        if (id.equals(TOOLBAR_ZOOMIN)) {
    public static final String TOOLBAR_ZOOMIN = "toolbar.zoomin";
                destPal = new PaletteData(srcPal.redMask, srcPal.greenMask, srcPal.blueMask);
            if (srcPal.isDirect) {
    /**
    public SWTImageViewer imageViewControl = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
            }
            ImageData src = imageViewCanvas.getSourceImage().getImageData();
    public static final String TOOLBAR_ZOOMOUT = "toolbar.zoomout";
            /* rotate by rearranging the pixels */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.swt.graphics.PaletteData;
        } else if (id.equals(TOOLBAR_ORIGINAL)) {
    @Override
            PaletteData srcPal = src.palette;
            imageViewCanvas.zoomOut();

        }
 * @author Chengdong Li: cli4@uky.edu
            dest = new ImageData(src.height, src.width, src.depth, destPal);
import org.jkiss.dbeaver.model.DBPImage;
        } else if (id.equals(TOOLBAR_ROTATE)) {
            } else {

        } else if (id.equals(TOOLBAR_ZOOMOUT)) {
