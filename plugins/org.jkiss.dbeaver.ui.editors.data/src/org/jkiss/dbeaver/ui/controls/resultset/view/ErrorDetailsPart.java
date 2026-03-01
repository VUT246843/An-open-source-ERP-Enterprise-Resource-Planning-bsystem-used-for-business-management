import org.jkiss.dbeaver.ui.IActionConstants;
        UIUtils.createDialogButton(
        );
    private Image getImage() {
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
 * Unless required by applicable law or agreed to in writing, software
            }
        this.reason = reason;
        }
                descriptor.getDescription(),
                ((GridData) text.getLayoutData()).heightHint = 100;

    private static final Log log = Log.getLog(ErrorDetailsPart.class);
import org.eclipse.jface.layout.GridDataFactory;
            return;
        EditTextDialog dialog = new EditTextDialog(
        }
        createDetailsButton(buttonParent);
/**
}
 *
        button.addDisposeListener(e -> image.dispose());
/*
        buttonParent.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
     * @return the image
            }
        dialog.setMonospaceFont(true);
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetErrorActionRegistry;
        }
        Composite buttonParent = new Composite(parent, SWT.NONE);
            SelectionListener.widgetSelectedAdapter(e -> {
            throwable.printStackTrace(pwriter);
        final Image image = descriptor.getImageDescriptor().createImage();
                descriptor.getLabel(),
import org.jkiss.code.NotNull;
    }
        imageLabel.setImage(getImage());
            null,
 */
            case IStatus.WARNING -> DBeaverIcons.getImage(DBIcon.STATUS_WARNING);
                    StatusManager.getManager().handle(ce, WorkbenchPlugin.PI_WORKBENCH);
            }
        text.setFont(UIUtils.getMonospaceFont());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return swriter.toString();
                try {
        buttonParent.setBackground(parent.getBackground());
import org.eclipse.ui.statushandlers.StatusManager;
        new Label(buttonParent, SWT.NONE).setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.custom.StyledText;
        Label imageLabel = new Label(parent, SWT.NONE);
            UIUtils.createDialogButton(
 *
    ErrorDetailsPart(final Composite parent, IStatus reason, @NotNull IResultSetContainer resultSetContainer) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetErrorActionDescriptor;
                descriptor.getIcon(),
import java.io.StringWriter;
        createShowLogButton(buttonParent);
        IViewDescriptor descriptor = PlatformUI.getWorkbench().getViewRegistry().find(IActionConstants.LOG_VIEW_ID);
    private void createShowLogButton(Composite parent) {

        return switch (reason.getSeverity()) {

            true);
                action = descriptor.createInstance();
    }
        }
     *
        if (status.getException() != null) {
import org.eclipse.core.runtime.IStatus;
                buttonParent,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.DBeaverIcons;
            if (size.y > 100) {
import org.jkiss.dbeaver.ui.UIUtils;
                }


            ((GridLayout) buttonParent.getLayout()).numColumns++;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.internal.WorkbenchMessages;
    private String getStackTrace(Throwable throwable) {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContainer;
 * You may obtain a copy of the License at

import org.eclipse.swt.layout.GridLayout;
 * @since 3.1
                parent.layout(true);
            SelectionListener.widgetSelectedAdapter(e -> showDetails())
            case IStatus.ERROR -> DBeaverIcons.getImage(DBIcon.STATUS_ERROR);
    }

import org.jkiss.dbeaver.ui.controls.resultset.IResultSetErrorAction;
import org.jkiss.dbeaver.model.DBIcon;
        }
            final Point size = text.getSize();
        if (reason.getException() == null) {
import org.eclipse.jface.dialogs.IDialogConstants;

            default -> DBeaverIcons.getImage(DBIcon.STATUS_INFO);
    }
    private String getDetails(IStatus status) {
        this.parent = parent;
import org.eclipse.swt.widgets.Label;
 * limitations under the License.
            WorkbenchMessages.ErrorLogUtil_ShowErrorLogTooltip,

        text.setText(GeneralUtils.normalizeLineSeparators(reason.getMessage()));
    private void showDetails() {
            parent.getShell(),
 * distributed under the License is distributed on an "AS IS" BASIS,
        StringWriter swriter = new StringWriter();
        if (descriptor == null) {

        StyledText text = new StyledText(parent, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(IActionConstants.LOG_VIEW_ID);
        });
                log.error("Can't create error action '" + descriptor.getLabel() + "'", e);
            return GeneralUtils.normalizeLineSeparators(getStackTrace(status.getException()));
import org.jkiss.dbeaver.Log;
 *
            } catch (DBException e) {
                continue;


            return;
            "Error details",
        imageLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_BEGINNING));
            parent,
    private final IStatus reason;


    }
        dialog.open();

 *     http://www.apache.org/licenses/LICENSE-2.0
            "Show log",
    private final Composite parent;
            try {
            );

            })
package org.jkiss.dbeaver.ui.controls.resultset.view;
 */
                continue;
import org.jkiss.dbeaver.utils.GeneralUtils;
        try (PrintWriter pwriter = new PrintWriter(swriter)) {
        for (ResultSetErrorActionDescriptor descriptor : ResultSetErrorActionRegistry.getInstance().getActions()) {
import org.eclipse.swt.layout.GridData;
            IDialogConstants.SHOW_DETAILS_LABEL,
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.ui.views.IViewDescriptor;

     * Return the image for the upper-left corner of this part
        Button button = UIUtils.createDialogButton(
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.swt.SWT;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionListener;
            getDetails(reason),
import org.eclipse.ui.internal.WorkbenchPlugin;
        );
class ErrorDetailsPart {
            parent,

        return ""; //$NON-NLS-1$
            if (!action.isVisible(resultSetContainer, this.reason)) {
            IResultSetErrorAction action;
        };
    private void createDetailsButton(@NotNull Composite parent) {
        // Spacer
 * See the License for the specific language governing permissions and
                SelectionListener.widgetSelectedAdapter(e -> action.perform(resultSetContainer, this.reason))
    }
        buttonParent.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).span(2, 1).create());
import org.jkiss.dbeaver.DBException;
        dialog.setAutoSize(true);
        parent.setLayout(GridLayoutFactory.fillDefaults().extendedMargins(5, 0, 5, 5).numColumns(2).create());
    }
import org.eclipse.ui.PlatformUI;
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
import java.io.PrintWriter;
     */

        button.setImage(image);
    /**
        text.addListener(SWT.Resize, e -> {
            pwriter.flush();
                } catch (CoreException ce) {

import org.eclipse.swt.graphics.Point;

                // Can't use the setSize here - will revalidate every time the parent is resized
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
