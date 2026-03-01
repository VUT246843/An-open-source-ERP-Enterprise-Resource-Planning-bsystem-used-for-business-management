import net.schmizz.sshj.common.SSHPacket;
            return name;
 */
 * DBeaver - Universal Database Manager
    public void handle(Message cmd, SSHPacket buf) throws UserAuthException, TransportException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final Identity identity;
    }
        }
 *
        final byte[] dataToSign = new Buffer.PlainBuffer()
    }
        this.identity = identity;
            super.handle(cmd, buf);


/*
        reqBuf.putBytes(identity.getSignature(dataToSign, getAlgName()));
    public DBeaverAuthAgent(@NotNull Identity identity) throws Buffer.BufferException {
        if (cmd == Message.USERAUTH_60) {

 * You may obtain a copy of the License at
            .getCompactData();
import net.schmizz.sshj.userauth.method.AbstractAuthMethod;
 * you may not use this file except in compliance with the License.
import net.schmizz.sshj.userauth.UserAuthException;

    @NotNull
        super("publickey");

        }
        final String name = identity.getAlgName();
    private SSHPacket putPubKey(SSHPacket reqBuf) {
        if ("ssh-rsa".equals(name)) {
    private String getAlgName() {
import net.schmizz.sshj.common.Buffer;
    }
    }
    protected SSHPacket buildReq() throws UserAuthException {
    @Override

            .putBuffer(reqBuf) // & rest of the data for sig
    }
 * Unless required by applicable law or agreed to in writing, software
    }

        } else {
    private SSHPacket putSig(SSHPacket reqBuf) {
    @NotNull
}
        return putPubKey(super.buildReq().putBoolean(signed));
 * limitations under the License.
        reqBuf
        } else {
        return reqBuf;
package org.jkiss.dbeaver.model.net.ssh;
    private void sendSignedReq() throws UserAuthException, TransportException {
 *
            .putString(params.getTransport().getSessionID())

import net.schmizz.sshj.transport.TransportException;
        params.getTransport().write(putSig(buildReq(true)));
        return buildReq(false);
 * See the License for the specific language governing permissions and
    }
import net.schmizz.sshj.common.Message;
 *     http://www.apache.org/licenses/LICENSE-2.0

            .putBytes(identity.getPublicKeyBlob());
            sendSignedReq();
    private SSHPacket buildReq(boolean signed) throws UserAuthException {

import com.jcraft.jsch.Identity;
public class DBeaverAuthAgent extends AbstractAuthMethod {
    @Override
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @NotNull

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            .putString(getAlgName())
            return "rsa-sha2-512";

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return reqBuf;
    @NotNull
