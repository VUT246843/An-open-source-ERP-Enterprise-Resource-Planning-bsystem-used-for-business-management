                populateList(eStatus, nesting, false);
        Point textSize;
    @Override

        // Look for child status
        detailPanel = super.createDialogPanelWithMargins(parent, true);

    private IStatus status;
        // create image
import org.jkiss.dbeaver.model.DBIcon;
        } finally {
            sb.append(statusMessage.trim());


        super(parentShell, dialogTitle, DBIcon.STATUS_ERROR);
import org.eclipse.swt.graphics.GC;
/**
        }
    }
            detailPanel.setVisible(false);
    @Override
import org.jkiss.code.Nullable;
        super.configureShell(shell);
    protected Text getDetailsText() {
    }
public class BaseErrorDialog extends BaseDialog {
                IDialogConstants.SHOW_DETAILS_LABEL, false

        // fill the list

        @NotNull IStatus status,
        // Look for a nested core exception
            }

            super.buttonPressed(id);
            ((GridData)detailPanel.getLayoutData()).exclude = true;
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
import org.eclipse.core.runtime.CoreException;
    }
        }
            // Gets exception message if it is not contained in the
            detailPanel.setVisible(true);
        }
        if (detailsText != null && !detailsText.isDisposed()) {

        this.message = message == null ? status.getMessage() : message;
                textSize.x += fontHeight * 8;
        }
            // Include low-level exception message
        Throwable t = status.getException();
        }
    @Override
        }
    protected final void setStatus(IStatus status) {
    private Composite detailPanel;
            return true;
        return result;
    private void populateList(
        }
        return listContentExists();
        boolean opened = false;


import org.jkiss.utils.StringUtils;
import org.eclipse.jface.layout.GridDataFactory;
    }

            ((GridLayout) dialogArea.getLayout()).numColumns++;
            }

        }


 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.eclipse.swt.widgets.*;
    protected String message;
    }
        }
    }
import java.util.Objects;
        }
    @NotNull

    @NotNull
 *
        createDropDownList(contents);
        this.displayMask = displayMask;
            CoreException ce = (CoreException) t;
        if (!(t instanceof CoreException) && t != null) {
                return DBIcon.STATUS_WARNING;
    protected void createDropDownList(@NotNull Composite parent) {
    private boolean listContentExists() {
        int displayMask
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL

        Composite contents = (Composite) super.createContents(parent);
    private Text detailsText;
        return DBIcon.STATUS_ERROR;
    private static final String NESTING_INDENT = "  "; //$NON-NLS-1$
        }
        @NotNull IStatus status,
                    + "\n";
    @Override
        int fontHeight = UIUtils.getFontHeight(messageText);

        // Look for a nested core exception
        data.widthHint = 100;
    }
        getShell().layout(true, true);
        }
            detailsText.append(sb.toString());
    public BaseErrorDialog(
            if (RuntimeUtils.isMacOS()) {
            dialogTitle;
        if (!buildingStatus.matches(displayMask)) {

import org.eclipse.jface.resource.JFaceResources;
        boolean includeStatus
    public int open() {
            textSize = gc.textExtent(wrappedMessage);
        populateList(status, 0, shouldIncludeTopLevelErrorInDetails);
        if (includeStatus) {

    @Nullable


    }
        createDetailsButton(parent);
    ) {

 * Licensed under the Apache License, Version 2.0 (the "License");
     */
        ((GridLayout) dialogArea.getLayout()).numColumns++;
    private final int displayMask;
    /**
        dialogArea.setLayoutData(gd);
    protected Composite createContents(@NotNull Composite parent) {
            return;
        if (isDetailsVisible()) {
        repopulateList();
    private void populateList() {
    @Override
/*
    ) {
        if (!isDetailsVisible()) {
        }

        @Nullable String message,

        boolean incrementNesting = false;
    }
        GridData gd = new GridData(fillVertical ? GridData.FILL_BOTH : GridData.FILL_HORIZONTAL);
        return OK;
 * information then a Details button is automatically supplied, which shows or
            detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
            StringBuilder sb = new StringBuilder();
 * You may obtain a copy of the License at
            }

        if (id == IDialogConstants.DETAILS_ID) {
        shell.setText(title);
            // Only print the exception message if it is not contained in the
}
     * Filter mask for determining which status items to display.

     */
            return status.matches(mask);
        }
        // Look for child status

                result |= listContentExists(eStatus, true);
 *

import org.jkiss.dbeaver.utils.GeneralUtils;
            toggleDetailsArea();
 * *
    }
            String message = GeneralUtils.makeStandardErrorMessage(t);
    }
            opened = true;
        }
import org.jkiss.dbeaver.model.DBPImage;
        @Nullable Shell parentShell,
    @Override
        imageLabel.setImage(DBeaverIcons.getImage(image));
    protected void buttonPressed(int id) {
    private final String title;
            detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
            if (status.getSeverity() == IStatus.INFO) {
        this.status = status;

            this.status = status;
                incrementNesting = true;
import org.eclipse.jface.dialogs.IDialogConstants;
        return detailPanel.isVisible();
            if (message == null || !message.contains(eStatus.getMessage())) {

import org.eclipse.swt.layout.GridData;
        IStatus[] children = buildingStatus.getChildren();
        if (shouldShowDetailsButton()) {
            incrementNesting = true;
        return contents;

    ) {
        if (includeStatus) {

        if (shouldDisplay(status, displayMask)) {
            .getString("Problem_Occurred") : //$NON-NLS-1$
    }
        IStatus[] children = status.getChildren();
import org.jkiss.dbeaver.utils.RuntimeUtils;
        for (IStatus element : children) {
        }
        detailsText.setLayoutData(data);
        Composite dialogArea = super.createDialogArea(parent);
 */
            // was the details button pressed?

            Text messageText = new Text(dialogArea, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
            getShell().setSize(new Point(newSize.x, newSize.y));
        messageText.setLayoutData(gd);
            }

        return detailsText;
        shouldIncludeTopLevelErrorInDetails = true;
                    + message.trim()
    }
        return false;
        ((GridData)detailPanel.getLayoutData()).exclude = true;
 * limitations under the License.

                return true;
            populateList();
import org.eclipse.swt.layout.GridLayout;
        }
            UIUtils.resizeShell(getShell());
        this.title = dialogTitle == null ? JFaceResources
    private void applyMessageSizes(@NotNull Text messageText, boolean fillVertical, int messageWidthHintChars) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (message != null && !Objects.equals(statusMessage, message)) {
 * See the License for the specific language governing permissions and
                String sb = NESTING_INDENT.repeat(Math.max(0, nesting))
 * hides an error details viewer when pressed by the user.
        } else {
            //textSize.y = wrappedMessage.split("\n").length * messageText.getLineHeight();

    private boolean shouldIncludeTopLevelErrorInDetails = false;

            ((GridData)detailPanel.getLayoutData()).exclude = false;
            messageText.setText(message);
 * A dialog to display one or more errors to the user, as contained in an
        // create composite
            }

            if (element.matches(mask)) {
            String wrappedMessage = StringUtils.wrap(messageText.getText(), (int) charsPerLine);

        int rowCount = 10;//Math.min(detailsText.getText().split("\n").length, 10) + 1;
    private static final int DETAILS_MESSAGE_WIDTH = 130;
        ((GridData)detailsText.getLayoutData()).heightHint = rowCount * UIUtils.getFontHeight(detailsText);
        if (!status.matches(displayMask)) {

        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }
            }
            }

        }
 *
    protected boolean shouldShowDetailsButton() {
        for (IStatus element : children) {
            double charsPerLine = (double) maxDialogWidth / gc.getFontMetrics().getAverageCharacterWidth();
    public DBPImage getImage() {
                detailsText.append(sb);

            if (message == null || !message.contains(eStatus.getMessage())) {
            textSize.x += fontHeight * 2;
        //data.horizontalSpan = ((GridLayout)parent.getLayout()).numColumns;
    }
    protected boolean isDetailsVisible() {
        GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BEGINNING).applyTo(imageLabel);
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
    public static final int DEFAULT_MESSAGE_WIDTH = 80;
        IStatus buildingStatus,
    private Button detailsButton;
            sb.append(NESTING_INDENT.repeat(Math.max(0, nesting)));

            IStatus eStatus = ce.getStatus();
 * Originally copied from org.eclipse.jface.dialogs.ErrorDialog
    /**
        return dialogArea;
            detailsText.setText("");

        detailsText = new Text(detailPanel, SWT.BORDER | SWT.WRAP | SWT.READ_ONLY | SWT.V_SCROLL | SWT.MULTI);
        boolean includeStatus
        applyMessageSizes(detailsText, true, DETAILS_MESSAGE_WIDTH);


    protected static boolean shouldDisplay(@NotNull IStatus status, int mask) {
    }

    }
        Throwable t = buildingStatus.getException();
        Label imageLabel = new Label(dialogArea, SWT.NULL);
import org.jkiss.dbeaver.ui.UIUtils;
        boolean result = false;
            | GridData.GRAB_HORIZONTAL | GridData.VERTICAL_ALIGN_FILL
            statusMessage = status.getMessage();
        gd.minimumWidth = IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH;
        String statusMessage = null;
        // create the list
    protected final void showDetailsArea() {

        gd.heightHint = Math.min(textSize.y, fontHeight * 10);
    protected void configureShell(@NotNull Shell shell) {
        if (children == null || children.length == 0) {
        @Nullable String dialogTitle,
        for (IStatus element : children) {
     * Toggles the unfolding of the details area. This is triggered by the user
import org.eclipse.core.runtime.IStatus;
        if (opened) {
        {
            toggleDetailsArea();
 * you may not use this file except in compliance with the License.

            sb.append("\n");
        gd.grabExcessHorizontalSpace = true;
        detailPanel.setVisible(false);


        if (status != null) {
            );
        return listContentExists(status, shouldIncludeTopLevelErrorInDetails);

            | GridData.GRAB_VERTICAL);
        populateList();
        if (incrementNesting) {
    }
    private boolean listContentExists(
    }
            detailsButton = createButton(parent, IDialogConstants.DETAILS_ID,
import org.eclipse.swt.graphics.Point;

        if (t instanceof CoreException ce) {
        Point newSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        GC gc = new GC(messageText);
    @Override
        }
            applyMessageSizes(messageText, false, DEFAULT_MESSAGE_WIDTH);
            return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
    }
        gd.widthHint = Math.min(textSize.x, maxDialogWidth);
    protected Composite createDialogArea(@NotNull Composite parent) {
    protected void createDetailsButton(@NotNull Composite parent) {
            // parent message
 * Unless required by applicable law or agreed to in writing, software
     * pressing the details button.
    }
    @Override
        if (t != null && !(t instanceof CoreException)) {
            // parent message
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        // create message
            return true;
        }
    }
        DBPImage image = getImage();
            gc.setFont(messageText.getFont());
        setReturnCode(OK);
            return super.open();
 * DBeaver - Universal Database Manager

        // If it was not a warning or an error then return the error image

import org.eclipse.swt.SWT;
            IStatus eStatus = ce.getStatus();
        }
        if (t != null) {
        }
        }
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    }
        try {
        IStatus[] children = status.getChildren();
        int nesting,
package org.jkiss.dbeaver.ui.dialogs;
        }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (this.status != status) {
        } else {
            if (status.getSeverity() == IStatus.WARNING) {

    private void repopulateList() {
 * <code>IStatus</code> object. If an error contains additional detailed
            nesting++;
            textSize.y += 5; // Just in case. On MacOS height should be a bit more to avoid truncation
            populateList(element, nesting, false);
    private void toggleDetailsArea() {
            gc.dispose();
                return DBIcon.STATUS_INFO;
            result |= listContentExists(element, true);
        } else if (getDialogArea() != null) {

        int maxDialogWidth = fontHeight * messageWidthHintChars;
