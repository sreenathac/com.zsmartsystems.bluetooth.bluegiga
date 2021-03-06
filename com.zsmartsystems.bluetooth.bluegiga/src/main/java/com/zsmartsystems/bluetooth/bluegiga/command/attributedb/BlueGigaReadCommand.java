/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributedb;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;

/**
 * Class to implement the BlueGiga command <b>read</b>.
 * <p>
 * The command reads the given attribute's value from the local database. There is a 32-byte
 * limit in the amount of data that can be read at a time. In order to read larger values multiple
 * read commands must be used with the offset properly used.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaReadCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x01;

    /**
     * Handle of the attribute to read
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int handle;

    /**
     * Offset to read from. Maximum of 32 bytes can be read at a time.
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int offset;

    /**
     * Handle of the attribute to read
     *
     * @param handle the handle to set as {@link int}
     */
    public void setHandle(int handle) {
        this.handle = handle;
    }
    /**
     * Offset to read from. Maximum of 32 bytes can be read at a time.
     *
     * @param offset the offset to set as {@link int}
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt16(handle);
        serializeUInt16(offset);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaReadCommand [handle=");
        builder.append(handle);
        builder.append(", offset=");
        builder.append(offset);
        builder.append(']');
        return builder.toString();
    }
}
