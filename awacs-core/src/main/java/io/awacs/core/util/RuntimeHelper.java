/**
 * Copyright 2016 AWACS Project.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.awacs.core.util;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * Created by pixyonly on 8/23/16.
 */
public enum RuntimeHelper {

    instance;

    RuntimeHelper() {
        //            host = Inet4Address.getLocalHost().getHostAddress();
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName();
        int index = name.indexOf("@");
        if (index != -1) {
            pid = Integer.parseInt(name.substring(0, index));
        }
        processors = Runtime.getRuntime().availableProcessors();
    }

    private String host;

    private int pid;

    private int processors;

//    public String getHost() {
//        return host;
//    }

    public int getPid() {
        return pid;
    }

    public int getProcessors() {
        return processors;
    }
}
