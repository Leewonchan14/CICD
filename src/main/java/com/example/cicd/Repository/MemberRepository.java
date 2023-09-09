package com.example.cicd.Repository;


import com.example.cicd.Model.DAO.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
