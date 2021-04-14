/*
 * Copyright 2021 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.awsqueueui;

import io.micrometer.core.lang.Nullable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "jmix.awsqueue")
@ConstructorBinding
public class QueueProperties {

    protected String accessKey;
    protected String secretKey;
    protected String region;

    protected String queueFamilyTag;

    public QueueProperties(String accessKey, String secretKey, String region,
                           @Nullable String queueFamilyTag) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.region = region;
        this.queueFamilyTag = queueFamilyTag;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getQueueFamilyTag() {
        return queueFamilyTag;
    }

    public void setQueueFamilyTag(String queueFamilyTag) {
        this.queueFamilyTag = queueFamilyTag;
    }
}
