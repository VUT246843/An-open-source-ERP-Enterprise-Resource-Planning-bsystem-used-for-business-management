            Assert.assertNotNull("Should be able to load target PNG image at " + pngImagePath, expected);
//            graphics.dispose();
import org.jkiss.code.Nullable;
            }
 */
    }
        Assert.assertEquals(a.getWidth(), b.getWidth());
        return null;
    @Test
    public void rasterizeSvgStressTest() throws IOException {
            Assert.assertNotNull("Should be able to locate target PNG image at " + pngImagePath, is);

import java.io.InputStream;
import org.junit.Ignore;
//            graphics.scale(factor, factor);

        }
 * You may obtain a copy of the License at
//
    }

//        try {
//
            expected = ImageIO.read(is);

import org.junit.Assert;
    @Nullable
            actual = getImage(is, factor);
            Assert.assertNotNull("Should be able to load source SVG image at " + svgImagePath, actual);
/*
import org.jkiss.code.NotNull;
    @Ignore("See #26434")
//        final int width = (int) (document.size().width * factor);
//        } finally {
//import com.github.weisj.jsvg.SVGDocument;
//
import org.junit.Test;

//import com.github.weisj.jsvg.parser.SVGLoader;
        final int count = 1000;
 *     http://www.apache.org/licenses/LICENSE-2.0
        compareImages(actual, expected);
        try (InputStream is = SVGTest.class.getResourceAsStream(pngImagePath)) {
//        final SVGLoader loader = new SVGLoader();
    }
    @Test

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
import java.awt.image.BufferedImage;
    }
//        final SVGDocument document = loader.load(is);
        final BufferedImage actual;
            compareImages("logo.svg", "logo.png", 1.0f);

        compareImages("logo.svg", "logo@1.5x.png", 1.5f);
        final long start = System.currentTimeMillis();
//            graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
//
import java.io.IOException;

            Assert.assertNotNull("Should be able to locate source SVG image at " + svgImagePath, is);
package org.jkiss.dbeaver.ui.svg;
 *
//            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
    private static void compareImages(@NotNull String svgImagePath, @NotNull String pngImagePath, float factor) throws IOException {
//        final BufferedImage target = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        final long end = System.currentTimeMillis();
//        }

 *
            for (int y = 0; y < a.getHeight(); y++) {
import javax.imageio.ImageIO;
//        final Graphics2D graphics = target.createGraphics();
public class SVGTest {
//
//        return target;
//            return null;
        System.out.println("Took " + (end - start) + "ms to rasterize " + count + " SVG images (average " + ((end - start) / count) + "ms per image)");
    private static BufferedImage getImage(@NotNull InputStream is, float factor) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
//        final int height = (int) (document.size().height * factor);
 *
 * limitations under the License.
    private static void compareImages(@NotNull BufferedImage a, @NotNull BufferedImage b) {
 * DBeaver - Universal Database Manager
        compareImages("logo.svg", "logo@2x.png", 2.0f);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//
//            document.render(null, graphics);

        for (int x = 0; x < a.getWidth(); x++) {
        Assert.assertEquals(a.getHeight(), b.getHeight());
        compareImages("logo.svg", "logo.png", 1.0f);
        for (int i = 0; i < count; i++) {
                Assert.assertEquals("Pixel at %d-%d should be the same".formatted(x, y), a.getRGB(x, y), b.getRGB(x, y));
//        if (document == null) {
        try (InputStream is = SVGTest.class.getResourceAsStream(svgImagePath)) {
        }

    @Ignore("See #26434")
 * you may not use this file except in compliance with the License.


    }
    public void rasterizeSvgAndCompareToPngTest() throws IOException {
 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
        final BufferedImage expected;
}//        }
