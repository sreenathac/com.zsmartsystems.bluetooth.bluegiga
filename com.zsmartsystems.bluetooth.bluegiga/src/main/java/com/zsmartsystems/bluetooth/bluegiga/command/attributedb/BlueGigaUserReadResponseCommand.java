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
 * Class to implement the BlueGiga command <b>userReadResponse</b>.
 * <p>
 * This command is used to respond to an attribute Read request by a remote device, but only for
 * attributes which have been configured with the user property. Attributes which have the
 * user property enabled allow the attribute value to be requested from the application
 * instead of the Smart stack automatically responding with Bluetooth the data in it's local
 * GATT database. This command is normally used in response to a User Read Request event, which
 * is generated when a remote device tries to read an attribute with a user property enabled. The
 * response to User Read Request events must happen within 30 seconds or otherwise a timeout
 * will occur.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaUserReadResponseCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x03;

    /**
     * Connection handle to response to.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * 0: User Read Request is responded with data. In case of an error an application specific error
     * code can be sent.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int attError;

    /**
     * Data to send
     * <p>
     * BlueGiga API type is <i>uint8array</i> - Java type is {@link int[]}
     */
    private int[] value;
    /**
     * Connection handle to response to.
     *
     * @param connection the connection to set as {@link int}
     */
    public void setConnection(int connection) {
        this.connection = connection;
    }

    /**
     * 0: User Read Request is responded with data. In case of an error an application specific error
     * code can be sent.
     *
     * @param attError the attError to set as {@link int}
     */
    public void setAttError(int attError) {
        this.attError = attError;
    }

    /**
     * Data to send
     *
     * @param value the value to set as {@link int[]}
     */
    public void setValue(int[] value) {
        this.value = value;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt8(connection);
        serializeUInt8(attError);
        serializeUInt8Array(value);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaUserReadResponseCommand [connection=");
        builder.append(connection);
        builder.append(", attError=");
        builder.append(attError);
        builder.append(", value=");
        builder.append(value);
        builder.append(']');
        return builder.toString();
    }
}
