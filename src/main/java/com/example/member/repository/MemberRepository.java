package com.example.member.repository;

import com.example.member.domain.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final List<Member> members = new ArrayList<>();

    public void save(Member member) {
        members.add(member);
    }

    public List<Member> findAll() {
        return members;
    }
}