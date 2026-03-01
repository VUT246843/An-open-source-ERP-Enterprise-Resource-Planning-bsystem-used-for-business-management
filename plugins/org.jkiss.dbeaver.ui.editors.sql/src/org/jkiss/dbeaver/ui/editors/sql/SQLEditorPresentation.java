import org.jkiss.code.NotNull;
     * @param isNew  {@code true} if this presentation was opened for the very first

        // do nothing by default
import org.eclipse.swt.widgets.Composite;
    ISelectionProvider getSelectionProvider();
        // do nothing by default
    }
 *
     *               a subsequent opening.
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
     *
     * an interactive confirmation is shown with an option to cancel the operation.
    default void hidePresentation(@NotNull SQLEditor editor) {
     */
     */
     * A notification that this presentation is about to be closed.
    default void showPresentation(@NotNull SQLEditor editor, boolean isNew) {
     */
     * <p>
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software


 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
/*
     * An implementation may opt not to be opened. This can be useful if
}
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface SQLEditorPresentation {
     * @param editor associated SQL editor
     * <p>
    /**
     *
     * A predicate that decides whether the presentation can be shown or not.
    }

    default boolean canHidePresentation(@NotNull SQLEditor editor) {
     *
    /**
 * limitations under the License.
     * @param editor associated SQL editor
     * @param editor associated SQL editor
     * A notification that this presentation is about to be shown.
    void createPresentation(Composite parent, SQLEditor editor);
 * See the License for the specific language governing permissions and
     *
     * @return {@code true} if the presentation can be shown, or {@code false} if not

 */


    /**
    void dispose();
 *
     * @param editor associated SQL editor
 * DBeaver - Universal Database Manager
     * an interactive confirmation is shown with an option to cancel the operation.

     *               time in the associated SQL editor, or {@code false} if it was
 * You may obtain a copy of the License at
import org.eclipse.jface.viewers.ISelectionProvider;
package org.jkiss.dbeaver.ui.editors.sql;
        return true;
        return true;
     * An implementation may opt not to be closed. This can be useful if

     *               a subsequent opening.
     *               time in the associated SQL editor, or {@code false} if it was
     * A notification that this presentation is about to be closed.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
     * @return {@code true} if the presentation can be closed, or {@code false} if not
    default boolean canShowPresentation(@NotNull SQLEditor editor, boolean isNew) {
     * @param isNew  {@code true} if this presentation was opened for the very first
    /**
