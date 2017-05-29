/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.security;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.BgApiResponse;

/**
 * Class to implement the BlueGiga command <b>bondingFailEvent</b>.
 * <p>
 * This event indicates the bonding has failed for a connection.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaBondingFailEvent extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x05;
    public static int COMMAND_METHOD = 0x01;

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int handle;

    /**
     * Encryption status, describes error that occurred during bonding. See: Security Manager
     * Protocol Errors
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     */
    private BgApiResponse result;

    /**
     * Event constructor
     */
    public BlueGigaBondingFailEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
        handle = deserializeUInt8();
        result = deserializeBgApiResponse();
    }

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current handle as {@link int}
     */
    public int getHandle() {
        return handle;
    }

    /**
     * Encryption status, describes error that occurred during bonding. See: Security Manager
     * Protocol Errors
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     *
     * @return the current result as {@link BgApiResponse}
     */
    public BgApiResponse getResult() {
        return result;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaBondingFailEvent [handle=");
        builder.append(handle);
        builder.append(", result=");
        builder.append(result);
        builder.append(']');
        return builder.toString();
    }
}
