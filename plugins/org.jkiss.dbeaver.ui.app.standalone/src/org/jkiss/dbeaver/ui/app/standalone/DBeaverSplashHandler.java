
import org.eclipse.jface.resource.StringConverter;

 */
import org.eclipse.core.runtime.Platform;
        super.init(splash);
            versionInfoSizeString = product.getProperty("versionInfoSize");
 * You may obtain a copy of the License at
        String versionInfoSizeString = null;
            if (product != null) {
import org.eclipse.swt.graphics.*;
        normalFont = getContent().getFont();
        fontData[0].setStyle(fontData[0].getStyle() | SWT.BOLD);
        super.dispose();
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IProduct;
    public void init(Shell splash) {
 * Unless required by applicable law or agreed to in writing, software
        final IProduct product = Platform.getProduct();
public final class DBeaverSplashHandler extends BasicSplashHandler {
        String foregroundColorString = null;
        });
        final int versionInfoSize = StringConverter.asInt(versionInfoSizeString, 22);
        boldFont = new Font(normalFont.getDevice(), fontData[0]);
        if (boldFont != null) {
            e.gc.drawText(productVersion, versionCoord.x, versionCoord.y, true);
            e.gc.setFont(boldFont);
    private Font boldFont;

 * Licensed under the Apache License, Version 2.0 (the "License");
            versionCoordString = product.getProperty("versionInfoCoord");

                productVersion = GeneralUtils.getPlainVersion();
        setForeground(StringConverter.asRGB(foregroundColorString, new RGB(255, 255, 255)));
            initVisualization();
            progressRectString = product.getProperty(IProductConstants.STARTUP_PROGRESS_RECT);
            messageRectString = product.getProperty(IProductConstants.STARTUP_MESSAGE_RECT);
import org.eclipse.ui.splash.BasicSplashHandler;
/*
    private void initVisualization() {
import org.jkiss.dbeaver.utils.GeneralUtils;
        FontData[] fontData = normalFont.getFontData();
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private Font normalFont;
    @Override
            foregroundColorString = product.getProperty(IProductConstants.STARTUP_FOREGROUND_COLOR);
        final Point versionCoord = StringConverter.asPoint(versionCoordString, new Point(485, 215));

            String productVersion = "";
package org.jkiss.dbeaver.ui.app.standalone;
}
        }

    
            boldFont.dispose();
        getContent().addPaintListener(e -> {
            }
 * DBeaver - Universal Database Manager

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        String messageRectString = null;
 *
    }
        }
        if (product != null) {

        String versionCoordString = null;
    public void dispose() {
 *
        fontData[0].setHeight(versionInfoSize);

        }
            e.printStackTrace(System.err);
        setMessageRect(StringConverter.asRectangle(messageRectString, new Rectangle(275, 275, 280, 25)));
 *
        String progressRectString = null;

 * See the License for the specific language governing permissions and
        } catch (Exception e) {
import org.eclipse.ui.branding.IProductConstants;
import org.eclipse.swt.widgets.Shell;
        setProgressRect(StringConverter.asRectangle(progressRectString, new Rectangle(275, 300, 280, 10)));
 * limitations under the License.
            e.gc.setFont(normalFont);
        try {
            boldFont = null;
    @Override
import org.eclipse.swt.SWT;

            e.gc.setForeground(getForeground());

    }
