/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson.json;

import org.bson.BsonReaderSettings;

/**
 * Settings to control the behavior of a {@code JSONReader} instance.
 *
 * @see JsonWriter
 * @since 3.0
 */
public class JsonReaderSettings extends BsonReaderSettings {
    private final JsonMode inputMode;

    /**
     * Creates a new instance with default values for all properties.
     */
    public JsonReaderSettings() {
        this(JsonMode.STRICT);
    }

    /**
     * Creates a new instance with the given output inputMode and default values for all other properties.
     *
     * @param mode the input mode
     */
    public JsonReaderSettings(final JsonMode mode) {
        this.inputMode = mode;
    }
}