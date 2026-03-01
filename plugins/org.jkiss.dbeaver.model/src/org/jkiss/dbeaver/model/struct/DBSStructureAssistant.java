 *
import org.jkiss.code.Nullable;
            return isLikeCondition;
        private boolean globalSearch;
        public void setSearchInDefinitions(boolean searchInDefinitions) {
            return maxResults;


    DBSObjectType[] getAutoCompleteObjectTypes();
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        public boolean isSearchInComments() {

        }
 * limitations under the License.
        }
            isLikeCondition = likeCondition;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }


        }
            this.globalSearch = globalSearch;


        @NotNull
    List<DBSObjectReference> findObjectsByMask(
     * </ul>
        public void setLikeCondition(boolean likeCondition) {
    @NotNull
    /**
            return parentObject;
}
        }
 * Unless required by applicable law or agreed to in writing, software
     *     <li>{@code mask}: name mask</li>
     *     <li>{@code caseSensitive}: case sensitive search (ignored by some implementations)</li>
        public void setGlobalSearch(boolean globalSearch) {
/*

            return objectTypes;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull CONTEXT executionContext,
        @NotNull ObjectsSearchParams params) throws DBException;
            this.searchInDefinitions = searchInDefinitions;
        private boolean caseSensitive;

        public DBSObjectType[] getObjectTypes() {
    @NotNull
            return caseSensitive;

 * you may not use this file except in compliance with the License.
public interface DBSStructureAssistant<CONTEXT extends DBCExecutionContext> {

        }
        @NotNull
        }
    DBSObjectType[] getSearchObjectTypes();
/**
 * DBSStructureAssistant

        }
 */
        @NotNull DBRProgressMonitor monitor,
        public boolean isSearchInDefinitions() {
    }
        public DBSObject getParentObject() {
            this.mask = mask;
        }
            return mask;
        @NotNull
     * A data class with search parameters.

package org.jkiss.dbeaver.model.struct;
        public void setMask(@NotNull String mask) {
import org.jkiss.dbeaver.DBException;
    @NotNull
        public void setParentObject(@Nullable DBSObject parentObject) {
        }
        }
            this.parentObject = parentObject;
 * You may obtain a copy of the License at
        }
        }
     * These include:

        private final DBSObjectType[] objectTypes;
        public int getMaxResults() {
        public boolean isGlobalSearch() {
 */
     *     <li>{@code searchInComments}: perform additional search in comments (ignored by some implementations)</li>

        @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others

            this.objectTypes = objectTypes;
        private boolean searchInComments;
        public void setMaxResults(int maxResults) {
    class ObjectsSearchParams {
        public void setSearchInComments(boolean searchInComments) {
        }
            this.maxResults = maxResults;
            return searchInComments;

        }

 * distributed under the License is distributed on an "AS IS" BASIS,
        private int maxResults = Integer.MAX_VALUE;
        public boolean isCaseSensitive() {
     *
    DBSObjectType[] getHyperlinkObjectTypes();
 *

 * DBeaver - Universal Database Manager
            this.searchInComments = searchInComments;
            return searchInDefinitions;

     *     <li>{@code maxResults}: maximum number of results</li>

        }
        private DBSObject parentObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

     */
        public String getMask() {
    @NotNull


    @NotNull
    DBSObjectType[] getSupportedObjectTypes();
            return globalSearch;
     * <ul>
        return false;
            this.caseSensitive = caseSensitive;
        public ObjectsSearchParams(@NotNull DBSObjectType[] objectTypes, @NotNull String mask) {
        @Nullable
    default boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
        private boolean searchInDefinitions;

    default boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
import java.util.List;
    }
        private String mask;
     *     <li>{@code objectTypes}: type of objects to search</li>

        }
        public boolean isLikeCondition() {

 *
        public void setCaseSensitive(boolean caseSensitive) {
        }
     *     <li>{@code globalSearch}: search in all available schemas/catalogs. If {@code false} then search with respect of active schema/catalog</li>


        @Nullable
        private boolean isLikeCondition;
     *     <li>{@code searchInDefinitions}: perform additional search in definitions (ignored by some implementations)</li>
        return false;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     *     <li>{@code parentObject}: parent (schema or catalog)</li>
            this.mask = mask;
