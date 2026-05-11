package com.example.member.service;

import com.example.member.domain.Member;
import com.example.member.repository.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemberRepository();

    public void register(String id, String name) {
        Member member = new Member(id, name);
        memberRepository.save(member);
    }
}