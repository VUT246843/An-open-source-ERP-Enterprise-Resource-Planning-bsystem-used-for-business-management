        vertical.setPageIncrement(getClientArea().height);
        if (sourceImage == null)
                    imageRect.y,
            AffineTransform af) {
            Rectangle imageBound = sourceImage.getBounds();
        double select = -scrollBar.getSelection();
                scrollHorizontally((ScrollBar) event.widget);
    /* zooming rates in x and y direction are equal.*/
                    destRect.width,
 * distributed under the License is distributed on an "AS IS" BASIS,
        ScrollBar horizontal = getHorizontalBar();
        if (data != null)
        ScrollBar horizontal = getHorizontalBar();
                ty = -vertical.getMaximum() + ch;
        double dy = ((double) h) / 2;
 * implement this is to use inheritance to create multiple hierarchies.
     * Reset the image data and update the image

        Rectangle rect = getClientArea();
 * limitations under the License.
 *
        if (imageBound.height * sy > ch) { /* image is higher than client area */
        if (sourceImage == null)
     * (dx, dy) and using the given scale factor.
    /**
import org.eclipse.swt.widgets.Composite;
    }
                    imageRect.height,

     */

 */
        double s = Math.min(sx, sy);
            Rectangle imageRect =
        vertical.setIncrement(getClientArea().height / 100);
import org.eclipse.swt.graphics.ImageData;
        horizontal.setPageIncrement(getClientArea().width);
            imageRect = imageRect.intersection(imageBound);
     * Perform a zooming operation centered on the given point
                tx = -horizontal.getMaximum() + cw;
        if (sourceImage == null)
        horizontal.addSelectionListener(new SelectionAdapter() {
    public void zoomIn() {
        Rectangle destRect = getClientArea();
    public Image getSourceImage() {
            return;
        af.preConcatenate(AffineTransform.getTranslateInstance(dx, dy));


        } else { /* image is narrower than client area */
                    imageRect.width,
        double sx = (double) destRect.width / (double) imageBound.width;
     * @return swt image created from image file
        if (sourceImage == null)
    public ImageData getImageData() {
    public void centerZoom(

            imageRect.x -= gap;
        double dy = ((double) h) / 2;
     *
        Rectangle clientRect = getClientArea(); /* Canvas' painting area */
    public void reset() {
        }
            gc.drawImage(
        horizontal.setEnabled(false);
    }
 * Unless required by applicable law or agreed to in writing, software
                scrollVertically((ScrollBar) event.widget);
} * you may not use this file except in compliance with the License.
        sourceImage = null;
    private ImageData imageData;
            Rectangle destRect = ImageViewUtil.transformRect(transform, imageRect);
    final float ZOOMOUT_RATE = 0.9f; /* zoomout rate */
                sourceImage = new Image(getDisplay(), imageData);
        horizontal.setSelection((int) (-tx));

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        centerZoom(dx, dy, ZOOMOUT_RATE, transform);

import org.eclipse.swt.graphics.Image;
        double tx = af.getTranslateX();
     * Source image getter.

                    destRect.height);
        centerZoom(dx, dy, s, new AffineTransform());
                    destRect.y,
        double tx = af.getTranslateX(), ty = af.getTranslateY();
        syncScrollBars();
        this.error = null;
        AffineTransform af = transform;
 * This implementation using the pure SWT, no UI AWT package is used. For
 *
        return error;
     * @param dy    center y

        }
    private void scrollVertically(ScrollBar scrollBar) {
 * A scrollable image canvas that extends org.eclipse.swt.graphics.Canvas.
 * <p/>
     * of range, it will correct it. This function considers only following
        af = AffineTransform.getScaleInstance(sx, sy);
        af.preConcatenate(AffineTransform.getScaleInstance(scale, scale));

     */
            }
                    imageRect.x,
     */
        return imageData;
        addPaintListener(new PaintListener() { /* paint listener. */
            public void widgetDisposed(DisposeEvent e) {
            ty = (ch - imageBound.height * sy) / 2; //center if too small.
 */
     */
        });
     * Show the image with the original size
        vertical.setThumb(getClientArea().height);
            public void widgetSelected(SelectionEvent event) {
        return sourceImage;
 * convenience, I put everything into one class. However, the best way to

    /* Paint function */
            int gap = 2; /* find a better start point to render */
import org.eclipse.swt.SWT;
                paint(event.gc);
            return;
     * Constructor for ScrollableCanvas.
                }
        int w = rect.width, h = rect.height;
            tx = (cw - imageBound.width * sx) / 2; //center if too small.
     * Reload image from a file
 * <p/>
    }
     * @param style  the style of this control.
            }
 *
    }
            imageRect.width += 2 * gap;
        int w = rect.width, h = rect.height;

        syncScrollBars();
            public void widgetSelected(SelectionEvent event) {
     * Zoom out around the center of client Area.
 *
        if (sourceImage == null)
import org.eclipse.swt.SWTException;
        double dx = ((double) w) / 2;
        if (tx > 0) tx = 0;
    /* Scroll vertically */
        double dy = 0.5 * destRect.height;
            imageRect.height += 2 * gap;
        }
        Rectangle imageBound = sourceImage.getBounds();
/**
 * It requires Eclipse (version >= 2.1) on Win32/win32; Linux/gtk; MacOSX/carbon.

            } catch (SWTException e) {
                this.error = e;
     * @param data image data to be set
        initScrollBars();
        vertical.setEnabled(false);
    private Image sourceImage; /* original image */
    private SWTException error;
        if (sourceImage != null && !sourceImage.isDisposed()) {
    public void updateImage(ImageData data) {
        syncScrollBars();
    /**
     */
        int cw = getClientArea().width, ch = getClientArea().height;
        }
            if (((int) -ty) > vertical.getMaximum() - ch)
     */
    }
            @Override
            redraw();

     *
        }
            }
    /**

            vertical.setEnabled(false);
     * @param scale zoom rate

        double dx = 0.5 * destRect.width;
 * You may obtain a copy of the License at
    /**
            @Override
                syncScrollBars();
        transform = af;
        if (sourceImage != null)
import org.eclipse.swt.graphics.GC;
    public ImageViewCanvas(final Composite parent) {
            double dx,
            @Override
    }
     */
    /* Scroll horizontally */
    public void zoomOut() {
    }
    /**
        AffineTransform af = transform;
            initScrollBars();
    /**
    private void paint(GC gc) {
        if (ty > 0) ty = 0;
    }
     *
        if (sourceImage != null) {
        if (imageBound.width * sx > cw) { /* image is wider than client area */
            if (((int) -tx) > horizontal.getMaximum() - cw)

            vertical.setEnabled(true);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }

        AffineTransform af = transform;
            gc.setBackground(getParent().getBackground());
     * @return image data of canvas

        double sx = af.getScaleX(), sy = af.getScaleY();
            gc.setClipping(clientRect);
        super(parent, style | SWT.V_SCROLL | SWT.H_SCROLL);
    private AffineTransform transform = new AffineTransform();
    /**
        af.preConcatenate(AffineTransform.getTranslateInstance(0, select - ty));
        af.preConcatenate(AffineTransform.getTranslateInstance(select - tx, 0));
     *
            @Override
     * Fit the image onto the canvas


            return;
        syncScrollBars();
import org.eclipse.swt.graphics.Rectangle;
    /**
            public void paintControl(final PaintEvent event) {
                if (sourceImage != null && !sourceImage.isDisposed()) {
package org.jkiss.dbeaver.ui.controls.imageview;
        }
        ScrollBar vertical = getVerticalBar();

    /**
    }
            return;
        } else {
            sourceImage.dispose();
        redraw();
    public Image loadImage(InputStream inputStream) {
     */
        } else { /* image is less higher than client area */
            public void controlResized(ControlEvent event) {
        transform = af;
    }
     */
import org.eclipse.swt.widgets.Canvas;
    private void initScrollBars() {
            sourceImage = null;
		/* update transform. */
     *
    }
    public SWTException getError() {
     * Get the image data. (for future use only)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        double sy = (double) destRect.height / (double) imageBound.height;
        double dx = ((double) w) / 2;
            horizontal.setEnabled(false);
            double dy,
        double select = -scrollBar.getSelection();
        horizontal.setIncrement(getClientArea().width / 100);
        });
            double scale,
     */
import java.awt.geom.AffineTransform;
        showOriginal();
 * DBeaver - Universal Database Manager
                    sourceImage,

        af.preConcatenate(AffineTransform.getTranslateInstance(tx, ty));
            }
        transform = af;
        Rectangle imageBound = sourceImage.getBounds();
        horizontal.setThumb(getClientArea().width);
     * @param parent the parent of this control.
        centerZoom(dx, dy, ZOOMIN_RATE, transform);
            horizontal.setEnabled(true);
        this(parent, SWT.NULL);
                    ImageViewUtil.inverseTransformRect(transform, clientRect);
    public void fitCanvas() {
     */
            }
        vertical.setSelection((int) (-ty));
     * Zoom in around the center of client Area.
        vertical.addSelectionListener(new SelectionAdapter() {
            horizontal.setMaximum((int) (imageBound.width * sx));
     * @param dx    center x
        double ty = af.getTranslateY();
    /**
        if (sourceImage == null) {
        });
 * @author Chengdong Li: cli4@uky.edu
            imageRect.y -= gap;

    }
    private void scrollHorizontally(ScrollBar scrollBar) {
        if (inputStream != null) {
            imageData = null;
     * Synchronize the scrollbar with the image. If the transform is out
            gc.fillRectangle(clientRect);
    public void showOriginal() {
        addDisposeListener(new DisposeListener() {

 * See the License for the specific language governing permissions and
    }
import org.eclipse.swt.events.*;

        syncScrollBars();
                    destRect.x,
    }
    }
        af.preConcatenate(AffineTransform.getTranslateInstance(-dx, -dy));
        redraw();
        });
        transform = af;
import org.eclipse.swt.widgets.ScrollBar;
     * factors :<b> transform, image size, client area</b>.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return sourceImage;
                imageData = new ImageData(inputStream);
            return;
    /**
     *
            @Override
                    sourceImage.dispose();
import java.io.InputStream;
            sourceImage = new Image(getDisplay(), data);
        Rectangle rect = getClientArea();
        ScrollBar vertical = getVerticalBar();
    }
     * @return sourceImage.
            try {
            }
        });

    public void syncScrollBars() {
    public ImageViewCanvas(final Composite parent, int style) {
            transform = new AffineTransform();
class ImageViewCanvas extends Canvas {
    }
    final float ZOOMIN_RATE = 1.1f; /* zoomin rate */
        addControlListener(new ControlAdapter() { /* resize listener. */
    /* Initalize the scrollbar and register listeners. */
     * The given AffineTransform instance is preconcatenated.
        if (sourceImage != null) {

            sourceImage.dispose();
            vertical.setMaximum((int) (imageBound.height * sy));
     * @param af    original affinetransform
            gc.fillRectangle(clientRect);
            return;
