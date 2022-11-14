package com.mustache.bbs.repository;

import com.mustache.bbs.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Board, Long> {

}
