     * string is shown to the user

    String getId();
     */
}
     * Returns the type of this property. Types is a java class.

    @Nullable
    /**

 */
 * DBeaver - Universal Database Manager
     * belonging to the same category are grouped together visually. This localized


/*

import org.jkiss.code.Nullable;
     */
    Object getDefaultValue();
    @NotNull
     * @return a displayable name

import org.jkiss.dbeaver.model.meta.PropertyLength;
    /**
    String getHint();
 *
    /**

    default boolean isHidden() {
     * Returns the name of the category to which this property belongs. Properties

import org.jkiss.code.NotNull;
     */
    }
    boolean isRequired();
     */
    // TODO: remove "object" parameter
    PropertyLength getLength();
    boolean isDesktop();
 * See the License for the specific language governing permissions and
/**

    String[] getFeatures();
     * Returns a hint of this property.
    Class<?> getDataType();
 * Copyright (C) 2010-2026 DBeaver Corp and others
    String[] getRequiredFeatures();
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Returns the id for this property. This object is used internally to distinguish one property descriptor from another.
 *
    @Nullable
     * Returns the display name for this property. This localized string is shown to

     * to the user when this property is selected.
        return false;

    /**
 */
    boolean isEditable(Object object);

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
     */
public interface DBPPropertyDescriptor {
package org.jkiss.dbeaver.model.preferences;
    String getCategory();

     */
 *
    /**
 * you may not use this file except in compliance with the License.
     */
    @Nullable
     * Property applies only for desktop products.
    /**
    String getDisplayName();
 * Unless required by applicable law or agreed to in writing, software

     * Returns a brief description of this property. This localized string is shown
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * limitations under the License.

    boolean hasFeature(@NotNull String feature);
 * Property descriptor.
     * the user as the name of this property.

    String getDescription();
 * You may obtain a copy of the License at
    @NotNull
     *
    @Nullable
    @Nullable
