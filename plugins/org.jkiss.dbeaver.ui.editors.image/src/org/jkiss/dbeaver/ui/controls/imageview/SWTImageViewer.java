            ImageViewMessages.controls_imageview_fit_window,
import org.eclipse.jface.action.Separator;
 * you may not use this file except in compliance with the License.
            case SWT.IMAGE_JPEG:
                return "TIFF"; //$NON-NLS-1$

}
        boolean hasImage = getCanvas().getSourceImage() != null;

            case SWT.IMAGE_PNG:
        return getImageType(imageData.type) + " " + imageData.width + "x" + imageData.height + "x" + imageData.depth +

import org.eclipse.swt.widgets.Composite;

        return canvas;
        });
                if (canvas.getImageData() != null) {

    private IAction itemZoomOut;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.dnd.*;
        itemZoomOut.setEnabled(hasImage);

/**
        gl.verticalSpacing = 0;
            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, new Separator());
    public boolean clearImage() {
            toolBar.add(new Separator());
        source.addDragListener(new DragSourceListener() {
    public SWTException getLastError() {
        source.setTransfer(types);
        canvas.loadImage(null);


            }
            ImageActionDelegate.TOOLBAR_ZOOMIN,
            case SWT.IMAGE_TIFF:
                return "UNKNOWN"; //$NON-NLS-1$
        gl.marginHeight = 0;
    }
            UIIcon.ORIGINAL_SIZE
 * limitations under the License.
        setLayout(gl);
            toolBar.add(itemZoomIn);
            case SWT.IMAGE_GIF:
 *
            UIIcon.ROTATE_LEFT
 */
        );
    private IAction itemOriginal;
import org.eclipse.swt.SWTException;
            case SWT.IMAGE_ICO:
            @Override

            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, itemOriginal);
    public void fillToolBar(IContributionManager toolBar) {
    ImageViewCanvas getCanvas() {
        itemZoomIn.setEnabled(hasImage);
        itemFit = new ImageActionDelegate(this,
        itemZoomIn = new ImageActionDelegate(this,
        // Add DND support
    }
        }
            ImageViewMessages.controls_imageview_rotate,
            ImageActionDelegate.TOOLBAR_ORIGINAL,
import org.jkiss.dbeaver.ui.UIIcon;
                }
    private final ImageViewCanvas canvas;
            public void dragFinished(DragSourceEvent event) {
            ImageViewMessages.controls_imageview_zoom_in,
               "  "; //$NON-NLS-1$
            toolBar.add(itemRotate);
                return "GIF"; //$NON-NLS-1$
        );
            UIIcon.ZOOM_IN
            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, itemZoomOut);
    private IAction itemFit;
import org.eclipse.swt.SWT;

            case SWT.IMAGE_OS2_BMP:

    protected String getImageDescription() {


        itemFit.setEnabled(hasImage);
            public void dragSetData(DragSourceEvent event) {
        canvas.loadImage(inputStream);
    @Override
            }
                return "JPEG"; //$NON-NLS-1$

        itemRotate.setEnabled(hasImage);
                } else {
        gl.horizontalSpacing = 0;
        super(parent, style);
import org.eclipse.jface.action.IAction;
            ImageViewMessages.controls_imageview_original_size,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
                return "BMP"; //$NON-NLS-1$
 * Unless required by applicable law or agreed to in writing, software
    }
        );
            case SWT.IMAGE_BMP:

        switch (type) {
            ImageActionDelegate.TOOLBAR_ZOOMOUT,
            @Override

            toolBar.add(itemOriginal);
        gl.marginWidth = 0;

 *
    }
                return "PNG"; //$NON-NLS-1$

public class SWTImageViewer extends AbstractImageViewer {
                return "OS2 BMP"; //$NON-NLS-1$
import java.io.InputStream;
        );
import org.eclipse.swt.graphics.ImageData;
 * See the License for the specific language governing permissions and
            case SWT.IMAGE_BMP_RLE:
        final DragSource source = new DragSource(canvas, operations);
import org.jkiss.dbeaver.ui.data.IValueManager;
            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, itemFit);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, itemZoomIn);
    }
        itemZoomOut = new ImageActionDelegate(this,
    protected void updateActions() {
               //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        GridLayout gl = new GridLayout(1, false);
            default:
        );
import org.eclipse.swt.layout.GridData;
            toolBar.insertBefore(IValueManager.GROUP_ACTIONS_ADDITIONAL, itemRotate);
        Transfer[] types = new Transfer[]{ImageTransfer.getInstance()};
    }
            ImageActionDelegate.TOOLBAR_FIT,
            ImageActionDelegate.TOOLBAR_ROTATE,
                return "BMP RLE"; //$NON-NLS-1$
    @Override
 */

 * Image viewer control
    protected String getImageType(int type) {
        ImageData imageData = getCanvas().getImageData();
        canvas.setLayoutData(new GridData(GridData.FILL_BOTH));
            @Override
        int operations = DND.DROP_COPY;
        itemRotate = new ImageActionDelegate(this,
            toolBar.add(itemZoomOut);
        return true;
        return canvas.getError() == null;
        itemOriginal.setEnabled(hasImage);
            public void dragStart(DragSourceEvent event) {
    }
            toolBar.add(itemFit);
                return "ICO"; //$NON-NLS-1$

 *
import org.eclipse.swt.layout.GridLayout;
import org.jkiss.code.NotNull;
        return canvas.getError();
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    private IAction itemZoomIn;

        }
    }
        canvas = new ImageViewCanvas(this, SWT.DOUBLE_BUFFERED);
                    event.data = null;
package org.jkiss.dbeaver.ui.controls.imageview;
 * You may obtain a copy of the License at
            }
    public boolean loadImage(@NotNull InputStream inputStream) {
    public SWTImageViewer(Composite parent, int style) {

 * DBeaver - Universal Database Manager
    @Override
    private IAction itemRotate;
/*
        itemOriginal = new ImageActionDelegate(this,
                    event.data = canvas.getImageData();
            UIIcon.ZOOM_OUT
        if (toolBar.find(IValueManager.GROUP_ACTIONS_ADDITIONAL) != null) {
import org.eclipse.jface.action.IContributionManager;

    }
            UIIcon.FIT_WINDOW
            ImageViewMessages.controls_imageview_zoom_out,
