package study.datajpa.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import study.datajpa.entity.Member;

@Data
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public MemberDto(Member member) {
        this.username = member.getUsername();
        this.age = member.getAge();
    }
}