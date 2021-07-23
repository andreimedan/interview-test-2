package eu.cec.digit.comref.interview.persistent.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import eu.cec.digit.comref.interview.persistent.domain.InternetServiceProvider;

import java.util.List;

public interface InternetServiceProviderRepository extends JpaRepository<InternetServiceProvider, String> {

    List<InternetServiceProvider> findByAvailable(boolean available);
    Page<InternetServiceProvider> findByAvailable(Pageable page, boolean available);
    Page<InternetServiceProvider> findAll(Pageable pageable);
}