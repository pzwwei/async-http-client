/*
 * Copyright (c) 2010-2014 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.asynchttpclient.extras.registry;

import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.AsyncHttpProvider;
import org.asynchttpclient.extras.registry.AbstractAsyncHttpClientFactoryTest;
import org.asynchttpclient.providers.grizzly.GrizzlyAsyncHttpProvider;
import org.testng.annotations.Test;

@Test
public class GrizzlyAsyncHttpClientFactoryTest extends AbstractAsyncHttpClientFactoryTest {

    @Override
    public AsyncHttpProvider getAsyncHttpProvider(AsyncHttpClientConfig config) {
        if (config == null) {
            config = new AsyncHttpClientConfig.Builder().build();
        }
        return new GrizzlyAsyncHttpProvider(config);
    }
}
