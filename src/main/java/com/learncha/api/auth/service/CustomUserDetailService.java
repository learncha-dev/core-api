package com.learncha.api.auth.service;

import com.learncha.api.auth.domain.Member;
import com.learncha.api.auth.repository.MemberRepository;
import com.learncha.api.common.exception.EntityNotFoundException;
import com.learncha.api.common.security.jwt.model.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetailsImpl loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email)
            .orElseThrow(EntityNotFoundException::new);
        return new UserDetailsImpl(member);
    }
}
