package com.example.dao;

import com.example.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public final static String searchSql1 = "SELECT * FROM user WHERE name like %:name%";

    @Query(value = searchSql1, nativeQuery = true)
    Page<User> findByNameLike(@Param("name")String name, Pageable pageRequest);
}
