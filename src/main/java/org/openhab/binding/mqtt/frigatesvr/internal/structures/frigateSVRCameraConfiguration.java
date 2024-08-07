/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.mqtt.frigatesvr.internal.structures;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link mqtt.frigateSVRConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author J Gow - Initial contribution
 */
@NonNullByDefault
public class frigateSVRCameraConfiguration extends frigateSVRCommonConfiguration {
    public String serverID = "";
    public String cameraName = "";
    public boolean enableStream = true;
    public String ffmpegCameraNameOverride = "";
}
