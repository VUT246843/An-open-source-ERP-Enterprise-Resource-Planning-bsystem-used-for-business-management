        try (DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), attribute, "Copy from clipboard")) {
    // Use linear interpolation to make gradient color in a range


                int index = 0;
        double p = (value - minValue) / range;
            }
            try {
    }
        return new RGB(
                return dataFilter;
                        return constraint;
import org.jkiss.dbeaver.ui.UIUtils;
    @NotNull
import java.util.Map;

 */
            (int)(c2.green * p + c1.green * (1 - p)),
                List<DBSEntityReferrer> refs = DBUtils.getAttributeReferrers(new VoidProgressMonitor(), entityAttribute, true);
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                    new Object[]{string},
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.ui.controls.resultset;
/**
/*
            (int)(c2.blue * p + c1.blue * (1 - p)));
            associatedEntity[0] = ((DBSEntityAssociation) constraint).getAssociatedEntity();
            } catch (InvocationTargetException e) {
                    final DBSDictionary dictionary = (DBSDictionary)associatedEntity;
    {
                clipboard.setContents(values, transfers);
                    if (dictionary.supportsDictionaryEnumeration()) {
            final DBDDataFilter dataFilter = new DBDDataFilter();
            } finally {
import org.jkiss.dbeaver.model.struct.*;

import org.eclipse.swt.dnd.TextTransfer;
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
            } finally {
        }
        if (savedConfig != null) {
                        associatedEntity[0] = ((DBSEntityAssociationLazy) constraint).getAssociatedEntity(monitor);
{
 * DBeaver - Universal Database Manager



 * limitations under the License.
        try {
            } catch (DBException e) {
import org.jkiss.code.Nullable;
        if (DBExecUtils.BROWSE_LAZY_ASSOCIATIONS && constraint instanceof DBSEntityAssociationLazy) {
        }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    index++;
            viewerSettings = UIUtils.getDialogSettings(ResultSetViewer.class.getSimpleName());
import org.eclipse.swt.widgets.Display;
        Clipboard clipboard = new Clipboard(Display.getCurrent());
    }
            }
            }
        return associatedEntity[0];
import java.util.List;
                if (associatedEntity instanceof DBSDictionary) {
            DBSEntityAttribute entityAttribute = binding.getEntityAttribute();
    private static final Log log = Log.getLog(ResultSetUtils.class);
    public static DBDDataFilter restoreDataFilter(final DBSDataContainer dataContainer, @NotNull DBRProgressMonitor monitor) {
import org.eclipse.swt.dnd.Clipboard;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    new Transfer[]{textTransfer});

            Clipboard clipboard = new Clipboard(Display.getCurrent());
        final DataFilterRegistry.SavedDataFilter savedConfig = DataFilterRegistry.getInstance().getSavedConfig(dataContainer);
import org.jkiss.code.NotNull;
        if (!formats.isEmpty()) {
            if (entityAttribute != null) {
                clipboard.dispose();
    @Nullable
                Transfer[] transfers = new Transfer[formats.size()];
        return null;
        } finally {
                        throw new InvocationTargetException(e);
                log.error(e.getTargetException());
 * Unless required by applicable law or agreed to in writing, software
            }
        }
 *
            clipboard.dispose();
                log.warn("Can't restore table data filters for " + dataContainer.getName(), e);
        if (value <= minValue) {
        } else if (constraint instanceof DBSEntityAssociation) {
        if (string != null && string.length() > 0) {
 * Utils
import java.lang.reflect.InvocationTargetException;
        DBSEntity[] associatedEntity = new DBSEntity[1];
                    transfers[index] = fmtEntry.getKey();
        } catch (Throwable e) {
    }
import org.jkiss.dbeaver.Log;
                clipboard.setContents(
        return null;
 * See the License for the specific language governing permissions and
            try {
import org.jkiss.dbeaver.DBException;
 */
import org.eclipse.jface.dialogs.IDialogSettings;
    // It is dummy but simple and fast
import org.eclipse.swt.dnd.Transfer;
            try {
                session, attribute.getAttribute(), strValue, true, false);

                });
                }
        }
        if (value >= maxValue) {
        return rows < 0 ? "0" : String.valueOf(rows);
    }

                }
    public static void copyToClipboard(String string) {
}
                    }
                UIUtils.runInProgressService(monitor -> {
        if (viewerSettings == null) {
                DBSEntityReferrer constraint = refs.isEmpty() ? null : refs.get(0);
 * you may not use this file except in compliance with the License.
            return c2;
        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static volatile IDialogSettings viewerSettings;

            } catch (InterruptedException e) {
            if (dataFilter.hasFilters()) {
    public static Object getAttributeValueFromClipboard(DBDAttributeBinding attribute) throws DBCException
            log.error(e);
                    values[index] = fmtEntry.getValue();
            return attribute.getValueHandler().getValueFromObject(
            String strValue = (String) clipboard.getContents(TextTransfer.getInstance());
                    } catch (DBException e) {

    public static RGB makeGradientValue(RGB c1, RGB c2, double minValue, double maxValue, double value) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                TextTransfer textTransfer = TextTransfer.getInstance();
            return c1;

                Object[] values = new Object[formats.size()];
            Clipboard clipboard = new Clipboard(Display.getCurrent());
        }

    public static DBSEntity getAssociatedEntity(DBSEntityConstraint constraint) {
    }
 * You may obtain a copy of the License at
    }
            (int)(c2.red * p + c1.red * (1 - p)),
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public static void copyToClipboard(Map<Transfer, Object> formats) {
                // Ignore
public class ResultSetUtils
 *
    public static DBSEntityReferrer getEnumerableConstraint(DBDAttributeBinding binding) {

            }
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    static String formatRowCount(long rows) {
    public static IDialogSettings getViewerSettings(String section) {
            try {
        }
                DBSEntity associatedEntity = getAssociatedEntity(constraint);
                clipboard.dispose();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBUtils;
        // Restore data filter

                savedConfig.restoreDataFilter(monitor, dataContainer, dataFilter);
        }

        return UIUtils.getSettingsSection(viewerSettings, section);
        }
                    }
                    try {
        double range = maxValue - minValue;
 *
import org.eclipse.swt.graphics.RGB;
                for (Map.Entry<Transfer, Object> fmtEntry : formats.entrySet()) {
