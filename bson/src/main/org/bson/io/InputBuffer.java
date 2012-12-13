package org.bson.io;

import org.bson.BsonType;
import org.bson.types.ObjectId;

/**
 * Copyright (c) 2008 - 2012 10gen, Inc. <http://10gen.com>
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
public interface InputBuffer {
    int getPosition();

    boolean readBoolean();

    byte readByte();

    byte[] readBytes(int size);

    long readInt64();

    double readDouble();

    int readInt32();

    String readString();

    ObjectId readObjectId();

    BsonType readBsonType();

    String readCString();

    void skipCString();

    void setPosition(int position);
}