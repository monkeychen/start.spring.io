package io.spring.start.site.project;

import io.spring.initializr.generator.buildsystem.Build;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import io.spring.initializr.metadata.InitializrMetadata;
import io.spring.start.site.project.contributor.InnoVueAppContributor;
import org.springframework.context.annotation.Bean;

/**
 * <p>Title: InnobaseProjectGenerationConfiguration</p>
 * <p>Description:</p>
 * <p>Copyright: FJ.CMCC Co., Ltd. (c) 2024</p>
 * <p>@Author: chenzhian </p>
 * <p>@Date: 2024/3/27 21:23</p>
 */
@ProjectGenerationConfiguration
public class InnobaseProjectGenerationConfiguration {

    @Bean
    InnoVueAppContributor innoVueAppContributor(Build build, InitializrMetadata metadata) {
        return new InnoVueAppContributor(build, metadata);
    }
}
