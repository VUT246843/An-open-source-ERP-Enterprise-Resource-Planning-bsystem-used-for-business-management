        });
 * TextEditorUtils

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
    public static Map<String, Integer> getTextEditorActionMap()
        return ACTION_TRANSLATE_MAP;
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
            FakeTextEditor.fillActionMap(ACTION_TRANSLATE_MAP );
 * DBeaver - Universal Database Manager
            if (activeTheme != null) {

import org.eclipse.ui.IWorkbenchPartSite;
            @Override
     * @param enable enable or disable
 * Unless required by applicable law or agreed to in writing, software
                    }
            @Override
                    enableHostEditorKeyBindings(partSite, true);
                activated[0] = false;
            if (widget == null || widget.isDisposed()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            Control widget = hostEditor.getAdapter(Control.class);
        }
     * AbstractTextEditor Uses reflection because setActionActivation is private method
import org.eclipse.e4.ui.css.swt.theme.ITheme;
                    e instanceof InvocationTargetException ite ? ite.getTargetException() : e);

    public static boolean isDarkThemeEnabled() {
 *
import java.util.HashMap;
            }
            }
     * Eclipse hack. Disables/enabled all key bindings in specified site's part. Works only if host editor is extender of
import java.lang.reflect.Method;
                    if (!PlatformUI.getWorkbench().isClosing()) {

            try {
                    enableHostEditorKeyBindings(partSite, false);
 *
                isDark = activeTheme.getId().contains("dark");
import org.eclipse.swt.events.FocusListener;
}

 */
            }
import org.eclipse.ui.PlatformUI;
            }
        IWorkbenchPart part = partSite.getPart();
        }
        return isDark;
    /**
                }
        static void fillActionMap(Map<String, Integer> map) {
import org.eclipse.ui.IWorkbenchPart;

            if (activated[0]) {

    public static void enableHostEditorKeyBindingsSupport(final IWorkbenchPartSite partSite, Control control)

 * Licensed under the Apache License, Version 2.0 (the "License");
public class TextEditorUtils {
    private static final Log log = Log.getLog(TextEditorUtils.class);
        if (ACTION_TRANSLATE_MAP == null) {
            }
import java.util.Map;
     * TODO: find better way to disable key bindings or prioritize event handling to widgets
        if (!(partSite.getPart() instanceof AbstractTextEditor)) {
    public static void enableHostEditorKeyBindings(IWorkbenchPartSite partSite, boolean enable)
            ACTION_TRANSLATE_MAP = new HashMap<>();

    }
            }
    }
            } catch (Throwable e) {
import org.jkiss.dbeaver.Log;
        final boolean[] activated = new boolean[] {false};
        if (part instanceof AbstractTextEditor hostEditor) {
                if (!PlatformUI.getWorkbench().isClosing()) {
            public void focusGained(FocusEvent e) {

    {
    private static class FakeTextEditor extends AbstractTextEditor {
                return;



package org.jkiss.dbeaver.ui.editors;
            return;
        }
                activatorMethod.setAccessible(true);
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.swt.widgets.Control;
        });
 * You may obtain a copy of the License at
        control.addFocusListener(new FocusListener() {
import java.lang.reflect.InvocationTargetException;
        }
        }
            }
     * @param partSite workbench part site
 * limitations under the License.
                map.put(entry.getActionId(), entry.getAction());
            ITheme activeTheme = engine.getActiveTheme();
                        enableHostEditorKeyBindings(partSite, true);
            public void focusLost(FocusEvent e) {
        if (engine != null) {
/**
    }
                if (!activated[0]) {
                    activated[0] = false;
 * See the License for the specific language governing permissions and
                Method activatorMethod = AbstractTextEditor.class.getDeclaredMethod("setActionActivation", Boolean.TYPE);
    {
                }
    private static Map<String, Integer> ACTION_TRANSLATE_MAP;
    {
     *
 *
                    activated[0] = true;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
        IThemeEngine engine = PlatformUI.getWorkbench().getService(IThemeEngine.class);

        boolean isDark = false;
import org.eclipse.swt.events.FocusEvent;
            for (AbstractTextEditor.IdMapEntry entry : AbstractTextEditor.ACTION_MAP) {
/*
                if (activated[0]) {
            //hostEditor.getEditorSite().getActionBarContributor().setActiveEditor(hostEditor);
 */
        control.addDisposeListener(e -> {
    }
                activatorMethod.invoke(hostEditor, enable);
                log.warn("Can't disable text editor action activations",
