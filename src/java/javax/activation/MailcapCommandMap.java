/**
 *
 * Copyright 2003-2004 The Apache Software Foundation
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
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.activation;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 *
 *
 * @version $Revision: 1.3 $ $Date: 2004/03/10 10:00:22 $
 */
public class MailcapCommandMap extends CommandMap {
    public MailcapCommandMap() {
        /*@todo implement*/
    }

    public MailcapCommandMap(String fileName) throws IOException {
        /*@todo implement*/
    }

    public MailcapCommandMap(InputStream is) {
        /*@todo implement*/
    }

    public synchronized CommandInfo[] getPreferredCommands(String mimeType) {
        /*@todo implement*/
        return null;
    }

    public synchronized CommandInfo[] getAllCommands(String mimeType) {
        /*@todo implement*/
        return null;
    }

    public synchronized CommandInfo getCommand(String mimeType, String cmdName) {
        /*@todo implement*/
        return null;
    }

    public synchronized void addMailcap(String mail_cap) {
        /*@todo implement*/
    }

    public synchronized DataContentHandler createDataContentHandler(String mimeType) {
        /*@todo implement*/
        return null;
    }
}
