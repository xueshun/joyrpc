package io.joyrpc.transport.resteasy.warmup;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
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
 * #L%
 */

import io.joyrpc.config.AbstractInterfaceConfig;
import io.joyrpc.config.ProviderConfig;
import io.joyrpc.config.Warmup;
import io.joyrpc.extension.Extension;
import io.joyrpc.transport.resteasy.deployment.DeploymentManager;

/**
 * 触发resteasy接口注册的预热插件
 */
@Extension("resteasyRegister")
public class ResteasyRegisterWarmup implements Warmup {

    @Override
    public void setup(AbstractInterfaceConfig config) {
        if (config instanceof ProviderConfig) {
            DeploymentManager.register((ProviderConfig) config);
        }
    }
}