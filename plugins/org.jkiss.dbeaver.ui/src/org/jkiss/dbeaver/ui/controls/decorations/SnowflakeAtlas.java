 * limitations under the License.
    private static int sum(int n) {
        return new SnowflakeAtlas(
import java.util.List;
        var data = generateAtlasData(display, images, color, size, step, mips);
            var result = image.getImageData();
        @NotNull RGB color,
    private static ImageData generateAtlasData(
    @NotNull
    ) {

import org.jkiss.dbeaver.model.DBPImage;
            image.dispose();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
                    int y = size * j - sum(j - 1) * step;
        return size - mip * step;
    }
                    transform.rotate(angle);
        @NotNull RGB color,
            for (int y = 0; y < result.height; y++) {

 *
        var scale = image.getBounds().width / (float) (size * images.size());
                    int center = (int) (scale * 0.5f);
                    var bounds = sprite.getBounds();
            transform.dispose();
import java.util.Random;
        var random = new Random();
            images.size(),
import org.eclipse.swt.SWT;
                    result.setAlpha(x, y, 255 - pixel.red); // use any channel since images are BW
                    gc.setTransform(transform);
            gc.dispose();
        int mips
            image,

                }
                }
            mipSize
        );
                for (int j = 0; j < mips; j++) {
        }
        int step,
                    var pixel = result.palette.getRGB(result.getPixel(x, y));
        try {

                    gc.drawImage(sprite, bounds.x, bounds.y, bounds.width, bounds.height, -center, -center, scale, scale);
    }
            gc.setAntialias(SWT.ON);
        int mipSize = getSize(mip);
    }

    ) {
            mipSize,
    @NotNull Image image,

            gc.fillRectangle(0, 0, image.getBounds().width, image.getBounds().height);
                    transform.identity();

        );
    @NotNull
        int step,
            var filler = result.palette.getPixel(color);
        int mipShift = sum(mip - 1) * step;
            // fill the background with something contrast
) implements IDisposable {

            for (int i = 0; i < images.size(); i++) {
            }

    int mips
                    int angle = random.nextInt(360);

                    transform.translate(x + center, y + center);
        return n * (n + 1) / 2;
        image.dispose();
        int size,
        @NotNull List<? extends DBPImage> images,
 * You may obtain a copy of the License at
                for (int x = 0; x < result.width; x++) {
        var gc = new GC(image);
    static SnowflakeAtlas generate(
 * Licensed under the Apache License, Version 2.0 (the "License");

    int getSize(int mip) {
            Math.round(step * scale),
            gc.setInterpolation(SWT.HIGH);

        var image = new Image(display, data);
record SnowflakeAtlas(
        @NotNull Display display,
                    int x = i * scale;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    gc.setAlpha(255 / random.nextInt(3, 8));
    int step,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void dispose() {
        return new Rectangle(
 * DBeaver - Universal Database Manager
    }
}
            }
            mip * size - mipShift,
            return result;

    Rectangle getClip(int index, int mip) {

        var image = new Image(display, size * images.size(), size * mips - sum(mips - 1) * step);

        @NotNull Display display,

 * See the License for the specific language governing permissions and
    @NotNull
        int size,
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
                    result.setPixel(x, y, filler);
    int count,

import org.jkiss.code.NotNull;

            Math.round(size * scale),
    }
import org.eclipse.swt.graphics.*;
            index * mipSize,
import org.jkiss.dbeaver.ui.DBeaverIcons;
            gc.setBackground(display.getSystemColor(SWT.COLOR_MAGENTA));
 *
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.services.IDisposable;

        var transform = new Transform(display);
                    var sprite = DBeaverIcons.getImage(images.get(i));
        int mips
            mips
package org.jkiss.dbeaver.ui.controls.decorations;

import org.eclipse.swt.widgets.Display;
                    int scale = size - j * step;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull List<? extends DBPImage> images,
    int size,
/*
 *
        } finally {
