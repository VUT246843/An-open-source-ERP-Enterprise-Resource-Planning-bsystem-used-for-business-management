package org.jkiss.dbeaver.ui.config.migration.dbvis;
    }
    }


        this.description = description;
    public String getUseSshConfigFile() {
    public String getSshJumpServerId() {
    public String getIsEnabled() {
    public void setSshImplementationType(String sshImplementationType) {
    private String isEnabled;
    }
    private String sshConfigFile;
        if (authenticationType.equals("PUBLIC_KEY")) {

    }
    public String getSshImplementationType() {
        return sshKeepAliveInterval;
        return sshConfigFile;
        return description;
        this.sshHost = sshHost;


    }

        return sshPrivateKeyFile;
    }

        return savePasswords;
    public void setAuthenticationType(String authenticationType) {

    public void setSshKnownHostsFile(String sshKnownHostsFile) {
        this.sshJumpServerId = sshJumpServerId;
    }
    public void setSshPrivateKeyFile(String sshPrivateKeyFile) {

        return authenticationType;
        return sshJumpServerId;
    }
    private String useSshConfigFile;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.sshConnectTimeout = sshConnectTimeout;
        this.useSshConfigFile = useSshConfigFile;
    public String getPromptPassphrase() {
    }

}
    public void setSshUserid(String sshUserid) {
    }


 
    public String getSshConnectTimeout() {
    public String getId() {
    private String sshMaxAuthTries;
    public String getSshUserid() {


    }
        return sshConnectTimeout;
    public void setDescription(String description) {
    }
    }


        this.name = name;
 *
    public String getSshKeepAliveInterval() {
    private String sshConnectTimeout;
        return sshKnownHostsFile;

import org.jkiss.dbeaver.model.net.ssh.SSHConstants;
    }

        this.sshPrivateKeyFile = sshPrivateKeyFile;
 *
 * Unless required by applicable law or agreed to in writing, software
    private SSHConstants.AuthType authenticationType;

    public SSHConstants.AuthType getAuthenticationType() {
    private String sshKeepAliveInterval;
    public String getSshMaxAuthTries() {
    }
        return useSshConfigFile;
        return sshPort;
        this.isEnabled = isEnabled;

        this.sshKeepAliveInterval = sshKeepAliveInterval;
    private String savePasswords;
    }

    }
    }
    public void setUseSshConfigFile(String useSshConfigFile) {
    }
    }
    }
    public String getSshPort() {
    public void setSshMaxAuthTries(String sshMaxAuthTries) {


    public String getSavePasswords() {
    }

    public String getSshPrivateKeyFile() {
    public void setSshJumpServerId(String sshJumpServerId) {
    }
        return sshUserid;
        } else {

    public String getSshHost() {
        return promptPassphrase;
    private String id;
    private String sshHost;
    public void setSavePasswords(String savePasswords) {
    }
    }
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }


    private String sshPrivateKeyFile;
    public void setName(String name) {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

    }
    private String sshPort;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.id = id;
 * limitations under the License.
        this.promptPassphrase = promptPassphrase;
    public String getSshConfigFile() {
    private String name;

        return isEnabled;
    private String sshKnownHostsFile;
 */
    private String description;
        this.sshUserid = sshUserid;
    public String getSshKnownHostsFile() {
        this.sshMaxAuthTries = sshMaxAuthTries;
        return id;

    }
    private String sshUserid;
        this.sshKnownHostsFile = sshKnownHostsFile;
 * You may obtain a copy of the License at
    }
        return sshMaxAuthTries;
            this.authenticationType = SSHConstants.AuthType.PUBLIC_KEY;
            this.authenticationType = SSHConstants.AuthType.PASSWORD;
    private String sshJumpServerId;
    }
    public String getName() {
 * DBeaver - Universal Database Manager
    }
    public void setSshKeepAliveInterval(String sshKeepAliveInterval) {
    }
public class DbvisSshServerConfiguration {
    public void setId(String id) {

    public void setSshConfigFile(String sshConfigFile) {
    public void setPromptPassphrase(String promptPassphrase) {
    public void setSshConnectTimeout(String sshConnectTimeout) {
        this.sshImplementationType = sshImplementationType;
        return name;
        return sshHost;
    }

        return sshImplementationType;
    }
        this.sshPort = sshPort;
    public void setSshHost(String sshHost) {
        this.savePasswords = savePasswords;
    }
 * you may not use this file except in compliance with the License.
    public void setSshPort(String sshPort) {
    public String getDescription() {

    private String promptPassphrase;
        this.sshConfigFile = sshConfigFile;
    }
    public void setIsEnabled(String isEnabled) {
 * Licensed under the Apache License, Version 2.0 (the "License");


 *
    }

    private String sshImplementationType;


    }

/*
