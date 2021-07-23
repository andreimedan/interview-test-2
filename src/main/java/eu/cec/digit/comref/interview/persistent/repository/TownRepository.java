package eu.cec.digit.comref.interview.persistent.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import eu.cec.digit.comref.interview.persistent.domain.Town;

public interface TownRepository extends JpaRepository<Town, String> {
    Page<Town> findAll(Pageable pageable);
    Page<Town> findByInhabitants(Pageable page, Integer inhabitants);
}
