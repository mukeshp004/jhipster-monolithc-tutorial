package com.patelinfo.pos.repository.search;

import com.patelinfo.pos.domain.Region;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Region entity.
 */
public interface RegionSearchRepository extends ElasticsearchRepository<Region, Long> {
}
