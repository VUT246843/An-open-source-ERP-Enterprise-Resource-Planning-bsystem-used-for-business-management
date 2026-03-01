        // convert the font size (in pt for awt) to height in pixels for swt
        int modifiers = 0;
            try {
            Font tmpFont = new Font(device, fontData);
     * operating system resources (the garbage collector won't do it).
import java.awt.event.MouseEvent;

import org.eclipse.swt.graphics.Rectangle;
            int size = colorModel.getMapSize();
     *
import org.eclipse.swt.graphics.Color;
    }
    /**
    }
     * Because the SWT toolkit use native graphical resources whenever
     * @return an swt {@code Rectangle} object.
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
     *

 * Utility class gathering some useful and general method.
        if ((event.stateMask & SWT.ALT) != 0) {
                while (tmpGC.textExtent(Az).x
     *
     * will display differently on the screen than the awt one.
     * @return An AWT point with the same coordinates as {@code p}.
        fontData.setHeight(height);
        // SWT and AWT share the same style constants.
     * of the specified swt color.
                    tmpFont.dispose();

     */
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az)
            }
    public static Rectangle toSwtRectangle(Rectangle2D rect2d) {
 *     http://www.apache.org/licenses/LICENSE-2.0
     *         permitted).
     * Create an awt font by converting as much information
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Rectangle2D rect2d = new Rectangle2D.Double();
    public static Color toSwtColor(Device device, java.awt.Paint paint) {
        // hack to ensure the newly created swt fonts will be rendered with the
    public static Point2D toAwtPoint(Point p) {
    /**
                    raster.getPixel(x, y, pixelArray);
     * This method helps passing SWT mouse event to awt components.
        fontData.setName(font.getFamily());
        switch (event.button) {
    public static java.awt.Font toAwtFont(Device device, Font font) {
import org.eclipse.swt.graphics.Font;
    }
     * one. Because the SWT toolkit use native graphical ressources whenever
                    data.setPixel(x, y, pixelArray[0]);
                height);
        }
        // hack to ensure the newly created awt fonts will be rendered with the
     * <p>Generally speaking, given a font size, the returned swt font
     * @return a swt color object.
     *
        return rect2d;
        case 3: button = MouseEvent.BUTTON3; break;
        }
    public static Point toSwtPoint(java.awt.Point p) {
                / device.getDPI().y);
     * Transform an awt Rectangle2d instance into a swt one.
     * an awt font with the same height as the swt one.
import java.awt.image.DirectColorModel;
                }
     * @param device The swt device to draw on (display or gc device).
                    < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {

     */
     */
            return null;
     * SWT point.
            for (int y = 0; y < data.height; y++) {
                        blues[i] & 0xFF);
        FontData fontData = font.getFontData()[0];
                    height--;
 * DBeaver - Universal Database Manager
    /**
        }
                / 72.0);
                }
            tmpGC.setFont(tmpFont);
        return null;
        return new org.eclipse.swt.graphics.Color(device,
 * distributed under the License is distributed on an "AS IS" BASIS,
        g.drawImage(image, 0, 0, null);
import java.awt.image.IndexColorModel;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        > tmpGC.textExtent(Az).x) {
     */
            colorModel.getGreens(greens);
 *
package org.jfree.swt;
        if (ensureSameSize) {
import java.awt.image.BufferedImage;
     * @param color The swt color to match.
     * @param p  the SWT point ({@code null} not permitted).
        }
    /**
     * @return An awt font converted from the provided swt font.
        case 2: button = MouseEvent.BUTTON2; break;

                    > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
            data.transparentPixel = colorModel.getTransparentPixel();
        fontData.setStyle(font.getStyle());
                color.getBlue());
     * it is possible, this fact is platform dependent. To address
 */
        if (w == -1 || h == -1) {
/*
 * limitations under the License.
                    height++;
     * Creates an awt color instance to match the rgb values
            else if (tmpGC.textExtent(Az).x
        return awtMouseEvent;
                    height--;

/**
    protected static final JPanel DUMMY_PANEL = new JPanel();
                for (int x = 0; x < data.width; x++) {
     * Returns an AWT point with the same coordinates as the specified
        java.awt.Color color;
        if (image == null) {
            ImageData data = new ImageData(bufferedImage.getWidth(),
     * (in pixels) between the awt font and the newly created swt font.
    }
                        < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
            PaletteData palette = new PaletteData(colorModel.getRedMask(),
     * as the awt one.
     * @param device The swt device to draw on (display or gc device).
            else if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az)
     *
     * display differently on the screen than the corresponding awt
            int[] pixelArray = new int[1];
            java.awt.Font tmpAwtFont = new java.awt.Font(fontData.getName(),

                    tmpGC.setFont(tmpFont);
            if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az)
 * Unless required by applicable law or agreed to in writing, software
     * @see #toAwtPoint(Point)
                    tmpAwtFont = new java.awt.Font(fontData.getName(),
     *
            tmpGC.dispose();
        if (ensureSameSize) {
    /**
     * of the specified awt color. alpha channel is not supported.
 * Licensed under the Apache License, Version 2.0 (the "License");
     *
                    height++;

     */
     */
     * Returns an SWT point with the same coordinates as the specified AWT
     *
     */
                    tmpFont = new Font(device, fontData);
            colorModel.getBlues(blues);
     * this issue, it is possible to enforce the method to return
            tmpGC.dispose();
                (int) Math.round(rect2d.getMinX()),
 *
 *
import org.eclipse.swt.graphics.*;
        return new java.awt.Color(color.getRed(), color.getGreen(),
     * a font with the same size (or at least as close as possible)
    public static Color toSwtColor(Device device, java.awt.Color color) {
            GC tmpGC = new GC(device);
     * Creates a swt color instance to match the rgb values
     * point (rounded to integer values).
                for (int x = 0; x < data.width; x++) {
        if (paint instanceof java.awt.Color) {
                            fontData.getStyle(), height);
     * @see #toSwtPoint(java.awt.Point)
                rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF,
        }
     * Converts a buffered image to SWT {@code ImageData}.
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
        // same height as the swt one
     * @param device The swt device being drawn on (display or gc device).
        if ((event.stateMask & SWT.CTRL) != 0) {
            WritableRaster raster = bufferedImage.getRaster();
    }
import javax.swing.*;
        return new Rectangle(
                event.time, modifiers, event.x, event.y, 1, false, button);
     *
            Font tmpFont = new Font(device, fontData);
     * this issue, it is possible to enforce the method to return
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az)
     * @param ensureSameSize A boolean used to enforce the same size
     * the essential data to create a swt font. The data is taken
public class SWTUtils {

 * You may obtain a copy of the License at
                            pixelArray[1], pixelArray[2]));
     *
        else {
    public static MouseEvent toAwtMouseEvent(org.eclipse.swt.events.MouseEvent event) {
    }
import java.awt.Image;
            throw new IllegalArgumentException("Null 'image' argument.");
     * @param rect the swt {@code Rectangle}
                (int) Math.round(rect2d.getHeight()));
     * @return Image data.
        FontData fontData = new FontData();
            modifiers |= InputEvent.ALT_DOWN_MASK;
     * @param device The swt device to draw on (display or gc device).
     * @param image  the image ({@code null} not permitted).
     * returned object.

        }
     * @return a {@code FontData} object.
     * as possible from the provided swt {@code Font}.
     *
     * as possible from the provided swt {@code FontData}.
        return new java.awt.Point(p.x, p.y);

                    fontData.setHeight(height);
                while (tmpGC.textExtent(Az).x
                    fontData.setHeight(height);
                }
    /**
     * @return An SWT point with the same coordinates as {@code p}.
    public static java.awt.Font toAwtFont(Device device, FontData fontData,
    public static FontData toSwtFontData(Device device, java.awt.Font font,
     */
            tmpGC.setFont(tmpFont);
            }
 * Mainly convert forth and back graphical stuff between
                        > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
    /**
    /**
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                color.getRed(), color.getGreen(), color.getBlue());
                            fontData.getStyle(), height);
        int h = image.getHeight(null);
     * Returns an SWT point with the same coordinates as the specified
            }
                color.getRed(), color.getGreen(), color.getBlue());


            int[] pixelArray = new int[3];
            for (int i = 0; i < rgbs.length; i++) {
            JPanel DUMMY_PANEL = new JPanel();
                (int) Math.round(p.getY()));
    }
        // same height as the awt one
     * @param device The swt device to draw on (display or gc device).
        return new java.awt.Font(fontData.getName(), fontData.getStyle(),
                    palette);
        }
    }
            DirectColorModel colorModel
     * The coordinates are rounded to integer for the swt object.
                }
     * @param paint The awt color to match.
        int w = image.getWidth(null);
            modifiers |= InputEvent.CTRL_DOWN_MASK;
     *
     * Create an awt font by converting as much information
     * @return an awt color abject.
     */
                (int) Math.round(rect2d.getMinY()),
            if (tmpGC.textExtent(Az).x
        if (bufferedImage.getColorModel() instanceof DirectColorModel) {
                    > tmpGC.textExtent(Az).x) {
        return fontData;
     * call the dispose method on the returned font to free the
     *
            return data;
                    colorModel.getGreenMask(), colorModel.getBlueMask());
     *
                    < tmpGC.textExtent(Az).x) {
    public static Point toSwtPoint(java.awt.geom.Point2D p) {
            ImageData data = new ImageData(bufferedImage.getWidth(),
import java.awt.event.InputEvent;
        g.dispose();
     * @return A AWT mouse event based on the given SWT event.

            WritableRaster raster = bufferedImage.getRaster();
    }

                e.printStackTrace();
            boolean ensureSameSize) {
    /**
                    int pixel = palette.getPixel(new RGB(pixelArray[0],
    /**
            catch (Exception e) {
     * swt color. Otherwise plain black is assumed.
    /**
                    tmpFont = new Font(device, fontData);
     */
        int height = (int) Math.round(font.getSize() * 72.0
     */
     * @param fontData The swt font to convert.
            GC tmpGC = new GC(device);
     * @return The image data.

     *
     * @param event The swt event.
            colorModel.getReds(reds);
 * you may not use this file except in compliance with the License.
    /**
    /**
            IndexColorModel colorModel = (IndexColorModel)
    }
        return new Point(p.x, p.y);
    public static ImageData convertToSWT(BufferedImage bufferedImage) {
        MouseEvent awtMouseEvent = new MouseEvent(DUMMY_PANEL, event.hashCode(),
import org.eclipse.swt.graphics.Point;
     * <p>Generally speaking, given a font size, an swt font will
     * AWT point.
import java.awt.geom.Rectangle2D;
        int button = MouseEvent.NOBUTTON;
     * from the provided awt Font.
import java.awt.image.WritableRaster;
            }
            }
     * <p>When the object is no more used, the user must explicitly
                    fontData.getStyle(), height);
        }
            tmpFont.dispose();
     * (in pixels) between the swt font and the newly created awt font.
     * Create a {@code FontData} object which encapsulate
                    tmpFont.dispose();
    public static java.awt.Color toAwtColor(Color color) {
    public static Rectangle2D toAwtRectangle(Rectangle rect) {
            byte[] greens = new byte[size];
     * @return An awt font converted from the provided swt font.
        Graphics g = bi.getGraphics();
    }
                        + "setting paint to uniform black color");
            for (int y = 0; y < data.height; y++) {

import java.awt.geom.Point2D;
     */
     * Converts an AWT image to SWT.
     * @return An SWT point with the same coordinates as {@code p}.

}
        case 1: button = MouseEvent.BUTTON1; break;
                }
                color = new java.awt.Color(0, 0, 0);
            tmpFont.dispose();
 * See the License for the specific language governing permissions and
     * @see #toAwtPoint(Point)
        return toAwtFont(device, fontData, true);
        return convertToSWT(bi);
     * @param font The awt font from which to get the data.
     * if the paint is a color and then return the adequate
        }
        }
    }
 * awt and swt.
     *
                throw new Exception("only color is supported at present... "
            boolean ensureSameSize) {
                    data.setPixel(x, y, pixel);
     * of the specified awt paint. For now, this method test
            }
        return new org.eclipse.swt.graphics.Color(device,
                    bufferedImage.getColorModel();
            modifiers |= InputEvent.SHIFT_DOWN_MASK;
            }
                    tmpGC.setFont(tmpFont);
        if ((event.stateMask & SWT.SHIFT) != 0) {
            byte[] blues = new byte[size];
        }
     */
     * @param bufferedImage  the buffered image ({@code null} not
     *
 */
     * Creates a swt color instance to match the rgb values
     * Creates an AWT {@code MouseEvent} from a swt event.
    /**
        rect2d.setRect(rect.x, rect.y, rect.width, rect.height);
    private final static String Az = "ABCpqr";
    public static ImageData convertAWTImageToSWT(Image image) {
                        < tmpGC.textExtent(Az).x) {
                    palette);
        int height = (int) Math.round(fontData.getHeight() * device.getDPI().y
     * @return a swt color object.

     *
     * @param p  the AWT point ({@code null} not permitted).
     * it is possible, this fact is platform dependent. To address
    }
    }

            }
                (int) Math.round(rect2d.getWidth()),
            return data;
            color = (java.awt.Color) paint;
    /** A dummy JPanel used to provide font metrics. */
            }
     * @param rect2d The awt rectangle to map.
        return new Point((int) Math.round(p.getX()),
     * @param color The awt color to match.

import org.eclipse.swt.SWT;
     * @return a Rectangle2D.Double instance with
     *
     * @param ensureSameSize A boolean used to enforce the same size
     */
                    raster.getPixel(x, y, pixelArray);
            byte[] reds = new byte[size];
     * @param p  the AWT point ({@code null} not permitted).
        }
        else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
            PaletteData palette = new PaletteData(rgbs);
            RGB[] rgbs = new RGB[size];
                    = (DirectColorModel) bufferedImage.getColorModel();
     * the eappropriate location and size.
     * @param font The swt font to convert.
     * Transform a swt Rectangle instance into an awt one.
                }
                    tmpAwtFont = new java.awt.Font(fontData.getName(),
     * Note that the dispose method will need to be called on the
import java.awt.*;
