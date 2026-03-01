     * Returns the bounds for this configuration.
    private GraphicsConfiguration gc;
     */
    public AffineTransform getDefaultTransform() {

public class SWTGraphicsConfiguration extends GraphicsConfiguration {
     * @param height  the height of the bounds.
     * Returns the color model for this configuration.
        }
    /**
import java.awt.geom.AffineTransform;

    @Override
    public SWTGraphicsConfiguration(int width, int height) {
            return null;

        return this.device;
 * See the License for the specific language governing permissions and
    public ColorModel getColorModel() {
     * Returns the color model for the specified transparency type, or

    }
     * @param caps  the image capabilities.
        } else {
 * DBeaver - Universal Database Manager
        return new AffineTransform();

     * @param transparency  the transparency.
    }
    public AffineTransform getNormalizingTransform() {
 *
     * @return The default transform.
    public VolatileImage createCompatibleVolatileImage(int width, int height,
import java.awt.image.ColorModel;
 * you may not use this file except in compliance with the License.
     *
    public GraphicsDevice getDevice() {
     * {@code null}.
 *

import java.awt.image.VolatileImage;
    }
     * @param height  the image height.
            return new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff);
    @Override
    private GraphicsDevice device;
     *
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
    /**
    @Override
     */
     *
                                                       ImageCapabilities caps, int transparency) throws AWTException {
    /**
     */
        }
    /**
     * Returns the normalizing transform.
 */
import java.awt.image.BufferedImage;

     * @param width  the image width.
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Creates a new instance.
        this.height = height;
     *
        if (this.device == null) {
 */
 *
    }
}
     * @return The graphics device (never {@code null}).
            return ColorModel.getRGBdefault();
    @Override
 * You may obtain a copy of the License at
     *
 * limitations under the License.
     * @return The volatile image.
        return new Rectangle(this.width, this.height);
        if (img == null) {
     * @param width  the width of the bounds.
 * A graphics configuration for the {@link SWTGraphics2D} class.
    @Override
    }
            img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
    /**
    /**
import java.awt.image.DirectColorModel;
     */
        super();
    /**
     * @return A color model (possibly {@code null}).
        } else if (transparency == Transparency.OPAQUE) {
import java.awt.*;
    private BufferedImage img;
 * Licensed under the Apache License, Version 2.0 (the "License");
     *

        return getColorModel(Transparency.TRANSLUCENT);
        this.width = width;

    }
     * @throws AWTException if there is a problem creating the image.
    }
     */
            this.device = new SWTGraphicsDevice("SWTGraphicsDevice", this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
     * Returns the default transform.
        return gc.createCompatibleVolatileImage(width, height, caps,
     * @return The color model.
/**
        }

     *
    private final int width, height;

     * ClassCastException that occurs on MacOSX when exporting a Swing UI
     * @return The bounds.
     */
     *
     */
     * @return The normalizing transform.
    }
    public ColorModel getColorModel(int transparency) {
            gc = img.createGraphics().getDeviceConfiguration();
        if (transparency == Transparency.TRANSLUCENT) {
     * Returns a volatile image.  This method is a workaround for a
    public Rectangle getBounds() {
     *
     *
        return new AffineTransform();

     * Returns the graphics device that this configuration is associated with.
     */
                transparency);
     * @param transparency  the transparency type.
package org.jfree.swt;
     *
/*


    /**
     * that uses the Nimbus Look and Feel.
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
