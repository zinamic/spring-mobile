/*
 * Copyright 2010-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.mobile.device;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Service interface for resolving Devices that originate web requests with the application.
 * @author Keith Donald
 */
public interface DeviceResolver {

	/**
	 * Resolve the device that originated the web request.
	 */
	default Device resolveDevice(HttpServletRequest request) {
		return null;
	}

}
