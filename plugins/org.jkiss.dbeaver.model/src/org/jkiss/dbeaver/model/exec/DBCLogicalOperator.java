                final int max = DBUtils.compareDataValues(srcValue, arguments[1]);
        }
     * Determines whether this operator supports wildcard pattern matching.
     */
    EQUALS("=", 1) {
        @Override
        }
/*
        @Override
    },

    },
    /**
        @Override
            if (arguments.length == 1) {
     */
        @Override
}
            return false;
        @Override
    LESS("<", 1) {

        public boolean evaluate(Object srcValue, Object[] arguments) {
        @Override
        return argumentCount;
        }

    DBCLogicalOperator(String stringValue, int argumentCount) {
    public String getExpression() {
        public boolean evaluate(Object srcValue, Object[] arguments) {
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Negative number means variable number of arguments
        public boolean evaluate(Object srcValue, Object[] arguments) {
    }
            return srcValue != null;
        }
    CONTAINS_KEY("CONTAINS KEY", 1) {
    LIKE("LIKE", 1) {
        public boolean evaluate(Object srcValue, Object[] arguments) {
            return compare(srcValue, arguments) >= 0;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.code.NotNull;
            return DBUtils.compareDataValues(srcValue, cmpValue) != 0;
 */
    REGEX("REGEX", 1) {
        @Override
        @Override

                !SQLUtils.matchesLike(srcValue.toString(), arguments[0].toString());
    /**
                srcValue.toString().matches(arguments[0].toString());
                    SQLUtils.matchesLike(srcValue.toString(), arguments[0].toString());
        public boolean evaluate(Object srcValue, Object[] arguments) {
        @Override
    private final String stringValue;
            return srcValue == null;
        @Override
            if (arguments.length == 2) {
        }
        }
    public abstract boolean evaluate(Object srcValue, Object[] arguments);
    },
        return stringValue;
        public boolean evaluate(Object srcValue, Object[] arguments) {
 *
        }
    SOUNDS("SOUNDS", 1) {
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.DBUtils;
    },
        @Override
     */
    },
    NOT_LIKE("NOT LIKE", 1) {
        public boolean evaluate(Object srcValue, Object[] arguments) {
 * DBeaver - Universal Database Manager
    }
                return min >= 0 && max <= 0;

            return compare(srcValue, arguments) > 0;
            return ArrayUtils.contains(arguments, srcValue);
import org.jkiss.dbeaver.model.sql.SQLUtils;
        }
 * Logical operator
    },

        public boolean evaluate(Object srcValue, Object[] arguments) {
    },
        return this == LIKE || this == ILIKE || this == NOT_LIKE;
            final Object cmpValue = arguments == null ? null : arguments[0];
 */
        public boolean evaluate(Object srcValue, Object[] arguments) {
            return srcValue != null && !ArrayUtils.isEmpty(arguments) &&
            return false;
public enum DBCLogicalOperator {
package org.jkiss.dbeaver.model.exec;
        @Override
 *
        if (srcValue == null && (arguments == null || arguments.length == 0 || arguments[0] == null)) {
     * @return argument count
    LESS_EQUALS("<=", 1) {
        }
        public boolean evaluate(Object srcValue, Object[] arguments) {

        }
    private static int compare(Object srcValue, Object[] arguments) {
    public int getArgumentCount() {

    },
    },
                final int min = DBUtils.compareDataValues(srcValue, arguments[0]);
        }
                SQLUtils.matchesLike(srcValue.toString(), arguments[0].toString());
        @Override
    IN("IN", -1) {
        }
                return DBUtils.compareDataValues(srcValue, arguments[0]) == 0;
        @Override
 *
    /**
        @Override
     * Operator string representation
        }
    },
            return false;
     * Zero means no arguments.
    IS_NULL("IS NULL", 0) {
import org.jkiss.utils.ArrayUtils;
            return srcValue != null && !ArrayUtils.isEmpty(arguments) &&
        public boolean evaluate(Object srcValue, Object[] arguments) {
            return false;//DBUtils.compareDataValues(srcValue, cmpValue) != 0;
            }
            }
    ILIKE("ILIKE", 1) {
     * @return {@code true} if the operator supports wildcards, {@code false} otherwise.
        public boolean evaluate(Object srcValue, Object[] arguments) {
    },
            }
        return name();
    },
    },
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return false;//DBUtils.compareDataValues(srcValue, cmpValue) == 0;
    },
 * See the License for the specific language governing permissions and
    },

            return srcValue != null && !ArrayUtils.isEmpty(arguments) &&
    }
    }
                return DBUtils.isNullValue(srcValue);


/**
        }
        @Override
        this.stringValue = stringValue;
            return compare(srcValue, arguments) < 0;
    IS_NOT_NULL("IS NOT NULL", 0) {
            return srcValue != null && !ArrayUtils.isEmpty(arguments) &&
    private final int argumentCount;
     * Argument count.
    GREATER(">", 1) {
        public boolean evaluate(Object srcValue, Object[] arguments) {
    GREATER_EQUALS(">=", 1) {
    CONTAINS("CONTAINS", 1) {
        return DBUtils.compareDataValues(srcValue, arguments[0]);
 * Unless required by applicable law or agreed to in writing, software
            if (arguments == null) {
            final Object cmpValue = arguments == null ? null : arguments[0];

    NOT_EQUALS("<>", 1) {
            return 0;
    }
    },
            return compare(srcValue, arguments) <= 0;
    public String getId() {
     * Positive number means exact this number of arguments.
        }
        public boolean evaluate(Object srcValue, Object[] arguments) {
        }
        }
        public boolean evaluate(Object srcValue, Object[] arguments) {

    BETWEEN("BETWEEN", 2) {
    };
    public boolean isWildcardOperator() {
        @Override
 * limitations under the License.
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        public boolean evaluate(Object srcValue, Object[] arguments) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        public boolean evaluate(Object srcValue, Object[] arguments) {
        }
            final Object cmpValue = arguments == null ? null : arguments[0];
    @NotNull
        this.argumentCount = argumentCount;
