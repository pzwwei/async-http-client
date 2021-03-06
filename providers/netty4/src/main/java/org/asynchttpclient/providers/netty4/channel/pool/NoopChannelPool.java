/*
 * Copyright (c) 2014 AsyncHttpClient Project. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 *     http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.asynchttpclient.providers.netty4.channel.pool;

import org.asynchttpclient.providers.netty.commons.channel.pool.ChannelPoolPartitionSelector;

import io.netty.channel.Channel;

public class NoopChannelPool implements ChannelPool {

    @Override
    public boolean offer(Channel channel, String poolKey) {
        return false;
    }

    @Override
    public Channel poll(String poolKey) {
        return null;
    }

    @Override
    public boolean removeAll(Channel channel) {
        return false;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public void destroy() {
    }

    @Override
    public void flushPartition(String partitionId) {
    }

    @Override
    public void flushPartitions(ChannelPoolPartitionSelector selector) {
    }
}
