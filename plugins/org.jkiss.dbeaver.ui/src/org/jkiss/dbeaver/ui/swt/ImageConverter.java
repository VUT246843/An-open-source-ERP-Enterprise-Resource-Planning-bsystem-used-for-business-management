 * 
            // check for alpha channel
}


                if (alphaRaster != null)
     * @param imageData the {@link org.eclipse.swt.graphics.Image} to be converted to a <code>BufferedImage</code>
    {
import java.awt.image.BufferedImage;
                        alpha[0] = imageData.getAlpha(x, y);
 * 
                image.setRGB(x, y, new java.awt.Color(color.red, color.green, color.blue).getRGB());
                        {

                        }
import org.eclipse.swt.graphics.PaletteData;
        {
import java.awt.image.WritableRaster;
        int scansize = (((srcImage.getWidth() * 3) + 3) * 4) / 4;
     * @return an <code>Image</code> that represents the same image data as the AWT <code>BufferedImage</code> type.

        }
    /**
     * <code>BufferedImage</code> that is of type <code>BufferedImage.TYPE_INT_ARGB</code> regardless of the type of swt
     * @since 1.3.1
                    }
        ImageData maskData = null;
        return image;
     * image that is passed into the method.
        int alpha[] = new int[1];
public class ImageConverter
                    {
    public static BufferedImage convertFromImageData(ImageData imageData)
        // the appropriate color.
                swtImageData.setAlphas(0, y, srcImage.getWidth(), alphaBytes, 0);
            {
     * <code>ImageData</code> that has 24 bit depth regardless of the type of AWT buffered image that is passed into the
        // We can force bitdepth to be 24 bit because BufferedImage getRGB

        WritableRaster alphaRaster = image.getAlphaRaster();
            {
 */
                    else
     * <code>Image</code> that has 24 bit depth regardless of the type of AWT buffered image that is passed into the
            int[] buff = srcImage.getRGB(0, y, srcImage.getWidth(), 1, null, 0, scansize);
    }
        return swtImageData;

 * Contributors:
     */

        // now we should have the image data for the bitmap, decompressed in

     */

     * @since 1.3.1
        int width = imageData.width;
        ImageData swtImageData = new ImageData(srcImage.getWidth(), srcImage.getHeight(), 24, PALETTE_DATA);
     * Converts an AWT based buffered image into an SWT <code>ImageData</code>. This will always return an
                            alphaRaster.setPixel(x, y, alpha);
 ****************************************************************************/
 * which accompanies this distribution, and is available at
     * 
                        alphaRaster.setPixel(x, y, alpha);
     * Converts an swt based image into an AWT <code>BufferedImage</code>. This will always return a
     * <code>BufferedImage</code> that is of type <code>BufferedImage.TYPE_INT_ARGB</code> regardless of the type of swt
import org.eclipse.swt.graphics.ImageData;
        // ensure scansize is aligned on 32 bit.
 * Copyright (c) 2004, 2010 IBM Corporation and others.

                    alphaBytes[i] = (byte) alpha[i];


    public static ImageData convertToImageData(BufferedImage srcImage)
     * 
                        // check for transparency mask
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++)
package org.jkiss.dbeaver.ui.swt;

                for (int i = 0; i < srcImage.getWidth(); i++)
                int[] alpha = alphaRaster.getPixels(0, y, srcImage.getWidth(), 1, (int[]) null);
                // check for alpha channel
    }
                        if (maskData != null)
                {
                }
import org.eclipse.swt.widgets.Display;
        // loop over the imagedata and set each pixel in the BufferedImage to
     */
        }
    }
     * @return a <code>BufferedImage</code> that represents the same image data as the swt <code>Image</code>

     * @return a <code>BufferedImage</code> that represents the same image data as the swt <code>Image</code>
{
    {
        return convertFromImageData(srcImage.getImageData());
 *    IBM Corporation - initial API and implementation
            }
    public static BufferedImage convert(Image srcImage)
 *    		   GMF's DisplayUtils
    public static Image convert(BufferedImage srcImage)
     * 
 * All rights reserved. This program and the accompanying materials
     * 
        {
            swtImageData.setPixels(0, y, srcImage.getWidth(), buff, 0);
     * 
        // Convert that to a Buffered Image.
 * This is a helper class used to convert an SWT Image into an AWT BufferedImage.

    /**
                    }
        int height = imageData.height;
                RGB color = imageData.palette.getRGB(imageData.getPixel(x, y));
 *
     * Converts an AWT based buffered image into an SWT <code>Image</code>. This will always return an
     * @return an <code>Image</code> that represents the same image data as the AWT <code>BufferedImage</code> type.
     * Converts an swt based image data into an AWT <code>BufferedImage</code>. This will always return a
                            alpha[0] = maskData.getPixel(x, y) == 0 ? 0 : 255;

                    if (imageData.alphaData != null)
/**
    /**
     * @param srcImage the {@link java.awt.image.BufferedImage} to be converted to an <code>Image</code>
     * @param srcImage the {@link org.eclipse.swt.graphics.Image} to be converted to a <code>BufferedImage</code>
        // allows us to always retrieve 24 bit data regardless of source color depth.
    {

            if (alphaRaster != null)
        return new Image(Display.getCurrent(), convertToImageData(srcImage));
     */
    private static final PaletteData PALETTE_DATA = new PaletteData(0xFF0000, 0xFF00, 0xFF);
        WritableRaster alphaRaster = srcImage.getAlphaRaster();
    {
            }
            maskData = imageData.getTransparencyMask();
    }
    /**
        if (imageData.alphaData == null)
 * http://www.eclipse.org/legal/epl-v10.html
 *    		   uses GraphitiUiInternal.getWorkbenchService() instead of
        byte[] alphaBytes = new byte[srcImage.getWidth()];
 *    SAP AG - copied class from GMF runtime  since Graphiti can not have a dependency to GMF
     * @param srcImage the {@link java.awt.image.BufferedImage} to be converted to an <code>Image</code>
        // imageData[0].data.
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
                    {
 * This class is originally from GMF and was adapted for Graphiti needs.
     * image that is passed into the method.
     * method.
     * 

/******************************************************************************
 * are made available under the terms of the Eclipse Public License v1.0
     * method.
        for (int y = 0; y < srcImage.getHeight(); y++)
        BufferedImage image = new BufferedImage(imageData.width, imageData.height, BufferedImage.TYPE_INT_ARGB);
