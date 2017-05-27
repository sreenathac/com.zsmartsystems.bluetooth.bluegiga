/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.attributeclient;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaResponse;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.BgApiResponse;

/**
 * Class to implement the BlueGiga command <b>prepareWrite</b>.
 * <p>
 * This command will send a prepare write request to a remote device for queued writes. Queued
 * writes can for example be used to write large attribute values by transmitting the data in
 * chunks using prepare write command. Once the data has been transmitted with multiple
 * prepare write commands the write must then be executed or canceled with Execute Write
 * command, which if acknowledged by the remote device triggers a Procedure Completed event.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaPrepareWriteResponse extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x04;
    public static int COMMAND_METHOD = 0x09;

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * Command result.
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     */
    private BgApiResponse result;

    /**
     * Response constructor
     */
    public BlueGigaPrepareWriteResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        connection = deserializeUInt8();
        result = deserializeBgApiResponse();
    }

    /**
     * Connection handle
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current connection as {@link int}
     */
    public int getConnection() {
        return connection;
    }

    /**
     * Command result.
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
        builder.append("BlueGigaPrepareWriteResponse [connection=");
        builder.append(connection);
        builder.append(", result=");
        builder.append(result);
        builder.append("]");
        return builder.toString();
    }
}
