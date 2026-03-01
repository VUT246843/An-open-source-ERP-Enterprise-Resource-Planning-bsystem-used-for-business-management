        ImageData newImageData = new ImageData(imageData.width, imageData.height, 8, newPaletteData);
    /**

        GC gc = new GC(image);
        int blue = Math.round((colour.blue + 25) / 51) * 51;
                    lastPixel = pixel;
        }
     * Retrieve an image data with an 8 bit palette for an image. We assume that

            return result;
            }

        int borderPixel = imageData.getPixel(0, 0);

                colours[k] = colour;
        }

        int lastPixel = -1;
            }
                    for (newPixel = 0; newPixel < 256; ++newPixel) {
        int i = 0;
     * Retrieves a web safe palette. Our palette will be 216 web safe colours
    }
        ImageData newImageData = new ImageData(imageData.width,
/**

                newImageData.setPixel(i, j, newPixel);
     * @param imageData the imageData for the image.
        Image result = removeImageBorder(image, borderColor);
        PaletteData palette = imageData.palette;
            boolean emptyRow = true;
                    RGB colour = palette.getRGB(pixel);
        UIUtils.dispose(srcImage);
     * @param image the SWT image.


            return srcImage;
                emptyBottomRows = imageData.height - row - 1;

            return null;
     * colours.
            if (colours[k] == null) {
            if (!emptyRow) {
 * Web image transformation by Anthony Hunter, cmahoney
 * limitations under the License.
     */
        }
         * get an 8 bit imageData for the image
/*
import org.eclipse.swt.graphics.*;
            //gc.copyArea(image, 0, 0);
        }
     * Retrieve the image data for the image, using a palette of at most 256
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Control;
            return image.getImageData();
        // Check top rows
     * and map the colours to the new palette.
                break;
import org.eclipse.swt.SWT;
        RGB colour = new RGB(0, 0, 0);
                }

                    }
*/
                    Assert.isTrue(newPixel < 216);
            }
        ImageData imageData = image.getImageData();
     */
     * and the remaining filled with white.
			w = srcImage.getBounds().width - x;
				0, 0,
    /**
    public static ImageData makeWebImageData(Image image)
    /**
}    }
                    RGB webSafeColour = getWebSafeColour(colour);
    }
     * @return array of 256 colours.

                }
     */
     * @return the new 8 bit imageData or null if the image has more than 256
                            colours[newPixel] = colour;
            return cropImage(
        } catch (Exception e) {
        } else {
                        /**
         */
    private static ImageData get8BitPaletteImageData(ImageData imageData)
        Point size = widget.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                    emptyRow = false;
        }
         * image data.

            for (int col = 0; col < imageData.width; col++) {
    public static Image removeImageBorder(Image srcImage, Color borderColor)
                        }
        for (row = imageData.height - 1; row >= 0; row--) {
        RGB colours[] = new RGB[256];

        return newImageData;
        }
                    RGB colour = new RGB(red, green, blue);
        for (int i = 0; i < imageData.width; ++i) {
    private static RGB[] getWebSafePalette()
    /**
        }
     * Retrieves a web safe colour that closely matches the provided colour.
        }

        try {
     * @return new image data.
    {
		if (y+h > srcImage.getBounds().height) {
        imageData.transparentPixel = imageData.getPixel(0, 0);
        if (newImageData == null) {
                break;
		GC cropGC = new GC(cropImage);
                if (borderPixel != imageData.getPixel(col, row)) {
        if (result == null) {

                for (int blue = 0; blue <= 255; blue = blue + 51) {
     * If the image has less than 256 colours, simply create a new 8 bit palette
 * <p/>
				x, y,
        if (imageData.depth <= 8) {

	public static Image cropImage(Image srcImage, int x, int y, int w, int h)
            return defaultImage;
    private static RGB getWebSafeColour(RGB colour)
        RGB colour = new RGB(0, 0, 0);
     * the image has less than 256 colours.
package org.jkiss.dbeaver.ui;
                        }
            }
                        if (colours[newPixel] == null) {
                         * Diagram has more than 256 colors, return null
     *
                    if (newPixel >= 256) {
         * If the image depth is 8 bits or less, then we can use the existing
                }

    private static ImageData getWebSafePaletteImageData(ImageData imageData)
 *
        if (imageData.height == 0 || imageData.width == 0) {
    {
		return cropImage;
		cropGC.drawImage(srcImage,
        /**
    }
        PaletteData newPaletteData = new PaletteData(webSafePalette);
        for (int i = 0; i < imageData.width; ++i) {

     * @return the web safe colour.
import org.eclipse.core.runtime.Assert;
                if (pixel != lastPixel) {
                srcImage,
            // All rows are empty
                if (borderPixel != imageData.getPixel(col, row)) {
                if (pixel != lastPixel) {

        return colours;
	{
        return newImageData;
                    break;
        int red = Math.round((colour.red + 25) / 51) * 51;
                emptyTopRows = row;
		}
 * you may not use this file except in compliance with the License.

		Image cropImage = new Image(srcImage.getDevice(), w, h);
            // First pixel isn't a border
    }
                    RGB colour = palette.getRGB(pixel);
 *
        }
                    break;
            }
        for (int k = 0; k < 256; ++k) {
        //image.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
     *         colours.

 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
            }
                colours[k] = colour;
            }
    {
                            break;
     */
        final ImageData imageData = image.getImageData();
			h = srcImage.getBounds().height - y;
        Image image = new Image(widget.getDisplay(), size.x, size.y);

                newImageData.setPixel(i, j, newPixel);
        int emptyTopRows = 0, emptyBottomRows = 0, emptyLeftColumns = 0, emptyRightColumns = 0;
        if (!imageData.palette.getRGB(borderPixel).equals(borderColor.getRGB())) {
        for (int red = 0; red <= 255; red = red + 51) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        int row;
 */
         */
        }
         * safe palette to get an 8 bit image data for the image.
    }
            for (int j = 0; j < imageData.height; ++j) {
    public static ImageData getImageDataAtCurrentZoom(Image image) {
                }
 *
            for (int green = 0; green <= 255; green = green + 51) {
            UIUtils.dispose(gc);
        if (row == imageData.height) {
            if (!emptyRow) {
            }
        }
                        }
        /**
        image.dispose();
        for (int k = 0; k < 256; ++k) {
     *
    {

		UIUtils.dispose(cropGC);
        } finally {

 * Licensed under the Apache License, Version 2.0 (the "License");
                        return null;
        int newPixel = -1;
                    colours[i++] = colour;
                        if (webSafePalette[newPixel].equals(webSafeColour)) {
     *
            widget.print(gc);

        return new RGB(red, green, blue);
                    for (newPixel = 0; newPixel < 256; ++newPixel) {
                int pixel = imageData.getPixel(i, j);
                    emptyRow = false;
                }
 * Image-related utils
				w, h);
        // Redefine w and h to void them to be too big
        }
    {
 *
        int lastPixel = -1;
                         */
        ImageData newImageData = get8BitPaletteImageData(imageData);
                imageData.width - emptyLeftColumns - emptyRightColumns,
                imageData.height - emptyTopRows - emptyBottomRows);
        for (row = 0; row < imageData.height; row++) {
        return newImageData;
    public static Image captureWidget(Control widget, Color borderColor, Image defaultImage)
                        if (colours[newPixel].equals(colour)) {
        return srcImage;
/*
        PaletteData palette = imageData.palette;
            for (int j = 0; j < imageData.height; ++j) {
 * Web image transformation originally get from org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil
        }
            imageData.height, 8, newPaletteData);
                            break;
            return imageData;
                int pixel = imageData.getPixel(i, j);
    }
    /**
        // Check bottom rows
        RGB[] colours = new RGB[256];
		}
		if (x+w > srcImage.getBounds().width) {
        try {
    }
                    }
				w, h,
            newImageData = getWebSafePaletteImageData(imageData);

        int green = Math.round((colour.green + 25) / 51) * 51;
        /**

import org.eclipse.swt.internal.DPIUtil;
                    lastPixel = pixel;
public class ImageUtils {
            return srcImage;
                    }
            if (colours[k] == null) {
                emptyTopRows,
 *
        RGB[] webSafePalette = getWebSafePalette();
            boolean emptyRow = true;
            }
     *
     */
 * Unless required by applicable law or agreed to in writing, software
                emptyLeftColumns,
        int newPixel = -1;
        if (emptyTopRows > 0 || emptyBottomRows > 0 || emptyLeftColumns > 0 || emptyRightColumns > 0) {

        }
            for (int col = 0; col < imageData.width; col++) {



     * @param colour a colour.
         */
    {
        }
        Image fixedImage = new Image(widget.getDisplay(), imageData);
        final ImageData imageData = srcImage.getImageData();
         * if newImageData is null, it has more than 256 colours. Use the web


                            break;
            return image.getImageData(DPIUtil.getDeviceZoom());

        }
        PaletteData newPaletteData = new PaletteData(colours);

	}

        return fixedImage;
 * DBeaver - Universal Database Manager
