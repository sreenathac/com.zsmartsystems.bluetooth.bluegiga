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
 * Class to implement the BlueGiga command <b>deleteBonding</b>.
 * <p>
 * This command deletes a bonding from the local security database. There can be a maximum of 8
 * bonded devices stored at the same time, and one of them must be deleted if you need bonding with
 * a 9th device.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaDeleteBondingResponse extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x05;
    public static int COMMAND_METHOD = 0x02;

    /**
     * 0: the command was successful. Non-zero: An error occurred
     * <p>
     * BlueGiga API type is <i>BgApiResponse</i> - Java type is {@link BgApiResponse}
     */
    private BgApiResponse result;

    /**
     * Response constructor
     */
    public BlueGigaDeleteBondingResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        result = deserializeBgApiResponse();
    }

    /**
     * 0: the command was successful. Non-zero: An error occurred
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
        builder.append("BlueGigaDeleteBondingResponse [result=");
        builder.append(result);
        builder.append("]");
        return builder.toString();
    }
}
