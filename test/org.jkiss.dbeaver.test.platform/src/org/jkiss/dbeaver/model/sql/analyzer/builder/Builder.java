        this.children = new ArrayList<>();


        this.dataSource = dataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public interface Consumer<T extends Builder<?, ?>> {
    public List<C> getChildren() {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
}
import org.jkiss.dbeaver.DBException;
        @SuppressWarnings("unchecked")
    @NotNull
    }
import org.jkiss.dbeaver.model.DBPDataSource;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    protected final List<C> children;

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        static <T extends Builder<?, ?>> Consumer<T> empty() {
    protected final DBPDataSource dataSource;


package org.jkiss.dbeaver.model.sql.analyzer.builder;
import org.jkiss.code.NotNull;
    }
    @NotNull
 * See the License for the specific language governing permissions and
        Consumer<?> EMPTY = t -> {};
        void apply(@NotNull T builder) throws DBException;

            return (Consumer<T>) EMPTY;

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        this.parent = parent;
 *
 *
 * You may obtain a copy of the License at
        }
    protected final DBSObject parent;

    protected Builder(@NotNull DBPDataSource dataSource, @NotNull DBSObject parent) {
    public abstract T build() throws DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.ArrayList;
        return children;
public abstract class Builder<T, C> {
import java.util.List;
/*
