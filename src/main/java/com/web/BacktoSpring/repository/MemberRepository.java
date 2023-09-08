package com.web.BacktoSpring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.web.BacktoSpring.entities.Member;

import java.util.Optional;
//public class MemberRepository {   }

public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member>  findByEmailAndPassword(String email, String password);

    // To check if user with such login is Present
    Optional<Member> findFirstByEmail(String email);
}