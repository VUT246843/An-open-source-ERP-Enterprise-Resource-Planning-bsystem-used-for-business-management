            }

import org.eclipse.swt.graphics.Image;
                } finally {
import org.eclipse.draw2d.Graphics;
import org.jkiss.dbeaver.ui.ImageUtils;
        } catch (Throwable e) {

package org.jkiss.dbeaver.ui.editors.erd.export;


                fos.flush();
                        graphics.setFont(figure.getFont());
            if (contentBounds.isEmpty()) {
 *
                        }
                            // Convert to 8bit color
                        } else {
                imageType = SWT.IMAGE_PNG;
 *
 * limitations under the License.
 */
import org.jkiss.dbeaver.ui.UIUtils;
                try {
                            // Use maximum colors for JPEG, PNG
        {
            try (FileOutputStream fos = new FileOutputStream(targetFile)) {
import org.eclipse.swt.graphics.ImageData;
                        imageLoader.save(fos, imageType);

            DBWorkbench.getPlatformUI().showError("Save ERD as image", null, e);
import java.io.File;
        }
import org.jkiss.dbeaver.DBException;
    private static final int MARGIN_X = 10;
                imageType = SWT.IMAGE_GIF;
                    Image image = new Image(null, contentBounds.width + MARGIN_X * 2, contentBounds.height + MARGIN_Y * 2);
import org.eclipse.swt.SWT;
                    UIUtils.dispose(gc);
    @Override
                GC gc = null;
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (filePath.endsWith(".jpg")) {

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
            }
                        ImageLoader imageLoader = new ImageLoader();
}
                        gc.setBackground(ERDThemeSettings.instance.diagramBackground);
    }
public class ERDExportRasterImage implements ERDExportFormatHandler
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
                        figure.paint(graphics);
 * you may not use this file except in compliance with the License.
import java.io.FileOutputStream;
                Graphics graphics = null;
import org.eclipse.swt.graphics.ImageLoader;
                throw new DBException("Can't serializeDiagram empty diagram");
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.SWTGraphics;
        Rectangle contentBounds = figure instanceof FreeformLayeredPane ? ((FreeformLayeredPane) figure).getFreeformExtent() : figure.getBounds();
                            imageLoader.data[0] = ImageUtils.getImageDataAtCurrentZoom(image);
                        graphics.translate(contentBounds.x * -1 + MARGIN_X, contentBounds.y * -1 + MARGIN_Y);
                imageType = SWT.IMAGE_JPEG;
import org.eclipse.swt.graphics.GC;
                        graphics = new SWTGraphics(gc);
                    if (graphics != null) {
 * You may obtain a copy of the License at
        try {
                    try {
                        imageLoader.data = new ImageData[1];
/*
    private static final int MARGIN_Y = 10;
                        if (imageType == SWT.IMAGE_GIF) {
            } else if (filePath.endsWith(".png")) {
                        gc = new GC(image);
import org.eclipse.draw2d.IFigure;
{
        int imageType = SWT.IMAGE_BMP;
                    } finally {
 * See the License for the specific language governing permissions and
            } else if (filePath.endsWith(".gif")) {
                        UIUtils.dispose(image);
        }
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
import org.eclipse.draw2d.geometry.Rectangle;
 * DBeaver - Universal Database Manager
            }
                            imageLoader.data[0] = ImageUtils.makeWebImageData(image);
                    }
                }
 * Unless required by applicable law or agreed to in writing, software
                        graphics.dispose();

 *
                        //gc.setClipping(0, 0, contentBounds.width + MARGIN_X * 2, contentBounds.height + MARGIN_Y * 2);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            String filePath = targetFile.getName().toLowerCase();
                        gc.fillRectangle(image.getBounds());

    public void exportDiagram(EntityDiagram diagram, IFigure figure, DiagramPart diagramPart, File targetFile) {
                    }
