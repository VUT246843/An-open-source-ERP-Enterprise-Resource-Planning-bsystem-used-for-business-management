                } else {
    }
            boolean valid;
            }
                excludedTransformers.add(id);

    public boolean filterTransformers(List<? extends DBDAttributeTransformerDescriptor> descriptors) {


/**
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
    public void setCustomTransformer(String customTransformer) {
        }
            this.transformOptions = new LinkedHashMap<>();
        this.customTransformer = source.customTransformer;
 * You may obtain a copy of the License at
        return customTransformer;
}
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void setTransformOption(String name, Object value) {
    }
/*
            }
                i++;
        return excludedTransformers != null && excludedTransformers.contains(id);
            if (transformer.isApplicableByDefault()) {
        return includedTransformers;


    DBVTransformSettings(DBVTransformSettings source) {
        return true;
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
    }
 * Unless required by applicable law or agreed to in writing, software
    public void setTransformOptions(Map<String, Object> transformOptions) {
            } else {
                    valid = (excludedTransformers == null || !excludedTransformers.contains(descriptor.getId()));
    }
    }
        final String id = transformer.getId();
    public boolean hasValuableData() {
            includedTransformers.remove(id);
 *



 * distributed under the License is distributed on an "AS IS" BASIS,
        return !CommonUtils.isEmpty(excludedTransformers) ||

    }
                descriptors.remove(i);
                    valid = includedTransformers != null && includedTransformers.contains(descriptor.getId());
            final DBDAttributeTransformerDescriptor descriptor = descriptors.get(i);
 */
    private Set<String> excludedTransformers, includedTransformers;
    public Set<String> getIncludedTransformers() {
    }
 *
public class DBVTransformSettings {
            } else {
    public boolean isExcluded(String id) {
                includedTransformers.add(id);
    }
    public boolean hasTransformOptions() {
        this.includedTransformers = source.includedTransformers == null ? null : new HashSet<>(source.includedTransformers);
        return excludedTransformers;
            if (descriptor.isCustom()) {
            !CommonUtils.isEmpty(includedTransformers) ||
        } else {
            if (!valid) {
 * DBeaver - Universal Database Manager
                if (descriptor.isApplicableByDefault()) {
package org.jkiss.dbeaver.model.virtual;
        if (this.transformOptions == null) {
                valid = descriptor.getId().equals(customTransformer);
        }
            return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
    public boolean isIncluded(String id) {
    public String getCustomTransformer() {
        this.transformOptions = source.transformOptions == null ? null : new LinkedHashMap<>(source.transformOptions);
        this.transformOptions.put(name, value);
    private Map<String, Object> transformOptions;

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.*;
 * Virtual model object
        this.transformOptions = transformOptions;
        for (int i = 0; i < descriptors.size();) {
            excludedTransformers.remove(id);
                }
 *
        }
    }
 * limitations under the License.
        return includedTransformers != null && includedTransformers.contains(id);
    }

        return transformOptions != null && !transformOptions.isEmpty();
    }
    public void enableTransformer(DBDAttributeTransformerDescriptor transformer, boolean enable) {


        return transformOptions;
        if (enable) {
        this.excludedTransformers = source.excludedTransformers == null ? null : new HashSet<>(source.excludedTransformers);
    DBVTransformSettings() {
        }
        if (!hasValuableData()) {

    }
            }
            if (!transformer.isApplicableByDefault()) {
            !CommonUtils.isEmpty(customTransformer);
    public Set<String> getExcludedTransformers() {
        this.customTransformer = customTransformer;
import org.jkiss.utils.CommonUtils;


        if (excludedTransformers == null) excludedTransformers = new HashSet<>();

    }
 * See the License for the specific language governing permissions and

    private String customTransformer;
        if (includedTransformers == null) includedTransformers = new HashSet<>();

    public Map<String, Object> getTransformOptions() {
    }
