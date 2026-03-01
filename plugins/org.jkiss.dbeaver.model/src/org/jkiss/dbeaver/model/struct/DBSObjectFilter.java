 * See the License for the specific language governing permissions and
            excludePatterns = new ArrayList<>(exclude.size());
            }
        return true;
        this.exclude = exclude;
        }
            return false;
    }

    }
                }
            exclude = new ArrayList<>();
            this.include = SQLUtils.splitFilter(includeString);
            for (Object pattern : excludePatterns) {
                    break;
 * You may obtain a copy of the License at
 */
/**
            CommonUtils.hashCode(description) +
    @Nullable
    }
                if (!inc.isEmpty()) {
    }
            this.exclude = SQLUtils.splitFilter(excludeString);
    }
                    includePatterns.add(makePattern(inc, isCaseSensitive()));
    private transient List<Object> excludePatterns = null;
        this.excludePatterns = null;

import java.util.ArrayList;
    }
        return caseSensitive;

    private static boolean atLeastOneNameMatchesPattern(Object pattern, String[] names) {
        this.enabled = enabled;
    public String getDescription() {

        if (excludePatterns != null) {
    public List<String> getInclude() {
        }
    }
                if (atLeastOneNameMatchesPattern(pattern, names)) {
        return CommonUtils.isEmpty(include) && CommonUtils.isEmpty(exclude);
        }
        }
        }

    public void setDescription(String description) {

                }
        }
        }
            this.caseSensitive = filter.caseSensitive;
        return Arrays.stream(names)
                }
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        this.excludePatterns = null;
    public DBSObjectFilter(@Nullable DBSObjectFilter filter) {

    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        }
    }
    public boolean isEmpty() {
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    public List<String> getExclude() {
                    excludePatterns.add(makePattern(exc, isCaseSensitive()));
    public synchronized boolean matchesAny(String... names) {
    private boolean enabled = true;
import java.util.regex.Pattern;
        }
                return false;
        if (excludeString != null) {
            this.enabled = filter.enabled;
        return !CommonUtils.isEmpty(include) ? include.get(0) : null;

        return include != null && include.size() == 1 && CommonUtils.isEmpty(exclude);
import org.jkiss.utils.CommonUtils;
    public boolean isNotApplicable() {

    }
    public void setInclude(@Nullable List<String> include) {
            this.exclude = filter.exclude == null ? null : new ArrayList<>(filter.exclude);
        this.includePatterns = null;

package org.jkiss.dbeaver.model.struct;
        this.caseSensitive = caseSensitive;
    private transient List<Object> includePatterns = null;
        }
                return false;
 *
}
    }
    }
            }
        if (!exclude.contains(name)) {
        if (exclude == null) {
        return exclude;

        this.include = include;

        fillExcludePatterns();
        if (!include.contains(name)) {
        // Done
                    return false;
                    matched = true;
    public DBSObjectFilter(@Nullable String includeString, @Nullable String excludeString) {
    private List<String> include;

    private void fillExcludePatterns() {
        this.name = name;
    }
 *
        if (includePatterns == null && !CommonUtils.isEmpty(include)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    matched = true;
    public DBSObjectFilter() {
    public void addInclude(String name) {
                    return false;
                if (!exc.isEmpty()) {
        return !enabled || isEmpty();

        if (excludePatterns == null && !CommonUtils.isEmpty(exclude)) {
            for (Object pattern : includePatterns) {
        return include;
            }
        }
        this.includePatterns = null;
        if (pattern instanceof Pattern) {
        if (includePatterns != null) {

        } else {
            .anyMatch(name -> matchesPattern(pattern, name));
 * you may not use this file except in compliance with the License.
        }
                }
 * Object filter configuration

    private void fillIncludePatterns() {
    private String description;
 */
import org.jkiss.code.Nullable;
        }
            for (Object pattern : excludePatterns) {

    @Nullable
import java.util.List;

            }

        fillExcludePatterns();

    private String name;
            if (!matched) {
    public boolean equals(Object obj) {
            if (!matched) {
            for (String exc : exclude) {
            CommonUtils.equalObjects(exclude, source.exclude);
            // Match includes (at least one should match)
            CommonUtils.hashCode(exclude);
        return name;
            exclude.add(name);
                SQLUtils.makeLikePattern(str), Pattern.MULTILINE) : Pattern.compile(SQLUtils.makeLikePattern(str), Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

        }
            return str;
            enabled == source.enabled &&
            // Match excludes
            include = new ArrayList<>();
        } else {
            this.name = filter.name;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setCaseSensitive(boolean caseSensitive) {
                }

            return ((Pattern) pattern).matcher(name).matches();
                if (matchesPattern(pattern, name)) {
 * limitations under the License.
    }
        fillIncludePatterns();
    public String getName() {
        return CommonUtils.hashCode(name) +
    }
            }
            for (Object pattern : includePatterns) {
    public int hashCode() {
                    break;
        if (excludePatterns != null) {

    @Override


            CommonUtils.equalObjects(description, source.description) &&
        }
                if (atLeastOneNameMatchesPattern(pattern, names)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        DBSObjectFilter source = (DBSObjectFilter) obj;


    }
            this.include = filter.include == null ? null : new ArrayList<>(filter.include);

    }
            }
    }
            (enabled ? 1 : 0) +
        if (includeString != null) {
            this.description = filter.description;
                }
 * DBeaver - Universal Database Manager


    private static boolean matchesPattern(Object pattern, String name) {
        if (filter != null) {
    public boolean isEnabled() {
        this.description = description;
        fillIncludePatterns();
    private static Object makePattern(String str, boolean caseSensitive) {
public class DBSObjectFilter {
            includePatterns = new ArrayList<>(include.size());

 *
 * Unless required by applicable law or agreed to in writing, software
    }

    public String getSingleMask() {
            boolean matched = false;
    public synchronized boolean matches(String name) {
        return enabled;
    }
        if (!(obj instanceof DBSObjectFilter)) {
    private boolean caseSensitive;
import org.jkiss.code.NotNull;
            boolean matched = false;
        return true;
        if (SQLUtils.isLikePattern(str)) {
            CommonUtils.equalObjects(include, source.include) &&
                if (matchesPattern(pattern, name)) {
        return description;
        return CommonUtils.equalObjects(name, source.name) &&
/*
            return ((String) pattern).equalsIgnoreCase(name);

    }
    public void addExclude(@NotNull String name) {
    }
    public boolean isCaseSensitive() {
            }
        }
            include.add(name);


            for (String inc : include) {
    public void setName(String name) {
import java.util.Arrays;
    }
        if (includePatterns != null) {
    }
    private List<String> exclude;

    @Override
    }
            return caseSensitive ? Pattern.compile(
    public void setExclude(List<String> exclude) {
        if (include == null) {
    public boolean hasSingleMask() {
    @NotNull

            CommonUtils.hashCode(include) +
    public void setEnabled(boolean enabled) {
