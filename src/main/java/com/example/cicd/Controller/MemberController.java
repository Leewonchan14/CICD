package com.example.cicd.Controller;

import com.example.cicd.Model.DAO.Member;
import com.example.cicd.Model.DTO.MemberDTO;
import com.example.cicd.Model.DTO.MemberPostDTO;
import com.example.cicd.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping
    public ResponseEntity<List<MemberDTO>> getMembers() {
        List<Member> memberList = memberRepository.findAll();
        List<MemberDTO> memberDTOS = memberList.stream().map(MemberDTO::of).collect(Collectors.toList());
        return ResponseEntity.ok(memberDTOS);
    }

    @PostMapping
    public ResponseEntity<MemberDTO> createMember(@RequestBody MemberPostDTO memberPostDTO) {
        Member member = new Member();
        member.setName(memberPostDTO.getName());
        memberRepository.save(member);
        return ResponseEntity.ok(MemberDTO.of(member));
    }
}
