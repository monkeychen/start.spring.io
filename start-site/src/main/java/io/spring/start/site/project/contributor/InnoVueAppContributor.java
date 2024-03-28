/*
 * Copyright 2012-2019 the original author or authors.
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

package io.spring.start.site.project.contributor;

import io.spring.initializr.generator.buildsystem.Build;
import io.spring.initializr.generator.project.contributor.ProjectContributor;
import io.spring.initializr.generator.spring.build.BuildMetadataResolver;
import io.spring.initializr.metadata.InitializrMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A {@link ProjectContributor} that creates ndyd-inno-vue application project.
 *
 * @author chenzhian
 */
public class InnoVueAppContributor implements ProjectContributor {
    private static final Logger logger = LoggerFactory.getLogger(InnoVueAppContributor.class);

	private final Build build;

	private final BuildMetadataResolver buildMetadataResolver;

	public InnoVueAppContributor(Build build, InitializrMetadata metadata) {
		this.build = build;
		this.buildMetadataResolver = new BuildMetadataResolver(metadata);
	}

	@Override
	public void contribute(Path projectRoot) throws IOException {
		logger.info("{}", projectRoot);
	}

	@Override
	public int getOrder() {
		return Ordered.LOWEST_PRECEDENCE - 1;
	}

}
