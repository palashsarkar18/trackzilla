package com.pluralsight.fundamentals.resolver;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {

    private ApplicationRepository applicationRepository;

    public Query(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public int countApplications() {
        return (int) applicationRepository.count();
    }
}
