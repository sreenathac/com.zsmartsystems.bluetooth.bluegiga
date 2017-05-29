/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributedb;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>attributeStatusEvent</b>.
 * <p>
 * This event indicates attribute status flags have changed. For example, this even is
 * generated at the module acting as the GATT Server whenever the remote GATT Client changes the
 * Client Characteristic Configuration to start or stop notification or indications from the
 * Server.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaAttributeStatusEvent extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x02;

    /**
     * Attribute handle
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int handle;

    /**
     * Attribute status flags. See: Attribute Status Flags
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int flags;

    /**
     * Event constructor
     */
    public BlueGigaAttributeStatusEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
        handle = deserializeUInt16();
        flags = deserializeUInt8();
    }

    /**
     * Attribute handle
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current handle as {@link int}
     */
    public int getHandle() {
        return handle;
    }

    /**
     * Attribute status flags. See: Attribute Status Flags
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current flags as {@link int}
     */
    public int getFlags() {
        return flags;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaAttributeStatusEvent [handle=");
        builder.append(handle);
        builder.append(", flags=");
        builder.append(flags);
        builder.append(']');
        return builder.toString();
    }
}
