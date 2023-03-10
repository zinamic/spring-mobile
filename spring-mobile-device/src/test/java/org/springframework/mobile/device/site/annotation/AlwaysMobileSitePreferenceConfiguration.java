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

package org.springframework.mobile.device.site.annotation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.mobile.device.site.SitePreferenceHandler;

/**
 * @author Roy Clarkson
 */
@Configuration
@EnableSitePreference
public class AlwaysMobileSitePreferenceConfiguration implements SitePreferenceConfigurer {

	@Nullable
	@Override
	public SitePreferenceHandler getSitePreferenceHandler() {
		return new SitePreferenceHandler() {

			@Override
			public SitePreference handleSitePreference(HttpServletRequest request, HttpServletResponse response) {
				request.setAttribute("currentSitePreference", SitePreference.MOBILE);
				return SitePreference.MOBILE;
			}

		};
	}

}
