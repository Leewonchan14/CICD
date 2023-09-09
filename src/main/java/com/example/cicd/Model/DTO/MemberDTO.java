package com.example.cicd.Model.DTO;

import com.example.cicd.Model.DAO.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class MemberDTO {
    private Long id;
    private String name;

    public static MemberDTO of(Member m){
        return new MemberDTO(m.getId(), m.getName());
    }
}
