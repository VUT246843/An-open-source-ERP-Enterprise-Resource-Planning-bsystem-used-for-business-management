        IProduct product = Platform.getProduct();
                    public void run() {
                BusyIndicator.showWhile(getShell().getDisplay(), new Runnable() {
    public static final String PRODUCT_PROP_SUB_TITLE = "subTitle"; //$NON-NLS-1$
    {
import org.jkiss.dbeaver.ui.ShellUtils;

        Link siteLink = UIUtils.createLink(group, "   " + UIUtils.makeAnchor(product.getProperty(PRODUCT_PROP_WEBSITE)) + "   ", new SelectionAdapter() {
        titleLabel.setText(product.getProperty(PRODUCT_PROP_SUB_TITLE));

import org.eclipse.swt.events.MouseAdapter;
            UIUtils.dispose(splashImage);
        Composite group = new Composite(parent, SWT.NONE);
        Label titleLabel = new Label(group, SWT.NONE);
    public static final String PRODUCT_PROP_WEBSITE = "website"; //$NON-NLS-1$
        gd = new GridData(GridData.FILL_HORIZONTAL);
            Label nameLabel = new Label(group, SWT.NONE);
    public AboutBoxDialog(Shell shell)
{
        versionLabel.setText(CoreMessages.dialog_about_label_version + GeneralUtils.getProductVersion());
import org.eclipse.swt.events.MouseEvent;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.resource.JFaceColors;
        authorLabel.setLayoutData(gd);
        releaseTimeLabel.setLayoutData(gd);

                        gc.setAntialias(SWT.ON);
            };
                    @Override
                public Point computeSize(int wHint, int hHint, boolean changed) {
        gd.horizontalAlignment = GridData.CENTER;
        if (splashImage != null) {
        releaseTimeLabel.setBackground(background);
        releaseTimeLabel.setText("Release date: " + DateFormat.getDateInstance(DateFormat.LONG).format(GeneralUtils.getProductReleaseDate()));
        Dialog.applyDialogFont(group);
    protected void configureShell(Shell newShell) {
            public void mouseDoubleClick(MouseEvent e) {

        group.setBackground(background);

import org.eclipse.jface.dialogs.Dialog;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        titleLabel.addMouseListener(new MouseAdapter() {
        siteLink.setLayoutData(gd);
    @Override
    protected boolean isBanner() {
import org.eclipse.swt.widgets.*;
 * About box

        gd = new GridData();
        data[0].height += 1;
        if (!CommonUtils.isEmpty(infoDetails)) {
        {
                            0, 0, splashImage.getBounds().width, splashImage.getBounds().height);
        {
    public static final String PRODUCT_PROP_COPYRIGHT = "copyright"; //$NON-NLS-1$
                });
        authorLabel.setText(product.getProperty(PRODUCT_PROP_COPYRIGHT));

    public boolean close() {
        }

        versionLabel.setBackground(background);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.UIUtils;
                        GC gc = new GC(splashImage);
            nameLabel.setLayoutData(gd);
                    try (InputStream is = splashResource.openStream()) {
    }
 * See the License for the specific language governing permissions and

        layout.marginWidth = 20;
 * Unless required by applicable law or agreed to in writing, software
        }
package org.jkiss.dbeaver.ui.app.standalone.about;
        Label releaseTimeLabel = new Label(group, SWT.NONE);
        versionLabel.setEditable(false);
        String infoDetails = DBWorkbench.getPlatform().getApplication().getInfoDetails();
            canvas.addPaintListener(e -> e.gc.drawImage(image, 0, 0));
/*
import org.jkiss.dbeaver.utils.GeneralUtils;
                }

    protected Control createDialogArea(Composite parent)
                            img.getBounds().width, img.getBounds().height,
    }

            Image aboutImage = AbstractUIPlugin.imageDescriptorFromPlugin(
import org.eclipse.core.runtime.Platform;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

        });
import org.eclipse.jface.resource.JFaceResources;
    }
                                // just ignore error
                    }
        titleLabel.setLayoutData(gd);
                        Image img = new Image(getShell().getDisplay(), is);

            HolidayDecorations.install(canvas);
            }
        TITLE_FONT.dispose();
        }
        newShell.setText(CoreMessages.dialog_about_title);

        Text versionLabel = new Text(group, SWT.NONE);
import java.io.InputStream;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        titleLabel.setFont(TITLE_FONT);
import org.jkiss.dbeaver.ui.dialogs.InformationDialog;
            final Canvas canvas = new Canvas(group, SWT.DOUBLE_BUFFERED | SWT.NO_BACKGROUND) {
        gd.horizontalAlignment = GridData.CENTER;
            final Image image = splashImage != null ? splashImage : aboutImage;
        Color background = JFaceColors.getBannerBackground(parent.getDisplay());
                            try {
                log.debug(e);
                    return new Point(bounds.width, bounds.height);
                        img.dispose();
        gd = new GridData(GridData.FILL_HORIZONTAL);
                        IHandlerService service = workbenchWindow.getService(IHandlerService.class);
                        // Do not create InstallationDialog directly
        final FontData[] data = JFaceResources.getDialogFont().getFontData();
                                service.executeCommand("org.eclipse.ui.help.installationDialog", null); //$NON-NLS-1$

import org.eclipse.ui.IWorkbenchWindow;
                            }
            extraText.setText(infoDetails);
            extraText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.model.impl.app.ApplicationRegistry;
    @Override
 * DBeaver - Universal Database Manager
        NAME_FONT.dispose();
        group.setLayout(layout);
    private static final Log log = Log.getLog(AboutBoxDialog.class);



                if (splashResource != null) {
        parent.setBackground(background);
 *
            gd.horizontalAlignment = GridData.CENTER;
        GridLayout layout = new GridLayout(1, false);
        siteLink.setBackground(background);
import org.eclipse.swt.events.SelectionAdapter;
        if (splashImage == null) {
        data[0].setStyle(data[0].getStyle() | SWT.BOLD);
                            } catch (Exception e1) {

public class AboutBoxDialog extends InformationDialog
        return true;
                }
            nameLabel.setBackground(background);
import java.net.URL;
        Label authorLabel = new Label(group, SWT.NONE);
                        splashImage = new Image(img.getDevice(), 400, 200);
                    final Rectangle bounds = image.getBounds();
import org.jkiss.dbeaver.core.CoreMessages;
        }
 * limitations under the License.
import org.eclipse.core.runtime.IProduct;
                @Override
                        if (service != null) {
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
            parent.addDisposeListener(e -> aboutImage.dispose());
                ShellUtils.launchProgram(e.text);
    }
    //public static final String PRODUCT_PROP_EMAIL = "email"; //$NON-NLS-1$
        //Color foreground = JFaceColors.getBannerForeground(parent.getDisplay());
import org.eclipse.swt.layout.GridData;
        gd.horizontalAlignment = GridData.CENTER;
import org.eclipse.ui.plugin.AbstractUIPlugin;
    private Image splashImage;

 *
            try {
        return super.close();
        gd = new GridData(GridData.FILL_HORIZONTAL);
            gd = new GridData(GridData.FILL_HORIZONTAL);
        GridData gd;
        NAME_FONT = new Font(shell.getDisplay(), data);
            "icons/dbeaver_about.png").createImage();
            public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.graphics.*;

            splashImage = null;
            }
            nameLabel.setText(product.getName());
        gd = new GridData(GridData.FILL_HORIZONTAL);
    private final Font NAME_FONT,TITLE_FONT;
import org.eclipse.swt.custom.BusyIndicator;
            @Override
                        IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    }

 */
            Text extraText = new Text(group, SWT.MULTI | SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
 * You may obtain a copy of the License at
        super.configureShell(newShell);

    {
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        authorLabel.setBackground(background);
            }

    }

import java.text.DateFormat;
            } catch (Exception e) {
        versionLabel.setLayoutData(gd);

        TITLE_FONT = new Font(shell.getDisplay(), data);
 *
        super(shell);
                        gc.setInterpolation(SWT.HIGH);
            canvas.setLayoutData(new GridData(SWT.CENTER, SWT.BEGINNING, true, true));
        });
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        gd.horizontalAlignment = GridData.CENTER;
        layout.marginHeight = 20;
        return parent;

        }
                URL splashResource = ApplicationRegistry.getInstance().getApplication().getContributorBundle().getResource("splash.png");
import org.jkiss.utils.CommonUtils;
import org.eclipse.ui.PlatformUI;
        data[0].height += 4;

                        }
                        gc.drawImage(img, 0, 0,
import org.jkiss.dbeaver.Log;
        gd.horizontalAlignment = GridData.CENTER;
}
                        gc.dispose();
import org.eclipse.ui.handlers.IHandlerService;
            @Override
                        // but execute "org.eclipse.ui.help.installationDialog" command
        titleLabel.setBackground(background);
                Platform.getProduct().getDefiningBundle().getSymbolicName(),
            nameLabel.setFont(NAME_FONT);
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridLayout;

import org.jkiss.dbeaver.ui.controls.decorations.HolidayDecorations;
 */
