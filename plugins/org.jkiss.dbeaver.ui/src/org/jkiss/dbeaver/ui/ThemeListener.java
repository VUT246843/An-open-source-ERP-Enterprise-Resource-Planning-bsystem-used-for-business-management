        @NotNull Consumer<String> listener,
                        // getBold implementation differs from our makeBoldFont

        IPropertyChangeListener themeChangeListener = this::updateThemeProperty;
                        // Create bold here because default getBold is broken on MacOS
                    log.error("Color '" + property + "' not found in registry");
 * Theme font annotation
                }
                    if (!Font.class.isAssignableFrom(field.getType())) {
            }
                Color value = currentTheme.getColorRegistry().get(property);
        if (consumers == null) {
                    field.set(this, font);
                fieldMap.put(propId, fields);
                ThemeFont param = field.getAnnotation(ThemeFont.class);
import org.eclipse.swt.widgets.Control;
import java.util.List;
    private void updateThemeProperty(PropertyChangeEvent event) {
                } else if (param != null && param.bold()) {

                ThemeFont fontAnno = field.getAnnotation(ThemeFont.class);
                if (consumers.isEmpty()) {
            } else if (Font.class.isAssignableFrom(field.getType())) {

                        if (normalFont.getDevice() instanceof Display display) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            display.disposeExec(font::dispose);
import java.lang.reflect.Field;
import org.eclipse.ui.themes.IThemeManager;
    }
    public synchronized void addPropertyListener(

    ) {
package org.jkiss.dbeaver.ui;
                    if (font == null) {
                if (!Color.class.isAssignableFrom(field.getType())) {

import org.jkiss.utils.ArrayUtils;
            ITheme currentTheme = themeManager.getCurrentTheme();
                    propId = colorAnno.value();
                }
        }
                        log.error("Font '" + property + "' (italic) not found in registry");
                        log.error("Font '" + property + "' not found in registry");
                        // because it doesn't copy all font metrics
                setPropertyValue(fields, currentTheme, property);
                        Object oldValue = field.get(this);
 * You may obtain a copy of the License at

                        Font normalFont = currentTheme.getFontRegistry().get(property);
        Field[] fields = fieldMap.get(property);
        } catch (IllegalAccessException e) {
}
        if (fields != null) {
            if (propId != null) {
 * limitations under the License.
        try {
                    }
        }
import java.util.HashMap;
    private final IThemeManager themeManager;
        themeManager.addPropertyChangeListener(themeChangeListener);
                    field.set(this, font);
        @NotNull String property,
        @Nullable Control control
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (Field field : fields) {
import org.eclipse.swt.widgets.Display;
 */
import java.util.ArrayList;
            }
                    if (RuntimeUtils.isMacOS()) {
                listener.accept(property);
        } else {
        }
                field.set(this, value);
                } else {
                if (param != null && param.italic()) {
        
 *
            for (Map.Entry<String, Field[]> prop : fieldMap.entrySet()) {
                    field.set(this, font);
import org.eclipse.swt.graphics.Font;
                        }
                        log.error("Bad color annotation " + field);
/*
 * you may not use this file except in compliance with the License.
                            oldFont.dispose();
        }
            }
 */
            String propId = null;
                        }
 *
        ITheme currentTheme = themeManager.getCurrentTheme();
                } else {

    }
                    fields = ArrayUtils.add(Field.class, fields, field);
    private void setPropertyValue(Field[] fields, ITheme currentTheme, String property) throws IllegalAccessException {

            log.debug("Error filling initial theme properties", e);
                    Font font = currentTheme.getFontRegistry().getItalic(property);
                    } else {
        List<Consumer<String>> listeners = propertyListeners.get(property);
        themeManager = PlatformUI.getWorkbench().getThemeManager();
        for (Field field : getClass().getFields()) {
                Field[] fields = fieldMap.get(propId);
            }
                }
                        font = currentTheme.getFontRegistry().getBold(property);

        }
    private final Map<String, List<Consumer<String>>> propertyListeners = new HashMap<>();
            }

                Field[] fields = prop.getValue();
            if (colorAnno != null) {
import org.eclipse.ui.PlatformUI;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    private final Map<String, Field[]> fieldMap = new HashMap<>();
import org.jkiss.dbeaver.utils.RuntimeUtils;
        String property = event.getProperty();
 * DBeaver - Universal Database Manager
                    } else {
                    Font font;
            control.addDisposeListener(e -> removePropertyListener(property, listener));
                    Font font = currentTheme.getFontRegistry().get(property);
import org.jkiss.code.NotNull;
public class ThemeListener {
        List<Consumer<String>> consumers = propertyListeners.get(property);
                }
    }
import org.eclipse.ui.themes.ITheme;
import org.jkiss.code.Nullable;
import org.eclipse.jface.util.IPropertyChangeListener;
                    log.error("Bad color annotation " + field);
                    }
                }
    }
                log.debug(e);
 *
import java.util.function.Consumer;
                    }
            }
                    }
            } else {
            }
                setPropertyValue(fields, currentTheme, prop.getKey());
                        font = UIUtils.makeBoldFont(normalFont);
import org.eclipse.jface.util.PropertyChangeEvent;
    public synchronized void removePropertyListener(String property, Consumer<String> listener) {
import org.eclipse.swt.graphics.Color;

    public ThemeListener() {
                log.debug("Property '" + property + "' consumer '" + listener + "' not found");
                if (fields == null) {
                if (value == null) {
            for (Consumer<String> listener : listeners) {
/**
import org.jkiss.dbeaver.Log;
        propertyListeners.computeIfAbsent(property, p -> new ArrayList<>()).add(listener);
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        if (oldValue instanceof Font oldFont) {

            } catch (IllegalAccessException e) {
            if (!consumers.remove(listener)) {
                } else {
            try {
            if (Color.class.isAssignableFrom(field.getType())) {
        // Fill initial values
        if (control != null) {
                    if (font == null) {

            ThemeColor colorAnno = field.getAnnotation(ThemeColor.class);
 * Unless required by applicable law or agreed to in writing, software
        if (listeners != null) {
                if (fontAnno != null) {
                        propId = fontAnno.value();
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    private static final Log log = Log.getLog(ThemeListener.class);
import java.util.Map;

            log.debug("No property '" + property + "' consumers");
                    propertyListeners.remove(property);
            } else {
                }
                    fields = new Field[]{field};
