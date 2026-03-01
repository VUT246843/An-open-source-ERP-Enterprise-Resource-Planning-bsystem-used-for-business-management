            }
                        if (Character.isLowerCase(constraintName.charAt(0))) {
        this.constraintType = constraintType;
        return constraintType;

                if (matcher.find() && matcher.end() == testName.length()) {
                        hasPK = true;
    public String validateAllowedType(DBSEntityConstraintType constraintType) {
    }
    }
                        nameUpdated = true;
        if (CommonUtils.isEmpty(constraintName)) {

    private void addTypePrefix(DBSEntityConstraintType type, String prefix) {
            String entityName = CommonUtils.escapeIdentifier(entity.getName());

            prefix = entity.getDataSource().getSQLDialect().storesUnquotedCase().transform(prefix);
    }
    private void generateConstraintName(boolean forceRefresh) {

                Matcher matcher = NAME_INDEX_PATTERN.matcher(testName);
    private final Map<DBSEntityConstraintType, String> TYPE_PREFIX = new HashMap<>();
    @NotNull
            if (hasPK) {
        TYPE_PREFIX.put(type, prefix);
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        constraintName = testName.substring(0, testName.length() - oldPrefix.length()) + newPrefix;
            if (namePrefix == null) {
}
        } catch (DBException e) {
            }
            }
        addTypePrefix(DBSEntityConstraintType.UNIQUE_KEY, "_UNIQUE");
 * DBeaver - Universal Database Manager
                log.debug(e);


                    testName = testName.substring(0, matcher.start());

import java.util.Locale;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                curName = constraintName + "_" + conIndex;

import org.jkiss.dbeaver.DBException;
        if (CommonUtils.isEmpty(this.constraintName) || forceRefresh) {
    private static final Log log = Log.getLog(ConstraintNameGenerator.class);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
    public ConstraintNameGenerator(@NotNull DBSEntity entity, String constraintName, DBSEntityConstraintType constraintType) {


    }
        try {
        if (constraintType == DBSEntityConstraintType.PRIMARY_KEY) {
                        break;
import org.jkiss.code.NotNull;
                namePrefix = "_KEY";
        return null;
            if (entityName != null && !entityName.isBlank()) {
import java.util.regex.Pattern;
 * limitations under the License.
                    namePrefix = namePrefix.toLowerCase(Locale.ENGLISH);

            String namePrefix = TYPE_PREFIX.get(constraintType);
        return constraintName;
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.constraintName = entityName + namePrefix;
    }
        this.constraintType = newType;
 * Unless required by applicable law or agreed to in writing, software
    private final DBSEntity entity;
        this.entity = entity;
    private DBSEntityConstraintType constraintType;
        makeNameUnique();
    private static final Pattern NAME_INDEX_PATTERN = Pattern.compile("_([0-9]+)");
            Collection<? extends DBSEntityConstraint> conList = entity.getConstraints(new VoidProgressMonitor());
                }
                return "Primary key already exists in '" + DBUtils.getObjectFullName(entity, DBPEvaluationContext.UI) + "'";
                    }

            this.makeNameUnique();
            try {

                String testName = constraintName;
            if (oldPrefix != null) {
    public DBSEntityConstraintType getConstraintType() {
                for (DBSEntityConstraint con : CommonUtils.safeCollection(entity.getConstraints(new VoidProgressMonitor()))) {
    private String constraintName;
                }

    }
            String curName = constraintName;
            constraintName = DBObjectNameCaseTransformer.transformName(entity.getDataSource(), curName);
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
        }
        } else {
                        }
        }
            }
import java.util.regex.Matcher;
    public void setConstraintType(DBSEntityConstraintType newType) {
    }
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Collection;
        this(entity, constraintName, DBSEntityConstraintType.PRIMARY_KEY);
import java.util.Map;
        this.constraintName = constraintName;

        if (!nameUpdated) {
    }
public class ConstraintNameGenerator {
 * you may not use this file except in compliance with the License.
        }
        this.constraintName = constraintName;
                if (Character.isLowerCase(entityName.charAt(0))) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.object.struct;
            }
        addTypePrefix(DBSEntityConstraintType.VIRTUAL_KEY, "_VK");
    public void setConstraintName(String constraintName) {

            } catch (DBException e) {
        }
import org.jkiss.utils.CommonUtils;
import java.util.HashMap;
 */
    public String getConstraintName() {
        if (entity.getDataSource() != null) {

        addTypePrefix(DBSEntityConstraintType.CHECK, "_CHECK");
                conIndex++;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            String oldPrefix = TYPE_PREFIX.get(this.constraintType);
 * ConstraintNameGenerator
        boolean nameUpdated = false;
 *
 * See the License for the specific language governing permissions and
            int conIndex = 1;

                    }
                    String newPrefix = TYPE_PREFIX.get(newType);
            while (DBUtils.findObject(conList, curName) != null) {
                    if (con.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.dbeaver.Log;
                            newPrefix = newPrefix.toLowerCase(Locale.ENGLISH);

                }
        }
 */
            generateConstraintName(false);
        if (!CommonUtils.isEmpty(constraintName)) {
    private void makeNameUnique() {
 *
            boolean hasPK = false;

                    if (newPrefix != null) {

        this(entity, null);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    public ConstraintNameGenerator(DBSEntity entity) {

    }
        addTypePrefix(DBSEntityConstraintType.PRIMARY_KEY, "_PK");
            this.generateConstraintName(true);
        }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        addTypePrefix(DBSEntityConstraintType.FOREIGN_KEY, "_FK");
import org.jkiss.dbeaver.model.DBUtils;
 *
                if (testName.toLowerCase().endsWith(oldPrefix.toLowerCase())) {
            log.debug(e);
    public ConstraintNameGenerator(DBSEntity entity, String constraintName) {
/*
            }

 * You may obtain a copy of the License at
