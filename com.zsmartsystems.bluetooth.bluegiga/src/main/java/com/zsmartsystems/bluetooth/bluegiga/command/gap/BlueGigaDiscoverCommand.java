/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.gap;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;
import com.zsmartsystems.bluetooth.bluegiga.enumeration.GapDiscoverMode;

/**
 * Class to implement the BlueGiga command <b>discover</b>.
 * <p>
 * This command starts the GAP discovery procedure to scan for advertising devices i.e. to
 * perform a device discovery. Scanning parameters can be configured with the Set Scan
 * Parameters command before issuing this command. To cancel on an ongoing discovery process
 * use the End Procedure command.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaDiscoverCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x06;
    public static int COMMAND_METHOD = 0x02;

    /**
     * see:GAP Discover Mode.
     * <p>
     * BlueGiga API type is <i>GapDiscoverMode</i> - Java type is {@link GapDiscoverMode}
     */
    private GapDiscoverMode mode;
    /**
     * see:GAP Discover Mode.
     *
     * @param mode the mode to set as {@link GapDiscoverMode}
     */
    public void setMode(GapDiscoverMode mode) {
        this.mode = mode;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeGapDiscoverMode(mode);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaDiscoverCommand [mode=");
        builder.append(mode);
        builder.append(']');
        return builder.toString();
    }
}
