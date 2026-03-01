 * You may obtain a copy of the License at
import org.jkiss.dbeaver.Log;
        }
                drawBottomLeft(bottomLeft);

        if (baseImageSize == null) {
/**
                drawImage(idp, x, 0);
                drawBottomRight(bottomRight);
}    }
        }
                x -= idp.getWidth();
            }
			}
		if (overlays == null)
    private CachedImageDataProvider getBaseImageData() {
    public OverlayImageDescriptor(@NotNull ImageDescriptor baseImage) {
        } catch (Exception e) {
    private Point baseImageSize = null;
				drawImage(idp, x, getSize().y - idp.getHeight());
        this.baseImage = baseImage;
 *
            CachedImageDataProvider idp = getBaseImageData();
		for (int i = 0; i < 3; i++) {


            if (i < length && overlays[i] != null) {
            log.debug("Error rendering overlay", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (bottomLeft != null)

		if (overlays == null)
 * See the License for the specific language governing permissions and
                drawImage(idp, x, 0);
    public void setTopRight(ImageDescriptor[] topRight)
    public void setTopLeft(ImageDescriptor[] topLeft)

            return;
 *
        return baseImageSize;
            if (bottomRight != null)
    }
                drawTopRight(topRight);
	private void drawBottomRight(ImageDescriptor[] overlays) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.topLeft = topLeft;
import org.eclipse.swt.graphics.Point;
                CachedImageDataProvider idp = createCachedImageDataProvider(overlays[i]);
    protected Point getSize() {
            baseImageDataProvider = createCachedImageDataProvider(baseImage); 
		}
        }
    }
        this.topRight = topRight;
 */
			return;
    {
        if (overlays == null)

 *
 * An OverlayIcon consists of a main icon and several adornments.
	}
            }

                CachedImageDataProvider idp = createCachedImageDataProvider(overlays[i]);
            if (i < length && overlays[i] != null) {
        int length = overlays.length;
    }
    @NotNull
		int x = getSize().x;
 * Licensed under the Apache License, Version 2.0 (the "License");
		int length = overlays.length;
            baseImageSize = new Point(idp.getWidth(), idp.getHeight());
        }
 * DBeaver - Universal Database Manager
        int length = overlays.length;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

            return;
			}
                CachedImageDataProvider idp = createCachedImageDataProvider(overlays[i]);
		int length = overlays.length;
    {
        return baseImageDataProvider;
    private final ImageDescriptor baseImage;

		for (int i = 2; i >= 0; i--) {
    {
    private void drawTopRight(ImageDescriptor[] overlays) {
				x -= idp.getWidth();
			return;
 * limitations under the License.
    @NotNull
    public void setBottomLeft(ImageDescriptor[] bottomLeft)
		}
    {
    public void setBottomRight(ImageDescriptor[] bottomRight)

        for (int i = 2; i >= 0; i--) {

        if (baseImageDataProvider == null) {
    }
	}
    private CachedImageDataProvider baseImageDataProvider = null;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.CompositeImageDescriptor;
                drawTopLeft(topLeft);

 */
        drawImage(getBaseImageData(), 0, 0);
        for (int i = 0; i < 3; i++) {

		int x = 0;
    }
    private ImageDescriptor[] topLeft, topRight, bottomLeft, bottomRight;
				x += idp.getWidth();
			if (i < length && overlays[i] != null) {
    }
            if (topLeft != null)
 * you may not use this file except in compliance with the License.
        }

				drawImage(idp, x, getSize().y - idp.getHeight());
/*
        if (overlays == null)

    private static final Log log = Log.getLog(OverlayImageDescriptor.class);
    }
        int x = 0;

        this.bottomLeft = bottomLeft;

package org.jkiss.dbeaver.ui;
	@Override
        try {
        int x = getSize().x;
        this.bottomRight = bottomRight;
public class OverlayImageDescriptor extends CompositeImageDescriptor {
 * Unless required by applicable law or agreed to in writing, software
    @Override
			if (i < length && overlays[i] != null) {
    protected void drawCompositeImage(int width, int height) {
import org.jkiss.code.NotNull;
                x += idp.getWidth();
    }

	private void drawBottomLeft(ImageDescriptor[] overlays) {
                CachedImageDataProvider idp = createCachedImageDataProvider(overlays[i]);

 * distributed under the License is distributed on an "AS IS" BASIS,
    private void drawTopLeft(ImageDescriptor[] overlays) {
            if (topRight != null)
