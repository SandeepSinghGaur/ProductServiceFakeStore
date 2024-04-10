package com.sandeep.productservice.inheritanceDemo.singleTable.repository;

import com.sandeep.productservice.inheritanceDemo.singleTable.Mentor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository("st_mr")
public interface MentorRepository extends JpaRepository<Mentor,Long> {

    @Override
    <S extends Mentor> S save(S entity);
}
