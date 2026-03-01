     */
 * Windows Shell Link (.lnk) handler
import org.jkiss.code.NotNull;
        final StringBuilder path = new StringBuilder();
     * <p>
import org.eclipse.osgi.util.NLS;
        return new File(path.toString());
        final ByteBuffer buf = ByteBuffer

            }
        buf.position(buf.position() + buf.getInt(buf.position() + (unicode ? 28 : 16)));
        if (resource instanceof IFile) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.UIUtils;
    /**
            } else if (DBWorkbench.getPlatformUI().confirmAction(CoreMessages.resource_shortcut_deleted_title, NLS.bind(CoreMessages.resource_shortcut_deleted_message, resolved.getName()))) {
        if ((buf.getInt(20) & 1) > 0) {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.resources.shortcuts;
            .order(ByteOrder.LITTLE_ENDIAN);
 *     http://www.apache.org/licenses/LICENSE-2.0
                break;
        }
 */

 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.NullProgressMonitor;
 *
        // Seek past fields we're not interested in (if `unicode` there are three additional fields)
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;
                break;
            final char ch = unicode ? buf.getChar() : (char) buf.get();
    }
import org.eclipse.core.resources.IResource;
            }

            }
        }
import java.io.IOException;

 *
}
            path.append(ch);
            final File resolved = resolve(path);
            .wrap(Files.readAllBytes(shellLinkFile.toPath()))
    private static File resolve(@NotNull File shellLinkFile) throws IOException {

                resource.delete(true, new NullProgressMonitor());
            // Check the flags, if LinkTargetIDList is present, then seek to sizeof(ShellLinkHeader) + sizeof(LinkTargetIDList)
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.core.resources.IFile;
        try {

 * You may obtain a copy of the License at
    @NotNull
import java.nio.file.Files;
     * Resolves absolute path from given Shell Link file.
                // Maximum path length on Windows is 260 characters. Let's pretend no one uses NTFS' `\\?\` prefix
public class ShortcutsHandlerImpl extends AbstractResourceHandler {
            if (resolved.exists()) {
    @Override
    }
            buf.position(24);
        } else {
        }
    public int getFeatures(IResource resource) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.core.CoreMessages;
 */
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
            if (path.length() > 260) {
        } catch (IOException e) {
 * See the License for the specific language governing permissions and
        while (true) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import java.io.File;
import java.nio.ByteOrder;
import org.eclipse.core.runtime.CoreException;
     * See <a href="http://msdn.microsoft.com/en-us/library/dd871305%28PROT.10%29.aspx">Shell Link (.LNK) Binary File Format</a>
 * Unless required by applicable law or agreed to in writing, software

        // There's no better way to determine whether path is stored in unicode format
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        return super.getFeatures(resource);
import java.nio.ByteBuffer;
            final File path = resource.getLocation().toFile();
                EditorUtils.openExternalFileEditor(resolved, UIUtils.getActiveWorkbenchWindow());
                // Hit string terminator, stop
        }
        final boolean unicode = buf.getInt(buf.position() + 4) >= 36;
 *
            // Otherwise, seek past linkFlags
    public void openResource(@NotNull IResource resource) throws CoreException, DBException {
/*
            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;

            throw new DBException("Error resolving shell link path", e);
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
            buf.position(buf.getInt(0) + buf.getShort(76) + 2);
            if (ch == 0) {
