/**
 *
 * Copyright 2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.security.auth.message.callback;

import javax.security.auth.callback.Callback;
import javax.security.auth.x500.X500Principal;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * @version $Rev$ $Date$
 */
public class PrivateKeyCallback implements Callback {

    private final Request request;
    private Certificate[] chain;
    private PrivateKey key;

    public PrivateKeyCallback(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }

    public Certificate[] getChain() {
        return chain;
    }

    public PrivateKey getKey() {
        return key;
    }

    void setKey(PrivateKey key, Certificate[] chain) {
        this.key = key;
        this.chain = chain;
    }

    public static interface Request {
    }

    static class AliasRequest implements Request {

        private final String alias;

        public AliasRequest(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return alias;
        }
    }

    public static class SubjectKeyIDRequest implements Request {

        private final byte[] subjectKeyID;

        public SubjectKeyIDRequest(byte[] subjectKeyID) {
            this.subjectKeyID = subjectKeyID;
        }

        public byte[] getSubjectKeyID() {
            return subjectKeyID;
        }
    }

    public static class IssuerSerialNumRequest implements Request {
        private final X500Principal issuer;
        private final BigInteger serialNum;

        public IssuerSerialNumRequest(X500Principal issuer, BigInteger serialNum) {
            this.issuer = issuer;
            this.serialNum = serialNum;
        }

        public X500Principal getIssuer() {
            return issuer;
        }

        public BigInteger getSerialNum() {
            return serialNum;
        }
    }
}
