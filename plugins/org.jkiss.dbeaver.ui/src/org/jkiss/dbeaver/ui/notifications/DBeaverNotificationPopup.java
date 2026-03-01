        int count = 0;
                        if (window != null) {
package org.jkiss.dbeaver.ui.notifications;
                        public void controlResized(ControlEvent e) {
    }
     * Allows to set focus on first child

                            }
import java.util.List;

            parent.getChildren()[0].setFocus();
                        }
                            Shell windowShell = window.getShell();
        super.createTitleArea(parent);
    public static final Color HYPERLINK_WIDGET_COLOR = new Color(Display.getDefault(), 12, 81, 172);
                    descriptionLabel.setText(LegacyActionTools.escapeMnemonics(descriptionText));
                        .applyTo(descriptionLabel);
                            }
import org.eclipse.swt.accessibility.AccessibleAdapter;
                remainingLink.setForeground(HYPERLINK_WIDGET_COLOR);
                int numNotificationsRemain = notifications.size() - count;
                break;
 * @author Rob Elves
                    });
                if (notification.getDescription() != null) {
        }
        }
import org.eclipse.swt.SWT;
            notificationComposite.setLayout(new GridLayout(2, false));
                    descriptionText = notification.getDescription();

import org.eclipse.ui.IWorkbenchWindow;

                            ((GridData) label.getLayoutData()).widthHint = label.getSize().x;
                notificationLabelIcon.setBackground(parent.getBackground());
                    descriptionLabel.getAccessible().addAccessibleListener(new AccessibleAdapter() {
                }
 * which accompanies this distribution, and is available at
                            final Text label = (Text) e.widget;
    }
                            label.removeControlListener(this);
import org.eclipse.swt.layout.GridLayout;
    DBeaverNotificationPopup(Shell parent) {
                            initializeBounds(); // will force the shell to resize

                });
 * Contributors:
                        @Override
                    }
    private static final int NUM_NOTIFICATIONS_TO_DISPLAY = 4;
                    public void linkActivated(HyperlinkEvent e) {
        this.parent = parent;

                GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.TOP).applyTo(itemLink);
import org.eclipse.swt.accessibility.AccessibleEvent;
 *
}                remainingLink.registerMouseTrackListener();
    public void setFocus() {
            count++;
                    descriptionLabel.addControlListener(new ControlAdapter() {
                itemLink.addHyperlinkListener(new HyperlinkAdapter() {
import java.util.ArrayList;
import org.eclipse.jface.action.LegacyActionTools;
import org.eclipse.ui.forms.events.HyperlinkEvent;
        for (final AbstractNotification notification : notifications) {
                    itemLink.setImage(((AbstractUiNotification) notification).getNotificationImage());
                String descriptionText = null;
                }
/**
                        }
        this.notifications = notifications;


                    });
 *     Tasktop Technologies - initial API and implementation
 * Copyright (c) 2004, 2011 Tasktop Technologies and others.
                itemLink.setText(LegacyActionTools.escapeMnemonics(notification.getLabel()));

    }
                final ScalingHyperlink itemLink = new ScalingHyperlink(notificationComposite, SWT.BEGINNING | SWT.NO_FOCUS);
                itemLink.registerMouseTrackListener();
import org.eclipse.jface.layout.GridDataFactory;
                final Label notificationLabelIcon = new Label(notificationComposite, SWT.NONE);
                            event.result = NLS.bind(UIMessages.notification_popup_context_message, descriptionLabel.getText());
                                windowShell.open();

                ScalingHyperlink remainingLink = new ScalingHyperlink(notificationComposite, SWT.NO_FOCUS);

                remainingLink.setText(NLS.bind("{0} more", numNotificationsRemain)); //$NON-NLS-1$
import org.eclipse.swt.widgets.*;
     */
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.ui.PlatformUI;
        super(parent.getDisplay());
            if (count < NUM_NOTIFICATIONS_TO_DISPLAY) {
                        }
            Composite notificationComposite = new Composite(parent, SWT.NO_FOCUS);
                        if (window != null) {
                            ((AbstractUiNotification) notification).open();
                        .span(2, SWT.DEFAULT)
    }
                    Text descriptionLabel = new Text(notificationComposite, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
    @Override
    }
                                    windowShell.setMinimized(false);

    private List<AbstractNotification> notifications;
                });
                    GridDataFactory.fillDefaults()
                itemLink.setBackground(parent.getBackground());
                    notificationLabelIcon.setImage(((AbstractUiNotification) notification).getNotificationKindImage());
            }
    public void setContents(List<AbstractNotification> notifications) {
public class DBeaverNotificationPopup extends AbstractWorkbenchNotificationPopup {
                        @Override
    public List<AbstractNotification> getNotifications() {
                                if (windowShell.getMinimized()) {
                    descriptionLabel.setBackground(parent.getBackground());
 * All rights reserved. This program and the accompanying materials
                    @Override
/*******************************************************************************
                        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
 * are made available under the terms of the Eclipse Public License v1.0
import org.eclipse.osgi.util.NLS;
                    }
    protected void createTitleArea(Composite parent) {
    }
        return new ArrayList<>(notifications);
    @Override
                        .grab(true, true)
            } else {
                                windowShell.setMaximized(true);
            GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(notificationComposite);
                if (notification instanceof AbstractUiNotification) {

                remainingLink.addHyperlinkListener(new HyperlinkAdapter() {

                            Shell windowShell = window.getShell();

                                windowShell.forceActive();
                        public void getName(final AccessibleEvent event) {
 * @author Mik Kersten
                    @Override
 * http://www.eclipse.org/legal/epl-v10.html
                        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    private Composite parent;
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.graphics.Color;
                itemLink.setForeground(HYPERLINK_WIDGET_COLOR);
                    public void linkActivated(HyperlinkEvent e) {
    /**

                GridDataFactory.fillDefaults().span(2, SWT.DEFAULT).applyTo(remainingLink);
        if (parent != null && parent.getChildren() != null && parent.getChildren().length > 0) {
import org.jkiss.dbeaver.ui.internal.UIMessages;
                if (!CommonUtils.isEmptyTrimmed(descriptionText)) { //$NON-NLS-1$
    protected void createContentArea(Composite parent) {
                }
 *******************************************************************************/
            notificationComposite.setBackground(parent.getBackground());
                            if (windowShell != null) {
                                }
 */

                        }
                                windowShell.open();
import org.eclipse.ui.forms.events.HyperlinkAdapter;
                        if (notification instanceof AbstractUiNotification) {
                        .align(SWT.FILL, SWT.FILL)
                }
                            if (windowShell != null) {

                        }
                if (notification instanceof AbstractUiNotification) {
                remainingLink.setBackground(parent.getBackground());
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.layout.GridData;

