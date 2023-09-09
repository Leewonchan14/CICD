package com.example.cicd.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class MemberPostDTO {
    private String name;

    public static MemberPostDTO of(String name){
        return new MemberPostDTO(name);
    }
}
