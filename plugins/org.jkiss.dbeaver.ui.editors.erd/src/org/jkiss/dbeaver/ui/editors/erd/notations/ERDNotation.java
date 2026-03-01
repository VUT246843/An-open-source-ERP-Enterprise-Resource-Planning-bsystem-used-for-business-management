import org.eclipse.swt.graphics.Color;
 *
    public double getIndentation();
 * Unless required by applicable law or agreed to in writing, software
     *
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param frgColor    - front end color
        @NotNull PolylineConnection conn,
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
     * @param association - ERD association
     * @param bckColor    - back end color
        @NotNull Color frgColor);
        @NotNull Color frgColor);
        @NotNull Color bckColor,
public interface ERDNotation {
 * limitations under the License.
     */
    /**
     * decorator. Each notation keeps own value to handle require behavior.
        @NotNull ERDAssociation association,
 */
/**
    public void applyNotationForEntities(
import org.eclipse.draw2d.PolylineConnection;
     * @param bckColor    - back end color
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBRProgressMonitor monitor,
     * Method designed to display diagram entity notation
     */
    public void applyNotationForArrows(
     * Method designed to display diagram relation notation
     * @return - value of indentation

     * @param frgColor    - front end color
     *
package org.jkiss.dbeaver.ui.editors.erd.notations;
 *
        @NotNull ERDAssociation association,
import org.jkiss.code.NotNull;
     * @param association - ERD association
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.erd.ERDAssociation;
     * Indentation value is a length of orthogonal line for source and target

 * DBeaver - Universal Database Manager
 * Interface of ER Diagram style notation
 *
    /**
 * You may obtain a copy of the License at
     * @param conn        - connection class specification
        @NotNull PolylineConnection conn,
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**

 * See the License for the specific language governing permissions and
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

     *
     * @param conn        - connection class specification
/*
 */
        @NotNull Color bckColor,
