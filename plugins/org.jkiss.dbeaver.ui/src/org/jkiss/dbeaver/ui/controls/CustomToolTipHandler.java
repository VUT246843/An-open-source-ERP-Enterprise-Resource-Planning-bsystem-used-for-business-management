        return toolTipDelay;
 * Unless required by applicable law or agreed to in writing, software
    public void updateToolTipText(@Nullable String text)
     * SWT/OS tooltip.  Generally, those subclasses would override this event and use this tooltip
 * limitations under the License.
     */
     * displaying.

/*
            this.toolTipHandler.toolTip = text;
            if (!monitor.isCanceled() && !control.isDisposed()) {
            }
    private class ToolTipHandler extends UIJob {
 *
            prevToolTip = text;
import org.eclipse.core.runtime.IStatus;
 */
 * You may obtain a copy of the License at
     *
 */
            control.setToolTipText("");
     * @param text  tooltip text
            text = text.replace("&", "&&");

            super("ToolTip handler");
            this.toolTipHandler.schedule(toolTipDelay);
        }
            if (curHandler != null) {
    {
                curHandler.cancel();
            }
public class CustomToolTipHandler {
        this.toolTipDelay = toolTipDelay;
                control.setToolTipText(toolTip);

 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (text != null) {
        private String toolTip;

            setSystem(true);
    private volatile String prevToolTip;
     * for subclasses to override, when a subclass wants to display a different than the standard
import org.eclipse.core.runtime.IProgressMonitor;
    }
        this.control = control;
    public void setToolTipDelay(int toolTipDelay) {
import org.eclipse.ui.progress.UIJob;
            // New tooltip
    /**
            text = GeneralUtils.normalizeLineEndings(text);
import org.eclipse.core.runtime.Status;
 *
            toolTipHandler = null;
     * text in their own tooltip or just override this method to prevent the SWT/OS tooltip from
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
}     * Sets the tooltip for the whole Grid to the given text.  This method is made available
            return Status.OK_STATUS;


 * See the License for the specific language governing permissions and

        ToolTipHandler() {
import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private ToolTipHandler toolTipHandler;
        }

    public CustomToolTipHandler(Control control) {
        }
 * DBeaver - Universal Database Manager
            this.toolTipHandler = new ToolTipHandler();
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override

        public IStatus runInUIThread(IProgressMonitor monitor) {
import org.eclipse.swt.widgets.Control;
        ToolTipHandler curHandler = this.toolTipHandler;
    public int getToolTipDelay() {
 *
    private static final Log log = Log.getLog(CustomToolTipHandler.class);
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
        if (!CommonUtils.equalObjects(prevToolTip, text)) {
            // Escape ampersands (#7101)
    }

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final Control control;
/**
    }
package org.jkiss.dbeaver.ui.controls;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.Log;

        }
 * Shows tooltip for custom controls
    private int toolTipDelay = 500;
