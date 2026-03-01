                close();
    protected IDialogSettings getDialogBoundsSettings() {
import org.jkiss.dbeaver.ui.UIUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.graphics.Font;
            }
    @Override
import org.eclipse.ui.forms.events.HyperlinkAdapter;
    }
            default:
            }

        GridLayout gl = new GridLayout(1, false);
        Control contents = super.createContents(parent);
                break;
        Font largeFont = new Font(dialogFont.getDevice(), fontData);

import org.eclipse.swt.widgets.Composite;
        try {
            case "https":
                });
        form.setLayout(new GridLayout(1, true));
    protected Composite createDialogArea(Composite parent) {
        this.tips = List.copyOf(tips);
            case "view":
        UIUtils.asyncExec(() -> {
        for (int i = 0; i < fontData.length; i++) {
        toolkit.adapt(formText, false, false);
    }
}

        return dialogArea;
import org.eclipse.swt.SWT;

import org.eclipse.ui.forms.widgets.Form;

    @Override
                    }
        store.setValue(UI_SHOW_TIP_OF_THE_DAY_ON_STARTUP, String.valueOf(showOnStartup));
        form.getBody().setLayoutData(new GridData(GridData.FILL_BOTH));
            case IDialogConstants.BACK_ID: {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        super.buttonPressed(buttonId);
        return contents;
        formText.addHyperlinkListener(new HyperlinkAdapter() {
        form.getBody().setLayout(new GridLayout(1, true));
        formText.marginHeight = 0;
                            element = DBWorkbench.getPlatform().getNavigatorModel().getRoot()
                    Object element = null;


                }
import java.util.List;
    protected void buttonPressed(int buttonId) {
import org.eclipse.ui.forms.events.HyperlinkEvent;
            fontData[i] = new FontData(fd.getName(), fd.getHeight() + 1, SWT.NONE);
import org.eclipse.swt.widgets.Control;
                tipIndex = tipIndex == tips.size() - 1 ? 0 : tipIndex + 1;
 */

            showTipButton.addSelectionListener(new SelectionAdapter() {
                @Override
                close();
                        if (uri.getFragment().equals("project")) {
                tipArea.layout();

 * Copyright (C) 2010-2025 DBeaver Corp and others
        switch (uri.getScheme()) {
import org.jkiss.code.NotNull;
                        }
        Composite dialogArea = super.createDialogArea(parent);
                    }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridLayout;
        return true;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public void setDisplayShowOnStartup(boolean displayShowOnStartup) {
            Button okButton = getButton(IDialogConstants.OK_ID);
            Button showTipButton = toolkit.createButton(form.getBody(), TipOfTheDayMessages.show_tips_on_startup, SWT.CHECK);
            @Override
                return;
import org.eclipse.ui.PartInitException;
            }
import org.eclipse.swt.graphics.FontData;
        }
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
    public static void setShowOnStartup(boolean showOnStartup) {
        formText.setHyperlinkSettings(toolkit.getHyperlinkGroup());
                break;
        getShell().setText(TipOfTheDayMessages.tip_of_the_day_title);

        });
 *
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    private final List<String> tips;
            public void linkActivated(HyperlinkEvent e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                return;
                UIUtils.asyncExec(() -> {
            if (!tipArea.isDisposed()) {
                ShellUtils.launchProgram(href.toString());
            case IDialogConstants.NEXT_ID: {
import org.eclipse.swt.widgets.Button;
                UIUtils.asyncExec(() -> {
                okButton.setFocus();
                                .getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject());
            }
    protected Control createContents(Composite parent) {
    private void navigateLink(HyperlinkEvent e) {
    protected boolean needsButtonBar() {
        scrolledFormText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
                    try {
    public static boolean isShowOnStartup() {

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        }
                        UIUtils.getActiveWorkbenchWindow().getActivePage().showView(uri.getHost());


            case "prefs":


        });
        } catch (Exception e) {
                    UIUtils.showPreferencesFor(UIUtils.getActiveWorkbenchShell(), element, uri.getHost());
    }
    }
import org.eclipse.ui.forms.widgets.FormToolkit;
                            log.warn("Unknown element type: '" + uri.getFragment() + "'");

                    setShowOnStartup(showTipButton.getSelection());
        String tipText = "<form><p>" + tips.get(tipIndex) + "</p></form>";
 * limitations under the License.
        tipArea.setLayoutData(new GridData(GridData.FILL_BOTH));
            });
        parent.addDisposeListener(e -> largeFont.dispose());
        setBlockOnOpen(false);
public class ShowTipOfTheDayDialog extends AbstractPopupPanel {
/*
                });
            scrolledFormText.getFormText().setText(tipText, true, false);
    @Override
                break;
                showTip();
    }
import java.net.URI;
        gl.marginWidth = 0;

 * you may not use this file except in compliance with the License.
        Form form = toolkit.createForm(tipArea);
        FontData[] fontData = dialogFont.getFontData();
 * See the License for the specific language governing permissions and
        GridData gd = new GridData(GridData.FILL_BOTH);
    @Override
            }


    }
        if (displayShowOnStartup) {
    }
import org.eclipse.jface.dialogs.IDialogSettings;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (okButton != null) {
            return;
    private static final String UI_SHOW_TIP_OF_THE_DAY_ON_STARTUP = "ui.show.tip.of.the.day.on.startup";
        gd.widthHint = 300;
        }
        createButton(parent, IDialogConstants.BACK_ID, IDialogConstants.BACK_LABEL, false);
        this.displayShowOnStartup = displayShowOnStartup;
 *
            showTipButton.setSelection(isShowOnStartup());

        //[dbeaver/dbeaver#11526]
        tipIndex = new Random(System.currentTimeMillis()).nextInt(tips.size());
            FontData fd = fontData[i];


        //form.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
        form.setLayoutData(new GridData(GridData.FILL_BOTH));

                    } catch (PartInitException e1) {
        if (href == null) {
        toolkit.setBorderStyle(SWT.NULL);
    protected void createButtonsForButtonBar(Composite parent) {
    public ShowTipOfTheDayDialog(@NotNull Shell parentShell, @NotNull List<String> tips) {
import org.eclipse.swt.layout.GridData;
        formText.setFont(largeFont);
    @Override
import org.eclipse.jface.resource.JFaceResources;
                showTip();
        FormText formText = new FormText(scrolledFormText, SWT.WRAP | SWT.NO_FOCUS);
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);

        tipArea = new Composite(dialogArea, SWT.BORDER);
        super(parentShell, TipOfTheDayMessages.tip_of_the_day_title);
                    if (uri.getFragment() != null) {
                break;
    private int tipIndex;
        switch (buttonId) {
        createButton(parent, IDialogConstants.NEXT_ID, IDialogConstants.NEXT_LABEL, false);
    }
        formText.setLayoutData(gd);
    }
            //toolkit.createFormText(form.getBody(), false);
    private ScrolledFormText scrolledFormText;
 * distributed under the License is distributed on an "AS IS" BASIS,
            scrolledFormText.reflow(true);
                        DBWorkbench.getPlatformUI().showError("Open view", "Error opening view " + uri.getHost(), e1);

import java.util.Random;
package org.jkiss.dbeaver.ui.app.standalone.tipoftheday;
import org.eclipse.ui.forms.widgets.FormText;
    }
    @Override

            log.error(e);
        scrolledFormText = new ScrolledFormText(form.getBody(), SWT.V_SCROLL, false);
        UIUtils.asyncExec(() -> {
        showTip();
        }
            case "http":
        tipArea.setLayout(gl);

        final URI uri = URI.create(href.toString());
        });
    }
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.widgets.Shell;
        final Object href = e.getHref();
    private void showTip() {
        }
                log.warn("Unknown scheme: '" + uri.getScheme() + "'");
import org.eclipse.ui.forms.widgets.ScrolledFormText;
        formText.setMenu(form.getBody().getMenu());
        gd.heightHint = 100;

        gl.marginHeight = 0;


        return UIUtils.getDialogSettings(DIALOG_ID);
import org.eclipse.swt.events.SelectionAdapter;
                        } else {
 * Unless required by applicable law or agreed to in writing, software
            form.getBody().setTabList(new Control[] { showTipButton });
        setModeless(true);
import org.eclipse.jface.dialogs.IDialogConstants;
        FormToolkit toolkit = new FormToolkit(parent.getDisplay());
        toolkit.adapt(scrolledFormText);
    private static final String DIALOG_ID = "DBeaver." + ShowTipOfTheDayDialog.class.getSimpleName();
                public void widgetSelected(SelectionEvent e) {
                tipIndex = tipIndex == 0 ? tips.size() - 1 : tipIndex - 1;
 *
    }
 * You may obtain a copy of the License at
        scrolledFormText.setExpandVertical(true);
    private boolean displayShowOnStartup;
        return CommonUtils.toBoolean(store.getString(UI_SHOW_TIP_OF_THE_DAY_ON_STARTUP), true);
import org.jkiss.dbeaver.ui.ShellUtils;
        formText.marginWidth = 1;
    private Composite tipArea;
        scrolledFormText.setFormText(formText);

        Font dialogFont = JFaceResources.getDialogFont();
import org.eclipse.swt.events.SelectionEvent;
                navigateLink(e);
import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(ShowTipOfTheDayDialog.class);
        }

