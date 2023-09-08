package com.web.BacktoSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.web.BacktoSpring.repository.MemberRepository;
import com.web.BacktoSpring.entities.Member;
import com.web.BacktoSpring.entities.Role;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

//    @Autowired
    private final MemberRepository memberRepository;

    public MemberService( MemberRepository memberRepository ) {
        this.memberRepository = memberRepository;
    }

//    private final BCryptPasswordEncoder encoder;
//    public MemberService(MemberRepository memberRepository, BCryptPasswordEncoder encoder) {
//        this.memberRepository = memberRepository;
//        this.encoder = encoder;
//    }
//    public Member createMember(Member member) {
//
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        member.setPassword(encoder.encode( member.getPassword()));
//        Role memberRole = new Role("ADMIN");
//        List<Role> roles = new ArrayList<>();
//        roles.add(memberRole);
//        member.setRole(roles);  // setting all the roles in the List roles
//        memberRepository.save(member);
//
//        return  member;
//    }

    public  Member registerMember( String firstName, String lastName, String email, String password ){
        if (email == null || password == null) {
            return null;
        }else {
            if( memberRepository.findFirstByEmail(email).isPresent() ) {
                System.out.println("Duplicated Email ");
                return null;
            }
            Member member = new Member();
            member.setFirstName(firstName);
            member.setLastName( lastName );
            member.setEmail( email );
            member.setPassword( password );

            return  memberRepository.save(member);
        }
    }

    public  Member authenticate( String email, String password) {
        return  memberRepository.findByEmailAndPassword( email, password ).orElse(null);
    }


}
