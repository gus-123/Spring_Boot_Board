package com.example.board.repository;

import com.example.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    // JPA Repository의 경우 "findBy컬럼이름Containing"을 하면 컬럼에서 키워드가 포함된 것을 찾아 줌
    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
}
