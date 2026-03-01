    @Override


            hControl.addDisposeListener(e -> registry.removeDataSourceListener(listener));
 * distributed under the License is distributed on an "AS IS" BASIS,
            monitor.subTask("Read binary value");
    public void contributeSettings(@NotNull IContributionManager manager, @NotNull HexEditControl control) throws DBCException {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    }
                    String defValue = (String) event.getNewValue();
                if (Arrays.equals(byteBuffer.array(), byteData)) {
            }
        hControl.addDisposeListener(e -> store.removePropertyChangeListener(preferencesChangeListener));
            BinaryContent content = control.getContent();
            final DBPDataSourceContainer container = executionContext.getDataSource().getContainer();
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    {
import java.util.Arrays;
    public void contributeActions(@NotNull IContributionManager manager, @NotNull final HexEditControl control) throws DBCException {
        } finally {
                control.setContent(byteData, finalCharset, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    return;
    public void extractEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull HexEditControl control, @NotNull DBDContent value) throws DBException
            throw new DBException("Error reading stream value", e);
        HexEditControl hControl = new HexEditControl(valueController.getEditPlaceholder(), SWT.BORDER | SWT.READ_ONLY);
                }

            final DBPDataSourceRegistry registry = container.getRegistry();
            } catch (IOException e) {
        if (executionContext != null) {
 * DBeaver - Universal Database Manager
        if (binaryContent != null) {

/**

}            @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        store.addPropertyChangeListener(preferencesChangeListener);
                control.redrawCaret(true);
import java.io.ByteArrayOutputStream;
import org.jkiss.dbeaver.DBException;
        final DBCExecutionContext executionContext = valueController.getExecutionContext();
import org.eclipse.jface.action.Action;
import java.io.IOException;
 * Licensed under the Apache License, Version 2.0 (the "License");
                charset = data.getCharset();
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCException;
        manager.add(new Action("Switch Insert/Overwrite mode", DBeaverIcons.getImageDescriptor(UIIcon.CURSOR)) {
 *
                    ContentUtils.copyStreams(contentStream, -1, buffer, monitor);
import org.eclipse.swt.SWT;
            monitor.done();
            registry.addDataSourceListener(listener);
            });

import org.jkiss.dbeaver.ui.UIUtils;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                log.error(e);
            } else {
public class BinaryPanelEditor implements IStreamValueEditor<HexEditControl> {

                }
*/
import org.jkiss.dbeaver.ui.editors.binary.BinaryContent;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.model.data.storage.BytesContentStorage;

            final DBPEventListener listener = e -> hControl.setReadOnly(container.isConnectionReadOnly() || valueController.isReadOnly());
    public void primeEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull HexEditControl control, @NotNull DBDContent value) throws DBException
            String charset = null;
        }
import org.jkiss.dbeaver.model.DBValueFormatting;
            if (data != null) {
    private static final Log log = Log.getLog(BinaryPanelEditor.class);
    private IValueController valueController;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            value.updateContents(
        DBPPreferenceListener preferencesChangeListener = new DBPPreferenceListener() {
            public void run() {
    @Override
                monitor,
        };
        return hControl;
                }
 * See the License for the specific language governing permissions and
    {
/*
                try (InputStream contentStream = data.getContentStream()){
                ByteBuffer byteBuffer = ByteBuffer.allocate(byteData.length);
import org.jkiss.dbeaver.runtime.DBWorkbench;

    }
            }

import org.eclipse.jface.action.IContributionManager;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.nio.ByteBuffer;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.Log;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * You may obtain a copy of the License at
            if (content != null && content.length() == byteData.length) {
            try {
            DBDContentStorage data = value.getContents(monitor);
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.model.data.DBDContent;
 */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.binary.HexEditControl;
                    // Equals data
    }
import org.jkiss.dbeaver.model.DBPEventListener;
            UIUtils.syncExec(() -> {
            @Override
        this.valueController = valueController;
    public HexEditControl createControl(IValueController valueController) {
            }
                    hControl.setDefWidth(Integer.parseInt(defValue));
        BinaryContent binaryContent = control.getContent();
import org.jkiss.dbeaver.utils.GeneralUtils;
            String finalCharset = charset;
    }
* ControlPanelEditor

            public void preferenceChange(PreferenceChangeEvent event) {

 *
                if (HexPreferencesPage.PROP_DEF_WIDTH.equals(event.getProperty())) {
        monitor.beginTask("Prime content value", 1);
 *
    @Override
                control.setReadOnly(value.getDataSource().getContainer().isConnectionReadOnly() || valueController.isReadOnly());
                charset = DBValueFormatting.getDefaultBinaryFileEncoding(value.getDataSource());
            }
        try {

            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        } catch (IOException e) {
                new BytesContentStorage(buffer.array(), GeneralUtils.getDefaultFileEncoding()));
import org.jkiss.dbeaver.utils.ContentUtils;
package org.jkiss.dbeaver.ui.data;

        });
import org.jkiss.dbeaver.ui.editors.binary.pref.HexPreferencesPage;
    }

import java.io.InputStream;
            ByteBuffer buffer = ByteBuffer.allocate((int) binaryContent.length());
import org.jkiss.code.NotNull;
                binaryContent.get(buffer, 0);
        }
            }
    @Override
 * limitations under the License.
            byte[] byteData = buffer.toByteArray();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
