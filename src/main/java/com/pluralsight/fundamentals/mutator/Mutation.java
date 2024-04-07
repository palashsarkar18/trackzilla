package com.pluralsight.fundamentals.mutator;

import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.exception.ApplicationNotFoundException;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;

import java.util.Optional;

public class Mutation implements GraphQLMutationResolver {

    private ApplicationRepository applicationRepository;

    public Mutation(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application newApplication(String name, String owner, String description) {
        try {
            Application application = new Application(name, owner, description);
            applicationRepository.save(application);
            if (application.getId() == null) {
                throw new ApplicationNotFoundException("Could not save the new application to the database", application.toString());
            }
            return  application;
        } catch (Exception e) {
            throw new ApplicationNotFoundException("Could not save the new application to the database", owner);
        }
    }

    public boolean deleteApplication(Long id) {
        applicationRepository.deleteById(id);
        return true;
    }

    public Application updateApplicationOwner(String newOwner, Long id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if (optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setOwner(newOwner);
            applicationRepository.save(application);
            return  application;
        } else {
            throw new ApplicationNotFoundException("Application not found", id);
        }
    }
}
