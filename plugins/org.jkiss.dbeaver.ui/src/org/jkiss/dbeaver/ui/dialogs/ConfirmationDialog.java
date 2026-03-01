 */
    public static String[] getButtonLabels(int kind) {
            default -> throw new IllegalArgumentException(
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        String dialogTitle,
            case QUESTION:
        }
            return true;
        Shell parentShell,
                new String[] {IDialogConstants.CANCEL_LABEL, IDialogConstants.OK_LABEL, IDialogConstants.YES_TO_ALL_LABEL} :
    @Override
            NLS.bind(descriptor.getMessage(), args),

    }
        return dialog.open();
            case QUESTION_WITH_CANCEL -> RuntimeUtils.isMacOS() ?
        dialog.setPrefStore(new PreferenceStoreDelegate(prefStore));

            shell,

import org.eclipse.osgi.util.NLS;

    {
     * Retrieves persisted confirmation state for the given key.
import org.jkiss.dbeaver.ui.internal.UIActivator;
    protected void buttonPressed(int buttonId) {
package org.jkiss.dbeaver.ui.dialogs;
        this.hideToggle = toggleMessage == null;
                new String[]{IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL};
import org.jkiss.code.NotNull;
                if (kind == QUESTION || kind == QUESTION_WITH_CANCEL) {
                new String[]{IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL};
                }
            try {
    public static String getSavedPreference(String id) {
        return ConfirmationDialog.open(
                    return IDialogConstants.NO_ID;
/**
                }
 * Unless required by applicable law or agreed to in writing, software
            }
                    return IDialogConstants.OK_ID;
 * limitations under the License.

                    return IDialogConstants.YES_ID;
    }
            } else if (ConfirmationDialog.NEVER.equals(prefStore.getString(key))) {
        ConfirmationDescriptor descriptor = ConfirmationRegistry.getInstance().getConfirmation(id);

     * or {@code null} is no persisted answer is present
        if ("default".equals(descriptor.getToggleMessage())) {
        }
        int dialogImageType,
                    return IDialogConstants.OK_ID;
                prefStore.setValue(prefKey, ConfirmationDialog.NEVER);
            parent == null ? UIUtils.getActiveWorkbenchShell() : parent,
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Shell;
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.Nullable;
    }
            default:
            }
                }

    protected Control createDialogArea(Composite parent) {
import org.eclipse.swt.widgets.Composite;
        super.initializeBounds();
            getButtonLabels(kind),
    }
            if (ConfirmationDialog.ALWAYS.equals(prefStore.getString(key))) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        };
                return RuntimeUtils.isMacOS() ? 0 : 1;

        int imageKind,

            getDefaultIndex(kind, imageKind),
            title,
 *
        ConfirmationDialog dialog = new ConfirmationDialog(
            );
        if (buttonId != IDialogConstants.CANCEL_ID && getToggleState() && prefStore != null && CommonUtils.isNotEmpty(prefKey)) {
            ResourceBundle resourceBundle = RuntimeUtils.getBundleLocalization(
                    return RuntimeUtils.isMacOS() ? 1 : 0;
            } catch (Exception e) {
        String message,
import org.jkiss.dbeaver.utils.RuntimeUtils;
        );
        Image image,
            if (buttonId == IDialogConstants.NO_ID) {
                "Illegal value for kind in MessageDialog.open()"); //$NON-NLS-1$
                return 0;
        String key)
            case ERROR:
                prefStore.setValue(prefKey, ConfirmationDialog.ALWAYS);
     * {@code false} if the persisted answer is "no",
        return dialogArea;
    public static int confirmAction(@Nullable Shell shell, int imageType, @NotNull String id, int type, @NotNull Object... args) {
        String[] dialogButtonLabels,
    public static int confirmAction(@Nullable Shell shell, @NotNull String id, int type, @NotNull Object... args) {
                } else {
 * You may obtain a copy of the License at

public class ConfirmationDialog extends MessageDialogWithToggle {
            toggleMessage != null ? NLS.bind(toggleMessage, args) : null,
import org.jkiss.dbeaver.ui.UIUtils;
        DBPPreferenceStore prefStore = DBWorkbench.getPlatform().getPreferenceStore();
     *
            case WARNING:
    public static int open(
            type,
import java.util.Locale;
        } else if (ConfirmationDialog.NEVER.equals(store.getString(key))) {
                toggleMessage = resourceBundle.getString("confirm.general.toggleMessage");
        if (hideToggle) {
                new String[]{IDialogConstants.CANCEL_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.YES_LABEL } :
/*
    }
                } else {
            false,
            toggleMessage,
            case CONFIRM:
                    return RuntimeUtils.isMacOS() ? 0 : 1;
    }
            // It makes no sense to return CANCEL_ID here as it's not a valid decision like YES or NO
            getToggleButton().setVisible(false);
    protected void initializeBounds() {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
     * @param id   identifier of a confirmation
        int defaultIndex,
import org.eclipse.jface.preference.IPreferenceStore;
        String toggleMessage,
    @Nullable
    {
            null, // accept the default window icon
        }
            case CONFIRM_WITH_YES_TO_ALL -> RuntimeUtils.isMacOS() ?
import org.jkiss.dbeaver.registry.confirmation.ConfirmationConstants;
            case INFORMATION:
        Shell parent,
    }
     */
                new String[]{IDialogConstants.NO_LABEL, IDialogConstants.YES_LABEL} :

            // These dialog all have OK and maybe CANCEL buttons.
        dialog.setPrefKey(key);
            return kind != QUESTION && kind != QUESTION_WITH_CANCEL;
        } else {
                log.debug(e);

import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
                new String[]{IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL};
            case QUESTION_WITH_CANCEL, CONFIRM_WITH_YES_TO_ALL: {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Standard confirmation dialog
                new String[] {IDialogConstants.YES_TO_ALL_LABEL, IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL};
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (ConfirmationDialog.ALWAYS.equals(store.getString(key))) {
        return prefStore.getString(ConfirmationConstants.CONFIRM_PREF_KEY_PREFIX + id);
            case ERROR, INFORMATION, WARNING -> new String[]{IDialogConstants.OK_LABEL};
    @Override
        return switch (kind) {
    private static final Log log = Log.getLog(UIStyles.class);
                new String[]{IDialogConstants.CANCEL_LABEL, IDialogConstants.OK_LABEL} :
        String toggleMessage,
                    "Illegal value for kind in MessageDialog.open()"); //$NON-NLS-1$
        String key = ConfirmationConstants.CONFIRM_PREF_KEY_PREFIX + id;
import org.eclipse.swt.widgets.Control;
 */
        switch (kind) {
import org.jkiss.dbeaver.registry.confirmation.ConfirmationRegistry;
            } else {
import java.util.ResourceBundle;

        String title,
    public static Boolean getPersistedState(@NotNull String id, int kind) {
        super(parentShell, dialogTitle, image, message, dialogImageType, dialogButtonLabels, defaultIndex, toggleMessage, toggleState);
import org.jkiss.dbeaver.ui.UIStyles;
 * you may not use this file except in compliance with the License.

}
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                Locale.getDefault().getLanguage()
                return RuntimeUtils.isMacOS() ? 0 : 2;
     * @return {@code true} if the persisted answer is "okay" or "yes",
import org.eclipse.jface.dialogs.IDialogConstants;
    private final boolean hideToggle;
                UIActivator.getDefault().getBundle(),
            message,
        DBPPreferenceStore prefStore = DBWorkbench.getPlatform().getPreferenceStore();

            return null;
                if (kind == QUESTION || kind == QUESTION_WITH_CANCEL) {
        }
        if (toggleMessage != null) {
    }
        boolean toggleState,
    public static int getDefaultIndex(int kind, int imageKind) {
                } else {
                if (imageKind == WARNING) {
            }
            ConfirmationConstants.CONFIRM_PREF_KEY_PREFIX + id
        String prefKey = getPrefKey();
            case CONFIRM -> RuntimeUtils.isMacOS() ?
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.graphics.Image;
        }
        super.buttonPressed(buttonId);
            }
    public ConfirmationDialog(
        //$NON-NLS-1$

        boolean toggleState)

 * DBeaver - Universal Database Manager
     * @param kind kind of the confirmation
                    // These dialog all have OK and maybe CANCEL buttons.
    /**

        String toggleMessage = descriptor.getToggleMessage();
import org.jkiss.dbeaver.registry.confirmation.ConfirmationDescriptor;
            imageKind,
                    // It makes no sense to return CANCEL_ID here as it's not a valid decision like YES or NO

 *
            toggleState);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        Control dialogArea = super.createDialogArea(parent);


        String message,
                throw new IllegalArgumentException(
        return confirmAction(shell, -1, id, type, args);
    public static final int CONFIRM_WITH_YES_TO_ALL = 7;
 *
            case QUESTION -> RuntimeUtils.isMacOS() ?
        int kind,
            NLS.bind(descriptor.getTitle(), args),
            imageType == -1 ? type : imageType,
        IPreferenceStore prefStore = getPrefStore();
        }
