package com.cg.eauction.auth.payload;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public record CustomPasswordUser(String username, Collection<GrantedAuthority> authorities) {

}
