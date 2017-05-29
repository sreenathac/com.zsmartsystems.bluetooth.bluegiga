/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the BlueGiga Enumeration <b>ScanResponseType</b>.
 * <p>
 * Defines the packet types received during a scan response
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum ScanResponseType {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * [0] Connectable Advertisement packet
     */
    CONNECTABLE_ADVERTISEMENT(0x0000),

    /**
     * [2] Non Connectable Advertisement packet
     */
    NON_CONNECTABLE_ADVERTISEMENT(0x0002),

    /**
     * [4] Scan response packet
     */
    SCAN_RESPONSE(0x0004),

    /**
     * [6] Discoverable advertisement packet
     */
    DISCOVERABLE_ADVERTISEMENT(0x0006);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, ScanResponseType> codeMapping;

    private int key;

    private ScanResponseType(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, ScanResponseType>();
        for (ScanResponseType s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the type code. Returns null if the code does not exist.
     *
     * @param scanResponseType
     *            the code to lookup
     * @return enumeration value.
     */
    public static ScanResponseType getScanResponseType(int scanResponseType) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(scanResponseType) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(scanResponseType);
    }

    /**
     * Returns the BlueGiga protocol defined value for this enum
     *
     * @return the BGAPI enumeration key
     */
    public int getKey() {
        return key;
    }
}
